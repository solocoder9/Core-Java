package Comparator.Example2;

import java.util.Comparator;

public class IdComp implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        // For descending order
        if (p2.pid == p1.pid) {
            return 0;
        } else if (p2.pid > p1.pid) {
            return 1;
        } else {
            return -1;
        }
    }

}
