
package contrat;



public class Poste {

    // Attributs 
    private String nom;
    private String role;
    private int nbrHeures; // Nombre d'heures par semaine
    private String description;

    // Constructeurs

    public Poste() {}

    public Poste(String nom, String role, int nbrHeures, String description) {
        this.nom = nom;
        this.role = role;
        this.nbrHeures = nbrHeures;
        this.description = description; 
    }

    // Getters & Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Méthode d'affichage

    public void afficherInfos() throws InterruptedException {
        System.out.println("\n--- Poste");
        Thread.sleep(200);
        System.out.println("Nom du poste              : " + this.getNom());
        System.out.println("Rôle                      : " + this.getRole());
        System.out.println("Heures par semaine        : " + this.getNbrHeures());
        System.out.println("Description du poste      : " + this.getDescription());
        Thread.sleep(200);
    }

    // toString pour affichage rapide

    @Override
    public String toString() {
        return " Poste  -- [ " + nom + ", " + role + ", " + nbrHeures + " h/semaine ]";
    }
}
