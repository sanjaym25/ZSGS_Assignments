/*
 3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
 */

package Day_2.part_3;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseVowels {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The String 1 : ");
        String str = scan.nextLine();
        System.out.println("Reverse The String Only Vowels : "+ reverseVowels(str));
    }
    // Reverse the Vowels Only
    public static String reverseVowels(String str) {

        // String To character Array

        char[] str2 = str.toCharArray();
        int left = 0;
        int right = str2.length - 1;
        while (left < right) {
            if (checkVowels(str2[left]) && checkVowels(str2[right])) {
                char temp = str2[left];
                str2[left++] = str2[right];
                str2[right--] = temp;
            } else if (!checkVowels(str2[left]) && !checkVowels(str2[right])) {
                left++;
                right--;
            } else if (!checkVowels(str2[left]))
                left++;
            else if (!checkVowels(str2[right]))
                right--;
        }
        return arrayToString(str2);
    }
    // check vowels method retun true Or false

    public static boolean checkVowels(char s) {
        if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
            if ((s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') ||
                    (s == 'A' || s == 'I' || s == 'O' || s == 'U' || s == 'E')) {
                return true;
            }
        }
        return false;
    }
    
    // Array to String Convert

    public static String arrayToString(char[] str){
       String s = "";
       for(int i = 0;i<str.length;i++) s+=str[i];
       return s;
    }
}
