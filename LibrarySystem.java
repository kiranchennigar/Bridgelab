class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + isIssued);
    }
}

class Library {
    private Book[] books = new Book[5];
    private int count = 0;

    public void addBook(int id, String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(id, title, author);
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                if (!books[i].isIssued()) {
                    books[i].issue();
                    System.out.println("Book issued: " + books[i].getTitle());
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                if (books[i].isIssued()) {
                    books[i].returnBook();
                    System.out.println("Book returned: " + books[i].getTitle());
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listAvailableBooks() {
        System.out.println("\nAvailable Books:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (!books[i].isIssued()) {
                books[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books.");
        }
    }
}

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library=new Library();
		library.addBook(1,"maths","abc");
		library.addBook(2,"science","xyz");
		library.addBook(3,"social","dce");
		library.addBook(4,"english","uvw");
		library.addBook(5,"kannada","kan");
		
		library.addBook(6, "Extra Book", "Author");

        library.issueBook(2);
        library.issueBook(4);

        library.returnBook(2);

        library.listAvailableBooks();

	}
}
