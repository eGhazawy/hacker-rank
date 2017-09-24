package com.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Cakewalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        
        long miles = 0;
        for (int i = 0; i < calories.length; i++) {
			miles += (Math.pow(2, i) * calories[calories.length - i - 1]);
		}
        
        System.out.println(miles);
    }
 
}
