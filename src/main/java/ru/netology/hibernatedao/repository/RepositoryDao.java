package ru.netology.hibernatedao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedao.model.Persons;

import java.util.List;

@AllArgsConstructor
@Repository
public class RepositoryDao {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Persons> getPersonsByCity(String city){

        return entityManager
                .createQuery("from Persons where cityOfLiving = :city", Persons.class).setParameter("city",city)
                .getResultList();

    }
}
