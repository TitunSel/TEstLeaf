package MySeleniumClasses.MySeleniumClasses;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
         String [] ar= {"Java", "C#", "Python", "TestNG","C#", "Python"};
         
         //Finding by simple loop
         for(int i=0;i<ar.length;i++)
         {
        	 for(int j=i+1;j<ar.length;j++) {
        		 if(ar[i].equals(ar[j])) {
        			 System.out.println("Duplicate found:" +ar[i]);
        		 }
        	 }
         }
         
         //Using Set
         
         Set<String> s1= new HashSet<String>();
         
         for(int i=0;i<ar.length;i++) {
        	 if(s1.add(ar[i])== false) {
        		 System.out.println("Duplicate found:" +ar[i]);
        	 }
         }
	}

}
