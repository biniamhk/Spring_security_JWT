package se.example.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.example.token.domain.AppUser;

public interface UserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String userName);
}
