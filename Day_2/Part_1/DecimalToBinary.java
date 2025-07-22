// 6. Define a method to convert the decimal number to a binary number?
package Day_2.Part_1;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        String binary = "";
        // Decimal To Binary conversion Method Call
        binary = DecimalToBinary(n,binary);
        System.out.println("Decimal To binary : "+binary);
    }
    // Decimal To Binary Convert
    public static String DecimalToBinary(int n,String binary){
        if(n == 0) return binary;
        binary = (n&1)+binary;
        return DecimalToBinary(n>>1,binary);
    }
}
