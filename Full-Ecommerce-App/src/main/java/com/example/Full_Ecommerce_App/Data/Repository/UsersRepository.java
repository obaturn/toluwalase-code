package com.example.Full_Ecommerce_App.Data.Repository;

import com.example.Full_Ecommerce_App.Data.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository  extends JpaRepository<Users, Long> {
     Optional<Users> findByEmail(String Email);
    Optional<Users> findByUserName(String username);
}
