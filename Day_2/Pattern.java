package Day_2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number Row pattern : ");
        int n = scan.nextInt();
        System.out.print("Enter The Letter Pattern Character : ");
        char character = scan.next().charAt(0);
        System.out.println("****   Digit pattern ***");
        digitPattern(n);
        System.out.println("****   Character pattern ***");
        letterPattern(n,character);
    }

    public static void digitPattern(int n){
        int top = n%2 != 0?(n/2)+1:n/2;
        int bottom = n%2 == 0?(n/2):n/2;
        int i = 0;
        int count = 1;
        while(top-- > 0){
            i++;
            int j = 0;
            while(j++<i) System.out.print((count++)+" ");
            System.out.println();                    
        }
         while(bottom > 0){
            int j = 0;
            while(j++<bottom) System.out.print((count++)+" ");
            System.out.println();
            bottom--;                    
        }
    }

    public static void letterPattern(int n,char character){
        int top = n%2 != 0?(n/2)+1:n/2;
        int bottom = n%2 == 0?(n/2):n/2;
        int i = 0;
        while(top-- > 0){
            i++;
            int j = 0;
            while(j++<i) System.out.print(character+" ");
            System.out.println();                    
        }
         while(bottom > 0){
            int j = 0;
            while(j++<bottom) System.out.print(character+" ");
            System.out.println();
            bottom--;                    
        }
    }
}
