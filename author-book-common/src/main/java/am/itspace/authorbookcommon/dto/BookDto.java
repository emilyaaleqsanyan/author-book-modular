package am.itspace.authorbookcommon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private int id;
    private String description;
    private double priceUSD;
    private double price;
    private String title;
    private AuthorResponseDto authorResponseDto;

}
