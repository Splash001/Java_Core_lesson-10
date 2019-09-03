package ua.lviv.lgs.task5;

import java.util.Arrays;

public class MostCommonWordMain {
	
	public static void main(String[] args) {
		
		String[] m = "When I entered the door , it was closed, because the door is not a good thing to stop me from getting what I want, right door ?".split(" ");
		Arrays.sort(m);

		String maxWord = "", word = "";
		int maxCount = 0, count = 1;

		for (String s : m) {
		    if (s.equals(word)) {
		        count++;
		    } else {
		        if (count > maxCount) {
		            maxCount = count;
		            maxWord = word;
		        }
		        word = s;
		        count = 1;
		    }
		}

		if (count > maxCount) {
		    maxCount = count;
		    maxWord = word;
		}

		System.out.println("The most common word is: " + maxWord + " (it occures " + maxCount + " times)");
		
	}

}
