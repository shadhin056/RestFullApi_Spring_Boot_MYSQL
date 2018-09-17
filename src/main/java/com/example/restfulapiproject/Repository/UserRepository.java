package com.example.restfulapiproject.Repository;

import com.example.restfulapiproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
