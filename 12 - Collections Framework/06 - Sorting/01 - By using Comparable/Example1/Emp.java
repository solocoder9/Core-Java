package Comparable.Example;

public class Emp implements Comparable {
	Integer id;
	String name;

	public Emp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Emp e = (Emp) o;
		if (id == e.id) {
			return 0;
		} else if (id > e.id) {
			return 1;
		} else {
			return -1;
		}
	}

}
