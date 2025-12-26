package SRP.Solution;

public class BookBusnessLogic {
    public void emprunter(BookSRP book, String lecteur) {

        System.out.println("\nEmprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

//On peut ajouter d'autres logiques

    public void autreService(BookSRP book) {

        System.out.println("\nAutre logique métier sur le livre '" + book.getTitle());
    }
}

