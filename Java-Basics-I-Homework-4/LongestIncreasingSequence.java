import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputasstring = input.nextLine();
		String[] inputasarray = inputasstring.split(" ");
		Integer[] inputasinteger = new Integer[inputasarray.length];
		for (int i = 0; i < inputasarray.length; i++) {
			int nextint = Integer.parseInt(inputasarray[i]);
			inputasinteger[i] = nextint;
		}

		ArrayList<ArrayList<Integer>> finaloutputoflists = new ArrayList<>();
		ArrayList<Integer> nextsubseq = new ArrayList<Integer>();
		for (int i = 0; i < inputasinteger.length; i++) {
			if (i == inputasinteger.length - 1) {
				if (inputasinteger[i] > nextsubseq.get(nextsubseq.size() - 1)) {
					nextsubseq.add(inputasinteger[i]);
				} else {
					ArrayList<Integer> nextsubseqshadowfinal = new ArrayList<Integer>();
					for (int j = 0; j < nextsubseq.size(); j++) {
						nextsubseqshadowfinal.add(nextsubseq.get(j));
					}
					finaloutputoflists.add(nextsubseqshadowfinal);
					nextsubseq.clear();
					nextsubseq.add(inputasinteger[i]);
				}
				finaloutputoflists.add(nextsubseq);
				break;
			}
			if (nextsubseq.size() == 0) {
				nextsubseq.add(inputasinteger[i]);
				continue;
			}
			if (inputasinteger[i] > nextsubseq.get(nextsubseq.size() - 1)) {
				nextsubseq.add(inputasinteger[i]);
			} else {
				ArrayList<Integer> nextsubseqshadow = new ArrayList<Integer>();
				for (int j = 0; j < nextsubseq.size(); j++) {
					nextsubseqshadow.add(nextsubseq.get(j));
				}
				finaloutputoflists.add(nextsubseqshadow);
				nextsubseq.clear();
				i = i - 1;
			}
		}

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
