package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.Apprenant;
import com.example.rabiezouita.Entities.Formation;
import com.example.rabiezouita.Repository.ApprenantRepo;
import com.example.rabiezouita.Repository.FormationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprenantService implements  Iapprenant {
    @Autowired
    ApprenantRepo apprenantRepo;
    @Autowired
    FormationRepo formationRepo;
    @Override
    public Apprenant ajouterApprenant(Apprenant apprenant) {
        return apprenantRepo.save(apprenant);
    }

    @Override
    public void affecterApprenantForamtion(Integer idApprenant, Integer idFormation) {
        Apprenant apprenant = apprenantRepo.findById(idApprenant).orElse(null);
        Formation formation = formationRepo.findById(idFormation).orElse(null);

        formation.getApprenants().add(apprenant);
        formationRepo.save(formation);
    }
}
