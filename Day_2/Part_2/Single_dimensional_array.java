/*
 Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
 */
package Day_2.Part_2;

import java.util.Scanner;

class Single_dimensional_array {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = getArray();
        print(nums);
    }
    // Create Array Collect The Data Store By Array
    public static int[] getArray() {
        System.out.print("Enter the number Array Size : ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the Number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }
        return nums;
    }

    // Single Digit And Double Digit Sum
    
    public static void print(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10)
                singleDigit += nums[i];
            else if (nums[i] < 100)
                doubleDigit += nums[i];
        }
        System.out.println("Single digit Sum : " + singleDigit);
        System.out.println("Double digit Sum : " + doubleDigit);
    }
}