
package employe;

import contrat.Contrat;


public class DirecteurGeneral extends Employe {

    // attributs

    private static DirecteurGeneral D;
    private static final String TYPE_EMPLOYE = "Directeur General";


    // attributs

    private DirecteurGeneral() {
        super();
    }

    private DirecteurGeneral(int id, String nom, String prenom, int age, String email, int telephone, String niveau, Contrat contrat) {
        super(id, nom, prenom, age, email, telephone, niveau, contrat);
    }


    // Getters & Setters

    public static DirecteurGeneral getDirecteurGeneral() {
        return D;
    }

    public String getTypeEmploye() {
        return TYPE_EMPLOYE;
    }


    // Methodes

    public static synchronized void NommerDirecteurGeneral() {
        if (D == null) {
            D = new DirecteurGeneral();
        }
    }

    @Override
    public String toString() {
        return "[ " + TYPE_EMPLOYE + " ] -- " + super.toString();
    }

    @Override
    public void afficherInfos() throws InterruptedException {
        super.afficherInfos();
        System.out.println("\nType d'employé - " + TYPE_EMPLOYE);
        Thread.sleep(200);
    }

    
}