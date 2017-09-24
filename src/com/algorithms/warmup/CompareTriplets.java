package com.algorithms.warmup;

import java.util.Scanner;

public class CompareTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
    	int[] grades = new int[2];
    	int[] results = new int[3];
    	
    	results[0] = a0 - b0;
    	results[1] = a1 - b1;
    	results[2] = a2 - b2;
    	
    	for (int i = 0; i < results.length; i++) {
			if(results[i] > 0){
				grades[0] ++;
			}
			else if(results[i] < 0){
				grades[1] ++;
			}
		}
    	
    	return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
