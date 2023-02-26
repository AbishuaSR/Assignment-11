package week3.day1;

import java.util.Scanner;

public class ReverseAStringUsingScanner {
	public static void main(String[] args) {
		//Assigning the scanner to take the input values
		Scanner scan=new Scanner(System.in);
		//print the text in the scanner window
		System.out.println("Enter the input");
		//initializing the value is string type
		String value=scan.nextLine();
		//converting string values to array values
		char[] charArray=value.toCharArray();
		//here we are giving string as input so we have used nextLine
		//nextInt,nextChar,nextBoolean
		
		//ITERATE the values by for loop
		for (int i=charArray.length-1;i>=0;i--)
			//print the values
			System.out.println(charArray[i]);
		
	}

}
