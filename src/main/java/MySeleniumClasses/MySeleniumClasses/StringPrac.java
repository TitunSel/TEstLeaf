package MySeleniumClasses.MySeleniumClasses;

public class StringPrac {

	public static void main(String[] args) {
	 
		//Reverse a String
		//1. Using tocharArray
		
		String s1= "Titun";
		String s2= " ";
		String rev= " ";
		
		char [] c1=s1.toCharArray();
		
		
		for (int i=c1.length-1;i>=0;i--) {
			s2=s2+c1[i];
		}
		
		System.out.println(s2);
		
		//Using charAt
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		// Using Reverse Function
		StringBuilder sb= new StringBuilder(s1);
		System.out.println(sb.reverse());
	}

	  
}
