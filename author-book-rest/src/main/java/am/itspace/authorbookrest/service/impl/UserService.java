package am.itspace.authorbookrest.service.impl;


import am.itspace.authorbookcommon.dto.CreateUserRequestDto;
import am.itspace.authorbookcommon.dto.UserDto;
import am.itspace.authorbookcommon.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserService {


    UserDto create(CreateUserRequestDto createUserRequestDto);

    User findByEmail(String email);

    User findById(int id);


    void uploadImage(User byId, MultipartFile multipartFile) throws IOException;
}
