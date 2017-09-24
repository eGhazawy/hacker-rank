package com.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
    	int[] results = new int[grades.length];
    	for (int i = 0; i < results.length; i++) {
			if(grades[i] < 38){
				results[i] = grades[i];
			}
			else{
				int newVal = 5 * ((grades[i] / 5) + 1);
				results[i] = newVal - grades[i] < 3? newVal : grades[i];
			}
		}
    	
    	return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
