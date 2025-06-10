package gestionSysteme;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import employe.Employe;
import departement.Departement;
import project.Projet;
import contrat.Salaire;
import contrat.Poste;



public class GestionSysteme {

    Scanner scanner = new Scanner(System.in);


    // Attributs 

    private List<Employe> employes = new ArrayList<>();

    private List<Departement> departements = new ArrayList<>();

    private List<Projet> projets = new ArrayList<>();


    // Getters & Setters

    public List<Employe> getEmployes() {
        return employes;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public List<Projet> getProjets() {
        return projets;
    }


    // Employés - Methodes 
    

    public void extraireSalairesNet() throws InterruptedException {

        for (Employe employe : employes) {

            Thread.sleep(200);
            System.out.println("\n\n__________\n");
            Thread.sleep(200);
            System.out.println("ID: " + employe.getId());
            Thread.sleep(200);
            System.out.println("Nom: " + employe.getNom());
            Thread.sleep(200);
            System.out.println("Prenom: " + employe.getPrenom());
            Thread.sleep(200);
            System.out.println("Salaire net: " + employe.getSalaire().calculerSalaireNet());
            Thread.sleep(200);
            System.out.println("\n__________");

        }

    }


    // Departements - Methodes 

    public void ajouterDepartement(Departement departement, int size) throws InterruptedException {
        
    
        departements.add(departement);

        System.out.println("Saisir les informations du département: \n");


        // Id input

        int id;

        id = size;

        departement.setId(id);
        Thread.sleep(200);

        // Nom input

        String nom;

        System.out.println("Nom: ");
        nom = scanner.nextLine();

        departement.setNom(nom);
        Thread.sleep(200);


        // Departement ajouté

        System.out.println("Departement ajouté avec succès.\n");
        Thread.sleep(200);

    }


    public void supprimerDepartement() throws InterruptedException {

        boolean existe = false;
        int idDepartement = -1;

        do {

            Thread.sleep(200);
            System.out.println("Saisisez l'ID du département que vous souhaitez supprimer: \n");
            idDepartement = scanner.nextInt();
            Thread.sleep(200);

            for (Departement departement : departements) {
                if (departement.getId() == idDepartement) {
                    existe = true;
                    System.out.println("Informations du département avec ID " + idDepartement + " : \n");
                    Thread.sleep(200);
                    System.out.println("Nom: " + departement.getNom());
                    Thread.sleep(200);
                    break;
                }
            }

            if (existe == false) {
                System.out.println("Aucun département trouvé avec cet ID, merci de réessayer. \n");
                Thread.sleep(200);
            }

        } while (existe == false);

        int choix;

        do {

            System.out.println("\n\nEtes vous sûr de supprimer définitivement ce département ? ");
            Thread.sleep(200);
            System.out.println("1. Oui");
            Thread.sleep(200);
            System.out.println("2. Non: Annuler la suppression du département \n");
            Thread.sleep(200);
            System.out.println("0. Quitter le menu\n\n");
            Thread.sleep(200);

            System.out.println("> Saisir votre option:  ");
            choix = scanner.nextInt();
            Thread.sleep(200);
            System.out.println("\n\n");

            switch (choix) {

                case 1:

                    final int idToRemove = idDepartement;
                    departements.removeIf(d -> d.getId() == idToRemove);
                    System.out.println("Département supprimé avec succès.\n\n");
                    Thread.sleep(200);

                break;

                case 2:

                    System.out.println("Suppression annulée.\n\n");
                    supprimerDepartement();
                    Thread.sleep(200);

                return;

                case 0:

                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(200);

                break;

                default:

                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);

                break;
            }

        } while (choix != 0 && choix != 1);

    }


    public void afficherDepartement() throws InterruptedException {

        if (departements.isEmpty()) {

        Thread.sleep(200);
        System.out.println("Aucun département enregistré.\n");
        
        } else {

            for (Departement departement : departements) {

                Thread.sleep(200);
                System.out.println("\n\n__________\n");
                Thread.sleep(200);
                System.out.println("ID: " + departement.getId());
                Thread.sleep(200);
                System.out.println("Nom: " + departement.getNom());
                Thread.sleep(200);
                System.out.println("\n__________");
            }
        
        }

    }


    public void modifierDepartement() throws InterruptedException {

        boolean existe = false;
        int idDepartement = -1;

        do {

            System.out.println("Saisisez l'ID du département que vous souhaitez modifier: \n");
            idDepartement = scanner.nextInt();
            Thread.sleep(200);

            for(Departement departement : departements) {
                if(departement.getId() == idDepartement) {
                    existe = true;
                    System.out.println("Informations du département avec ID " + idDepartement + " : \n");
                    Thread.sleep(200);
                    System.out.println("Nom: " + departement.getNom());
                    Thread.sleep(200);
                    break;
                }
            }

            if(existe == false) {
                System.out.println("Aucun département trouvé avec cet ID, merci de réessayer. \n");
                Thread.sleep(200);
            }

        } while(existe == false);

        int choix;

        do {

            System.out.println("\n\nEtes-vous sûr de modifier ce département ? ");
            Thread.sleep(200);
            System.out.println("1. Oui");
            Thread.sleep(200);
            System.out.println("2. Non: Annuler la modification du département \n");
            Thread.sleep(200);
            System.out.println("0. Quitter le menu\n\n");  
            Thread.sleep(200); 

            System.out.println("> Saisir votre option:  ");
            choix = scanner.nextInt();
            System.out.println("\n\n");
            Thread.sleep(200); 

            switch(choix) {

                case 1:

                    int choix2;

                    do {

                        System.out.println("\nChoisissez une option pour modifier le département: \n");
                        Thread.sleep(200);
                        System.out.println("1. modifier - Nom");
                        Thread.sleep(200);
                        System.out.println("0. Quitter le menu\n\n");  
                        Thread.sleep(200); 

                        System.out.println("> Saisir votre option:  ");
                        choix2 = scanner.nextInt();
                        System.out.println("\n\n");
                        Thread.sleep(200); 

                        switch(choix2) {

                            case 1:

                                System.out.println("-- modifier - Nom ---\n");

                                System.out.println("Nom: " + departements.get(idDepartement-1).getNom());
                                Thread.sleep(200);
 
                                System.out.println("Nouveau - Nom: ");
                                scanner.nextLine();
                                String nom = scanner.nextLine();

                                departements.get(idDepartement-1).setNom(nom);

                                System.out.println("Modification validée avec succès.\n");
                                Thread.sleep(200);

                            break;

                            case 0:

                                System.out.println("Retour en cours... \n\n");
                                Thread.sleep(200);
                            break;

                            default:

                                System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                                Thread.sleep(200);
                            break;
                        }

                    } while (choix2 != 0);

                break;

                case 2:
                    System.out.println("Modification annulée.\n\n");
                    Thread.sleep(200);
                    modifierDepartement();
                return;

                case 0:
                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(200);
                break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;

            }

        } while (choix != 0 && choix != 1);

    }


    public void rechercherDepartement() throws InterruptedException {

        boolean existe = false;
        int idDepartement = -1;

        Thread.sleep(200);
        System.out.println("Saisissez l'ID du département que vous recherchez: \n");
        idDepartement = scanner.nextInt();
        Thread.sleep(200);

        for (Departement departement : departements) {
            if (departement.getId() == idDepartement) {
                existe = true;
                System.out.println("\n\nInformations du département avec ID " + idDepartement + " : \n");
                Thread.sleep(200);
                System.out.println("Nom: " + departement.getNom());
                Thread.sleep(200);
                break;
            }
        }

        if (existe == false) {
            System.out.println("Aucun département trouvé avec cet ID. \n");
            Thread.sleep(200);
        }

        int choix;

        do {
            System.out.println("\nVoulez-vous rechercher un autre département ? \n");
            Thread.sleep(200);
            System.out.println("1. Oui\n");
            Thread.sleep(200);
            System.out.println("0. Non: Quitter le menu \n\n");
            choix = scanner.nextInt();
            Thread.sleep(200);

            switch (choix) {
                case 1:
                    rechercherDepartement();
                    return;

                case 0:
                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(200);
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                    break;
            }

        } while (choix != 0);
    
    }


    // Projets - Methodes

    public void ajouterProjet(Projet projet, int size) throws InterruptedException {
        
    
        projets.add(projet);

        System.out.println("Saisir les informations du projet: \n");


        // Id input

        int id;

        id = size;

        projet.setId(id);


        // Nom input

        String nom;

        System.out.println("Nom: ");
        nom = scanner.nextLine();

        projet.setNom(nom);


        // DateDebut input

        LocalDate dateDebut = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (dateDebut == null) {

        System.out.println("Date Debut (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine().trim();

        try {
            dateDebut = LocalDate.parse(dateInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("\nFormat invalide: Veuillez entrer une date valide (yyyy-MM-dd).\n");
        }

        }

        projet.setDateDebut(dateDebut);


        // DateFin input

        LocalDate dateFin = null;

        while (dateFin == null) {

        System.out.println("Date Fin (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine().trim();

        try {
            dateFin = LocalDate.parse(dateInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("\nFormat invalide: Veuillez entrer une date valide (yyyy-MM-dd).\n");
        }

        }

        projet.setDateFin(dateFin);


        // Projet ajouté

        System.out.println("Projet ajouté avec succès.\n");

    }


    public void modifierProjet() throws InterruptedException { 

        boolean existe = false;
        int idProjet = -1;

        System.out.println("Saisisez l'ID du projet que vous souhaitez modifier: \n");
        idProjet = scanner.nextInt();
        Thread.sleep(200);

        for(Projet projet : projets) {

            if(projet.getId() == idProjet) {

                existe = true;
                System.out.println("Informations du projet avec ID " + idProjet + " : \n");
                Thread.sleep(200);
                System.out.println("Nom: " + projet.getNom());
                Thread.sleep(200);
                System.out.println("Date début: " + projet.getDateDebut());
                Thread.sleep(200);
                System.out.println("Date fin: " + projet.getDateFin());
                Thread.sleep(200);
                break;
            }

        }

        if(existe == false) {
            System.out.println("Aucun projet trouvé avec cet ID, merci de réessayer. \n");
            Thread.sleep(200);
        }

        int choix;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        do {

            System.out.println("\nChoisissez la propriété que vous souhaiter modifier: \n");
            Thread.sleep(200);
            System.out.println("1. Nom ");
            Thread.sleep(200);
            System.out.println("2. DateDebut ");
            Thread.sleep(200);
            System.out.println("3. DateFin ");
            Thread.sleep(200);
            System.out.println("0. Quitter le menu ");
            choix = scanner.nextInt();
            Thread.sleep(200);

            switch(choix) {

                case 1:
                    System.out.println("Saisir le nouveau nom du projet: \n");
                    projets.get(idProjet-1).setNom(scanner.next());
                    Thread.sleep(200);
                return;

                case 2:

                    LocalDate dateDebut = null;

                    while (dateDebut == null) {

                        System.out.println("Saisir la nouvelle date de début du projet (yyyy-MM-dd): \n");
                        String dateInput = scanner.nextLine().trim();
                        Thread.sleep(200);

                        try {
                            dateDebut = LocalDate.parse(dateInput, formatter);
                        } catch (DateTimeParseException e) {
                            System.out.println("\nFormat invalide: Veuillez entrer une date valide (yyyy-MM-dd).\n");
                        }

                    }

                    projets.get(idProjet-1).setDateDebut(dateDebut);
                
                return;

                case 3:

                    LocalDate dateFin = null;

                    while (dateFin == null) {

                        System.out.println("Saisir la nouvelle date de fin du projet (yyyy-MM-dd): \n");
                        String dateInput = scanner.nextLine().trim();
                        Thread.sleep(200);

                        try {
                            dateFin = LocalDate.parse(dateInput, formatter);
                        } catch (DateTimeParseException e) {
                            System.out.println("\nFormat invalide: Veuillez entrer une date valide (yyyy-MM-dd).\n");
                        }

                    }

                    projets.get(idProjet-1).setDateFin(dateFin);

                return;

                case 0:
                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(200);
                break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;

            }
        
        } while (choix != 0);

    }

    
    public void afficherProjets() throws InterruptedException {

        if (projets.isEmpty()) {

            Thread.sleep(200);
            System.out.println("Aucun projet enregistré.\n");

        } else {

            for (Projet projet : projets) {

                Thread.sleep(200);
                System.out.println("\n\n__________\n");
                Thread.sleep(200);
                System.out.println("ID: " + projet.getId());
                Thread.sleep(200);
                System.out.println("Nom: " + projet.getNom());
                Thread.sleep(200);
                System.out.println("Date début: " + projet.getDateDebut());
                Thread.sleep(200);
                System.out.println("Date fin: " + projet.getDateFin());
                Thread.sleep(200);
                System.out.println("\n__________");

            }

        }

    }


    public void supprimerProjet() throws InterruptedException {

        boolean existe = false;
        int idProjet = -1;

        do {

            Thread.sleep(200);
            System.out.println("Saisisez l'ID du projet que vous souhaitez supprimer: \n");
            idProjet = scanner.nextInt();
            Thread.sleep(200);

            for (Projet projet : projets) {
                if (projet.getId() == idProjet) {
                    existe = true;
                    System.out.println("Informations du projet avec ID " + idProjet + " : \n");
                    Thread.sleep(200);
                    System.out.println("Nom: " + projet.getNom());
                    Thread.sleep(200);
                    System.out.println("Date début: " + projet.getDateDebut());
                    Thread.sleep(200);
                    System.out.println("Date fin: " + projet.getDateFin());
                    Thread.sleep(200);
                    break;
                }
            }

            if (existe == false) {
                System.out.println("Aucun projet trouvé avec cet ID, merci de réessayer. \n");
                Thread.sleep(200);
            }

        } while (existe == false);

        int choix;

        do {

            System.out.println("\n\nÊtes-vous sûr de supprimer définitivement ce projet ? ");
            Thread.sleep(200);
            System.out.println("1. Oui");
            Thread.sleep(200);
            System.out.println("2. Non: Annuler la suppression du projet \n");
            Thread.sleep(200);
            System.out.println("0. Quitter le menu\n\n");
            Thread.sleep(200);

            System.out.println("> Saisir votre option:  ");
            choix = scanner.nextInt();
            Thread.sleep(200);
            System.out.println("\n\n");

            switch (choix) {

                case 1:

                    final int idToRemove = idProjet;
                    projets.removeIf(p -> p.getId() == idToRemove);
                    System.out.println("Projet supprimé avec succès.\n\n");
                    Thread.sleep(200);

                break;

                case 2:

                    System.out.println("Suppression annulée.\n\n");
                    supprimerProjet();
                    Thread.sleep(200);

                return;

                case 0:

                    System.out.println("Retour en cours... \n\n");
                    Thread.sleep(200);

                break;

                default:

                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);

                break;
            }

        } while (choix != 0 && choix != 1);

    }

    
    public void rechercherProjet() throws InterruptedException {

        boolean existe = false;
        int idProjet = -1;

        Thread.sleep(200);
        System.out.println("Saisissez l'ID du projet que vous recherchez : ");
        idProjet = scanner.nextInt();
        Thread.sleep(200);

        for (Projet projet : projets) {
            if (projet.getId() == idProjet) {
                existe = true;
                System.out.println("\n\nInformations du projet avec ID " + idProjet + " :\n");
                Thread.sleep(200);
                System.out.println("Nom: " + projet.getNom());
                Thread.sleep(200);
                System.out.println("Date début: " + projet.getDateDebut());
                Thread.sleep(200);
                System.out.println("Date fin: " + projet.getDateFin());
                Thread.sleep(200);
                break;
            }
        }

        if (!existe) {
            System.out.println("Aucun projet trouvé avec cet ID.\n");
            Thread.sleep(200);
        }

        int choix;

        do {
            System.out.println("\nVoulez-vous rechercher un autre projet ?\n");
            Thread.sleep(200);
            System.out.println("1. Oui");
            Thread.sleep(200);
            System.out.println("0. Non : Quitter le menu\n");
            choix = scanner.nextInt();
            Thread.sleep(200);

            switch (choix) {
                case 1:
                    rechercherProjet();
                    return;

                case 0:
                    System.out.println("Retour en cours...\n");
                    Thread.sleep(200);
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir une option valide.\n");
                    Thread.sleep(200);
                    break;
            }

        } while (choix != 0);
    
    }

} 









