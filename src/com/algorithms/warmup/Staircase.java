package com.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = "#";
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n + 1) + "s", str + "\n");
			str = str + "#";
		}
	}
	//
	//
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// Scanner scanner = new Scanner(System.in);
	// int n = scanner.nextInt();
	// for (int i = 1; i <= n; i++) {
	// StringBuilder sb = new StringBuilder("");
	// for (int j = 0; j < n - i; j++) {
	// sb.append(" ");
	// }
	// for (int j = 0; j < i; j++) {
	// sb.append("#");
	// }
	// System.out.println(sb.toString());
	// }
	//
	// }

}
