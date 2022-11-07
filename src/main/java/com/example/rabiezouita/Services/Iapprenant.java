package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.Apprenant;

public interface Iapprenant {
    public Apprenant ajouterApprenant(Apprenant apprenant);
    public void affecterApprenantForamtion(Integer idApprenant, Integer idFormation);
}
