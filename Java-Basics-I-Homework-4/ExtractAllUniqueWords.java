import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		text = text.toLowerCase();
		
		String[] inputasarray = text.split("\\W+");
		
		ArrayList<String> inputaslist = new ArrayList<>();
		for (int i = 0; i < inputasarray.length; i++) {
			if (!inputaslist.contains(inputasarray[i])) {
				inputaslist.add(inputasarray[i]);	
			}
			
		}
		
		Collections.sort(inputaslist);
		for (int i = 0; i < inputaslist.size(); i++) {
			System.out.print(inputaslist.get(i));
			System.out.print(" ");
			
		}
		input.close();

	}

}
