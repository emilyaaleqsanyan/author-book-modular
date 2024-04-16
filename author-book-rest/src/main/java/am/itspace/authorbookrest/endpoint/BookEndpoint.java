package am.itspace.authorbookrest.endpoint;


import am.itspace.authorbookcommon.dto.BookDto;
import am.itspace.authorbookcommon.dto.BookFilterDto;
import am.itspace.authorbookcommon.dto.SaveBookDto;
import am.itspace.authorbookrest.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("v1/books")
@RequiredArgsConstructor
public class BookEndpoint {

    private final BookService bookService;



    @PostMapping
    public BookDto create(@Valid @RequestBody SaveBookDto saveBookDto){
        return bookService.save(saveBookDto);
    }


    @GetMapping
    public List<BookDto> getAll(){
        return bookService.getAll();
    }


    @PostMapping("/filter")
    public List<BookDto> getAllByFilter(@RequestBody BookFilterDto bookFilterDto){
        return bookService.getAllByFilter(bookFilterDto);
    }
}
