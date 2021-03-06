/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

import java.util.Date;

/**
 *
 * @author MSI
 */
public class User {

    private int id;
    private int cin_u;
    private String nom_u;
    private String prenom_u;
    private Date date_naissance;
    private String email_u;
    private int num_tel;
    private String role;
    private String mot_de_passe;

    public User() {
    }

    public User(int id,int cin_u, String nom_u, String prenom_u, Date date_naissance, String email_u, int num_tel, String role, String mot_de_passe) {
        this.id = id;
        this.cin_u = cin_u;
        this.nom_u = nom_u;
        this.prenom_u = prenom_u;
        this.date_naissance = date_naissance;
        this.email_u = email_u;
        this.num_tel = num_tel;
        this.role = role;
        this.mot_de_passe = mot_de_passe;
    }
    //
      public User(int cin_u, String nom_u, String prenom_u, Date date_naissance, String email_u, int num_tel, String role, String mot_de_passe){
        this.cin_u = cin_u;
        this.nom_u = nom_u;
        this.prenom_u = prenom_u;
        this.date_naissance = date_naissance;
        this.email_u = email_u;
        this.num_tel = num_tel;
        this.role = role;
        this.mot_de_passe = mot_de_passe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin_u() {
        return cin_u;
    }

    public void setCin_u(int cin_u) {
        this.cin_u = cin_u;
    }

    public String getNom_u() {
        return nom_u;
    }

    public void setNom_u(String nom_u) {
        this.nom_u = nom_u;
    }

    public String getPrenom_u() {
        return prenom_u;
    }

    public void setPrenom_u(String prenom_u) {
        this.prenom_u = prenom_u;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail_u() {
        return email_u;
    }

    public void setEmail_u(String email_u) {
        this.email_u = email_u;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", cin_u=" + cin_u + ", nom_u=" + nom_u + ", prenom_u=" + prenom_u + ", date_naissance=" + date_naissance + ", email_u=" + email_u + ", num_tel=" + num_tel + ", role=" + role + ", mot_de_passe=" + mot_de_passe + '}';
    }
   

}
