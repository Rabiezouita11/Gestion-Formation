package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.Formateur;
import com.example.rabiezouita.Repository.FormateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormateurService implements Iformateur {
@Autowired
FormateurRepo formateurRepo;

    @Override
    public Formateur ajouterFormateur(Formateur formateur) {
        return formateurRepo.save(formateur);
    }

    @Override
    public Formateur updatetarifFormateur(Integer idFormateur, Integer tarif) {

        Formateur formateur = formateurRepo.findById(idFormateur).get();
        formateur.setTarifHoraire(tarif);
        return formateurRepo.save(formateur);
    }
}
