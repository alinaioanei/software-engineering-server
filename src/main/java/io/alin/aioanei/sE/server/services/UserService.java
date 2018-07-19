package io.alin.aioanei.sE.server.services;

import io.alin.aioanei.sE.server.model.User;
import io.alin.aioanei.sE.server.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    /**
    Return the list with all the users
     */
    List<UserDTO> findAll();

    User register(User user);


}
