package week4;
/*
 * Section Handout #5: Files, Arrays, and ArrayLists
 * 3. Unique Names
Write a program that asks the user for a list of names (one per line) until the user enters a
blank line (i.e., just hits return when asked for a name). At that point the program should
print out the list of names entered, where each name is listed only once (i.e., uniquely) no
matter how many times the user entered the name in the program. You may find that
using an ArrayList to keep track of the names entered by user may greatly simplify this
problem.
*
*   Author: Rosa C. Rodriguez
*	File: UniqueNames.java
*	Week4
*/

import java.util.*;
import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		ArrayList<String> nameList = new ArrayList<String>();
		while(true) {
			String name = readLine(" ? ");
			if (name.equals("")) break;
			if (!nameList.contains(name))
				nameList.add(name);
		}
		
		for(int i = 0; i < nameList.size(); i++) {
				println(nameList.get(i));
		}

	}
	
}
