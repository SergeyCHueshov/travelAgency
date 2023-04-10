package by.it.academy.travelagency.dto;

import by.it.academy.travelagency.entities.User;
import by.it.academy.travelagency.repositories.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class UserUpdateResponse {
    private UserRepository userRepository;

    public User updateUser(UserRequest userRequest, User user){
        User updatedUser = (User) userRepository.findByFirstnameAndSecondname(userRequest.getFirstname(), userRequest.getSecondname());
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setSecondname(user.getSecondname());
        updatedUser.setAge(user.getAge());
        updatedUser.setLogin(user.getLogin());
        updatedUser.setPassword(user.getPassword());
        userRepository.save(updatedUser);
        return updatedUser;
    }
}
