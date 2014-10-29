import java.util.Arrays;
import java.util.Scanner;

public class SortArrayofStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] inputasarray = new String[number];
		Scanner reading = new Scanner(System.in);
		for (int i = 0; i < number; i++) {
		
			String nextstring = reading.next();
			inputasarray[i] = nextstring;
			
		}

		Arrays.sort(inputasarray);
		for (int i = 0; i < inputasarray.length; i++) {

			System.out.println(inputasarray[i]);
		}
		input.close();
		reading.close();

	}

}
