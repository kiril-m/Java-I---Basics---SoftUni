import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		text = text.toLowerCase();
		String wordtolookfor = input.next();
		wordtolookfor= wordtolookfor.toLowerCase();
		
		int count = 0;
		String[] inputasarray = text.split("\\W+");
		for (int i = 0; i < inputasarray.length; i++) {
			if (inputasarray[i].equals(wordtolookfor)) {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
