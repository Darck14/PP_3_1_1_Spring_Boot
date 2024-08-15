package ru.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.spring.model.User;



public interface UserRepository extends JpaRepository<User, Long> {

//    @Modifying
//    @Query("UPDATE users u SET u.name = :#{#user.name}, u.sername = :#{#user.sername}, u.sex = :#{#user.sex} WHERE u.id = :#{#user.id}")
//    void updateUser(User user);
}
