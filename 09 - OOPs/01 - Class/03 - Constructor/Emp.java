public class Emp {

	int eID;
	String eName;
	float eSalary;

	// Constructor
	public Emp(int eID, String eName, float eSalary) {
		this.eID = eID;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public static void main(String[] args) {

		// Create object
		Emp e1 = new Emp(111, "Justin", 56000.00f);
		Emp e2 = new Emp(222, "Charlie", 60000.00f);

		// Display employee details
		System.out.println(e1.eID + " " + e1.eName + " " + e1.eSalary);
		System.out.println(e2.eID + " " + e2.eName + " " + e2.eSalary);

	}
}
