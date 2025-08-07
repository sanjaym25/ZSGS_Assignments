/*
 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.
 */
package String;
import java.io.IOException;
import java.util.Scanner;
public class My_String_Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("***    Create First Object 1   ***");
        My_String obj = new My_String(input());
        System.out.println("***    Create Second Object 2   ***");
        My_String obj2 = new My_String(input());
        System.out.println("***    Create Third Object 3  ***");
        My_String obj3 = new My_String(input());
        System.out.println("length() : "+obj.length());
        System.out.println("charAt() : "+obj.charAt(4));
        System.out.println("equals() : "+obj.equals(obj2));
        System.out.println("toUpperCase() : "+obj2.toUpperCase());
        System.out.println("toUpperCase() : "+obj2.toLowerCase());
        System.out.println("subString() : "+obj2.substring(0,4));
        System.out.println("Single parameter subString(): "+obj2.substring(1));
        System.out.println("cancat() : "+obj3.concat(obj2));
        System.out.println("indexOf() : "+obj3.indexOf('i'));
        System.out.println("contains() : "+obj3.contains(obj2));
        System.out.println("replace() : "+obj3.replace('i','s'));
    }
    // User Input System.in.read() Dircte
    public static char[] input() throws IOException{
        System.out.print("Enter the String : ");
        char character[] = new char[10];
        int idx = 0;
        int ch = 0;
        while((ch = System.in.read()) != '\n'){
            if(character.length == idx){
                char newChar[] = new char[idx*2];
                for(int i = 0;i<character.length;i++){
                    newChar[i] = character[i];      
                }
                character = newChar;
            }
            character[idx++] = (char)ch;
        }
        char result [] = new char[idx-1];
        for(int i = 0;i<idx-1;i++){
            result[i] = character[i];
        }
        return result;
    }
}