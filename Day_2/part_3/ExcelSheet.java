/*
 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
 */
package Day_2.part_3;

import java.util.Scanner;

public class ExcelSheet {
   static Scanner  scan = new Scanner(System.in);
   public static void main(String[] args) {
     System.out.print("Enter the Colummn Number : "); 
     int  colummnNo = scan.nextInt();
     System.out.println(ColummnNoToLetter(colummnNo,""));
   } 
   // Colummn No To Excel Sheet format
   public static String ColummnNoToLetter(int colummnNo,String str){
      while(--colummnNo > 0){
      str = ((char)((colummnNo%26)+'A'))+str;
      colummnNo/=26;
      }
      return str;
   }  
}
