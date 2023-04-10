package by.it.academy.travelagency.repositories;

import by.it.academy.travelagency.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findByFirstnameAndSecondname(String firstname, String secondname);

    List<User> findByFirstnameAndAge(String firstname, int age);

    List<User> findBySecondameAndAge(String secondname, int age);

    boolean existsUserByLogin(String login);

}
