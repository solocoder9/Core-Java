package Comparator.Example2;

import java.util.Comparator;

public class NameComp implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		// For descending order
		return p2.pname.compareTo(p1.pname);
	}
}
