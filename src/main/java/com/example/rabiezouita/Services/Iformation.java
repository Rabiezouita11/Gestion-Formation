package com.example.rabiezouita.Services;

import com.example.rabiezouita.Entities.Formation;

public interface Iformation {

    public Formation ajouterFormation(Formation formation);
    public Formation affecterFormateurToFormation(Integer idFormateur , Integer idFormation);
    public Integer getRevenuByFormation(Integer idFormation);
}
