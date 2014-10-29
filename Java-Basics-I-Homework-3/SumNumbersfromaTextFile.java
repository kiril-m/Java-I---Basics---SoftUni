//Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line. Print the sum of the numbers at the console. Ensure you close correctly the file in case of exception or in case of normal execution. In case of exception (e.g. the file is missing), print "Error" as a result. 

import java.io.File;
import java.util.Scanner;

public class SumNumbersfromaTextFile {

	public static void main(String[] args) {
		File theinput = new File("e:\\Input.txt");
		try {
			Scanner input = new Scanner(theinput);
			int sum = 0;
			Integer nextnum;
			do {
				try {
					nextnum = input.nextInt();
				} catch (Exception e) {
					break;
				}
				sum += nextnum;
			} while (nextnum != null);
			System.out.println(sum);
			input.close();
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}
}
