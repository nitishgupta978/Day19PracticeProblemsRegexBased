package Com.bridge.regixuc4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberCheckUc4 {
	public static void main(String[] args) {
					 int ch=1;
						do {
					Scanner sc= new Scanner (System.in);
					System.out.println("Enter your Mobile Number");
					String name=sc.next();
					
					String regix="(91)?[7-9][0-9]{9}/z";
					Pattern pattern = Pattern.compile(regix);
					Matcher matcher = pattern.matcher(name);
					
						if (matcher.find()) {
							System.out.println("Your Mobile Number is " +name+" ");
						}
						else {
							System.out.println("YourMobile Number not found");
						}
						
					System.out.println("if you Continew this process than press 1..");
					ch=sc.nextInt();
						}while(ch==1);
				 }
			}

