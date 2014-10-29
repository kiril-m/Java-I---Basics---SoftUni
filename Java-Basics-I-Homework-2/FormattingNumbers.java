/*Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c and prints them in 4 virtual columns on the console. Each column should have a width of 10 characters. The number a should be printed in hexadecimal, left aligned; then the number a should be printed in binary form, padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned; the number c should be printed with 3 digits after the decimal point, left aligned. Examples:
a		b		c		result
254		11.6	0.5		|FE        |0011111110|     11.60|0.500     |
499		-0.5559	10000	|1F3       |0111110011|     -0.56|10000.000 |
0		3		-0.1234	|0         |0000000000|      3.00|-0.123    |
444		-7.5	7.5		|1BC       |0110111100|     -7.50|7.500     | */


import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		double n2 = (double)input.nextDouble();
		double n3 = (double)input.nextDouble();

		// first number #1
		System.out.print("|" + Integer.toHexString(n1).toUpperCase());
		for (int i = 0; i < 10 - Integer.toHexString(n1).length(); i++) {
			System.out.print(" ");
		}
		System.out.print("|");

		// first number #2	
		if ( Integer.toBinaryString(n1) .length() < 10) {
			for (int i = 0; i < 10 - Integer.toBinaryString(n1).length(); i++) {
				System.out.print("0");
			}
		}
		System.out.print(Integer.toBinaryString(n1));
		System.out.print("|");

		// second number 
		for (int i = 0; i < 10 - String.format("%.2f", n2).length(); i++) {
			System.out.print(" ");
		}
		System.out.print(String.format("%.2f", n2));
		System.out.print("|");
	
		// third number
		System.out.print(String.format("%.3f", n3));
		for (int i = 0; i < 10- String.format("%.3f", n3).length(); i++) {
			System.out.print(" ");
		}
		System.out.print("|");
		input.close();
	}
}
