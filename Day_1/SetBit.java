//8. Write a program to find the first set bit of a number?
public class SetBit {
    public static void main(String[] args) {
      int n = 0;
      int count = 1;  
      System.out.println("First Set Bit Position : "+setbit(n,count));
    }
    public static int setbit (int n,int count){
        if(n == 0) return 0;
        if((n & 1) == 1) return count;
        count++;
        return setbit( n >> 1,count);    
    }
}
