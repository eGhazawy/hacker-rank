package com.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoCharacters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();
		char[] charArr = s.toCharArray();
		Map<Character, Integer> chars = new HashMap<>();
		
		for (int i = 0; i < charArr.length; i++) {
			Character ch = new Character(charArr[i]);
			if (chars.containsKey(ch)) {
				int value = chars.get(ch);
				chars.put(ch, ++value);
			} else {
				chars.put(ch, 1);
			}
		}

		Character[] charsArr = new Character[chars.keySet().size()];
		chars.keySet().toArray(charsArr);


		Map<Integer, List<StringBuilder>> sortedTable = new Hashtable<>();
		for (int i = 0; i < charsArr.length - 1; i++) {
			for (int j = i + 1; j < charsArr.length; j++) {
				int finalStringLength = chars.get(charsArr[i]) + chars.get(charsArr[j]);
				if (sortedTable.containsKey(finalStringLength)) {
					List<StringBuilder> sbL = sortedTable.get(finalStringLength);
					sbL.add(new StringBuilder().append(charsArr[i]).append(charsArr[j]));
				} else {
					List<StringBuilder> sbL = new ArrayList<>();
					sbL.add(new StringBuilder().append(charsArr[i]).append(charsArr[j]));
					sortedTable.put(finalStringLength, sbL);
				}
			}
		}
		
		List<Integer> sortedTableKeys = new ArrayList<>(sortedTable.keySet());
		List<StringBuilder> sortedPairs = new ArrayList<>();
		for (int i = 0; i < sortedTableKeys.size(); i++) {
			sortedPairs.addAll(sortedTable.get(sortedTableKeys.get(i)));
		}
		
		for (int i = 0; i < sortedPairs.size(); i++) {
			char ch1 = sortedPairs.get(i).charAt(0);
			char ch2 = sortedPairs.get(i).charAt(1);
			StringBuilder sb = new StringBuilder(s);
			char lastChar = 0;
			boolean isAMatch = true;
			int charIndex = 0;
			while(charIndex < sb.length()){
				
				if(ch1 == sb.charAt(charIndex) || ch2 == sb.charAt(charIndex) ){
					if(lastChar != 0  && lastChar == sb.charAt(charIndex)){
						isAMatch = false;
						break;
					}else{
						lastChar = sb.charAt(charIndex);
						charIndex++;
					}
				}
				else{
					sb.deleteCharAt(charIndex);
				}
			}
				
			if(isAMatch){
				System.out.println(sb.length());
				break;
			}
		}
	}
}
