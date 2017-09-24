package com.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] sosArr = {'S', 'O', 'S'};
        char[] message = S.toCharArray();
        int count = 0;
        for (int i = 0, j = 0; i < message.length; i++) {
			if(sosArr[j] != message[i]) count ++;
        	
        	j = j == 2? 0 : j + 1;
		}
        System.out.println(count);
    }
}
