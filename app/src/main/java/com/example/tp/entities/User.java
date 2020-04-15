package com.example.tp.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "nom")
    public String nom;

    @ColumnInfo(name = "prenom")
    public String prenom;

    @ColumnInfo(name = "Email")
    public String mail;

    @ColumnInfo(name = "Sexe")
    public String sexe;

    @ColumnInfo(name = "pass")
    public String pass;

    @ColumnInfo(name = "code")
    public String CodePermanent;

    public User() {
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCodePermanent() {
        return CodePermanent;
    }

    public void setCodePermanent(String codePermanent) {
        CodePermanent = codePermanent;
    }
}