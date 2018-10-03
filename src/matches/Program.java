package matches;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		scn.close();

		long ans;
		double length, width;

		length = Math.floor(Math.sqrt(n));
		width = Math.ceil(n / length);
		ans = (long) (2 * n + length + width);

		System.out.println(ans);
	}

}