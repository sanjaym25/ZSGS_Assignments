package Day_2.Part_1.Pattern_Printing;

import java.util.Scanner;

public class R_pattern {
   static Scanner scan = new Scanner(System.in); 
   public static void main(String[] args) {
        System.out.print("Enter The Number Of Row : ");
        int row = scan.nextInt();
        System.out.print("Enter The Number Of Col : ");
        int col = scan.nextInt();
        System.out.print("Enter The Character : ");
        char character = scan.next().charAt(0);
        rPattern(row,col,character);
   }

   // R Pattern Will be Print Method 

   public static void rPattern(int row,int col,char character){
        int mid = row/2;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if((i == 0 || j == 0) || (j == col-1 && i<mid) || (i == mid) || (i>mid && i == j)) 
                    System.out.print(character+" ");
                else System.out.print("  ");
            }
           System.out.println(); 
        }
   }
}
