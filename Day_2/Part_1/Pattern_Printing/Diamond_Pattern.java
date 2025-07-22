package Day_2.Part_1.Pattern_Printing;

import java.util.Scanner;

public class Diamond_Pattern{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter The Number Of Row : ");
        int row = scan.nextInt();
        if(row%2 == 0) System.out.println("***     Invalid Row    ***");
        else diamond_Pattern(row); // Call the diamond_Pattern method
    }
    // Diamond Pattern printing
    public static void diamond_Pattern(int row){
        int mid = (row/2)+1;
        int i = 0;
        int count = 1;
        while(mid-->0){
            int x = 0;
            while(x++<mid)System.out.print(" ");
            i++;
            int j = 0;
            while(j++<i) System.out.print((count++)+" ");
            System.out.println();
        }
        mid = (row/2+1);
        int y = 0;
        while(mid-- > 0){
            int x = 0;
            y++;
            int z = 0;
            while(z++<y)System.out.print(" "); 
            while(x++<mid)System.out.print((count++)+" ");  
            System.out.println();
        }

    } 

}