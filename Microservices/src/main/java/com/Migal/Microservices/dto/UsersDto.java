package com.Migal.Microservices.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsersDto {
    private String name;
    private LocalDate birthDay;
}