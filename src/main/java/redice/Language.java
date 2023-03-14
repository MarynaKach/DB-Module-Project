package redice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Language {

    private String language;

    private Boolean isOfficial;

    private BigDecimal percentage;
}
