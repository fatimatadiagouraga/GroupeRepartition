package com.GroupeRepartition.demo.Groupe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/groupe/")

public class GroupeController {
    @Autowired
    ServiceGroupe serviceGroupe;

    @PostMapping("ajoutGroupe")
    public String ajouterGroupe(@RequestBody Groupe groupe){
        serviceGroupe.ajouterGroupe(groupe);
        return "success";
    }

    @PostMapping("modifierGroupe")
    public Groupe modifierGroupe(@RequestBody Groupe groupe,@PathVariable Long idGr){
        return serviceGroupe.modifierGroupe(groupe,idGr);
    }

    @GetMapping("listerGroupe")
    public List<Groupe> listeGroupe(){
        return serviceGroupe.listeGroupe();
    }
    @GetMapping("/genGroupe/{nbreGroupe}")
    public List<Groupe> genereGroupe(@PathVariable("nbreGroupe") Integer nombreGroupe) {
        return serviceGroupe.generateByNbreGroupe(nombreGroupe);
    }
}
