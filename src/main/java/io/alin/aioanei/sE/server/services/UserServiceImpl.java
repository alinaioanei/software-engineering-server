package io.alin.aioanei.sE.server.services;

import io.alin.aioanei.sE.server.model.User;
import io.alin.aioanei.sE.server.model.dto.UserDTO;
import io.alin.aioanei.sE.server.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> convertToDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }


    private UserDTO convertToDto(User user) {
        UserDTO userDto = modelMapper.map(user, UserDTO.class);
        return userDto;
    }

    private User convertToEntity(UserDTO userDto){
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
}
