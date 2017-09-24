package com.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
    	String hr = s.substring(0, 2);
    	String miss = s.substring(2, 8);
    	String ampm = s.substring(8);
    	if(ampm.equals("PM")){
    		if(!hr.equals("12")){
        		hr = Integer.parseInt(hr) + 12 + "";
    		}
    	}
    	else if(hr.equals("12")){
    		hr = "00";
    	}
    	return hr + miss;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
