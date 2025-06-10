
package salaire;



public class Salaire {

    // Attributs 
    
    private double salaireBase;
    private double primes;
    private double bonus;
    private double deductions;

    // Constructeur 

    public Salaire() {}
    
    public Salaire(double salaireBase, double primes, double bonus, double deductions) {
        this.salaireBase = salaireBase;
        this.primes = primes;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    // Getters & Setters

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public void setPrimes(double primes) {
        this.primes = primes;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public double getPrimes() {
        return primes;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    // Methodes 
    
    public double calculerSalaireNet() {
        return this.salaireBase + this.primes + this.bonus - this.deductions;
    }

}
