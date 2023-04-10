package by.it.academy.travelagency.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserResponse {
    private UUID id;

    private String firstname;

    private String secondname;

    private Integer age;

    private String login;

    private String password;
}