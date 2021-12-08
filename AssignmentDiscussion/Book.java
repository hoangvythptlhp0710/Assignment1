package AssignmentDiscussion;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

import static java.lang.System.out;

public class Book implements Serializable {
    public int id;
    // TODO: your code here
    // attributes id, name, price
    public String name;
    public double price;

    public Book(){
        id = 0;
        name = null;
        price = 0;
    }

    // constructor
    public Book(int id, String name, double price) {
        // TODO: your code here
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        // TODO: your code here
        this.name = name;
    }

    public void setPrice(double price) {
        // TODO: your code here
        this.price = price;
    }


    /**
     * return this as a String in the required format
     */
    @Override
    public String toString() {
        out.printf("%-5s %-45s %-10s", "ID", "Name", "Price");
        out.printf("%5d %-45s %10.2f", id, name, price);
        // TODO: your code here
    }
}
