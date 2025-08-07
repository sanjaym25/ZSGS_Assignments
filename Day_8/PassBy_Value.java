//6. Develop a Java program to illustrate pass-by-value.
package Day_8;
public class PassBy_Value {
    public static void main(String[] args){
        int num = 10;
        passByValue(num);
        System.out.println(" Orginal Num : "+num);// No affected To orinal value
    }
    public static void passByValue(int num){
        num = 20;
        System.out.println("Method Inside Num : "+num);
    }    
}