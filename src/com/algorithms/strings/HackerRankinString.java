package com.algorithms.strings;

import java.util.Scanner;

public class HackerRankinString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char[] hackerRank = "hackerrank".toCharArray();
        for(int a0 = 0; a0 < q; a0++){
        	char[] s = in.next().toCharArray();
            int i = 0;
            int j = 0;
            while(i < s.length && j < hackerRank.length){
            	if(s[i] == hackerRank[j]){
            		i++;
            		j++;
            	}
            	else{
            		i++;
            	}
            }
            if(j == hackerRank.length){
            	System.out.println("YES");
            }
            else{
            	System.out.println("NO");
            }
            
        }
    }
}
