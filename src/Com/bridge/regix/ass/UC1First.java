package Com.bridge.regix.ass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1First {
	public static void main(String[] args) {
		int ch =1;
		do {
		System.out.println("Welcome ");
		Scanner user= new Scanner(System.in);
		System.out.println("Please Enter the Name");
		String name = user.next();
		
		String regex = " ^{1}[A-Z]+[a-z]|[a-z]{3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		
		if(matcher.find()) {
			System.out.println("Walcome Back "+name+" ");
		}
		else {
			System.out.println("Please Enter the vaild First Name...like First name starts with Cap and has minimum 3 characters ");
					 
			}
		System.out.println("If you want to Continew : "+name+" :This Process please Enter 1..");
		ch=user.nextInt();
		}while(ch==1);
	}
}
