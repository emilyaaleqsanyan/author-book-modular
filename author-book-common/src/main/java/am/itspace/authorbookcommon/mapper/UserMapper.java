package am.itspace.authorbookcommon.mapper;


import am.itspace.authorbookcommon.dto.CreateUserRequestDto;
import am.itspace.authorbookcommon.dto.UserDto;
import am.itspace.authorbookcommon.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto map(User user);

    @Mapping(target = "userType", constant = "USER")
    User map(CreateUserRequestDto createUserRequestDto);

}
