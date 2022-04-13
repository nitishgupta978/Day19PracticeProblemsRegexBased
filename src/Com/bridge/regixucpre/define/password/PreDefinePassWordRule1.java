package Com.bridge.regixucpre.define.password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinePassWordRule1 {
	public static void main(String[] args) {
		int ch =1;
		do {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter your Pre-define Password");
		String password = user.next();
		
		String regex = "{1}[A-Z]+{1}[a-z]+{1}[0-9]+[@]|[$]|[*]|[#]|[&]|[!][%]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if(matcher.find()) {
			System.out.println("Your password is :"+password+"");
		}
		else {
			System.out.println("please check your password");
		}
		System.out.println("If you want to countinew than press 1...");
		ch=user.nextInt();
		}while(ch==1);
	}
}
