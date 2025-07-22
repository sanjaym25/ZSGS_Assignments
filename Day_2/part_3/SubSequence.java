/*
 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 */
package Day_2.part_3;

import java.util.Scanner;

public class SubSequence {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String 1 :");
        String str = scan.nextLine();
        System.out.print("Enter the String 2 :");
        String str1 = scan.nextLine();
        System.out.println(checkSubsequence(str,str1));
    } 
    // Check Subsequence Of Str1 To Str2
    public static boolean checkSubsequence(String str1,String str2){
        int left = 0;
        int right = 0;
        while(left<str1.length() && right<str2.length()){
            if(str1.charAt(left) == str2.charAt(right)){
                left++;
                right++;
            }
            else right++;
        }
        if(left<str1.length()) return false;
        return true;
    }   
}