package Day_2;

import java.util.Scanner;

public class EvenContinue {
    public static void main(String[] args) {
        // Check Even Number using
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            if(i%2 != 0) continue;
            sum+=i;
        }
        System.out.println("Even Number Sum : "+ sum);
    }   
}
