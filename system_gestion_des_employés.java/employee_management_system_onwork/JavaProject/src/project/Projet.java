
package project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import employe.Employe;



public class Projet {

    // Attributs 

    private int id;
    private String nom;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;

    private List<Employe> participants = new ArrayList<>();


    // Constructeur 

    public Projet() {}
    
    public Projet(int id, String nom, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }


    // Getters et Setters

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public LocalDate getDateDebut() {
        return this.dateDebut;
    }

    public LocalDate getDateFin() {
        return this.dateFin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }


    // Methodes

    public void afficherDetails() {
        System.out.println("Id : " + this.id);
        System.out.println("Nom : " + this.nom);
        System.out.println("Date Debut : " + this.dateDebut);
        System.out.println("Date Fin : " + this.dateFin);
    }
    
    public void ajouterEmploye(Employe employe) { 
        participants.add(employe); 
    }

    public void retirerEmploye(Employe employe) { 
        participants.remove(employe); 
    }

}
