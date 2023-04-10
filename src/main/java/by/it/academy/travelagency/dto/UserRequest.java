package by.it.academy.travelagency.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserRequest {
    @NotBlank
    private String firstname;

    @NotBlank
    private String secondname;

    @Min(18)
    @Max(95)
    @NotNull
    private LocalDate birthdate;

    @NotBlank
    private String login;

    @NotBlank
    private String password;
}
