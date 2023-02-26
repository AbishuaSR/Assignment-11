package week3.day1;

public class Palindrom {
	public static void main(String[] args) {
		String pal="madam";
		//create another string to store the reverse string
		String rev="";
		//since we are giving the input value as string we have to use length() property
		//If it is a char value we can simply give length
		for(int i=pal.length()-1;i>=0;i--) {
			//In string length is a method but in arrays it is a property
			//we don't have any direct method to reverse a string
			//hence we convert string to characters and convert it.
			rev=rev+pal.charAt(i);
			//note that charAt has (Parenthesis)  not [SquareBrackets].
					}System.out.println(rev);

		if(pal.equals(rev)) {
			System.out.println("The given string is a palindrome");
		}
		else
			
			System.out.println("The given string is not a palindrome");
		}

}

