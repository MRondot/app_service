package com.example.app_service.classes;

public class Prestation {

    String nomPrestation, description, nomFournisseur;
    Boolean mobilite;
    Double accompte, prix;

    //Constructeur
    public Prestation(String nomPrestation, String description, String nomFournisseur, Boolean mobilite, Double accompte, Double prix) {
        this.nomPrestation = nomPrestation;
        this.description = description;
        this.nomFournisseur = nomFournisseur;
        this.mobilite = mobilite;
        this.accompte = accompte;
        this.prix = prix;
    }

    //Accesseur
    public String getNomPrestation() {
        return nomPrestation;
    }

    public void setNomPrestation(String nomPrestation) {
        this.nomPrestation = nomPrestation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public Boolean getMobilite() {
        return mobilite;
    }

    public void setMobilite(Boolean mobilite) {
        this.mobilite = mobilite;
    }

    public Double getAccompte() {
        return accompte;
    }

    public void setAccompte(Double accompte) {
        this.accompte = accompte;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }




}
