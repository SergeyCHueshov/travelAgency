package by.it.academy.travelagency.mapper;

import by.it.academy.travelagency.dto.UserRequest;
import by.it.academy.travelagency.dto.UserResponse;
import by.it.academy.travelagency.entities.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class UserMapper {
    public UserResponse buildUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .secondname(user.getSecondname())
                .age(user.getAge())
                .login(user.getLogin())
                .password(user.getPassword())
                .build();
    }

    public User buildUser(UserRequest userRequest) {
        return User.builder()
                .firstname(userRequest.getFirstname())
                .secondname(userRequest.getSecondname())
                .age(convertToAge(userRequest.getBirthdate()))
                .login(userRequest.getLogin())
                .password(userRequest.getPassword())
                .build();
    }

    private Integer convertToAge(LocalDate birthdate) {
        return Period.between(birthdate, LocalDate.now())
                .getYears();
    }

}
