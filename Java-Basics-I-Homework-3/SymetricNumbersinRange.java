//Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits are symmetric toward its middle. For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric. 
import java.util.Scanner;

public class SymetricNumbersinRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		System.out.println();
		for (int i = start; i <= end; i++) {
			if (0 <= i && i <= 9) {
				System.out.print(i);
				System.out.print(" ");
			}
			if (i > 9 && i < 100) {
				String iasstring = new String("" + i);
				int substr1 = Integer.parseInt(iasstring.substring(0, 1));
				int substr2 = Integer.parseInt(iasstring.substring(1, 2));
				if (substr1 == substr2) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
			if (i > 99 && i < 1000) {
				String iasstring = new String("" + i);
				int substr1 = Integer.parseInt(iasstring.substring(0, 1));
				int substr2 = Integer.parseInt(iasstring.substring(2, 3));
				if (substr1 == substr2) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
		}
		input.close();
	}

}
