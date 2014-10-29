import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsofLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text1 = input.nextLine();
		String text2 = input.nextLine();
		char[] text1inter = text1.toCharArray();
		char[] text2inter = text2.toCharArray();
		
		ArrayList<Character> l1 = new ArrayList<>();
		
		for (int i = 0; i < text1inter.length; i++) {
			if (text1inter[i]!= ' ') {
				l1.add((text1inter[i]));	
			}
		}
		
		ArrayList<Character> l2 = new ArrayList<>();
		
		for (int i = 0; i < text2inter.length; i++) {
			if (text2inter[i]!= ' ') {
				l2.add((text2inter[i]));	
			}
		}	
		
		ArrayList<Character> l1shadow = new ArrayList<>();
		for (int i = 0; i < l1.size(); i++) {
			l1shadow.add(l1.get(i));
		}
		
		for (int i = 0; i < l2.size(); i++) {
			if (!l1.contains(l2.get(i))) {
				l1shadow.add(l2.get(i));
			}
		}
		
		for (char c : l1shadow) {
			System.out.print(c);
			System.out.print(" ");
		}
		input.close();
	}

}
