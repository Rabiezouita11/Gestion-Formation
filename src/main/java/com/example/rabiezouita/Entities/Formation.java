package com.example.rabiezouita.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Formation implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idFormation;
    private String titre;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
@Temporal( TemporalType.DATE)
private Date dateDebut;
    @Temporal( TemporalType.DATE)
    private Date dateFin;
    private Integer nbrHeures;
    private Integer nbrMaxParticipant;
    private Integer frais;

    @OneToOne
    DetailFormation detailFormation;
    @ManyToMany
    List<Apprenant> apprenants;
    @ManyToOne
    Formateur formateur;
}
