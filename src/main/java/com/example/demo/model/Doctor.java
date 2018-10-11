package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor")
@Entity
public class Doctor {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String description;
    @Column
    private int age;
    @Column(name = "pic_url")
    private String picUrl;
    @ManyToOne
    private Stomotology stomotology;
}
