//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsof5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<List<String>> finallist = new ArrayList<List<String>>();
		String[] cardfaces = new String[] { "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "J", "Q", "K", "A" };
		String[] cardsuits = new String[] { "'\u2663'", "'\u2666'", "'\u2665'",
				"'\u2660'" };
		List<String> combinations = new ArrayList<>();
		for (int i = 0; i < cardfaces.length; i++) {
			for (int j = 0; j < cardsuits.length; j++) {
				String nextcombo = "" + cardfaces[i] + cardsuits[j];
				combinations.add(nextcombo);
			}
		}
		
		int count = 0;
		int countinner = 0;
		for (int rr = 0; rr < n; rr++) {
			List<String> nextrandomcombo = new ArrayList<String>();
			do {
				Random rnd = new Random();
				int nrandom = rnd.nextInt(combinations.size());
				if (!nextrandomcombo.contains(combinations.get(nrandom))) {
					nextrandomcombo.add(combinations.get(nrandom));
					countinner++;
				}
				if (countinner == 5) {
					List<String> nextcomboshadow = new ArrayList<>();
					for (int mm = 0; mm < 5; mm++) {
						nextcomboshadow.add(nextrandomcombo.get(mm));
					}
					finallist.add(nextcomboshadow);
					countinner = 0;
					count++;
					break;
				}
				
			} while (count < n);
			nextrandomcombo.clear();
		}	
		for (int m = 0; m < finallist.size(); m++) {
			for (int i = 0; i < finallist.get(m).size(); i++) {
				if (i == finallist.get(m).size() - 1) {
					System.out.print(finallist.get(m).get(i));
					System.out.println();
					continue;
				}
				System.out.print(finallist.get(m).get(i));
				System.out.print(",");
			}
		}
		input.close();
	}
}
