package am.itspace.authorbookcommon.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveBookDto {

    private String description;
    private double price;
    @Length(min = 2, message = "Title length should be >= 2" )
    private String title;
    private int authorId;
}
