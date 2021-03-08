package week4;
/*
 * 	Author: Rosa C. Rodriguez
 *  File: RemoveDoubleLetters.java
 *  Week4
 */
import acm.program.ConsoleProgram;

public class RemoveDoubleLetters extends ConsoleProgram {


		public void run() {
			
			println("tresidder " + removeDoubledLetters("tresidder"));
			
			println("bookkeeper " + removeDoubledLetters("bookkeeper"));
					
		}
		
		public String removeDoubledLetters(String str) {
			println("lenght " + str.length());
			
			String newStr = "";			
			int i = 1;
			while(i < str.length()) {		
				newStr += str.charAt(i-1);
				if (str.charAt(i) == str.charAt(i-1)) { 
					i++;
				} else if (i == str.length() - 1) {
					newStr += str.charAt(i);
				}
				i++;
			}
			
			return newStr;
		}
}
