
package employe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import salaire.Salaire;
import project.Projet;



public class Employe {

    // Attributs 

    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateEmbauche;
    private Salaire salaire;
    private List<Projet> projets = new ArrayList<>();
    

    // Constructeur

    public Employe() {}

    public Employe(int id, String nom, String prenom, LocalDate dateEmbauche, Salaire salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    
    // Getters & Setters

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public LocalDate getDateEmbauche() {
        return this.dateEmbauche;
    }

    public Salaire getSalaire() {
        return this.salaire;
    }

    public List<Projet> getProjets() { 
        return projets; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public void ajouterProjet(Projet projet) { 
        projets.add(projet); 
    }

    public void retirerProjet(Projet projet) { 
        projets.remove(projet); 
    }

    // Methodes

    public void afficherDetails() {
        System.out.println("Id : " + this.id);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Date d'embauche : " + this.dateEmbauche);
        System.out.println("Salaire : " + this.salaire);
    }

}
