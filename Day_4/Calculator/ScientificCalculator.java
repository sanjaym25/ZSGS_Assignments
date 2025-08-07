package Calculator;

public class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angle){
       double rad = toRadians(angle);
       int sign = 0;
       double sin_value = 0;
       for(int i = 1;i<=18;i+=2){
            if(sign%2 == 0){
                sin_value += (pow(rad, i)/factorial(i));
                sign++;
            }
            else {
                sin_value -=(pow(rad, i)/factorial(i));
                sign++;
            }
       }
       return sin_value;
    }

    public double cos(double angle){
        double rad = toRadians(angle);
        int sign = 1;
        double sin_value = 1;
        for(int i = 2;i<=18;i+=2){
            if(sign%2 == 0){
                sin_value += (pow(rad, i)/factorial(i));
                sign++;
            }
            else {
                sin_value -=(pow(rad, i)/factorial(i));
                sign++;
            }
       }
       return sin_value;
    }
    
    public double log(double value){
        return Math.log(value);
    }
    public double exp(double value){
        return Math.exp(value);
    }
    public double toRadians(double angle){
        double pi = Math.PI;
        return angle*(pi/180);
    }
    public int factorial(int num){
        if(num==0) return 1;
        return num*factorial(--num);
    }
    public double pow(double base,int exponent){
        if(exponent == 0) return 1;
        return base*pow(base,--exponent);
    }
}
