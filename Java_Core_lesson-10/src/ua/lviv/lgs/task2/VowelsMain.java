package ua.lviv.lgs.task2;

import java.util.Scanner;

public class VowelsMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the text");
	   
	    String str = scan.nextLine();
	    System.out.println(str.replaceAll("[AaEeIiOoUu]", "-"));
	}

}
