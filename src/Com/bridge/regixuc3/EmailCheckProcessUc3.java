package Com.bridge.regixuc3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailCheckProcessUc3 {
			 public static void main(String[] args) {
				 int ch=1;
					do {
				Scanner sc= new Scanner (System.in);
				System.out.println("Enter your Email");
				String name=sc.next();
				

	
				String regix="{1}^[a-z]+[0-9]+[@,!,@,#,%.$.&.*]+gmail.com";
				Pattern pattern = Pattern.compile(regix);
				Matcher matcher = pattern.matcher(name);
				
					if (matcher.find()) {
						System.out.println("YourEmail is " +name+" ");
					}
					else {
						System.out.println("Your Email not found");
					}
					
				System.out.println("if you Continew this process than press 1..");
				ch=sc.nextInt();
					}while(ch==1);
			 }
		}

