package springboot.ankitaloginapplication.service;

import springboot.ankitaloginapplication.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
