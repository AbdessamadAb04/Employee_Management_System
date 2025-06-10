
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import employe.Employe;
import salaire.Salaire;
import departement.Departement;
import project.Projet;


public class Main {

    public static void main(String[] args) throws Exception {

        GestionEmployes sys = new GestionEmployes();

        Scanner scanner = new Scanner(System.in);


        // Menu principal

        // branch 1
        int choice1;

        do { 

            Thread.sleep(200);
            System.out.println("--- Application Systeme de Gestion des Employées ---\n\n");
            Thread.sleep(1000);

            System.out.println("1. Gestion Systeme: Employés");
            Thread.sleep(200);
            System.out.println("2. Gestion Systeme: Départements");
            Thread.sleep(200);
            System.out.println("3. Gestion Systeme: Projets\n\n");
            Thread.sleep(200);

            System.out.println("> Saisir votre option:  ");
            choice1 = scanner.nextInt();
            System.out.println("\n\n\n");

            switch(choice1) {

                case 1:

                    // Gestion Systeme: Employés 

                    // branch 11
                    int choice11;

                    do {

                        Thread.sleep(200);
                        System.out.println("-- Gestion Systeme: Employés --\n\n");
                        Thread.sleep(1000);

                        System.out.println("1. Ajouter un nouvel employé");
                        Thread.sleep(200);
                        System.out.println("2. Afficher la liste des employés");
                        Thread.sleep(200);
                        System.out.println("3. Supprimer un employé");
                        Thread.sleep(200);
                        System.out.println("4. Rechercher un employé");
                        Thread.sleep(200);
                        System.out.println("5. Modifier un employé");
                        Thread.sleep(200);
                        System.out.println("6. Extraire les salaires net\n");
                        Thread.sleep(200);

                        System.out.println("0. Retour\n\n");
                        Thread.sleep(200);

                        System.out.println("> Saisir votre option:  ");
                        choice11 = scanner.nextInt();
                        System.out.println("\n\n\n");

                        switch(choice11) {

                            case 1:

                                // Ajouter un nouvel employé

                                // branch 111

                                Thread.sleep(200);
                                System.out.println("-- Ajouter un nouvel employé --\n\n");
                                Thread.sleep(1000);

                                int size = sys.getEmployes().size() + 1;

                                sys.ajouterEmploye(new Employe(), size);

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 2:

                                // Afficher la liste des employés

                                // branch 112

                                Thread.sleep(200);
                                System.out.println("-- Afficher la liste des employés --\n\n");
                                Thread.sleep(1000);

                                sys.afficherEmployes();

                                System.out.println("\n\n\n");
                                   
                            break;

                            case 3:

                                // Supprimer un employé

                                // branch 113

                                Thread.sleep(200);
                                System.out.println("-- Supprimer un employé --\n\n");
                                Thread.sleep(1000);

                                sys.supprimerEmploye();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 4:

                                // Rechercher un employé

                                // branch 114

                                Thread.sleep(200);
                                System.out.println("-- Rechercher un employé --\n\n");
                                Thread.sleep(1000);

                                sys.rechercherEmploye();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 5:

                                // Rechercher un employé

                                // branch 115

                                Thread.sleep(200);
                                System.out.println("-- Modifier un employé --\n\n");
                                Thread.sleep(1000);

                                sys.modifierEmploye();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 6:

                                // Extraire le salaire net

                                // branch 116

                                Thread.sleep(200);
                                System.out.println("-- Extraire les salaires net --\n\n");
                                Thread.sleep(1000);

                                sys.extraireSalairesNet();

                                System.out.println("\n\n\n");

                            break;

                            case 0:

                                Thread.sleep(200);
                                System.out.println("Retour en cours... \n\n");
                                Thread.sleep(1000);

                            break;

                            default:

                                Thread.sleep(200);
                                System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                                Thread.sleep(1000);

                            break;

                        }

                    } while(choice11!=0);

                break;

                case 2:

                    // Gestion Systeme: Départements

                    // branch 12
                    int choice12;

                    do {

                        Thread.sleep(200);
                        System.out.println("-- Gestion Systeme: Départements --\n\n");
                        Thread.sleep(1000);
                
                        System.out.println("1. Ajouter un nouveau département");
                        Thread.sleep(200);
                        System.out.println("2. Afficher la liste des départements");
                        Thread.sleep(200);
                        System.out.println("3. Modifier un département");
                        Thread.sleep(200);
                        System.out.println("4. Supprimer un département");
                        Thread.sleep(200);
                        System.out.println("5. Rechercher un département\n");
                        Thread.sleep(200);
                
                        System.out.println("0. Retour\n\n");
                        Thread.sleep(200);

                        System.out.println("> Saisir votre option:  ");
                        choice12 = scanner.nextInt();
                        System.out.println("\n\n\n");

                        switch(choice12) {

                            case 1:

                                // Ajouter un nouveau département

                                // branch 121

                                Thread.sleep(200);
                                System.out.println("-- Ajouter un nouveau département --\n\n");
                                Thread.sleep(1000);

                                int size = sys.getDepartements().size() + 1;

                                sys.ajouterDepartement(new Departement(), size);

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 2:

                                // Afficher la liste des départements

                                // branch 122

                                Thread.sleep(200);
                                System.out.println("-- Afficher la liste des départements --\n\n");
                                Thread.sleep(1000);

                                sys.afficherDepartement();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 3:

                                // Modifier un département

                                // branch 123

                                Thread.sleep(200);
                                System.out.println("-- Modifier un département --\n\n");
                                Thread.sleep(1000);

                                sys.modifierDepartement();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 4:

                                // Supprimer un département

                                // branch 124

                                Thread.sleep(200);
                                System.out.println("-- Supprimer un département --\n\n");
                                Thread.sleep(1000);

                                sys.supprimerDepartement();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 5:

                                // Rechercher un département

                                // branch 125

                                Thread.sleep(200);
                                System.out.println("-- Rechercher un département --\n\n");
                                Thread.sleep(1000);

                                sys.rechercherDepartement();

                                System.out.println("\n\n\n");

                            break;

                            case 0:

                            Thread.sleep(200);
                            System.out.println("Retour en cours... \n\n");
                            Thread.sleep(1000);

                            break;

                            default:

                                Thread.sleep(200);
                                System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                                Thread.sleep(1000);

                            break;

                        }

                    } while(choice12!=0);

                break;

                case 3:

                    // Gestion Systeme: Projets

                    // Choice 13
                    int choice13;

                    do {

                        Thread.sleep(200);
                        System.out.println("-- Gestion Systeme: Projets --\n\n");
                        Thread.sleep(1000);
                
                        System.out.println("1. Ajouter un nouveau projet");
                        Thread.sleep(200);
                        System.out.println("2. Afficher la liste des projets");
                        Thread.sleep(200);
                        System.out.println("3. Modifier un projet");
                        Thread.sleep(200);
                        System.out.println("4. Supprimer un projet");
                        Thread.sleep(200);
                        System.out.println("5. Rechercher un projet\n");
                        Thread.sleep(200);
                
                        System.out.println("0. Retour\n\n");
                        Thread.sleep(200);

                        System.out.println("> Saisir votre option:  ");
                        choice13 = scanner.nextInt();
                        System.out.println("\n\n\n");

                        switch(choice13) {

                            case 1:

                                // Ajouter un nouveau projet

                                // branch 131

                                Thread.sleep(200);
                                System.out.println("-- Ajouter un nouveau projet --\n\n");
                                Thread.sleep(1000);

                                int size = sys.getProjets().size() + 1;

                                sys.ajouterProjet(new Projet(), size);

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 2:

                                // Afficher la liste des projets

                                // branch 132

                                Thread.sleep(200);
                                System.out.println("-- Afficher la liste des projets --\n\n");
                                Thread.sleep(1000);

                                sys.afficherProjets();

                                System.out.println("\n\n\n");
                                    

                            break;

                            case 3:

                                // Modifier un projet

                                // branch 133

                                Thread.sleep(200);
                                System.out.println("-- Modifier un projet --\n\n");
                                Thread.sleep(1000);

                                sys.modifierProjet();

                                System.out.println("\n\n\n");

                            break;

                            case 4:

                                // Supprimer un projet

                                // branch 134

                                Thread.sleep(200);
                                System.out.println("-- Supprimer un projet --\n\n");
                                Thread.sleep(1000);

                                sys.supprimerProjet();

                                System.out.println("\n\n\n");
                                    
                            break;

                            case 5:

                                // Rechercher un projet

                                // Choice 135

                                Thread.sleep(200);
                                System.out.println("-- Rechercher un projet --\n\n");
                                Thread.sleep(1000);

                                sys.rechercherProjet();

                                System.out.println("\n\n\n");

                            break;

                            case 0:

                                Thread.sleep(200);
                                System.out.println("Retour en cours... \n\n");
                                Thread.sleep(1000);

                            break;

                            default:

                                Thread.sleep(200);
                                System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                                Thread.sleep(1000);

                            break;

                        }

                    } while(choice13!=0);

                break;

                case 0:

                    Thread.sleep(200);
                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(1000);

                break;

                default:

                    Thread.sleep(200);
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(1000);

                break;

            }

        } while (choice1 != 0);


        scanner.close();
    
    }

}
