package UserServicePrueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data  // Lombok: genera getters, setters, equals, hashCode, toString
public class User {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    // Getters y setters (generados por Lombok @Data)
}