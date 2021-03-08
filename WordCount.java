package week4;
/*
 * Section Handout #5: Files, Arrays, and ArrayLists

 * 1. Word count
Write a program WordCount that reads a file and reports how many lines, words, and
characters appear in it. Suppose, for example, that the file lear.txt contains the
following passage from Shakespeare’s King Lear:
For the purposes of this program, a word consists of a consecutive sequence of letters
and/or digits, which you can test using the static method Character.isLetterOrDigit.
Also, you should not count the characters that mark the end of a line, which will have
different values depending on the type of computer.
*
*   Author: Rosa C. Rodriguez
*   File: WordCount.java
*   week4
*/
import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;
import java.util.*;

public class WordCount extends ConsoleProgram {
	int lineCount = 0;
	int wordCount = 0;
	int charCount = 0;
	String line = "";
	String filename = "C:\\Users\\carop\\Desktop\\lear.txt"; 

	public void run() {

		BufferedReader rd = openFile(filename);
		
		try {
			while(true) {

				line = rd.readLine();		
				if (line == null) break;
				println("Read line: [" + line + "]");
				countWordsCharacters(line);

			}
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}

		try {
			rd.close();
		} catch (IOException ex) {
		// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		
		println("File: " + filename);
		println("Lines: " + lineCount);
		println("Words: " + wordCount);
		println("Chars: " + charCount);
		
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
	
		
	public void countWordsCharacters(String line) {
		lineCount++;
		for (int i = 0; i< line.length(); i++) {
			char ch = line.charAt(i);
			charCount++;
			if (!Character.isLetterOrDigit(ch)) {
				wordCount++;
			}
		}
	}
	
}
