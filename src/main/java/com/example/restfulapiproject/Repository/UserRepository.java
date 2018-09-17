package com.example.restfulapiproject.Repository;

import com.example.restfulapiproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
