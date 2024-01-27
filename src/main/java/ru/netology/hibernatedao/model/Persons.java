package ru.netology.hibernatedao.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persons {

    @EmbeddedId
    private Contact contact;
    @Column(name = "city_of_living", nullable = false)
    private String cityOfLiving;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Persons() {
    }

}
