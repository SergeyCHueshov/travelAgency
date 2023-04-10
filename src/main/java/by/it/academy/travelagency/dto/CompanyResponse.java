package by.it.academy.travelagency.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CompanyResponse {

    @NotNull
    private UUID id;

    @NotBlank
    private String companyName;

    @NotBlank
    private String officialStateRegistrationNumber;

}
