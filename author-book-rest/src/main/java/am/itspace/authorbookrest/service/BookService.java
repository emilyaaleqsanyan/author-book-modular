package am.itspace.authorbookrest.service;



import am.itspace.authorbookcommon.dto.BookDto;
import am.itspace.authorbookcommon.dto.BookFilterDto;
import am.itspace.authorbookcommon.dto.SaveBookDto;

import java.util.List;

public interface BookService {
    BookDto save(SaveBookDto saveBookDto);

    List<BookDto> getAll();


    List<BookDto> getAllByFilter(BookFilterDto bookFilterDto);
}
