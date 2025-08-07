package TwoDandThreeD;

public class TwoD {
    private int x = 0;
    private int y = 0;

    TwoD(){
        System.out.println("TwoD Default Constructor");
    }

    TwoD(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
}
