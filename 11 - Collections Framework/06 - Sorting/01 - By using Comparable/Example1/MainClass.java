package Comparable.Example;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Dhoni"));
		al.add(new Emp(222, "Rohit"));
		al.add(new Emp(444, "Shivam"));
		al.add(new Emp(555, "Rutu"));
		al.add(new Emp(333, "Virat"));

		Collections.sort(al);

		for (Emp e : al) {
			System.out.println(e.id + " " + e.name);
		}

	}
}
