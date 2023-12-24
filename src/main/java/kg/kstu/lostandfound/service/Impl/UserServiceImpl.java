package kg.kstu.lostandfound.service.Impl;

import jakarta.transaction.Transactional;
import kg.kstu.lostandfound.dto.SimpleResponse;
import kg.kstu.lostandfound.dto.userDto.UserRequest;
import kg.kstu.lostandfound.dto.userDto.UserResponse;
import kg.kstu.lostandfound.repository.UserRepository;
import kg.kstu.lostandfound.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j //Simple logger facade for java
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public SimpleResponse saveUser(UserRequest userRequest) {

        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return null;
    }

    @Override
    public UserResponse getUserById(Long id) {
        return null;
    }

    @Override
    public SimpleResponse updateUserById(Long id, UserRequest userRequest) {
        return null;
    }

    @Override
    public SimpleResponse deleteUserById(Long id) {
        return null;
    }
}
