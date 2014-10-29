import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		text = text.toLowerCase();

		String[] inputasarray = text.split("\\W+");
		// arranging them alphabetically
		ArrayList<String> intermediatelist = new ArrayList<>();
		for (int i = 0; i < inputasarray.length; i++) {
			intermediatelist.add(inputasarray[i]);
		}
		Collections.sort(intermediatelist);

		for (int i = 0; i < intermediatelist.size(); i++) {
			inputasarray[i] = intermediatelist.get(i);
		}
		//

		ArrayList<ArrayList<String>> overalllist = new ArrayList<>();

		for (int i = 0; i < inputasarray.length; i++) {
			ArrayList<String> nextword = new ArrayList<>();
			nextword.add(inputasarray[i]);
			for (int j = i + 1; j < inputasarray.length; j++) {
				if (inputasarray[j].equals(nextword.get(0))) {
					nextword.add(inputasarray[j]);
				}
			}
			if (!overalllist.contains(nextword)) {
				overalllist.add(nextword);
			}
		}

		ArrayList<Integer> sizes = new ArrayList<>();
		for (int i = 0; i < overalllist.size(); i++) {
			sizes.add(overalllist.get(i).size());
		}
		ArrayList<Integer> sizesclone = new ArrayList<Integer>();
		for (int i = 0; i < sizes.size(); i++) {
			sizesclone.add(sizes.get(i));
		}

		Collections.sort(sizesclone);
		int max = sizesclone.get(sizesclone.size() - 1);

		for (int i = 0; i < sizes.size(); i++) {
			if (sizes.get(i) == max) {
				System.out.println(overalllist.get(i).get(0) + " -> "
						+ overalllist.get(i).size() + " time(s)");
			}
		}
		input.close();
	}
}
