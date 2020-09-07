package MySeleniumClasses.MySeleniumClasses;

//import org.testng.annotations.Test;

public class Test {
	

	public void main1() {
		String s="Plural";
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate found:" +ch[i]);
					count++;
					
				}
			}
		}
 System.out.println(count);
	}

}
