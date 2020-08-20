package ua.com.alevel.crud;

import java.util.List;

public interface UserService {
    void create(User user);

    void update(User user);

    void delete(int id);

    List<User> findAll();

    List<User> findByName(String name);

    User findById(int id);
}
