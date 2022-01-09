package com.example.app_service.classes;

public class AvisPost {

    String description, nomPrestation, nomClient, date, nomFournisseur;
    Integer note, id_p;

    public AvisPost(String description, String nomClient, String date, Integer note, Integer id_p) {
        this.description = description;
        this.nomClient = nomClient;
        this.date = date;
        this.note = note;
        this.id_p = id_p;
    }
    public AvisPost(String description,Integer note, Integer id_p){
        this.description = description;
        this.note = note;
        this.id_p = id_p;
    }
    public AvisPost(String description,Integer note, Integer id_p, String nomFournisseur){
        this.description = description;
        this.note = note;
        this.id_p = id_p;
        this.nomFournisseur = nomFournisseur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getId_p() {
        return id_p;
    }

    public void setId_p(Integer id_p) {
        this.id_p = id_p;
    }

    public String getNomFournisseur(){return nomFournisseur;}

    public void setNomFournisseur(String nomFournisseur){ this.nomFournisseur = nomFournisseur;}



}
