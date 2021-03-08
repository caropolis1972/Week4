package week4;
/*
 * Section Handout #5: Files, Arrays, and ArrayLists
 * 2. Histograms
Write a program that reads a list of exam scores from the file
MidtermScores.txt (which contains one score per line) and
then displays a histogram of those numbers, divided into the
ranges 0–9, 10–19, 20–29, and so forth, up to the range
containing only the value 100. If, for example,
MidtermScores.txt contains the data shown in the right
margin, your program should then be able to generate a
histogram that looks as much as possible like the following
sample run:
* 
* 	Author: Rosa C. Rodriguez
* 	File: Histograms.java
* 	week4
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 2. Histograms
Write a program that reads a list of exam scores from the file
MidtermScores.txt (which contains one score per line) and
then displays a histogram of those numbers, divided into the
ranges 0–9, 10–19, 20–29, and so forth, up to the range
containing only the value 100. If, for example,
MidtermScores.txt contains the data shown in the right
margin, your program should then be able to generate a
histogram that looks as much as possible like the following
sample run:
MidtermScores
*  Author: Rosa C. Rodriguez
*  File: Histograms.java
*  week4
*  
*/
import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;
import java.util.*;

public class Histograms extends ConsoleProgram {

	int[] scores = new int[11];
	int lineCount = 0;
	String line = "";
	String countAsterisk = "";
	String filename = "C:\\\\Users\\\\carop\\\\Desktop\\\\MidtermScores.txt"; 

	public void run() {
		BufferedReader rd = openFile(filename);
		
		try {
			while(true) {

				line = rd.readLine();		
				if (line == null) break;
				countScores(line);

			}
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
		
		int i = 0;
		for (int s:scores) {
			if (i < 100) {
				println(i + "-" + (i + 9) + ":" + scoreCountToChars(s));
				i = i + 10;
			} else {
				println(i + ":" + scoreCountToChars(s));
			}	
		}
	}
	
	private BufferedReader openFile(String filename) {

		BufferedReader rd = null;
		
		while (rd == null) {
			try {
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				println("That file doesn't exist");
			}
		}
		return rd;
	}
	
	public void countScores(String line) {
		lineCount++;
		int score = Integer.valueOf(line);
		if (score < 10) 
			scores[0]++;
		else if (score < 20)
			scores[1]++;
		else if (score < 30)
			scores[2]++;
		else if (score < 40)
			scores[3]++;
		else if (score < 50)
			scores[4]++;
		else if (score < 60)
			scores[5]++;
		else if (score < 70)
			scores[6]++;
		else if (score < 80)
			scores[7]++;
		else if (score < 90)
			scores[8]++;
		else if (score < 100)
			scores[9]++;
		else 
			scores[10]++;
	}
	
	public String scoreCountToChars(int s) {
		countAsterisk = "";
		for (int i = 1; i <= s; i++) {
			countAsterisk+= countAsterisk = "*";
		}
		return countAsterisk;
	}
}
