/*Write a program to count how many sequences of two equal bits ("00" or "11") can be found in the binary representation of given integer number n (with overlapping). Examples:
n		binary representation of n		count
5								101			0
0								  0			0
15							   1111			3
5343				  1010011011111			6
62241			   1111001100100001			9 */


import java.util.Scanner;

public class CountofEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int count = 0;
		String n1tobinary = Integer.toBinaryString(n1);
		for (int i = 0; i < n1tobinary.length()-1; i++) {
			if (n1tobinary.charAt(i) == '0' && n1tobinary.charAt(i+1) == '0') {
				count++;
			}
			if (n1tobinary.charAt(i) == '1' && n1tobinary.charAt(i+1) == '1') {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
}
