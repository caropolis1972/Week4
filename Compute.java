package week4;

import java.util.*;

import acm.program.ConsoleProgram;


public class Compute extends ConsoleProgram {

	public void run() {
		double a = 5.0 / 4 - 4 / 5;
		
		println("double a = 5.0 / 4 - 4 / 5 " + a);
		
		if (7 < 9 - 5 && 3 % 0 == 3) 
			println("7 < 9 - 5 && 3 % 0 == 3 TRUE");
		else 
			println("7 < 9 - 5 && 3 % 0 == 3 FALSE");
		
		String b = "B" + 8 + 4;
		
		println("String b = \"B\" + 8 + 4 " + b);
		
	}
}
