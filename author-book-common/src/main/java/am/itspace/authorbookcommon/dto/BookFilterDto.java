package am.itspace.authorbookcommon.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookFilterDto {

    private String title;
    private String description;
    private Double minPrice;
    private Double maxPrice;

    private String orderBy;
    private String orderDirection;

    private int page;
    private int size;

}
