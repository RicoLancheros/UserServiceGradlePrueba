package UserServicePrueba.service;
import UserServicePrueba.model.User;

import java.util.List;
import java.util.Optional;

// Interfaz que define los métodos que se implementarán en UserServiceImp
public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}