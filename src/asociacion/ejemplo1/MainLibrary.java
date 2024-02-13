package asociacion.ejemplo1;

public class MainLibrary {
    public static void main(String[] args) {

        // We create a library
        Library library = new Library("My Library");

        // We create some books
        Book book1 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez");
        Book book2 = new Book("The Little Prince", "Antoine de Saint-Exupéry");
        Book book3 = new Book("1984", "George Orwell");

        // We add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // We list the books in the library
        System.out.println("Books in " + library.getName() + ":");
        library.listBooks();

    }
}
