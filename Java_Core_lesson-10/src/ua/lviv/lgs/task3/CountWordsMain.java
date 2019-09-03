package ua.lviv.lgs.task3;

import java.util.Scanner;

public class CountWordsMain {
	
	public static void main(String[] args) {
	    Scanner sca = new Scanner(System.in);
	    System.out.println("Please type some words, then press enter: ");
	    String sentences= sca.nextLine();
	    String[] count_words= sentences.split(" ");
	    System.out.println("Number of words is "+ count_words.length);
	}

}
