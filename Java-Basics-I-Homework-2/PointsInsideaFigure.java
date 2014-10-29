/*Problem 3.	Points inside a Figure
Write a program to check whether a point is inside or outside of the figure below. The point is given as a pair of floating-point numbers, separated by a space. Your program should print "Inside" or "Outside". Examples:
Input		Output		Input		Output	 
10 9.7		Outside		17.72 9.12	Outside	
11.6 7		Outside		18.6 6		Inside	
12.5 6		Inside		19.693 13.4	Outside	
12.5 14.5	Outside		21 13.5		Inside	
13.13 9.15	Inside		21.3 5.5	Outside	
15.02 4.83	Outside		21.45 9.7	Inside	
15.11 7.01	Inside		22 14		Outside	
16.33 14.03	Outside		22.5 8.5	Inside	
17.5 13.5	Inside		23 7.5		Outside	
17.60 8.50	Inside		23.001 11.01Outside */	


import java.util.Scanner;


public class PointsInsideaFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float X = input.nextFloat();
		float Y = input.nextFloat();
			if (((X>= 12.5 && X<=17.5)&& (8.5<=Y && Y <=13.5)) ||((X>=12.5 && X<=22.5)&&(Y>=6 && Y<=8.5)) ||((X>= 20 && X<=22.5)&& (Y<=13.5 && Y >=8.5)) ) {
			System.out.println("Inside");
		}
		else System.out.println("Outside");
			input.close();
	}
}
