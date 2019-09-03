package ua.lviv.lgs.task1;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String[] args) {

		System.out.println("Enter 5-letter palindrome word:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		if (str.length() != 5) {
			System.err.println("This is not a five-letter word!!!!");
		}

		String reverse = new StringBuffer(str).reverse().toString();

		if (str.toLowerCase().equals(reverse.toLowerCase()))
			System.out.println("Your word: " + str + ", is palindrome");

		else
			System.out.println("Your word isn't palindrome");
	}
}
