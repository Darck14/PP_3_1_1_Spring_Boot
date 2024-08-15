package ru.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.spring.model.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
