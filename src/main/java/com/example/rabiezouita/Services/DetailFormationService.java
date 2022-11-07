package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.DetailFormation;
import com.example.rabiezouita.Repository.DetailFormationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailFormationService  implements  IdetailFormation{
    @Autowired
    DetailFormationRepo detailFormationRepo;
    @Override
    public DetailFormation ajouterDetailFormation(DetailFormation detailFormation) {
        return detailFormationRepo.save(detailFormation);
    }
}
