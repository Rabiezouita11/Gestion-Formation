package com.example.rabiezouita.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Formateur implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idFormateur;
    private String nom,prenom,email;
    private Integer tarifHoraire;
    @OneToMany(mappedBy = "formateur")
            @JsonIgnore
    List<Formation> formations;

}
