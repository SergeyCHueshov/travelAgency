package by.it.academy.travelagency.services;

import by.it.academy.travelagency.dto.UserRequest;
import by.it.academy.travelagency.dto.UserResponse;
import by.it.academy.travelagency.dto.UserUpdateResponse;
import by.it.academy.travelagency.entities.User;
import by.it.academy.travelagency.mapper.UserMapper;
import by.it.academy.travelagency.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final UserUpdateResponse userUpdateResponse;


    @Override
    public List<UserResponse> getByFirstnameAndSecondName(String firstname, String secondname){
        List<User> users = userRepository.findByFirstnameAndSecondname(firstname, secondname);
        return users.stream()
                .map(userMapper :: buildUserResponse)
                .toList();
    }

    @Override
    public List<UserResponse> getByFirstnamenameAndAge(String firstname, int age){
        List<User> users = userRepository.findByFirstnameAndAge(firstname, age);
        return users.stream()
                .map(userMapper :: buildUserResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserResponse> getBySecondnameAndAge(String secondname, int age){
        List<User> users = userRepository.findBySecondameAndAge(secondname, age);
        return users.stream()
                .map(userMapper :: buildUserResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse getUser(UUID id) {
        return userRepository.findById(id)
                .map(userMapper :: buildUserResponse)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find User with id %s", id)));
    }

    @Override
    public List<UserResponse> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).stream()
                .map(userMapper::buildUserResponse)
                .toList();
    }

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = userMapper.buildUser(userRequest);
        User savedUser = userRepository.save(user);
        return userMapper.buildUserResponse(savedUser);
    }

    @Override
    public UserResponse updateUser(UserRequest userRequest) {
        User user = userMapper.buildUser(userRequest);
        User updatedUser = userUpdateResponse.updateUser(userRequest,user);
        return userMapper.buildUserResponse(updatedUser);
    }

    @Override
    public void deleteUser(UUID id) throws RuntimeException{
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
        {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException(String.format("Cannot find User with id %s", id));
        }
    }
}
