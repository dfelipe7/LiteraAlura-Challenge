package co.edu.unicauca.literaAlura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record JsonDTO(
        @JsonAlias("results")
        List<BookDTO> bookResults
) {
}
