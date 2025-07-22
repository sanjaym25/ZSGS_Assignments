/*
 2. Write a program to take in 10 values and print only those numbers which are prime.
 */
package Day_2.Part_2;

import java.util.Scanner;

public class IsPrime {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = getArray();
        isPirme(nums);
    }
    // Get Array Created
    public static int[] getArray() {
        System.out.println("Enter the 10 numbers");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the Number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }
        return nums;
    }
    
    // Check Prime Array Created 
    public static void isPirme(int[] nums) {

        System.out.print("Primes In The Array : [ ");

        for (int i = 0; i < nums.length; i++) {
            boolean check = true;
            for (int j = 2; (j * j) < nums[i]; j++) {
                if (nums[i] % j == 0)
                    check = false;
            }
            if (check)
                System.out.print(nums[i] + ",");
        }
        System.out.println("]");
    }
}
