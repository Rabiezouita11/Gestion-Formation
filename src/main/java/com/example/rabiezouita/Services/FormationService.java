package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.Apprenant;
import com.example.rabiezouita.Entities.Formateur;
import com.example.rabiezouita.Entities.Formation;
import com.example.rabiezouita.Repository.DetailFormationRepo;
import com.example.rabiezouita.Repository.FormateurRepo;
import com.example.rabiezouita.Repository.FormationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormationService implements  Iformation {
    @Autowired
    FormationRepo formationRepo;
    @Autowired
    DetailFormationService detailFormationService;
    @Autowired
    FormateurRepo formateurRepo;
    @Override
    public Formation ajouterFormation(Formation formation) {
        detailFormationService.ajouterDetailFormation(formation.getDetailFormation());
        return formationRepo.save(formation);
    }

    @Override
    public Formation affecterFormateurToFormation(Integer idFormateur, Integer idFormation) {
        Formateur formateur= formateurRepo.findById(idFormateur).orElse(null);
        Formation formation = formationRepo.findById(idFormation).orElse(null);

        formation.setFormateur(formateur);
        return formationRepo.save(formation);
    }

    @Override
    public Integer getRevenuByFormation(Integer idFormation) {
     Integer x = 0  ;

        Formation formation = formationRepo.findById(idFormation).orElse(null);
        Integer xx=formation.getApprenants().size();
        Integer bb = formation.getFrais();
        x = xx * bb ;




        return x;
    }
}
