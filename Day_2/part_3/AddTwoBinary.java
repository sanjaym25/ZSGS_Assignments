/*
 1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
package Day_2.part_3;

import java.util.Scanner;

public class AddTwoBinary {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter The String 1 : ");
        String str1 = scan.nextLine();
        System.out.print("Enter The String 2 : ");
        String str2 = scan.nextLine();
        System.out.println("Add Two Binary String : " + addTwoBinary(str1, str2));
    }
    
    // Add two Binary
    public static String addTwoBinary(String str1, String str2) {
        int num1 = binaryToDecimal(str1, 0, 0);
        int num2 = binaryToDecimal(str2, 0, 0);
        int sum = num1 + num2;
        return decimalToBinary(sum, "");
    }
    
    // Binary To decimal Convert

    public static int binaryToDecimal(String str, int val, int i) {
        if (i == str.length())
            return val;
        return binaryToDecimal(str, ((val << 1) + (str.charAt(i) - '0')), ++i);
    }
    
    // Decimal To Binary Convert

    public static String decimalToBinary(int num, String val) {
        if (num == 0)
            return val;
        return decimalToBinary(num >> 1, ((num & 1) + val));
    }
}

