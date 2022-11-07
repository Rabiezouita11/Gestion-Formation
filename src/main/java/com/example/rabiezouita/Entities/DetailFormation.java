package com.example.rabiezouita.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetailFormation implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idDetail;

    private String salle;
    private String equipement;

}
