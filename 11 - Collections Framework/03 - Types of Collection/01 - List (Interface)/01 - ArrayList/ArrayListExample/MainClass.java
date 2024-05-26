package ArrayListExample;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee(9, "Solo"));
		al.add(new Student(15, "Suv"));
		al.add("Dhoni");
		al.add(7);
		al.add(null);
		
		System.out.println(al);
		System.out.println(); // print a line
		
		// Printing the elements using for-each loop
		for (Object obj : al) {
			if (obj  instanceof Employee) {
				Employee e = (Employee) obj;
				System.out.println(e.eID + " " + e.eName); 
			}
			if (obj instanceof Student) {
				Student s = (Student) obj;
				System.out.println(s.sID + " " + s.sName); 
			}
			if (obj instanceof Integer) {
				System.out.println(obj); 
			}
			if (obj instanceof String) {
				System.out.println(obj); 
			}
			if (obj == null) {
				System.out.println(obj);
			}
		}
	}
}
