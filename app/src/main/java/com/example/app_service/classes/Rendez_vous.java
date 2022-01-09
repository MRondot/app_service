package com.example.app_service.classes;

public class Rendez_vous {

    String rAdresse, nomClient, typeClient, nomFournisseur, nomPrestation, heure, date;
    Integer id_rdv;
    Double prix;

    //Constructeurs
    public Rendez_vous(String rAdresse, String nomClient, String typeClient, String nomFournisseur, String nomPrestation, String heure, String date, Integer id_rdv, Double prix) {
        this.rAdresse = rAdresse;
        this.nomClient = nomClient;
        this.typeClient = typeClient;
        this.nomFournisseur = nomFournisseur;
        this.nomPrestation = nomPrestation;
        this.heure = heure;
        this.date = date;
        this.id_rdv = id_rdv;
        this.prix = prix;
    }

    public Rendez_vous(String nomFournisseur,String date,String heure, double prix,String prestation,int id_rdv ){
        this.nomFournisseur = nomFournisseur;
        this.date = date;
        this.prix = prix;
        this.heure = heure;
        this.nomPrestation = prestation;
        this.id_rdv =id_rdv;

    }

    //Accesseurs
    public String getrAdresse() {
        return rAdresse;
    }

    public void setrAdresse(String rAdresse) {
        this.rAdresse = rAdresse;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getNomPrestation() {
        return nomPrestation;
    }

    public void setNomPrestation(String nomPrestation) {
        this.nomPrestation = nomPrestation;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getId_rdv() {
        return id_rdv;
    }

    public void setId_rdv(Integer id_rdv) {
        this.id_rdv = id_rdv;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }







}
