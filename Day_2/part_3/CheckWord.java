/*
 8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
 */
package Day_2.part_3;

import java.util.Scanner;

public class CheckWord {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String str = scan.nextLine();
        System.out.println(checkWord(str));
    }
    // Check Word Logic 
    public static boolean checkWord(String s){
        int count = 0;
        int smallLetter = 0;
        int bigLetter = 0;
        for(int i = 0;i<s.length();i++){
            if((count == 0 && s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i)>='a' && s.charAt(i)<='z'){
                smallLetter++;
            }
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                bigLetter++;
            }
            count++;
        }
        if(smallLetter == s.length()) return true;
        if(bigLetter == s.length()) return true;
        return false;
    }
}