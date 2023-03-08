package com.Migal.Microservices.repository;

import com.Migal.Microservices.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {

}
