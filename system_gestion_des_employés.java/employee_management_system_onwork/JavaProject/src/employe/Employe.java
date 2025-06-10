
package employe;


import java.util.ArrayList;
import java.util.List;
import contrat.Contrat;
import project.Projet;




abstract public class Employe {

    // Attributs 

    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;
    protected String email;
    protected int telephone;
    protected String niveau;

    protected Contrat contrat;
    protected List<Projet> projets = new ArrayList<>();
    

    // Constructeur

    Employe() {}

    Employe(int id, String nom, String prenom, int age, String email, int telephone, String niveau) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.niveau = niveau;
        this.contrat = new Contrat();
    }

    Employe(int id, String nom, String prenom, int age, String email, int telephone, String niveau, Contrat contrat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.niveau = niveau;
        this.contrat = contrat;
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

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public int getTelephone() {
        return this.telephone;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public Contrat getContrat() {
        return this.contrat;
    }

    public List<Projet> getProjets() { 
        return projets; 
    }

    public int getNbProjets() {
        return projets.size();
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public void ajouterProjet(Projet projet) { 
        projets.add(projet); 
    }

    public void retirerProjet(Projet projet) { 
        projets.remove(projet); 
    }

    // Methodes

    @Override
    public String toString() {
        return "[ " + this.id + ", " + this.nom + ", " + this.prenom + ", " + this.age + " ans, " + this.email + ", tel: " + this.telephone + ", " + this.niveau + ", contratId: " + this.contrat.getId() + ", nbProjets: " + this.getNbProjets() + " ] \n" +
                this.contrat.toString();
    }

    public void afficherInfos() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("\n--- Employé - id : "+ this.id +" ---\n");
        Thread.sleep(200);
        System.out.println("Id                        : " + this.id);
        System.out.println("Nom                       : " + this.nom);
        System.out.println("Prenom                    : " + this.prenom);
        System.out.println("Age                       : " + this.age);
        System.out.println("Email                     : " + this.email);
        System.out.println("Telephone                 : " + this.telephone);
        System.out.println("Niveau                    : " + this.niveau);
        Thread.sleep(200);
        this.contrat.afficherInfos();
    }

}




