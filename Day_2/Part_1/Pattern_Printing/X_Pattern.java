package Day_2.Part_1.Pattern_Printing;

import java.util.Scanner;

public class X_Pattern {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter The Number Of Row : ");
        int row = scan.nextInt();
        System.out.print("Enter The Number Of Col : ");
        int col = scan.nextInt();

        // Call The Method  X Pattern

        xPattern(row, col);
    }
    // X Pattern Print Logic 
    public static void xPattern(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j || j == col) {
                    System.out.print("X");
                    continue;
                }
                System.out.print("  ");
            }
            col--;
            System.out.println();
        }
    }
}
