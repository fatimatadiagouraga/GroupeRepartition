package com.GroupeRepartition.demo.Groupe;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import com.GroupeRepartition.demo.Apprenant.Repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service

public class GroupeServiceImp implements ServiceGroupe {

    @Autowired
    GroupeRepository groupeRepository;
    @Autowired
    ApprenantRepository apprenantRepository;

    @Override
    public String ajouterGroupe(Groupe groupe) {
        groupeRepository.save(groupe);
        return "ajout effectuée avec succès";
    }
    @Override
    public List<Groupe> listeGroupe() {
        return groupeRepository.findAll();
    }

    @Override
    public Groupe modifierGroupe(Groupe groupe, Long idGr) {
        Groupe groupeX = groupeRepository.findById(idGr).get();
        groupeX.setNom(groupe.getNom());
        groupeX.setDatecreation(groupe.getDatecreation());
        return groupeRepository.save(groupeX);
    }

    @Override
    public Groupe getByIdGroupe(Long idGr) {
        return this.groupeRepository.findById(idGr).get();
    }
    @Override
    public List<Groupe> generateByNbreGroupe(Integer nombreGroupe) {
        List<Apprenant> allApprenants = apprenantRepository.findAll();

//Shuffle liste
        Collections.shuffle(allApprenants);

    List<List<Apprenant>> listGroupeGenetayed = IntStream.range(0, allApprenants.size())
            .boxed()
            .collect(Collectors.groupingBy(i -> i % nombreGroupe))
            .values()
            .stream()
            .map(il -> il.stream().map(allApprenants::get).collect(Collectors.toList()))
            .collect(Collectors.toList());

        for(int i = 0; i < nombreGroupe; i++)
    {
        Groupe groupe = new Groupe();
        groupe.setNom("Groupe "+i);
        groupe.setApprenant(listGroupeGenetayed.get(i));
        groupeRepository.save(groupe);
    }

        return listeGroupe();
}


}




