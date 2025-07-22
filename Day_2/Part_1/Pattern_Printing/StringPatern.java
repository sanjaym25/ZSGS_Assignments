/*
ZOHO
CORP
ORAT
IONS
 */
package Day_2.Part_1.Pattern_Printing;

import java.util.Scanner;

public class StringPatern {
    public static void main(String[] args) {
        // User Input

        Scanner scan = new Scanner(System.in);

        // Enter User Input String 

        System.out.print("Enter the String  : ");
        String str = scan.nextLine();
        System.out.print("Enter the Column Number : ");
        int col = scan.nextInt();

        // Call the String Pattern
        
        stringPattern(0,0,str,col);
    }
    // String Pattern Logic 
    public static void stringPattern(int i, int idx,String str,int col){
        do{
           int j = 0;
           do{
            System.out.print(str.charAt(idx++)+" ");
           }while(j++<col-1 && idx<str.length());
           System.out.println();
        }while(i++<(str.length()/col-1));
    }   
}
