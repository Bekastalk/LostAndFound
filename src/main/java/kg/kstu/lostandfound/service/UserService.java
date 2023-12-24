package kg.kstu.lostandfound.service;

import kg.kstu.lostandfound.dto.SimpleResponse;
import kg.kstu.lostandfound.dto.userDto.UserRequest;
import kg.kstu.lostandfound.dto.userDto.UserResponse;

import java.util.List;

public interface UserService {
    SimpleResponse saveUser(UserRequest userRequest);
    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long id);
    SimpleResponse updateUserById(Long id, UserRequest userRequest);
    SimpleResponse deleteUserById(Long id);
}
