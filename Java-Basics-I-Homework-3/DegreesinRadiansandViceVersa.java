//Write a method to convert from degrees to radians. Write a method to convert from radians to degrees. You are given a number n and n queries for conversion. Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians. Print the results as n lines, each holding a number + space + measure. Format all numbers with 6 digit after the decimal point. 

import java.util.Scanner;

public class DegreesinRadiansandViceVersa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		degreesandradians(input, n);
		input.close();
	}

	private static void degreesandradians(Scanner input, int n) {
		for (int i = 0; i <= n; i++) {
			String nextinput = input.nextLine();

			if (nextinput.matches("\\d{0,9}[ ]deg")
					|| nextinput.matches("\\d{0,9}.\\d{0,9}[ ]deg")) {
				int n1 = nextinput.indexOf(" ");
				double degrees = Double.parseDouble(nextinput.substring(0, n1));
				System.out.println((double) (Math.round((Math
						.toRadians(degrees)) * 1000000))
						/ 1000000
						+ " "
						+ "rad");
			}
			if (nextinput.matches("\\d{0,9}[ ]rad")
					|| nextinput.matches("\\d{0,9}.\\d{0,9}[ ]rad")) {
				int n2 = nextinput.indexOf(" ");
				double radians = Double.parseDouble(nextinput.substring(0, n2));
				System.out.println((double) (Math.round((Math
						.toDegrees(radians)) * 1000000))
						/ 1000000
						+ " "
						+ "deg");
			}
		}
	}
}
