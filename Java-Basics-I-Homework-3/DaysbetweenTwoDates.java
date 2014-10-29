//Write a program to calculate the difference between two dates in number of days. The dates are entered at two consecutive lines in format day-month-year. Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100]. 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysbetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String startdate = input.next();
		String enddate = input.next();

		SimpleDateFormat dateparser = new SimpleDateFormat("dd-MM-yyyy");
		Date startdateproper = dateparser.parse(startdate);
		Date enddateproper = dateparser.parse(enddate);

		int diff = (int) ((enddateproper.getTime() - startdateproper.getTime()) / (1000 * 60 * 60 * 24));
		System.out.println(diff);
		
		input.close();
	}
}
