package StringManipulation;

import java.util.Scanner;

/**
 * Successful submission
 * 
 * @author kamran
 *
 */
public class FunnyString {

	public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i = 0; i < count; i++){
            isFunny(in.next());
        }
        in.close();
	}

	public static void isFunny(String str){
		boolean isFunny = true;
		StringBuilder reverseStr = new StringBuilder(str);
		reverseStr.reverse();
		
		for(int i = 1; i < str.length(); i++){
			int firstIndex = (int)str.charAt(i - 1);
			int secondIndex = (int)str.charAt(i);

			int beforeLastIndex = (int)reverseStr.charAt(i - 1);
			int lastIndex = (int)reverseStr.charAt(i);
			
			if (Math.abs(secondIndex - firstIndex) != Math.abs(lastIndex - beforeLastIndex)){
				isFunny = false;
				break;
			}
		}
		if(isFunny)System.out.println("Funny");
		else System.out.println("Not Funny");
	}
}

/**
Problem Statement

Suppose you have a string S which has length N and is indexed from 0 to N−1. 
String R is the reverse of the string S. The string S is funny if the 
condition |Si−Si−1| = |Ri−Ri−1| is true for every i from 1 to N−1.

(Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) 
of str. |x| denotes the absolute value of an integer x)

Input Format

First line of the input will contain an integer T. T test cases follow. 
Each of the next T lines contains one string S.

Constraints

    1 <= T <= 10
    2 <= length of S <= 10000

Output Format

For each string, print Funny or Not Funny in separate lines.

 
*/
