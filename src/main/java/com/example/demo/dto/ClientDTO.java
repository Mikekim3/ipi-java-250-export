package com.example.demo.dto;

public class ClientDTO {
	 private String prenom;
	 private String nom;
	 private String age;
	 private String adresse;
	 private String codePostal;
	 private String ville;

	 public String getPrenom() {
	      return prenom;
	 }
	 
	 public void setPrenom(String prenom) {
	      this.prenom = prenom;
	 }
	 
	 public String getNom() {
	      return nom;
	 }
	 
	 public void setNom(String nom) {
	      this.nom = nom;
	 }


     public String getAge() {return age;}

     public void setAge(String age) {
        this.age = age;
     }

	 public String getAdresse() {return adresse;}

	 public void setAdresse(String adresse){
	 	this.adresse = adresse;
	 }

     public String getCodePostal() {
        return codePostal;
     }
     public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
     }

    public String getVille() {
	     return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


}
