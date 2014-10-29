/*Write a program that finds the smallest of three numbers. Examples:
a		b		c		smallest
5		2		2		2
2		2		1		1
22		4		13		4
0		-2.5	-5		-5
-1.1	-0.5	-0.1	-1.1 */

import java.util.Scanner;

public class SmallestofThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1 = (double)input.nextDouble();
		double n2 = (double)input.nextDouble();
		double n3 = (double)input.nextDouble();
		if ((n1<=n2 && n1<n3) || (n1<n2 && n1<=n3)) {
			System.out.println(n1);		
		}else
		if ((n2<=n1 && n2<n3) || (n2<n1 && n2<=n3)) {
			System.out.println(n2);
		}else
		if ((n3<=n1 && n3<n2) || (n3<n1 && n3<=n2)) {
			System.out.println(n3);
		}else
		if (n1==n2 && n2 == n3) {
			System.out.println(n1);
		}
		input.close();
	}
}
