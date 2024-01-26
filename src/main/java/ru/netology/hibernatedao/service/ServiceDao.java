package ru.netology.hibernatedao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedao.model.Persons;
import ru.netology.hibernatedao.repository.RepositoryDao;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceDao {
    private final RepositoryDao repository;

    public List<Persons> gerPersonsByCity(String city){
        return repository.getPersonsByCity(city);
    }
}
