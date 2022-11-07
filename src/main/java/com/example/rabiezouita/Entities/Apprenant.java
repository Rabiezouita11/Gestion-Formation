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
public class Apprenant implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idApprenant;
    private String nom,prenom,email;
    private Integer telephone;
    @ManyToMany(mappedBy = "apprenants")
            @JsonIgnore
    List<Formation> formations;
}
