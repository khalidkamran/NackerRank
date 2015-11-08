package StringManipulation;

import java.util.Scanner;

/**
 * Successfully Submitted
 * @author kamran
 *
 */
public class AlternatingCharacters {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i = 0; i < count; i++){
        	isAlternatingCharacter(in.next());
        }
        in.close();
	}

	public static void isAlternatingCharacter(String str){
		int deletionCount = 0;
		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(i) == str.charAt(i + 1)) deletionCount++;
		}
		System.out.println(deletionCount);
	}
}

/**
 
Problem Statement

Shashank likes strings in which consecutive characters are different. For example, 
he likes ABABA, while he doesn't like ABAA. Given a string containing characters A 
and B only, he wants to change it into a string he likes. To do this, he is allowed 
to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases.
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1≤T≤10
1≤ length of string ≤105

Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Sample Output

3
4
0
0
4
 
*/

