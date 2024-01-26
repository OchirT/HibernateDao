package ru.netology.hibernatedao.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedao.model.Persons;
import ru.netology.hibernatedao.service.ServiceDao;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class Controller {
    private final ServiceDao service;


    @GetMapping("/by-city")
    public List<Persons> personsList(@RequestParam("city") String city){
        return service.gerPersonsByCity(city);
    }
}
