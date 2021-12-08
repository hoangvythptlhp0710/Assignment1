package AssignmentDiscussion;

import java.io.Serializable;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class BookManager extends Book implements Serializable {


    public List<Book> books;
    Scanner sc = new Scanner(System.in);


    public BookManager() {
        books = new ArrayList<>();
    }


    public static ArrayList<Book> getBooks() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("books.txt"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        return null;
    }

    /**
     * update this.books by reading books from file books.txt
     */
    public void loadFromFile(){
        System.out.println("Loading books...");
        // TODO: your code here
    }

    /**
     * print books (one/line) in required format
     */
    public static void printBooks(ArrayList<Book> books) throws FileNotFoundException {
        // TODO: your code here
        Scanner sc = new Scanner(new File("books.txt"));
        if (sc.hasNext()){
            String s = sc.next();
            s.toString();
            System.out.println();
        }
        else{
            System.out.println("(empty)");
        }

    }

    /**
     * if book.id is not duplicated, add book to this.books
     * return whether added or not
     */
    public static void add(Book book) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextDouble();
        Book b = new Book(id, name, price);
        // TODO: your code here
        books.add(b);
        for (int i = 0; i < book.id; i++){
            if (book.id == id){
                System.out.println("Duplicate ID!");
            }
        }
        System.out.println("Added successfully.");
    }

    /**
     * return book specified by id, null if not found
     */
    public static Book getBookById(int id) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter price: ");
        // TODO: your code here
        System.out.println("Enter book id: ");
        System.out.println("Enter book name: ");
        System.out.println("Enter book price: ");

        return null;
    }

    /**
     * delete book from this.books
     */
    public static void delete(Book book) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id: ");
        book.id = sc.nextInt();
        for (int i = 0; i < book.id; i++){
            if (book.id == id){
                System.out.println("Invalid ID!");
            }
            else{
                books.remove(getBookById(book.id));
                System.out.println("Deleted Successfully!");
            }
        }
        // TODO: your code here
    }

    /**
     * update this.books to be sorted by price from high -> low
     */
    public static void sortDescByPrice() {
        // TODO: your code here
        for (int i = 0; i < getBookById().price; i++){
            int h = i;
            for (int j = 0; j < getBookById().price; j++){
                int l = j;
            }
        }
    }

    /**
     * return all books having name contains keyword (case in-sensitive)
     */
    public static ArrayList<Book> searchByName(String keyword) {
        ArrayList<Book> matches = new ArrayList<>();

        // TODO: your code here

        return matches;
    }

    /**
     * write this.books to file books.txt in required format
     */
    public static void saveToFile() throws FileNotFoundException {
        PrintWriter b = new PrintWriter("books.txt");
        while (sc.hasNext()){
            String s = sc.nextLine();
        }
        // TODO: your code here
        b.close();
    }
}
