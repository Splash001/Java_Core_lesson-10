package ua.lviv.lgs.task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SentencesMain{
	
	public static void main(String[] args) throws IOException {
		
		FileReader fileName = new FileReader("D:\\text.txt");
        BufferedReader reader = new BufferedReader(fileName);
        
        int sentenceCount = 0;
        String line;
        String terminalSymbol = ".?!";

    while ((line = reader.readLine()) != null) { // Continue reading until end    of file is reached
    for (int i = 0; i < line.length(); i++) {
        if (terminalSymbol.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
            sentenceCount++;
            }
        }
    }


    reader.close();
    System.out.println("The number of sentences is " + sentenceCount);
	
	}
		

}
