package com.Migal.Microservices.service;

import com.Migal.Microservices.dto.UsersDto;
import com.Migal.Microservices.entity.Users;
import com.Migal.Microservices.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Users save(UsersDto usersDto) {
        Users users = new Users()
                .setName(usersDto.getName())
                .setBirthDay(usersDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return usersRepository.save(users);
    }

    public Iterable<Users> getAll() {
        return usersRepository.findAll();
    }

}