package am.itspace.authorbookcommon.dto;


import am.itspace.authorbookcommon.entity.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveAuthorDto {

    @JsonProperty("name")
    private String name;

    private String surname;

    private Gender gender;

    private int age;
}
