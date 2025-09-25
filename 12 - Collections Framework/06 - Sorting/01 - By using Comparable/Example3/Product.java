package Comparable.Example3;

public class Product implements Comparable<Product> {
	Integer pid;
	String pname;

	public Product(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public int compareTo(Product p) {

		if (pid == p.pid) {
			return 0;
		} else if (pid > p.pid) {
			return 1;
		} else {
			return -1;
		}
	}

}
