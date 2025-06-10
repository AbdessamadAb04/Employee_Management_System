package departement;

import java.util.ArrayList;
import java.util.List;
import employe.Dirigeant;
import employe.Employe;



public class Departement {

    // Attributs

    private int id;
    private String nom;
    private String description;
    private String adresse;

    private Dirigeant chefDepartement;
    private List<Employe> employes = new ArrayList<>();


    // Constructeurs

    public Departement() {}

    public Departement(int id, String nom, String description, String adresse) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
    }

    public Departement(int id, String nom, String description, String adresse, Dirigeant chefDepartement) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
        this.chefDepartement = chefDepartement;
    }


    // Getters & Setters

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getAdresse() {
        return adresse;
    }

    public Dirigeant getChefDepartement() {
        return chefDepartement;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public int getNbEmployes() {
        return employes.size();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setChefDepartement(Dirigeant chefDepartement) {
        this.chefDepartement = chefDepartement;
    }


    // Méthodes

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
        System.out.println("\nEmployé " + employe.getNom() + employe.getPrenom() + " ajouté dans le département " + this.nom + "\n");
    }

    public void retirerEmploye(Employe employe) {
        employes.remove(employe);
        System.out.println("\nEmployé " + employe.getNom() + employe.getPrenom() + " retiré du département " + this.nom + "\n");
    }

    public String toString() {
        return "[ " + id + ", " + nom + ", adresse: " + adresse + ", chef: " + (chefDepartement != null ? chefDepartement.getNom() : "non défini") + ", nbEmployes: " + getNbEmployes() + " ]";
    }

    public void afficherInfos() throws InterruptedException {

        Thread.sleep(200);
        System.out.println("\n--- Département - id : " + id + " ---\n");
        Thread.sleep(200);
        System.out.println("Id                        : " + this.id);
        System.out.println("Nom                       : " + nom);
        System.out.println("Adresse                   : " + adresse);
        System.out.println("Description : \n" + description);
        if (chefDepartement != null) {
            System.out.println("Chef du Département       : " + chefDepartement.getNom() + " " + chefDepartement.getPrenom());
        } else {
            System.out.println("Chef du Département     : non défini");
        }
        System.out.println("Nombre d'employés         : " + getNbEmployes());
        Thread.sleep(200);

    }

    
}
