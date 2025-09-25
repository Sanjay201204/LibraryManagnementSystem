// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Java Basics", "James Gosling");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        User user1 = new User("Sanjay", 101);

        System.out.println("Books in Library:");
        library.showBooks();

        System.out.println("\n" + user1.getName() + " wants to issue Harry Potter.");
        library.issueBook("Harry Potter");

        System.out.println("\nBooks after issue:");
        library.showBooks();

        System.out.println("\n" + user1.getName() + " returns Harry Potter.");
        library.returnBook("Harry Potter");

        System.out.println("\nBooks after return:");
        library.showBooks();
    }
}