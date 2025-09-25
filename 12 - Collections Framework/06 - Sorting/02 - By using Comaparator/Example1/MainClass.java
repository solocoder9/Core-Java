package Comparator.Example1;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(111, "Dhoni"));
        al.add(new Emp(444, "Rohit"));
        al.add(new Emp(333, "Virat"));
        al.add(new Emp(222, "Rutu"));

        // Sort the data by id
        Collections.sort(al, new EidComp());

        for (Emp e : al) {
            System.out.println(e.eid + " " + e.ename);
        }

        System.out.println("=================================");

        // Sort the data by name
        Collections.sort(al, new EnameComp());

        for (Emp e : al) {
            System.out.println(e.eid + " " + e.ename);
        }
    }
}
