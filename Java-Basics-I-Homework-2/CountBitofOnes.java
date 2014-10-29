/*Write a program to calculate the count of bits 1 in the binary representation of given integer number n. Examples:
n		binary representation of n	count
5		00000000 00000101			2
0		00000000 00000000			0
15		00000000 00001111			4
5343	00010100 11011111			9
62241	11110011 00100001			8
17263	01000011 01101111			9 */


import java.util.Scanner;

public class CountBitofOnes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int count = 0;
		String n1tobinary = Integer.toBinaryString(n1);
		for (int i = 0; i < n1tobinary.length(); i++) {
			if (n1tobinary.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
