import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] inputasarray = text.split(" ");
		ArrayList<String> cardfacespresent = new ArrayList<>();
		for (int i = 0; i < inputasarray.length; i++) {
			if (inputasarray[i].length() == 2) {
				if (!cardfacespresent.contains(inputasarray[i].substring(0, 1))) {
					if (inputasarray[i].length() == 2) {
						cardfacespresent.add(inputasarray[i].substring(0, 1));
					}
				}
			}
			if (inputasarray[i].length() == 3) {
				if (!cardfacespresent.contains(inputasarray[i].substring(0, 2))) {
					if (inputasarray[i].length() == 3) {
						cardfacespresent.add(inputasarray[i].substring(0, 2));
					}
				}
				
			}
		}

		// counts
		ArrayList<Integer> cardfacespresentcounts = new ArrayList<>();
		for (int i = 0; i < cardfacespresent.size(); i++) {
			int nextcardfacecount = 0;
			for (int j = 0; j < inputasarray.length; j++) {
				//special case for 10
				if (cardfacespresent.get(i).length() ==2) {
					if (inputasarray[j].substring(0, 2).equals(
							cardfacespresent.get(i))) {
						nextcardfacecount++;
					}
				}
				//
				
				//for the rest
				if (inputasarray[j].substring(0, 1).equals(
						cardfacespresent.get(i))) {
					nextcardfacecount++;
				}
				//
			}
			cardfacespresentcounts.add(nextcardfacecount);
		}
		// percentages
		ArrayList<String> cardfacespresentpercentages = new ArrayList<>();
		double sum = 0;
		for (int i = 0; i < cardfacespresentcounts.size(); i++) {
			sum += cardfacespresentcounts.get(i);
		}

		for (int i = 0; i < cardfacespresentcounts.size(); i++) {
			double nextpercentage = ((cardfacespresentcounts.get(i)) / sum) * 100;
			DecimalFormat df = new DecimalFormat("#.00");
			String nextpercentagetostring = df.format(nextpercentage);
			cardfacespresentpercentages.add(nextpercentagetostring);
		}
		//
		for (int i = 0; i < cardfacespresent.size(); i++) {
			System.out.println(cardfacespresent.get(i) + " -> "
					+ cardfacespresentpercentages.get(i) + "%");
		}

		input.close();
	}

}
