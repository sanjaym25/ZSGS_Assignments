/*
 10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m
 */

package Day_2.Part_2;

import java.util.Scanner;

public class Two_Dimensional_Array {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[0][0];
        
        // Show The Details Of Operations

        while (true) {
            System.err.println(
                    "Create 2D Array : 1 \nDisplay The 2D Matrix : 2 \nSum Of The 2D Matrix : 3 \nSum Of The 2D Row Matrix : 4 \nSum Of The 2D Column Matrix : 5 \n2D Transpose 2D Array Matrix : 6 \nExit : 7");
            System.out.print("Enter Your Choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("!!   Create 2D Array !!!\n");
                    matrix = createTwo_Dimensional_Array();
                    break;
                case 2:
                    System.out.println("****    Display The 2D Matrix  ***\n");
                    diaplay2DArray(matrix);
                    break;
                case 3:
                    System.out.println("****    Sum Of The 2D Matrix  ***\n");
                    sumOf2DArray(matrix);
                    break;
                case 4:
                    System.out.println("****    Sum Of The 2D Row Matrix  ***\n");
                    sumOfRow2DArray(matrix);
                    break;
                case 5:
                    System.out.println("****    Sum Of The 2D Column Matrix  ***\n");
                    sumOfCol2DArray(matrix);
                    break;
                case 6:
                    System.out.println("****    2D Transpose 2D Array Matrix  ***\n");
                    transpose2DArray(matrix);
                    break;

                default:
                    break;
            }
        }
    }

    // Create 2D Array
    public static int[][] createTwo_Dimensional_Array() {
        System.out.print("Enter the Row Size : ");
        int row = scan.nextInt();
        System.out.print("Enter the Colummn Size : ");
        int col = scan.nextInt();
        int[][] matixArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the Value : ");
                matixArray[i][j] = scan.nextInt();
            }
        }
        System.out.println("****    Array Created SuccesFully   ***");
        return matixArray;
    }

    // Display The 2D Array
    public static void diaplay2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Sum Of 2D Array
    public static void sumOf2DArray(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum Of 2D Array : " + sum);
    }

    // Row wise Sum Of Element

    public static void sumOfRow2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum Of Row " + (i + 1) + " 2D Array : " + sum);
        }
    }
    // Sum of Column The 2D Array

    public static void sumOfCol2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum Of Column " + (i + 1) + " 2D Array : " + sum);
        }
    }
    
    // Transpose 2D Array
    public static void transpose2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}