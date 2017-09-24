package com.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();

    	int d1 = 0;
    	int d2 = 0;
    	
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			int num = scanner.nextInt();
    			if(i == j){
    				d1 += num;
    			}
    			if(j == n - i - 1){
    				d2 += num;
    			}
    		}
    	}
    	System.out.println(Math.abs(d1 - d2));
    }
}
