package eu.example.service;

import java.util.List;

import eu.example.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
