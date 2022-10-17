//Amani Minaya Assignment 4
//This assignment takes user input and returns the length of last word
import java.util.Scanner;
public class assignment4 {
	public static void main(String[] args) {
		//gets user input to store in sentence 
		Scanner sentence = new Scanner (System.in);
		System.out.println("Enter a sentence: ");
		String words = sentence.nextLine();
		
		// takes last word of sentence 
		String lastWord= words.substring(words.lastIndexOf(" ") +1);
		
		//prints out last word length
		System.out.println("The length of your last word in your sentence is: " + lastWord.length());

	}

}
