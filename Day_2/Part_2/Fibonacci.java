/*
 3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
 */
package Day_2.Part_2;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Number Of Fibnacci : ");
    int n = scan.nextInt();
    // Create Memoization Data
    int [] dp= new int[n+1];
    int fib[] = new int[n];
    fib[1] = 1;
    // call The method fibonacci
    fibonacci(n-1,dp,n,fib);
    System.out.println(Arrays.toString(fib));
  }
  public static int fibonacci(int n,int[] dp,int idx,int[] fib){
    if(n<=1) return n;
    // Already Exits Calls Will be return Immediately
    if(dp[n] != 0) return dp[n]; 
    idx--;
    // Store the Call Stack value of Dp Array
    dp[n] = fibonacci(n-1,dp,idx,fib)+fibonacci(n-2,dp,idx,fib);// Call the Same Method 
    // Stack return Value Store Of Val fib Array
    fib[idx] = dp[n];
    return dp[n];
  }   
}
