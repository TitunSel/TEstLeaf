package MySeleniumClasses.MySeleniumClasses;

public class Stringreverse {

	public static void main(String[] args) {
		String a="Hello World";
		String rev="";
		char[] b=a.toCharArray();
		for(int i=b.length-1;i>=0;i--) {
			
				rev=rev+b[i];
				
			
		}
		System.out.println(rev);
    
    if(rev.equals(b)) {
    	System.out.println("String is Palindrome:" +rev);
    }
    else {
    	System.out.println("String is not palindrome:" +rev);
    }
	}

}
