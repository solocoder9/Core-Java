package Comparable.Example3;

import java.util.Collections;
import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {

		LinkedList<Product> ll = new LinkedList<Product>();
		ll.add(new Product(111, "Bat"));
		ll.add(new Product(444, "Ball"));
		ll.add(new Product(222, "Stump"));
		ll.add(new Product(333, "Bell"));

		Collections.sort(ll);

		for (Product p : ll) {
			System.out.println(p.pid + " " + p.pname);
		}
	}
}
