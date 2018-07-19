package io.alin.aioanei.sE.server.controller;

import io.alin.aioanei.sE.server.model.User;
import io.alin.aioanei.sE.server.model.dto.UserDTO;
import io.alin.aioanei.sE.server.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/findAll")
    @ResponseStatus(HttpStatus.OK)
    private List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/register")
    private User register(@Valid @RequestBody User user) {
        return userService.register(user);
    }
}
