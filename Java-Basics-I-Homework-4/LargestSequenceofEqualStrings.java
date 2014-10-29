import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestSequenceofEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputasarray = input.nextLine().split(" ");
		ArrayList<ArrayList<String>> finaloutputoflists = new ArrayList<>();
		ArrayList<String> firstofthem = new ArrayList<String>();
		int jshadow = 0;
		boolean isFirstover = false;

		firstofthem.add(inputasarray[0]);
		if (inputasarray.length > 1) {

			for (int i = 1; i < inputasarray.length; i++) {
				boolean isFlipcheck = false;
				if (firstofthem.contains(inputasarray[i])) {
					firstofthem.add(inputasarray[0]);
					if (i == inputasarray.length - 1) {
						finaloutputoflists.add(firstofthem);
						break;
					}
				} else {
					if (isFirstover == false) {
						finaloutputoflists.add(firstofthem);
					}
					isFirstover = true;
					ArrayList<String> nextarray = new ArrayList<String>();
					for (int j = i; j < inputasarray.length; j++) {
						jshadow = j;
						if (j == i) {
							nextarray.add(inputasarray[j]);

						} else {
							if (nextarray.contains(inputasarray[j])) {
								nextarray.add(inputasarray[j]);
							} else {
								boolean isFlip = false;
								i = j - 1;
								isFlip = true;
								isFlipcheck = isFlip;
								break;
							}
						}
					}
					if (jshadow == inputasarray.length - 1
							&& isFlipcheck == false) {
						i = jshadow;
					}

					finaloutputoflists.add(nextarray);
				}
			}
		} else
			finaloutputoflists.add(firstofthem);
		
		ArrayList<Integer> sizes = new ArrayList<>(); 
		for (int i = 0; i < finaloutputoflists.size(); i++) {
			sizes.add(finaloutputoflists.get(i).size());
		}
		ArrayList<Integer> sizesclone = new ArrayList<Integer>();
		for (int i = 0; i < sizes.size(); i++) {
			sizesclone.add(sizes.get(i));
		}
		
		Collections.sort(sizesclone);
		int max = sizesclone.get(sizesclone.size() - 1);
		
		for (int i = 0; i < sizes.size(); i++) {
			if (sizes.get(i) == max) {
				for (int j = 0; j < finaloutputoflists.get(i).size(); j++) {
					System.out.print(finaloutputoflists.get(i).get(j));
					System.out.print(" ");
					
					
				}
				break;
			}
		}
		
		
		input.close();
	}
}
