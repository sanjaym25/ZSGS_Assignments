package Day_2.Part_2;
/*
 5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
 */
public class Character_identical {

    public static void main(String[] args) {
        char[] charArray1 = {'m', 'n', 'o', 'p'};
        char[] charArray2 = {'m', 'n', 'o', 'p'};
        System.out.println(CharacterArrayEqualToNot(charArray1, charArray2));// return True Or False Print
    }
    
    // Check Two Array Equal Or not
    public static boolean CharacterArrayEqualToNot(char[] charArray1, char[] charArray2) {
        int left = 0;
        int right = 0;
        while (left < charArray1.length && right < charArray2.length) {
            if (charArray2[right] != charArray2[right])
                return false;
            right++;
            left++;        
        }
        return true;
    }
}