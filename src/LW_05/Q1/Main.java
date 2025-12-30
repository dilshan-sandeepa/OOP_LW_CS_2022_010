package LW_05.Q1;

public class Main {
    public static void main(String[] args) {

        // Create books
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        // create a library
        Library library = new Library();

        // add books to library
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        // display library info
        library.displayLibraryInfo();
        System.out.println();

        // List available items
        library.listAvailableItems();
        System.out.println();

        // Checkout a book
        library.checkoutItem("Island of a Thousand Mirrors");
        System.out.println();

        // List available items again
        library.listAvailableItems();
    }
}

