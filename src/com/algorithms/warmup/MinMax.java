package com.algorithms.warmup;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			sum += num;
			
			if(i == 0){
				min = num;
				max = num;
			}
			else{
				if(num < min){
					min = num;
				}
				
				if(num > max){
					max = num;
				}
			}
		}
		
		System.out.println((sum - max) + " " + (sum - min));
	}

}
