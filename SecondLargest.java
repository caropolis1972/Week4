package week4;
/*
 * finds the largest and the second-largest integer. 
 * use 0 as a sentinel to indicate the end of the input list.
 * 
 * Author: Rosa C. Rodriguez
 * File: SecondLargest.java
 * week4
 * 
 */

import java.util.*;

import acm.program.ConsoleProgram;

public class SecondLargest extends ConsoleProgram{
	
	public void run() {
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		while(true) {
			int number = readInt(" ? " );
			if (number == 0) break;
			iList.add(number);
		}
		
		int largest = iList.get(0);
		int secondLargest = iList.get(0);	
		
		for(int j = 1; j < iList.size(); j++) {

			if (iList.get(j) > largest) {
				secondLargest = largest;
				largest = iList.get(j);
				
				
			} else if (iList.get(j) > secondLargest) {
				secondLargest = iList.get(j);
			}
		}
		println("largest number : " + largest);
		println("second largest : " + secondLargest);	
	}
}
