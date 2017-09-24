package com.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

    static String super_reduced_string(String s){
    	StringBuilder sb = new StringBuilder(s);
    	int i = 0;
    	while(i < sb.length() - 1){
    		if(sb.charAt(i) == sb.charAt(i + 1)){
    			sb = sb.delete(i, i + 2);
    			i = i == 0 ? 0 : i - 1;
    		}
    		else{
    			i++;
    		}
    	}
    	
    	return sb.length() == 0? "Empty String" : sb.toString();
    }
//
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
//    hello
//    public static void main(String[] args) {
//    	StringBuilder sb = new StringBuilder("hello");
//		System.out.println(sb.delete(0, 1).toString());
//	}
}
