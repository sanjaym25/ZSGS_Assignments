/*
 * 7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
 */
package Day_2.part_3;

import java.util.Scanner;

public class SegmentsString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String str = scan.nextLine();
        wordCount(str);
    }
     // Segment String Word Count
    public static int wordCount(String s) {
        int count = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (str.length() > 0) {
                    count++;
                    str = "";
                }
                continue;
            }
            str += s.charAt(i);
        }
        if (str.length() > 0)
            count++;
        return count;
    }
}