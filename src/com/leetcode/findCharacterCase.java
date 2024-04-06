package com.leetcode;

import java.util.Scanner;

/*
 * Problem statement
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
 */

public class findCharacterCase {

    public static void main(String[] args) {
     	// System.out.println("enter a string: ");
		Scanner inp = new Scanner(System.in);
		char ch=inp.next().charAt(0);
		
		if (Character.isUpperCase(ch)){
			System.out.println(1);
		}
	else if (Character.isLowerCase(ch)) {
				System.out.println(0);
			}
		else {
			System.out.println(-1);
		}
    }
	
}
