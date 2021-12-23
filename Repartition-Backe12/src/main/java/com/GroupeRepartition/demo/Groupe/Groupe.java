package com.GroupeRepartition.demo.Groupe;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import com.GroupeRepartition.demo.Repartition.Repartition;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGr;

    private String nom;

    private LocalDate datecreation=LocalDate.now();
    @ManyToMany
    private List<Apprenant> apprenant;

    public Groupe() {
    }

    public Groupe(String nom, LocalDate datecreation) {
        this.nom = nom;
        this.datecreation = datecreation;
    }

    public Long getIdGr() {
        return idGr;
    }

    public void setIdGr(Long idGr) {
        this.idGr = idGr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(LocalDate datecreation) {
        this.datecreation = datecreation;
    }

    public void setApprenant(List<Apprenant> apprenants) {
    }

}
