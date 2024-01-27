package br.com.dev.api.config;

import br.com.dev.api.domain.User;
import br.com.dev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    UserRepository userRepository;


    public void starDB() {
        User u1 = new User(null, "diego", "diego@gmail.com", "123");
        User u2 = new User(null, "luiz", "luiz@gmail.com", "456");
        User u3 = new User(null, "silva", "silva@gmail.com", "789");

        userRepository.saveAll(List.of(u1,u2,u3));



    }
}
