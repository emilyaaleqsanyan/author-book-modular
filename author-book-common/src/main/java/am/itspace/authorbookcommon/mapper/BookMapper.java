package am.itspace.authorbookcommon.mapper;


import am.itspace.authorbookcommon.dto.BookDto;
import am.itspace.authorbookcommon.dto.SaveBookDto;
import am.itspace.authorbookcommon.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = AuthorMapper.class)
public interface BookMapper {


   @Mapping(target = "authorResponseDto", source = "author")
   BookDto map(Book book);


    Book map(SaveBookDto saveBookDto);

    List<BookDto> map(List<Book> books);

}
