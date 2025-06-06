package ru.itmentor.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmentor.spring.boot_security.demo.models.User;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);

}
