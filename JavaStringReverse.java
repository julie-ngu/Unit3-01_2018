/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Nov 2018
 * Created for: ICS4U
 * Reversed string program in java
 * 
 ****************************************************************************/
import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// main
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse: ");
		
		if(userInput.hasNextLine()) {
			String userText = userInput.nextLine();
			String reverse = reversString(userText);
			System.out.print("\nReversed string: " + reverse + "\n");
		}
		else {
			System.out.print("\nError\n");
		}
	}
	
	private static String reversString(String theSentence) {
		// this is a recursive procedure printing out the sentence backwards
		String txtReversed = "";
		String theSentenceSubstring;
		char lastCharOfString;
		
		if(theSentence.length() > 0) {
			theSentenceSubstring = theSentence.substring(0,  theSentence.length() - 1);
			
			// write out the last character in the current variable
			lastCharOfString = theSentence.charAt(theSentence.length() - 1);
			
			// adds last character of current string to a variable
			// recursion - inputs substring of current string into method to get next character
			txtReversed = lastCharOfString + reversString(theSentenceSubstring);
			
			return txtReversed; 
		}
		else {
			return theSentence;
		}
	}
}
