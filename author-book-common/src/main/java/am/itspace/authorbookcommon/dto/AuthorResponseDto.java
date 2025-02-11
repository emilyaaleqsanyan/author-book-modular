package am.itspace.authorbookcommon.dto;


import am.itspace.authorbookcommon.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorResponseDto {

    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private int age;
}
