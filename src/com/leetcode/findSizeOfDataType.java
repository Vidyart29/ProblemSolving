/*
Problem statement
Data type refers to the type of value a variable has and the way the computer interprets it.

Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte
*/
package com.leetcode;
import java.util.Scanner;

public class findSizeOfDataType {

	public static void main(String[] args) {
		System.out.println("enter the type: ");
		Scanner inp=new Scanner(System.in);
	    String type = inp.nextLine();

	    int result=dataTypes(type);

	    System.out.println(result);
	}

	 public static int dataTypes(String type) {
	        // Write your code here

	        if (type.equals("Integer")) {
	            return 4;
	        }
	        if (type.equals("Long")) {
	            return 8;
	        }
	        if (type.equals("Float")) {
	            return 4;
	        }
	        if (type.equals("Double")) {
	            return 8;
	        }
	        if (type.equals("Character")) {
	            return 1;
	        }
	        else{
	            return -1;
	        }
	    }
}
