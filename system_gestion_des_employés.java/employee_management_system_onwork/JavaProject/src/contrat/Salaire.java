
package contrat;



public class Salaire {

    // Attributs 
    private double salaireBase;
    private String typeSalaire;     // Exemple : "Mensuel", "Horaire"
    private String modePaiement;    // Exemple : "Virement", "Chèque", "Espèces"
    private double primes;
    private double bonus;
    private double deductions;

    // Constructeurs

    public Salaire() {}

    public Salaire(double salaireBase, String typeSalaire, String modePaiement,
                   double primes, double bonus, double deductions) {
        this.salaireBase = salaireBase;
        this.typeSalaire = typeSalaire;
        this.modePaiement = modePaiement;
        this.primes = primes;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    // Getters & Setters

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public String getTypeSalaire() {
        return typeSalaire;
    }

    public void setTypeSalaire(String typeSalaire) {
        this.typeSalaire = typeSalaire;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public double getPrimes() {
        return primes;
    }

    public void setPrimes(double primes) {
        this.primes = primes;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Méthodes

    public double calculerSalaireNet() {
        return salaireBase + primes + bonus - deductions;
    }

    public void afficherInfos() throws InterruptedException {
        System.out.println("\n--- Salaire");
        Thread.sleep(200);
        System.out.println("Salaire de base           : " + this.getSalaireBase() + " DA");
        System.out.println("Type de salaire           : " + this.getTypeSalaire());
        System.out.println("Mode de paiement          : " + this.getModePaiement());
        System.out.println("Primes                    : " + this.getPrimes() + " DA");
        System.out.println("Bonus                     : " + this.getBonus() + " DA");
        System.out.println("Déductions                : " + this.getDeductions() + " DA");
        System.out.println("Salaire net               : " + this.calculerSalaireNet() + " DA");
        Thread.sleep(200);
    }

    @Override
    public String toString() {
        return " Salaire -- [ Base: " + salaireBase + ", Net: " + calculerSalaireNet() + " DA, Paiement: " + modePaiement + " ]";
    }
}
