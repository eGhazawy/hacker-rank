package com.algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int messageLength = scanner.nextInt();
    	String message = scanner.next();
    	int k = scanner.nextInt();
    	if(k > 25){
    		k %= 26; 
    	}
    	char[] messageCharArr = message.toCharArray();
    	for (int i = 0; i < messageLength; i++) {
    		boolean upperCase = Character.isUpperCase(messageCharArr[i]);
    		messageCharArr[i] = upperCase? Character.toLowerCase(messageCharArr[i]) : messageCharArr[i];
			if(messageCharArr[i] >= 'a' && messageCharArr[i] <= 'z'){
				messageCharArr[i] += (char)k;
				if(messageCharArr[i] > 'z'){
					messageCharArr[i] = (char)('a' + messageCharArr[i] - 'z' - 1);
				}
				
				messageCharArr[i] = upperCase? Character.toUpperCase(messageCharArr[i]) : messageCharArr[i];
			}
			
		}
    	
    	System.out.println(new String(messageCharArr));
    }
    
}
