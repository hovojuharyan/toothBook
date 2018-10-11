package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stomotology_images")
@Entity
public class StomotologyImages {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column(name = "pic_url")
    private String picUrl;
    @ManyToOne
    private Stomotology stomotology;
}
