
package employe;

import contrat.Contrat;

public class CadreSuperieur extends Employe {

    // attributs

    private final String TYPE_EMPLOYE = "Cadre Superieur";


    // attributs

    CadreSuperieur() {}

    CadreSuperieur(int id, String nom, String prenom, int age, String email, int telephone, String niveau, Contrat contrat) {
        super(id, nom, prenom, age, email, telephone, niveau, contrat);
    }


    // Getters & Setters

    public String getTypeEmploye() {
        return this.TYPE_EMPLOYE;
    }


    // Methodes

    @Override
    public String toString() {
        return "[ " + TYPE_EMPLOYE + " ] -- " + super.toString();
    }

    @Override
    public void afficherInfos() throws InterruptedException {
        super.afficherInfos();
        System.out.println("\nType d'employé - " + this.TYPE_EMPLOYE);
        Thread.sleep(200);
    }

    
}