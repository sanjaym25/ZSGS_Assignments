/*
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
 */
package Day_2.Part_1.Pattern_Printing;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class DoWhilePascals {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The How Many Row Pascals : ");
        int n = scan.nextInt();
        pascalsPattern(0,n);
    }
    // Insert Pascals Logic Store The ArrayList

    public static void pascalsPattern(int row, int n){
        List<List<Integer>> pascals = new ArrayList<>();
        do {
            int col = 0;
            List<Integer> data = new ArrayList<>();
            do {
                if (col == 0 || col == row) {
                    data.add(1);
                } else {
                    data.add((pascals.get(row - 1).get(col - 1) + pascals.get(row - 1).get(col)));
                }

            } while (col++ < row);
            pascals.add(data);
        } while (row++ < n - 1);
        
        // Print Pattern Pascals method calling
        
        PatternPrinting(n,pascals); 
    }
    // Print Pattern Pascals
    public static void PatternPrinting(int n,List<List<Integer>> pascals){
        int i = 0;
        do {
            int j = 0;
            int k = 0;
            do {
                System.out.print(" ");
            } while (++k < (n - i));
            do {
                System.out.print(pascals.get(i).get(j) + " ");
            } while (++j < pascals.get(i).size());
            System.out.println();
        } while (++i < pascals.size());
    }
}
