package am.itspace.authorbookrest.endpoint;


import am.itspace.authorbookcommon.dto.AuthorResponseDto;

import am.itspace.authorbookcommon.dto.PagingResponseDto;
import am.itspace.authorbookcommon.dto.SaveAuthorDto;
import am.itspace.authorbookrest.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/authors")
public class AuthorEndpoint {

    private final AuthorService authorService;


    @PostMapping
    public AuthorResponseDto createAuthor(@RequestBody SaveAuthorDto authorDto) {
        return authorService.create(authorDto);
    }


    @GetMapping
    public PagingResponseDto getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size,
            @RequestParam(value = "orderBy", required = false, defaultValue = "id") String orderBY,
            @RequestParam(value = "order", required = false, defaultValue = "DESC") String order) {
        Sort sort = Sort.by(Sort.Direction.fromString(order), orderBY);
        Pageable pageable = PageRequest.of(page, size, sort);
        return authorService.getAll(pageable);
    }


    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> getById(@PathVariable("id") int id) {
        AuthorResponseDto author = authorService.getById(id);
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(author);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> update(@PathVariable("id") int id,
                                                    @RequestBody SaveAuthorDto authorDto) {
        AuthorResponseDto byId = authorService.getById(id);
        if (byId == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(authorService.update(id, authorDto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> deleteById(@PathVariable("id") int id) {
        AuthorResponseDto byId = authorService.getById(id);
        if (byId == null) {
            return ResponseEntity.notFound().build();
        }
        authorService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
