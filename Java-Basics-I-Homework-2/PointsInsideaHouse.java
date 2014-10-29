//Write a program to check whether a point is inside or outside the house below. The point is given as a pair of floating-point numbers, separated by a space. Your program should print "Inside" or "Outside". Examples:
//Input			Output		Input		Output
/*10 9.7		Outside		17.60 8.50	Inside
  11.6 7		Outside		17.72 9.12	Outside
  12.5 6		Outside		18.6 3.9	Outside
  12.5 14.5		Outside		18.6 6		Inside
  13.13 9.15	Inside		19.693 13.4	Outside
  13.5 6.9	    Outside		20 6		Inside
  15 6			Inside		21 7.5		Inside
  15.02 4.83	Outside		21 13.5		Inside
  15.11 7.01	Inside		21.3 5.5	Outside
  16.33 14.03	Outside		21.45 9.7	Inside
  16.4 5.4	    Inside		22 14		Outside
  17.5 3		Outside		22.5 8.5	Inside
  17.51 4.01	Inside		23 7.5		Outside
  17.5 13.5		Inside		23.001 11.01Outside
*/
import java.util.Scanner;

public class PointsInsideaHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float X = input.nextFloat();
		float Y = input.nextFloat();

		// the following calculations try to figure out if the position of X is
		// "below" the two sides of the top triangle. (we are using the signs of
		// the calculations: if it is a minus, this means the point is "below",
		// if it is a plus - then it is on the outer side of the triangle.)
		float position2BCX = (float) ((17.5 - 22.5) * (Y - 8.5) - (3.5 - 8.5)
				* (X - 22.5));
		float position3CAX = (float) ((12.5 - 17.5) * (Y - 3.5) - (8.5 - 3.5)
				* (X - 17.5));

		if (((X >= 12.5 && X <= 17.5) && (8.5 <= Y && Y <= 13.5))
				|| (position2BCX < 0 && position3CAX < 0 && Y <= 8.5)
				|| ((X >= 20 && X <= 22.5) && (Y <= 13.5 && Y >= 8.5))) {
			System.out.println("Inside");
		} else
			System.out.println("Outside");
		input.close();
	}
}
