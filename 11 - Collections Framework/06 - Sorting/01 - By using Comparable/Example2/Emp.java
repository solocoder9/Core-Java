package Comparable.Example2;

public class Emp implements Comparable<Emp> {
	Integer id;
	String name;

	public Emp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Emp e) {
		return name.compareTo(e.name);
	}

}
