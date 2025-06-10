
package departement;

import java.util.ArrayList;
import java.util.List;

import employe.Employe;



public class Departement {


    // Attributs 

    private int id;
    private String nom;
    private List<Employe> employes = new ArrayList<>();


    // Constructeur
    
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Departement() {}


    // Getters & Setters

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    // Methodes
    
    public void ajouterEmploye(Employe employe) { 
        employes.add(employe); 
    }

    public void retirerEmploye(Employe employe) { 
        employes.remove(employe); 
    }

    public void afficherDetails() {
        System.out.println("Id : " + this.id);
        System.out.println("Nom : " + this.nom);
    }

}