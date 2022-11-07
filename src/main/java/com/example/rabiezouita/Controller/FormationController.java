package com.example.rabiezouita.Controller;

import com.example.rabiezouita.Entities.Formation;
import com.example.rabiezouita.Services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Formation")
public class FormationController {
    @Autowired
    FormationService formationService ;


    @PostMapping("/ajouterFormation")
    public Formation ajouterFormation(@RequestBody Formation formation){
        return  formationService.ajouterFormation(formation);


    }
    @PutMapping("/affecterFormateurToFormation/{idFormateur}/{idforamtion}")
    public Formation affecterFormateurToFormation(@PathVariable("idFormateur") Integer idformateur, @PathVariable("idforamtion") Integer idformation){
        return  formationService.affecterFormateurToFormation(idformateur,idformation);

    }
    @GetMapping("/getRevenuByFormation/{idFormation}")
    public Integer getRevenuByFormation(@PathVariable("idFormation") Integer idformation){

        return formationService.getRevenuByFormation(idformation);
    }

}
