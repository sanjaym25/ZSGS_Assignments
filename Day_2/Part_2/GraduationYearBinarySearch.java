/*
 6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
 */
package Day_2.Part_2;
import java.util.Scanner;

public class GraduationYearBinarySearch {
    static Scanner scan = new Scanner(System.in);
    // Main Method Call the Method Call
    public static void main(String[] args) {
        int[] year = graduationYear();
        mergeSort(year, 0, year.length-1);
        System.out.print("Enter the Target : ");
        int target = scan.nextInt();
        boolean graduationYear = BinarySearch(year,0,year.length-1,target);
        if(graduationYear) System.out.println("Record Exit !!");
        else  System.out.println("Record Does Not Exit !!"); 
    }

    // Inseart Array Graduation year /
    public static int[] graduationYear() {
        System.out.println("Enter The Graduation Year Size :");
        int size = scan.nextInt();
        int[] year = new int[size];
        for (int i = 0; i < year.length; i++) {
            System.out.print("Enter The year : ");
            year[i] = scan.nextInt();
        }
        return year;
    }
    
    // Search the year Using Binary Search
    public static boolean BinarySearch(int[] year, int left, int right,int target){
        while(left<right){
            int mid = (left+right)/2;
            if(year[mid] == target) return true;
            else if(year[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
    
    // Sort the Array Using Merge Sort

    public static void mergeSort(int[] year, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(year, left, mid);
            mergeSort(year, mid + 1, right);
            merge(year, left, right, mid);
        }
    }
    
    // Merge The Two Array 

    public static void merge(int[] year, int left, int right, int mid) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[(right - left) + 1];
        while (i <= mid && j <= right) {
            if (year[i] < year[j])
                temp[k++] = year[i++];
            else
                temp[k++] = year[j++];
        }
        while (i <= mid)
            temp[k++] = year[i++];
        while (j <= right)
            temp[k++] = year[j++];

        for (int x = 0; x < temp.length; x++)
            year[left++] = temp[x];
    }
}
