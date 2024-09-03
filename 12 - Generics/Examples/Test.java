package generics;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(07, "Dhoni"));
		al.add(new Employee(45,"Rohit"));
		al.add(new Employee(18, "Virat"));
		
		for (Employee e : al) {
			System.out.println(e.eID + " " + e.eName);
		}
	}
}
