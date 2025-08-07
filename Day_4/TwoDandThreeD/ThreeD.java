package TwoDandThreeD;

public class ThreeD extends TwoD{
    private int z;
    ThreeD(){
       super(); 
    }
    ThreeD(int x ,int y,int z){
        super(x,y);
        this.z = z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return this.z;
    }

    public double distanceCalculate(ThreeD obj){
        int dX = (this.getX() - obj.getX());
        int dY = (this.getY() - obj.getY());
        int dZ = (this.getZ() - obj.getZ());
        double sum = ((dX*dX)+(dY*dY)+(dZ*dZ));
        return squareRoot(sum);
    }

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
