package am.itspace.authorbookcommon.dto;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CBCurrencyResponseDto {

    @JsonProperty("USD")
    private String usd;

    @JsonProperty("RUB")
    private String rub;
}
