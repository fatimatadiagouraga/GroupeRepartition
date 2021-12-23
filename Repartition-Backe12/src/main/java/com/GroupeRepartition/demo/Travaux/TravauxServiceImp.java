package com.GroupeRepartition.demo.Travaux;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class TravauxServiceImp implements TravauxService{

    @Autowired
    TravauxRepository travauxRepository;

    @Override
    public String ajouterTravaux(Travaux travaux) {
       travauxRepository.save(travaux);
        return "ajout effectuée avec succes";
    }

    @Override
    public Travaux modifierTravaux(Travaux travaux, Long idTr) {
        Travaux travauxexistant=travauxRepository.findById(idTr).get();
        travauxexistant.setTitre(travaux.getTitre());
        travauxexistant.setType(travaux.getType());
        travauxexistant.setDatedebut(travaux.getDatedebut());
        travauxexistant.setDatefin(travaux.getDatefin());
        return travauxRepository.save(travauxexistant);

    }

    @Override
    public String supprimerTravaux(Long idTr) {
        travauxRepository.deleteById(idTr);
        return"suppression effectuée avec succes";
    }

    @Override
    public List<Travaux> listerTravaux() {
        return travauxRepository.findAll();
    }
}
