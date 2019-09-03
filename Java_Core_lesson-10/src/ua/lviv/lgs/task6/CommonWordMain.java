package ua.lviv.lgs.task6;

import java.io.IOException;
import java.util.Arrays;

public class CommonWordMain {

	public static void main(String[] args) throws IOException {

		ReadFile rf = new ReadFile();
		String filename = "D:\\text.txt";

		try {
			String[] lines = rf.readLines(filename);

			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// Print out the exception that occurred
			System.out.println("Unable to create " + filename + ": " + e.getMessage());
		}

		String[] m = rf.readLines(filename);
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
