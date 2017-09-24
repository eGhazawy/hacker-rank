package com.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int positiveCount = 0;
    	int negativeCount = 0;
    	int zeroCount = 0;
    	for (int i = 0; i < n; i++) {
    		int num = scanner.nextInt();
    		if(num == 0){
    			zeroCount++;
    		}
    		else if(num > 0){
    			positiveCount++;
    		}
    		else if(num < 0){
    			negativeCount++;
    		}
		}
    	DecimalFormat df = new DecimalFormat("#.#####");
    	System.out.println(df.format((double)positiveCount / n));
    	System.out.println(df.format((double)negativeCount / n));
    	System.out.println(df.format((double)zeroCount / n));
    }
}
