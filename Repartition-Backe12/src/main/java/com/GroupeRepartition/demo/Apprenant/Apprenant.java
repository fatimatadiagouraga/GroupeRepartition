package com.GroupeRepartition.demo.Apprenant;

import com.GroupeRepartition.demo.Groupe.Groupe;
import com.GroupeRepartition.demo.Repartition.Repartition;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;
    @JsonIgnore
    @ManyToMany(mappedBy = "apprenant")
    private List<Groupe> groupes;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }

    public Etat getEtat() {
        return etat;
    }

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int tel;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Boolean supprimer) {
        this.supprimer = supprimer;
    }

    private Boolean supprimer =false;


    public Apprenant() {
    }

    public Apprenant(Long idApp, String nom, String prenom, String email, int tel, Etat etat, Boolean supprimer) {
        this.idApp = idApp;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.etat = etat;
        this.supprimer = supprimer;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


}
