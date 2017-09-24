package com.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

        Arrays.sort(unsorted, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int retval;
				if(o1.length() > o2.length()){
					retval = 1;
				}
				else if (o1.length() < o2.length()) {
					retval = -1;
				}
				else{
					retval = o1.compareTo(o2);
				}
				return retval;
			}
        	
		});
        
        for(int sorted_i=0; sorted_i < n; sorted_i++){
            System.out.println(unsorted[sorted_i]);
        }
    }
}
