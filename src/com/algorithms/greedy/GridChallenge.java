package com.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

//    public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		int T = scanner.nextInt();
//		StringBuilder sb = new StringBuilder();
//		while(T-- > 0){
//			int n = scanner.nextInt();
//			char[][] charsMap = new char[n][n];
//			boolean gridFlag = true;
//			for (int i = 0; i < n && gridFlag; i++) {
//				charsMap[i] = scanner.next().toCharArray();
//				Arrays.sort(charsMap[i]);
//				int j = 0;
//				if(i > 0){
//					while(i > 0 && j < n){
//						if(charsMap[i][j] < charsMap[i - 1][j]){
//                            i = n;
//							gridFlag = false;
//							break;
//						}
//						j++;
//					}
//				}
//				
//			}
//			sb.append(gridFlag? "YES":"NO");
//            if(T > 0){
//                sb.append("\n");
//            }
//			
//		}
//		System.out.println(sb);
//    }
	
	
	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int T = scanner.nextInt();
			StringBuilder sb = new StringBuilder();
			while(T-- > 0){
				if(T == 20) {
					System.out.println("test");
				}
				int n = scanner.nextInt();
				String[] words = new String[n];
				boolean gridFlag = true;
				for (int i = 0; i < n; i++) {
					char[] chars = scanner.next().toCharArray();
					Arrays.sort(chars);
					words[i] = new String(chars);
				}
				for (int i = 1; i < n && gridFlag; i++) {
					gridFlag = words[i].compareTo(words[i - 1]) >= 0;
				}
				sb.append(gridFlag? "YES":"NO");


	            if(T > 0){
	                sb.append("\n");
	            }
				
			}
			System.out.println(sb);
	    }
}
