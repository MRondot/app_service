package com.example.app_service.classes;

public class Client {

    String nomC, prenom, adresse, mail, mdp;
    Integer age;

    //Constructeur
    public Client(String nomC, String prenom, String adresse, String mail, String mdp, Integer age, Integer id_c) {
        this.nomC = nomC;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.mdp = mdp;
        this.age = age;
        this.id_c = id_c;
    }

    public Client(String nomC, String mail, String mdp){
        this.nomC = nomC;
        this.mail = mail;
        this.mdp = mdp;
    }

    //Accesseurs
    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId_c() {
        return id_c;
    }

    public void setId_c(Integer id_c) {
        this.id_c = id_c;
    }




    Integer id_c;
}
