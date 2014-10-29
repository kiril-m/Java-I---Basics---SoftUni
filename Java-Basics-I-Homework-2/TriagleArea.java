/*Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form a triangle, print "0" as result. Examples:
Input	Output		
-5 10
25 30
60 15	575		
53 18
56 23
24 27	86		
1 1
2 2
3 3		0 */


import java.util.Scanner;

public class TriagleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		int Bx = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		int area = Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
		System.out.println(area);
		input.close();
	}
}
