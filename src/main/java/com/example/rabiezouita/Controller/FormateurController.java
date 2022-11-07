package com.example.rabiezouita.Controller;

import com.example.rabiezouita.Entities.Formateur;
import com.example.rabiezouita.Services.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formateur")
public class FormateurController {
    @Autowired
    FormateurService formateurService ;


    @PostMapping("/ajouterForamteur")
    public Formateur ajouterFormateur(@RequestBody Formateur formateur){
     return    formateurService.ajouterFormateur(formateur);

    }
    @PutMapping("/modifierTarif/{idFormateur}/{inttarif}")
    public Formateur updatetarif (@PathVariable("idFormateur") Integer idformateur , @PathVariable("inttarif") Integer intarif ){

        return  formateurService.updatetarifFormateur(idformateur,intarif);
    }




  /*  @GetMapping("/afficherContrat")
    List<DetailFormation> afficherContrat() {
        return fournisseurService.afficher();
    }*/


}
