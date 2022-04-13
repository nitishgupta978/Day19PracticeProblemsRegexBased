package Com.bridge.regixuc2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LastNameStartWithCapLattercheckUc2 {	
		 public static void main(String[] args) {
			 int ch=1;
				do {
			
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter your Last name");
			String name=sc.next();
			

			 String regix="^^{1}[A-Z]+[a-z]|[A-Z]{3}";
			Pattern pattern = Pattern.compile(regix);
			Matcher matcher = pattern.matcher(name);
			
				if (matcher.find()) {
					System.out.println("Your Last Name is " +name+" ");
				}
				else {
					System.out.println("Match not found");
				}
				
			System.out.println("if you Continew this process than press 1..");
			ch=sc.nextInt();
				}while(ch==1);
		 }
	}

