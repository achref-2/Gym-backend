package com.gym.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class client {
    @Id
    private int id_cl;
    private String firstName;
    private String address;
    private String phone;
    private float weight;
    private float height;
    private float ideal_weight;
    private int age;
    private String sexe;
    private int id_co;
    private int id_course;
}