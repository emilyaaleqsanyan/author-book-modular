package am.itspace.authorbookcommon.mapper;



import am.itspace.authorbookcommon.dto.AuthorResponseDto;
import am.itspace.authorbookcommon.dto.SaveAuthorDto;
import am.itspace.authorbookcommon.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;

@Mapper(componentModel = "spring", imports = LocalDate.class)
public interface AuthorMapper {

    AuthorResponseDto map(Author author);

   @Mapping(target = "createdDate", expression = "java(LocalDate.now())")
    Author map(SaveAuthorDto saveAuthorDto);

}
