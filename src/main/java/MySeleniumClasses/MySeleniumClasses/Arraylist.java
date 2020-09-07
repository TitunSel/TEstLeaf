package MySeleniumClasses.MySeleniumClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
  
	String name="";
	int age;
	
	String dept;
	public Arraylist(String name, int age, String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		System.out.println(al.size());
		
		al.add(50);
		al.add("bhg");
		al.add(1,"v");
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		System.out.println(al.indexOf("v"));
		
		Arraylist a= new Arraylist("Titun",26,"QA");
		
		Arraylist a1= new Arraylist("Titun1",27,"devops");
		
		Arraylist a3= new Arraylist("Titun2",28,"DBA");
		
		Arraylist a4= new Arraylist("Titun",26,"QA");
		
		ArrayList<Arraylist> ao= new ArrayList<Arraylist>();
		
		ao.add(a);
		ao.add(a1);
		ao.add(a3);
		ao.add(a4);
		ao.add(a1);
		
		Iterator<Arraylist> it=ao.iterator();
		while(it.hasNext()) {
			Arraylist emp=it.next();
			System.out.print(emp.name +" ");
			System.out.print(emp.age +" ");
			System.out.print(emp.dept);
			System.out.println();
		}

	}

}
