package MySeleniumClasses.MySeleniumClasses;

public class StringSegregation {

	public static void main(String[] args) {
	
		String s1= "fname143 lname";
		StringBuilder alpha = new StringBuilder(), num= new StringBuilder();
		int total=0;
		
		for(int i=0;i<s1.length();i++) {
			if(Character.isAlphabetic(s1.charAt(i))) {
				alpha.append(s1.charAt(i));
			}
			else if(Character.isDigit(s1.charAt(i))) {
				int in=s1.charAt(i);
				total=total+in;
				
			}
			
			else if(Character.isWhitespace(s1.charAt(i))) {
				alpha.append(s1.charAt(i));
			}
		}
		
		alpha.append(total);
		
		System.out.println(alpha);

	}

}
