package com.example.app_service.classes;


//Non utilisé
public class InfoBancaire {


    String IBAN, nomBanque, nomFournisseur;


    //Constructeur
    public InfoBancaire(String IBAN, String nomBanque, String nomFournisseur) {
        this.IBAN = IBAN;
        this.nomBanque = nomBanque;
        this.nomFournisseur = nomFournisseur;
    }


    //Accesseurs
    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }




}
