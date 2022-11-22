package com.david.demo.service;


import com.david.demo.model.User;

import java.util.List;

public interface UserService {

    User updateUser(Long id, User user);

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);
}
