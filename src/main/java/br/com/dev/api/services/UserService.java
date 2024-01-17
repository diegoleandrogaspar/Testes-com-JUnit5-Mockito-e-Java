package br.com.dev.api.services;

import br.com.dev.api.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User findById(Integer id);

}
