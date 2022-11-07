package com.example.rabiezouita.Controller;

import com.example.rabiezouita.Entities.Apprenant;
import com.example.rabiezouita.Entities.Formateur;
import com.example.rabiezouita.Entities.Formation;
import com.example.rabiezouita.Services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Apprenant")
public class ApprenantController {
    @Autowired
    ApprenantService apprenantService;

    @PostMapping("/ajouterApprenant")
    public Apprenant ajouterApprenant(@RequestBody Apprenant apprenant){
        return    apprenantService.ajouterApprenant(apprenant);

    }
    @PutMapping("/affecterApprenantForamtion/{idapprenant}/{idforamtion}")
    public void affecterApprenantForamtion(@PathVariable("idapprenant") Integer idapprenant, @PathVariable("idforamtion") Integer idformation){
          apprenantService.affecterApprenantForamtion(idapprenant,idformation);

    }

}
