/*
 1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
 */
package Day_2.Part_2;

import java.util.Scanner;

public class Find_All_Sum_Odd {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int [] nums = getArray();
        int sum = findAllSumOdd(nums);
        System.out.println("Sum Of Odd Number : "+sum);
    }
    // Create Array 
    public static int[] getArray(){
        System.out.print("Enter the 10 numbers");
        int[] nums = new int[10];
        for(int i = 0;i<nums.length;i++){
            System.out.print("Enter the Number "+(i+1)+": ");
            nums[i] = scan.nextInt();
        }
        return nums;
    }
    // find All Sum Of Add Method
    public static int findAllSumOdd(int[] nums){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 != 0) sum+=nums[i];
        }
        return sum;
    }
}
