import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayofNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] initialarray = new int[n];
		for (int i = 0; i < n; i++) {
			int nextint = input.nextInt();
			initialarray[i] = nextint ;

		}
		ArrayList<Integer> sortedlist = new ArrayList<>();
		for (int i = 0; i < initialarray.length; i++) {
			sortedlist.add(initialarray[i]);
		}
		Collections.sort(sortedlist);
		for (Integer integervalue : sortedlist) {
			System.out.print(integervalue + " ");
		}
		input.close();
	}

}
