/*
 7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
 */
package Day_2.Part_2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double[] weight = peopleWeight();
        weight = selectionSort(weight);
        System.out.println(Arrays.toString(weight));
    }
    // Insert The People Weight

    public static double[] peopleWeight(){
        System.out.print("Enter The How Many Number People Weight Store : ");
        int n = scan.nextInt();
        double [] weight = new double[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter the Weight : ");
            weight[i] = scan.nextDouble();
        }
        return weight;
    }
    
    // selection Sort Logic
    public static double[] selectionSort(double[] weight){
        for(int i = 0;i<weight.length;i++){
            int idx = i;
            for(int j = i+1;j<weight.length;j++){
                if(weight[idx]<weight[j]) idx = j;
            }
            double temp = weight[i];
            weight[i] = weight[idx];
            weight[idx] = temp; 
        }
        return weight;
    } 
}
