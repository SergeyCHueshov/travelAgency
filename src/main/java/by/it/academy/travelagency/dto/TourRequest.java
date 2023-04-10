package by.it.academy.travelagency.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TourRequest {
    @NotBlank
    private String tourName;

    @NotBlank
    private String state;

    @NotBlank
    private String hotel;

    @Min(1)
    @Max(100000)
    @NotNull
    private int cost;

    @NotBlank
    private String additionalInformation;
}
