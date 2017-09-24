package com.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
	static int minimumAbsoluteDifference(int n, int[] arr) {
		Arrays.sort(arr);
		int diff = 0;
		if (arr.length > 1) {
			diff = Math.abs(arr[1] - arr[0]);
		}
		for (int i = 2; i < arr.length; i++) {
			int absDiff = Math.abs(arr[i] - arr[i - 1]);
			if (absDiff < diff) {
				diff = absDiff;
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = minimumAbsoluteDifference(n, arr);
		System.out.println(result);
		in.close();
	}
}
