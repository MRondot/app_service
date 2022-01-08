package com.example.app_service.classes;

public class Fournisseur {

    String nomFournisseur, domaineActivite, adresseF, mail, site, mdp, description, Avis;
    Integer numRCS, numTel;
    Double note;

    public Fournisseur(String nomFournisseur, String domaineActivite, String adresseF, String mail, String site, String mdp, String description, String avis, Integer numRCS, Integer numTel, Double note) {
        this.nomFournisseur = nomFournisseur;
        this.domaineActivite = domaineActivite;
        this.adresseF = adresseF;
        this.mail = mail;
        this.site = site;
        this.mdp = mdp;
        this.description = description;
        Avis = avis;
        this.numRCS = numRCS;
        this.numTel = numTel;
        this.note = note;
    }
    public Fournisseur (String nomFournisseur,String adresseF,String description){
        this.nomFournisseur = nomFournisseur;
        this.adresseF = adresseF;
        this.description = description;
    }

    public Fournisseur(){

    }

    public Fournisseur(String nomFournisseur,String adresseF,String mail,String site,String description){
        this.nomFournisseur = nomFournisseur;
        this.adresseF = adresseF;
        this.mail = mail;
        this.site = site;
        this.description = description;

    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getDomaineActivite() {
        return domaineActivite;
    }

    public void setDomaineActivite(String domaineActivite) {
        this.domaineActivite = domaineActivite;
    }

    public String getAdresseF() {
        return adresseF;
    }

    public void setAdresseF(String adresseF) {
        this.adresseF = adresseF;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvis() {
        return Avis;
    }

    public void setAvis(String avis) {
        Avis = avis;
    }

    public Integer getNumRCS() {
        return numRCS;
    }

    public void setNumRCS(Integer numRCS) {
        this.numRCS = numRCS;
    }

    public Integer getNumTel() {
        return numTel;
    }

    public void setNumTel(Integer numTel) {
        this.numTel = numTel;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }











}
