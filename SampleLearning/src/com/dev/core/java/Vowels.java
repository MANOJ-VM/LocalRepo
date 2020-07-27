package com.dev.core.java;

import java.util.HashSet;

public class Vowels {

	static boolean isVowel(char c) {
//		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//			return true;
//		} else {
//			return false;
//		}
		return (c == 'a' || c == 'e' || c == 'i'

				|| c == 'o' || c == 'u');
	}

	static int isVowelSubString(String str) {
		int count = 0;
		HashSet<Character> hash = new HashSet<Character>();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (isVowel(str.charAt(j)) == false) {
					break;
				}
				hash.add(str.charAt(j));
				System.out.println(hash);
				if (hash.size() == 5) {
					System.out.println(str.substring(i, j + 1) + " ");
					count++;
				}
			}
			hash.clear();
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "bhaaaaaeiiiiiioubaeaaiou";
		int noOfSubString = isVowelSubString(str);
		System.out.println(noOfSubString);
	}
}
