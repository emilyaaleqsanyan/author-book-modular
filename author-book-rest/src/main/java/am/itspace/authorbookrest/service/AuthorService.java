package am.itspace.authorbookrest.service;


import am.itspace.authorbookcommon.dto.AuthorResponseDto;
import am.itspace.authorbookcommon.dto.PagingResponseDto;
import am.itspace.authorbookcommon.dto.SaveAuthorDto;
import org.springframework.data.domain.Pageable;

public interface AuthorService {
    AuthorResponseDto create(SaveAuthorDto author);

    PagingResponseDto getAll(Pageable pageable);

    AuthorResponseDto getById(int id);

    AuthorResponseDto update(int id, SaveAuthorDto author);

    void deleteById(int id);
}
