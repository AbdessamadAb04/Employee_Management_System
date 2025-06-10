
package employe;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestionSysteme.Validateur;




public class GestionEmployes implements Validateur {

    Scanner scanner = new Scanner(System.in);


    // Attributs 

    private List<Employe> employes = new ArrayList<>();


    // Getters & Setters

    public List<Employe> getEmployes() {
        return employes;
    }


    // Methodes Internes

    private void instancierEmploye(Employe employe, int id) {

        // Instanciation avec saisie ID

        employes.add(employe);

        employe.setId(id);

    }


    private String saisieNom(Employe employe, String typeSaisie) throws InterruptedException {

        boolean nomInput;
        String nom;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Nom: " + employe.getNom() + "\n");
            Thread.sleep(200);
        }

        do {

            System.out.println("Nom: ");
            nom = scanner.nextLine();
            Thread.sleep(200);

            nomInput = validateurNom(nom);

        } while(nomInput != true);

        if(typeSaisie.equals("lecture")) {
            return nom;
        } else {
            employe.setNom(nom);
            System.out.println("Saisie complétè avec succès");
            return nom;
        }

    }


    private String saisiePrenom(Employe employe, String typeSaisie) throws InterruptedException {

        boolean prenomInput;
        String prenom;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Prenom: " + employe.getPrenom() + "\n");
        }

        do {

            System.out.println("Prénom: ");
            prenom = scanner.nextLine();
            Thread.sleep(200);

            prenomInput = validateurNom(prenom);

        } while(prenomInput != true);

        if(typeSaisie.equals("lecture")) {
            return prenom;
        } else {
            employe.setPrenom(prenom);
            System.out.println("Saisie complétè avec succès");
            return prenom;
        }

    }


    private int saisieAge(Employe employe, String typeSaisie) throws InterruptedException {

        boolean ageInput;
        String age;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Age: " + employe.getAge() + "\n");
        }

        do {

            System.out.println("Age: ");
            age = scanner.nextLine();
            Thread.sleep(200);

            ageInput = validateurAge(age);

        } while(ageInput != true);

        int intAge = Integer.parseInt(age);

        if(typeSaisie.equals("lecture")) {
            return intAge;
        } else {
            employe.setAge(intAge);
            System.out.println("Saisie complétè avec succès");
            return intAge;
        }

    }


    private String saisieEmail(Employe employe, String typeSaisie) throws InterruptedException {

        boolean emailInput;
        String email;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Email: " + employe.getEmail() + "\n");
        }

        do {

            System.out.println("Email: ");
            email = scanner.nextLine();
            Thread.sleep(200);

            emailInput = validateurEmail(email);

        } while(emailInput != true);

        if(typeSaisie.equals("lecture")) {
            return email;
        } else {
            employe.setEmail(email);
            System.out.println("Saisie complétè avec succès");
            return email;
        }

    }


    private int saisieTelephone(Employe employe, String typeSaisie) throws InterruptedException {

        boolean telephoneInput;
        String telephone;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Telephone: " + employe.getTelephone() + "\n");
        }

        do {

            System.out.println("telephone: ");
            telephone = scanner.nextLine();
            Thread.sleep(200);

            telephoneInput = validateurTelephone(telephone);

        } while(telephoneInput != true);

        int intTelephone = Integer.parseInt(telephone);

        if(typeSaisie.equals("lecture")) {
            return intTelephone;
        } else {
            employe.setTelephone(intTelephone);
            System.out.println("Saisie complétè avec succès");
            return intTelephone;
        }

    }


    private String saisieNiveau(Employe employe, String typeSaisie) throws InterruptedException {

        int choixNiveau;

        if(typeSaisie.equals("modification")) {
            System.out.println("Ancien Niveau: " + employe.getNiveau() + "\n");
        }

        do {

            System.out.println("Choisir le niveau d'experience: \n");
            Thread.sleep(200);
            System.out.println("1. Débutant (0-1 an)");
            Thread.sleep(200);
            System.out.println("2. Junior (1-3 ans)");
            Thread.sleep(200);
            System.out.println("3. Intermédiaire (3-5 ans)");
            Thread.sleep(200);
            System.out.println("4. Confirmé (5-8 ans)");
            Thread.sleep(200);
            System.out.println("5. Senior (8-12 ans)");
            Thread.sleep(200);
            System.out.println("6. Expert (12+ ans)");
            Thread.sleep(200);
            System.out.println("> Saisir votre option:  ");
            choixNiveau = scanner.nextInt();
            System.out.println("\n\n");
            Thread.sleep(200);

            switch(choixNiveau) {

                case 1:

                    // Débutant (0-1 an)

                    if(typeSaisie.equals("lecture"))  {
                        return "Débutant";
                    } else {
                        employe.setNiveau("Débutant");
                        System.out.println("Saisie complétè avec succès");
                        return "Débutant";
                    }


                case 2:

                    // Junior (1-3 ans)

                    if(typeSaisie.equals("lecture"))  {
                        return "Junior";
                    } else {
                        employe.setNiveau("Junior");
                        System.out.println("Saisie complétè avec succès");
                        return "Junior";
                    }


                case 3:

                    // Intermédiaire (3-5 ans)

                    if(typeSaisie.equals("lecture"))  {
                        return "Intermédiaire";
                    } else {
                        employe.setNiveau("Intermédiaire");
                        System.out.println("Saisie complétè avec succès");
                        return "Intermédiaire";
                    }


                case 4:

                    // Confirmé (5-8 ans)

                    if(typeSaisie.equals("lecture"))  {
                        return "Confirmé";
                    } else {
                        employe.setNiveau("Confirmé");
                        System.out.println("Saisie complétè avec succès");
                        return "Confirmé";
                    }


                case 5:

                    // Senior (8-12 ans)

                    if(typeSaisie.equals("lecture"))  {
                        return "Senior";
                    } else {
                        employe.setNiveau("Senior");
                        System.out.println("Saisie complétè avec succès");
                        return "Senior";
                    }


                case 6:

                    // Expert (12+ ans)

                    if(typeSaisie.equals("lecture"))  {
                        return "Expert";
                    } else {
                        employe.setNiveau("Expert");
                        System.out.println("Saisie complétè avec succès");
                        return "Expert";
                    }


                default:
                    Thread.sleep(200);
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(1000);
                break;
            }

        } while(choixNiveau < 1 || choixNiveau > 6);

        return "";

    }


    private int confirmerExecution(String execution) throws InterruptedException {

        int choixExecution;

        do {

            System.out.println("\n\nEtes vous sure de vouloir "+ execution + " cet employé ? ");
            Thread.sleep(200);
            System.out.println("1. Oui: procéder à l'éxécution");
            Thread.sleep(200);
            System.out.println("2. Non: Annuler l'éxécution \n");
            Thread.sleep(200);
            System.out.println("0. Quitter vers le menu\n\n");  
            Thread.sleep(200); 

            System.out.println("> Saisir votre option:  ");
            choixExecution = scanner.nextInt();
            Thread.sleep(200);

            switch(choixExecution) {

                case 1:
                    Thread.sleep(200);
                    return 1;

                case 2:
                    System.out.println("Annulation de l'éxécution...");
                    Thread.sleep(200);
                    return 2;

                case 0:
                    System.out.println("Retour au menu...");
                    Thread.sleep(200);
                    return 0;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;

            }

        } while (choixExecution < 0 && choixExecution > 2);

        return 0;
            
    }


    private int extraireEmployeParId(String execution) throws InterruptedException {

        boolean existe = false;

        do {

            System.out.println("Saisisez l'ID de l'employé que vous souhaitez " + execution + ": \n");
            int id = scanner.nextInt();
            Thread.sleep(200);

            for(Employe employe : employes) {
                if(employe.getId() == id) {
                    employe.afficherInfos();
                    return id;
                }
            }

            System.out.println("Aucun employé trouvé avec cet ID, veuillez réessayer. \n");
            Thread.sleep(200);

        } while (existe == false);

        return 0;

    }


    // Methodes Externes

    public void ajouterEmploye() throws InterruptedException {

        // Choix type employé

        int id = getEmployes().size() + 1;

        int choixEmploye;

        do {

            System.out.println("Choisir quelle type d'employé vous souhaitez ajouter: \n");
            Thread.sleep(200);
            System.out.println("1. Operationel");
            Thread.sleep(200);
            System.out.println("2. Cadre Intermédiaire");
            Thread.sleep(200);
            System.out.println("3. Cadre Supérieure");
            Thread.sleep(200);
            System.out.println("4. Dirigeant");
            Thread.sleep(200);
            System.out.println("5. Fonction support");
            Thread.sleep(200);
            System.out.println("> Saisir votre option:  ");
            choixEmploye = scanner.nextInt();
            System.out.println("\n\n");
            Thread.sleep(200);

            switch(choixEmploye) {
                
                case 1:

                // Operationel

                instancierEmploye(new Operationel(), id);

                break;
                
                case 2:

                // Cadre Intermédiaire

                instancierEmploye(new CadreIntermediaire(), id);

                break;
                
                case 3:

                // Cadre Supérieure

                instancierEmploye(new CadreSuperieur(), id);

                break;

                case 4:

                // Dirigeant

                instancierEmploye(new Dirigeant(), id);

                break;
                
                case 5:

                // Directeur General

                instancierEmploye(new FonctionSupport(), id);

                break;
                

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;
            
            }
        
        } while(choixEmploye < 1 || choixEmploye > 5);

        Employe employe = employes.get(id);


        // Nom input

        saisieNom(employe, "insertion");


        // Prénom input

        saisiePrenom(employe, "insertion");


        // Age input

        saisieAge(employe, "insertion");


        // Email input

        saisieEmail(employe, "insertion");


        // Telephone input

        saisieTelephone(employe, "insertion");


        // Niveau input
        
        saisieNiveau(employe, "insertion");

        // Employé ajouté

        System.out.println("Employé ajouté avec succès.\n");
        Thread.sleep(200);

    }


    public void supprimerEmploye() throws InterruptedException { 

        int id = extraireEmployeParId("supprimer");

        int choixExecution = confirmerExecution("supprimer");

        if (choixExecution == 0) {
            return;
        }

        else if (choixExecution == 2) {
            supprimerEmploye();
            return;
        }

        final int idToRemove = id;

        employes.removeIf(e -> e.getId() == idToRemove); 
        System.out.println("Employé supprimé avec succés.\n\n");
        Thread.sleep(200);

    }


    public void modifierEmploye() throws InterruptedException {

        int id = extraireEmployeParId("modifier");

        int choixExecution = confirmerExecution("modifier");

        if (choixExecution == 0) {
            return;
        }

        else if (choixExecution == 2) {
            modifierEmploye();
            return;
        }

        int choixAttribut;

        Employe employe = employes.get(id);

        do {

            System.out.println("\nChoisissez une option pour modifier l'employé: \n");
            Thread.sleep(200);
            System.out.println("1. modifier - Nom");
            Thread.sleep(200);
            System.out.println("2. modifier - Prenom");
            Thread.sleep(200);
            System.out.println("3. modifier - Age");
            Thread.sleep(200);
            System.out.println("4. modifier - Email");
            Thread.sleep(200);
            System.out.println("5. modifier - Telephone");
            Thread.sleep(200);
            System.out.println("6. modifier - Niveau");
            Thread.sleep(200);

            System.out.println("> Saisir votre option:  ");
            choixAttribut = scanner.nextInt();
            System.out.println("\n\n");
            Thread.sleep(200); 

            switch(choixAttribut) {

                case 1:
                    saisieNom(employe, "modification");
                break;

                case 2:
                    saisiePrenom(employe, "modification");
                break;

                case 3:
                    saisieAge(employe, "modification");
                break;

                case 4:
                    saisieEmail(employe, "modification");
                break;

                case 5:
                    saisieTelephone(employe, "modification");
                break;

                case 6:
                    saisieNiveau(employe, "modification");
                break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;
            }

        } while(choixAttribut < 1 && choixAttribut > 5);

    }


    public void rechercherEmploye() throws InterruptedException {

        int choixContinuer;

        do {

            extraireEmployeParId("modifier");

            System.out.println("\nVoulez vous rechercher un autre employé ? \n");
            Thread.sleep(200);
            System.out.println("1. Oui\n");
            Thread.sleep(200);
            System.out.println("0. Non: Quitter le menu \n\n");
            choixContinuer = scanner.nextInt();
            Thread.sleep(200);

            switch(choixContinuer) {

                case 1:
                    rechercherEmploye();
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

        } while (choixContinuer != 0);

    }


    public void afficherEmployes() throws InterruptedException {

        int choixAffichage;

        do {

            System.out.println("\nChoisissez une option pour afficher les employés: \n");
            Thread.sleep(200);
            System.out.println("1. afficher - Ensemble employés");
            Thread.sleep(200);
            System.out.println("2. afficher - par type d'employes");
            Thread.sleep(200);
            System.out.println("3. afficher - par niveau d'experiences");
            Thread.sleep(200);

            System.out.println("> Saisir votre option:  ");
            choixAffichage = scanner.nextInt();
            System.out.println("\n\n");
            Thread.sleep(200); 

            switch(choixAffichage) {

                case 1:
                    afficherEnsembleEmployes();
                break;

                case 2:
                    afficherEmployesParType();
                break;

                case 3:
                    afficherEmployesParNiveau();
                break;

                default:
                    System.out.println("Choix invalide. Veuillez saisir un choix convenant l'une des options requises. \n\n");
                    Thread.sleep(200);
                break;
            }

        } while(choixAffichage < 1 && choixAffichage > 3);

    }
    

    public void afficherEnsembleEmployes() throws InterruptedException {
        for (Employe employe : employes) {
            System.out.println(employe.toString() + "\n");
            Thread.sleep(200);
        }
    }


    public void afficherEmployesParNiveau() throws InterruptedException {
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Débutant") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
        System.out.println("\n __________________________ \n");
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Junior") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
        System.out.println("\n __________________________ \n");
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Intermédiaire") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
        System.out.println("\n __________________________ \n");
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Confirmé") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
        System.out.println("\n __________________________ \n");
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Senior") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
        System.out.println("\n __________________________ \n");
        for (Employe employe : employes) {
            if(employe.getNiveau() == "Expert") {
                System.out.println(employe.toString() + "\n");
                Thread.sleep(200);
            }
        }
    }


    public void afficherEmployesParType() throws InterruptedException {

        System.out.println("\n __________________________ \n");

        for (Employe employe : employes) {
            if(employe instanceof Operationel) {
                Operationel op = (Operationel) employe;
                System.out.println(op.toString() + "\n");
                Thread.sleep(200);
            }
        }

        System.out.println("\n __________________________ \n");

        for (Employe employe : employes) {
            if(employe instanceof CadreIntermediaire) {
                CadreIntermediaire ci = (CadreIntermediaire) employe;
                System.out.println(ci.toString() + "\n");
                Thread.sleep(200);
            }
        }

        System.out.println("\n __________________________ \n");

        for (Employe employe : employes) {
            if(employe instanceof CadreSuperieur) {
                CadreSuperieur cs = (CadreSuperieur) employe;
                System.out.println(cs.toString() + "\n");
                Thread.sleep(200);
            }
        }

        System.out.println("\n __________________________ \n");

        for (Employe employe : employes) {
            if(employe instanceof Dirigeant) {
                Dirigeant dg = (Dirigeant) employe;
                System.out.println(dg.toString() + "\n");
                Thread.sleep(200);
            }
        }

        System.out.println("\n __________________________ \n");

        for (Employe employe : employes) {
            if(employe instanceof FonctionSupport) {
                FonctionSupport fs = (FonctionSupport) employe;
                System.out.println(fs.toString() + "\n");
                Thread.sleep(200);
            }
        }

    }    


}
