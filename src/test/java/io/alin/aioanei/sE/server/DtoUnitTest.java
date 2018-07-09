package io.alin.aioanei.sE.server;

import io.alin.aioanei.sE.server.model.User;
import io.alin.aioanei.sE.server.model.dto.UserDTO;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;

public class DtoUnitTest {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertUserEntityToUserDto_thenCorrect() {
        User user = new User();
        user.setPassword("password");
        user.setUsername("username");
        user.setId(1);

        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        assertEquals(user.getId(), userDTO.getId());
        assertEquals(user.getUsername(), userDTO.getUsername());
    }

    @Test
    public void whenConvertUserDtoToUserEntity_thenCorrect() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setUsername("username");

        User user = modelMapper.map(userDTO, User.class);
        assertEquals(user.getId(), userDTO.getId());
        assertEquals(user.getUsername(), userDTO.getUsername());
    }
}
