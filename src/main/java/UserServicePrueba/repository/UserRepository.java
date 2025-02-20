package UserServicePrueba.repository;


import UserServicePrueba.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Puedes agregar métodos personalizados para consultas específicas, por ejemplo:
    User findByEmail(String email);
}