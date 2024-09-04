package Iterator.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Book> a1 = new ArrayList<Book>();
        a1.add(new Book(111, "Atomic Habit", "James Clear"));
        a1.add(new Book(222, "42 Laws", "Adam SR"));
        a1.add(new Book(333, "The Book", "Alen Jofer"));
        
        // Iterate through the list and remove the book with id 222
        Iterator<Book> itr = a1.iterator();
        
        while (itr.hasNext()) {
            Book b = itr.next();
            if (b.id == 222) {
                itr.remove();
            }
        }
        
        // Uncomment the following block to print the remaining books
        // Iterator<Book> itr2 = a1.iterator();
        // while (itr2.hasNext()) {
        //     Book b = itr2.next();
        //     System.out.println(b.id + " " + b.name + " " + b.author);
        // }
        
        // Print the remaining books using a for-each loop
        for (Book b : a1) {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }
    }
}
