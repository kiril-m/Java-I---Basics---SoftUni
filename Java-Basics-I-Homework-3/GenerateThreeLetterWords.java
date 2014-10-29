//Write a program to generate and print all 3-letter words consisting of given set of characters. For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at the first line of the input. Input characters are unique (there are no repeating characters). 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputasstring = input.next();
		String inputasstringshadow = inputasstring;
		ArrayList<String> inputchars = new ArrayList<>();
		for (int i = 0; i < inputasstringshadow.length(); i++) {
			if (inputasstring.length() == 0) {
				break;
			}
			String nextchar = inputasstring.substring(0, 1);
			inputchars.add(nextchar);
			inputasstring = inputasstring.substring(1, inputasstring.length());
		}
		
		List<String> listofpermutations = new ArrayList<String>();

		for (int m1 = 0; m1 < inputchars.size(); m1++) {
			String nextpermutation = "" + inputchars.get(m1);
			String shadow1 = nextpermutation;
			for (int m2 = 0; m2 < inputchars.size(); m2++) {
				nextpermutation = nextpermutation + inputchars.get(m2);
				String shadow2 = nextpermutation;
				for (int m3 = 0; m3 < inputchars.size(); m3++) {
					nextpermutation = nextpermutation + inputchars.get(m3);
					if (!listofpermutations.contains(nextpermutation)) {
						listofpermutations.add(nextpermutation);
						nextpermutation = shadow2;
						continue;
					} else
						nextpermutation = shadow2;
				}
				nextpermutation = shadow1;
			}
		}
		for (Object permutation : listofpermutations) {
			System.out.print(permutation);
			System.out.print(" ");
		}
		input.close();
	}
}
