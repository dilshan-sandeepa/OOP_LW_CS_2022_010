package LW_03.Q5;
import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    // Add item to library
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // Checkout item
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("You have checked out: " + title);
                    } else {
                        System.out.println(title + " is already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println(title + " not found in the library.");
    }

    // List all available items
    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    // Display library info
    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                if (((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("Total items in library: " + borrowableItemsList.size());
        System.out.println("Available items: " + availableCount);
    }
}

