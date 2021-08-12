package regexproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter your Email: ");
		      String email = sc.next();
		      String regex = "^[^.].+$";
		      Pattern pattern = Pattern.compile(regex);
		      //Matching the given phone number with regular expression
		      
		      Matcher matcher = pattern.matcher(email);
		      
		         System.out.println(email +" : "+ matcher.matches());
		     
		   }
	}


