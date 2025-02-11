package am.itspace.authorbookcommon.dto;


import am.itspace.authorbookcommon.entity.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private int id;

    private String name;

    private String surname;

    private String email;

    private UserType userType;

    private String imagePath;
}
