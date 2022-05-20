package se.example.token.service;

import se.example.token.domain.AppUser;
import se.example.token.domain.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUser();
}
