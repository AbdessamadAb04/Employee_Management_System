
package contrat;

import java.time.LocalDate;



public class Contrat {
    
    
    // Attributs

    private int id;
    private String typeContrat;      
    private LocalDate dateDebut;
    private LocalDate dateFin;
    
    private Poste poste;
    private Salaire salaire;


    // Constructeurs

    public Contrat() {}

    public Contrat(int id, String typeContrat, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.typeContrat = typeContrat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Contrat(int id, String typeContrat, LocalDate dateDebut, LocalDate dateFin, Poste poste, Salaire salaire) {
        this.id = id;
        this.typeContrat = typeContrat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.poste = poste;
        this.salaire = salaire;
    }

    
    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }


    // Méthodes

    public void afficherInfos() throws InterruptedException {

        System.out.println("\n--- CONTRAT - ID : " + this.id + " ---\n");
        Thread.sleep(200);
        System.out.println("Type de contrat           : " + this.typeContrat);
        System.out.println("Date de début             : " + this.dateDebut);
        System.out.println("Date de fin               : " + this.dateFin);
        Thread.sleep(200);

        this.poste.afficherInfos();

        this.salaire.afficherInfos();

    }

    @Override
    public String toString() {
        return " Contrat  -- [ " + id + ", " + typeContrat + ", Début: " + dateDebut + ", Fin: " + dateFin + " ] \n"
                + this.poste.toString() + "\n"
                + this.salaire.toString();
    }

}