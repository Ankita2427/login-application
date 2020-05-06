package springboot.ankitaloginapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.ankitaloginapplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
