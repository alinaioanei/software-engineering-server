package io.alin.aioanei.sE.server.utils;

import io.alin.aioanei.sE.server.model.User;
import io.alin.aioanei.sE.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u = new User();
        u.setUsername("username");
        u.setPassword("password");

        userRepository.save(u);
    }
}
