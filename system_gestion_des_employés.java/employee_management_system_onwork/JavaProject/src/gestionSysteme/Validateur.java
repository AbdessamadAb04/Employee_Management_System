
package gestionSysteme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public interface Validateur {
    
    default boolean validateurNom(String nom) {

        if (nom == null || nom.length() == 0 || nom.length() > 25) {
            try {
                throw new  IllegalArgumentException("Un nom doit contenir entre 1 et 25 caractères.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
            return false;
        }

        if (!nom.matches("^[a-zA-Z]+$")) {
            try {
                throw new  IllegalArgumentException("Un nom doit contenir uniquement des lettres sans espaces, chiffres ou caractères spéciaux.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
            return false;
        } 

        return true;
    
    }


    default boolean validateurAge(String age) {

        int intAge = Integer.parseInt(age);

        if (intAge >= 18 && intAge <= 65) {
            return true;
        } 

        else {
            try {
                throw new IllegalArgumentException("Un âge doit être compris entre 18 et 65 ans.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
            return false;
        }

    }


    default boolean validateurEmail(String email) {

        try {

            if (email == null || email.trim().isEmpty()) {
                throw new IllegalArgumentException("Un email ne peut pas être vide.");
            }

            // Regex conforme à un format email standard
            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            if (!email.matches(regex)) {
                throw new IllegalArgumentException("L'email n'est pas valide. Exemple attendu : nom@domaine.com");
            }

            if (email.length() > 100) {
                throw new IllegalArgumentException("Un email ne doit pas dépasser 100 caractères.");
            }

            return true;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }


    default boolean validateurTelephone(String tel) {

        if (tel == null || tel.length() == 0) {
            try {
                throw new IllegalArgumentException("Le numéro de téléphone ne peut pas être vide.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return false;
        }

        // Supprimer les espaces pour validation
        String cleanedTel = tel.replaceAll("\\s+", "");

        // Exemple : +33XXXXXXXXX ou 0XXXXXXXXX
        if (!cleanedTel.matches("^(\\+\\d{1,3})?\\d{9,12}$")) {
            try {
                throw new IllegalArgumentException("Le numéro de téléphone doit contenir uniquement des chiffres, avec ou sans indicatif (ex: +33, +213), et comporter entre 9 et 12 chiffres.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return false;
        }

        return true;

    }

    
    default boolean validateurTypeContrat(String typeContrat) {

        if (typeContrat == null || typeContrat.length() == 0 || typeContrat.length() > 50) {
            try {
                throw new  IllegalArgumentException("Un type contrat doit contenir entre 1 et 50 caractères.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
            return false;
        }

        if (!typeContrat.matches("^[a-zA-Z]+$")) {
            try {
                throw new  IllegalArgumentException("Un type contrat doit contenir uniquement des lettres sans espaces, chiffres ou caractères spéciaux.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
            return false;
        } 

        return true;
    
    }


    default boolean validateurDate(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        date = date.trim();

        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("\nFormat invalide: Veuillez entrer une date valide (yyyy-MM-dd).\n");
            return false;
        }
    
    }


}
