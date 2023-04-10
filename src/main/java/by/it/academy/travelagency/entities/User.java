package by.it.academy.travelagency.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "USERS")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String firstname;

    @Column(name = "SURNAME", nullable = false, length = 50)
    private String secondname;

    @Column(name = "AGE", nullable = false)
    private Integer age;

    @Column(name = "LOGIN", nullable = false, length = 50)
    private String login;

    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;
}
