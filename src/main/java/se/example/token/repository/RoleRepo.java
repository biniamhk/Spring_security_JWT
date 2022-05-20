package se.example.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.example.token.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
