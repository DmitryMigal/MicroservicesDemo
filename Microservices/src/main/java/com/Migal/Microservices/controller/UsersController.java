package com.Migal.Microservices.controller;

import com.Migal.Microservices.dto.UsersDto;
import com.Migal.Microservices.entity.Users;
import com.Migal.Microservices.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    @PostMapping
    public Users save(@RequestBody UsersDto users) {
        return service.save(users);
    }

    @GetMapping
    public Iterable<Users> getAll() {
        return service.getAll();
    }

}