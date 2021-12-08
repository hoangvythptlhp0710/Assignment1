package AssignmentDiscussion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends BookManager{

    private static void displayMenu(){
        for (int i = 0; i < 40; i++){
            System.out.println("-");
        }
        System.out.println("1. list all books");
        System.out.println("2. add a new book");
        System.out.println("3. edit book");
        System.out.println("4. delete a book");
        System.out.println("5. search books by name");
        System.out.println("6. sort books descending by price");
        System.out.println();
        System.out.println("0. save & exit");
        for (int i = 0; i < 40; i++){
            System.out.println("-");
        }
        System.out.println("Your option: ");
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BookManager Book = new BookManager();
        while (true){
            displayMenu();
            int option = sc.nextInt();
            switch(option){
                case 1:
                    getBooks();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    break;


            }
        }
    }
}
