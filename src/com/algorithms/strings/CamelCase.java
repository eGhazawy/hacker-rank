package com.algorithms.strings;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] charArr = s.toCharArray();
        int count = charArr.length > 0 ? 1 : 0;
        for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 'A' && charArr[i] <= 'Z') count++;
		}
        System.out.println(count);
//        Another very good solution
//        System.out.println(s.length() - s.replaceAll("[A-Z]", "").length() + 1);
    }
}
