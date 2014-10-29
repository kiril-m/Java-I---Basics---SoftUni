/*Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area. Examples:
Input	Output
7 20	140
5 12	60 */


import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		long area = a * b;
		System.out.println(area);
		input.close();
	}

}
