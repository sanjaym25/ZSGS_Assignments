package Calculator;

public class AdvancedCalculator extends BasicCalculator {
    // power Calculate
    public int power(int base, int exponent){
        if(exponent == 0) return 1;
        return base*power(base, --exponent);
    } 
    // return  remainder modulus operation
    public int modulus(int a, int b){
        return a%b;
    } 
    // return squareRoot operations
    public double squareRoot(double number){
        double start = 0;
        double end = number;
        double epsilon = 0.00001;
        double  mid = 0;
        while((end-start)>epsilon){
            mid = (start+end)/2;
            double square = mid*mid;
            if(square<number) start = mid;
            else end = mid;
        } 
        return (start+end)/2;
    } 
}
