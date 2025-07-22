/*
 * 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
 */
package Day_2.part_3;

import java.util.Scanner;

public class AddTwoNumberString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String Number 1:");
        String num1 = scan.nextLine();
        System.out.print("Enter the String Number 2 :");
        String num2 = scan.nextLine();
        addTwoNoString(num1,num2);
    }

    // Add To Number String 

    public static String addTwoNoString(String num1,String  num2){
        int left = num1.length()-1;
        int right = num2.length()-1;
        int rem = 0;
        String str = ""; 
        // Two Pointer Apporac Compare Two Digit Sum
        while(left>=0 && right>=0){
            int sum = ((num1.charAt(left)-'0')+(num2.charAt(right)-'0')+rem);
            str = ((sum%10)+str);
            rem = sum/10;
            left--;
            right--;
        }
        // letft pointer Not Complect Continue To this Loop
        while(left>=0){
            int sum = ((num1.charAt(left)-'0')+rem);
            str = ((sum%10)+str);
            rem = sum/10;
            left--;
        }
        // Right pointer Not Complect Continue To this Loop
        while(right>=0){
            int sum = ((num2.charAt(right)-'0')+rem);
            str = ((sum%10)+str);
            rem = sum/10;
            right--;
        }
        if(rem>0) str = rem+str;
        return str;
    }
}
