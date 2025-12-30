package LW_05.Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    // Constructor
    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    // Add an item to the library
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // Check out an item by title
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println(title + " has been checked out.");
                    return;
                }
            }
        }
        System.out.println("Item not found or already checked out.");
    }

    // List available items
    public void listAvailableItems() {
        System.out.println("Available items in the library:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                    System.out.println("-------------------");
                }
            }
        }
    }

    // Display library info
    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Total items in library: " + borrowableItemsList.size());
        System.out.println("Available items: " + availableCount);
    }
}
