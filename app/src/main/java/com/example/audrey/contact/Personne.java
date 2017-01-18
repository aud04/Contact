package com.example.audrey.contact;
import com.orm.SugarRecord;
/**
 * Created by Audrey on 16/01/2017.
 */

public class Personne extends SugarRecord{
    String nom;
    String prenom;
    String number;


    //constructeur vide par rapport a sugar
    public Personne() {
    }

    public Personne(String nom, String prenom, String number) {
        this.nom = nom;
        this.prenom = prenom;
        this.number = number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


}
