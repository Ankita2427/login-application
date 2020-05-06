package springboot.ankitaloginapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.ankitaloginapplication.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
