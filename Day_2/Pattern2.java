package Day_2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // User Input
        Scanner scan = new Scanner(System.in);
        // Enter User Input String 
        System.out.print("Enter the String  : ");
        String str = scan.nextLine();
        System.out.print("Enter the Column Number : ");
        int col = scan.nextInt();
        int i = 0;
        int idx = 0;
        do{
           int j = 0;
           do{
            System.out.print(str.charAt(idx++)+" ");
           }while(j++<col-1 && idx<str.length());
           System.out.println();
        }while(i++<(str.length()/col-1));
    }   
}
