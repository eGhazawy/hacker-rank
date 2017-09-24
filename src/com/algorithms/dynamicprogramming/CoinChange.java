package com.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CoinChange {
	private static Map<String, Long> dp = new HashMap<>();
    static long getWays(long n, long[] c){
    	long sum = 0;
    	if(c.length == 0) sum = 0;
    	else if (c.length == 1 && n % c[0] == 0) sum = 1;
    	else if (c.length == 1 && n % c[0] != 0) sum = 0;
    	else{
			long newN = n;
			long[] newArr = Arrays.copyOfRange(c, 1, c.length);
			String newArrString = Arrays.toString(newArr);
			while(newN > 0){
				Long newWays = dp.get(newN + newArrString);
				if(newWays == null) 
					newWays = getWays(newN, newArr);
				sum += newWays.longValue();
				newN -= c[0];
			}
			if(newN == 0) sum++;
    	}
    	dp.put(n + Arrays.toString(c), sum);
    	return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
