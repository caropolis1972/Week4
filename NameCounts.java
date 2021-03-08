package week4;
import java.util.ArrayList;

/*
 * 
 * Section Handout #6: More Arrays and HashMaps
 * 2. Name Counts
Write a program that asks the user for a list of names (one per line) until the user enters a
blank line (i.e., just hits return when asked for a name). At that point the program should
print out how many times each name in the list was entered. You may find that using a
HashMap to keep track of the information entered by user may greatly simplify this
problem. A sample run of this program is shown below.
*
*	Author: Rosa C. Rodriguez
*	File: NameCounts.java
*	week4
*
*/

import java.util.*;
import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	/* Private instance variable */
	Map<String, Integer> nameList = new HashMap<String, Integer>();
	
	
	public void run() {
		
		createListOfNames();
		displayAllNames();
	}
	
	private void displayAllNames() {
		Iterator<String> it = nameList.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			Integer number = nameList.get(name);
			println(name + ": " + number);
		}
		
	}
	
	private void createListOfNames() {
		while(true) {
			String name = readLine("Ener name: ");
			if (name.equals("")) break;
			Integer number = 0; 
			if(nameList.containsKey(name)) {
				number = nameList.get(name);
			}	
			number++;
			nameList.put(name, number);	
		}
	}
	
}
