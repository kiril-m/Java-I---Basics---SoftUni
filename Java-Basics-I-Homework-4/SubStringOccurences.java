import java.util.ArrayList;
import java.util.Scanner;

public class SubStringOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		text = text.toLowerCase();
		String substringtolookfor = input.next();
		substringtolookfor = substringtolookfor.toLowerCase();
		
		ArrayList<String> tempwithsubstrings = new ArrayList<>();
		int position;
	
		do {
			position = text.indexOf(substringtolookfor);
			if (position == -1) {
				break;
			}
			tempwithsubstrings.add(text.substring(position, position
					+ substringtolookfor.length()));
			text = text.substring(position +1, text.length());
		} while (position != -1);
		
		System.out.println(tempwithsubstrings.size());
	input.close();
	}
}
