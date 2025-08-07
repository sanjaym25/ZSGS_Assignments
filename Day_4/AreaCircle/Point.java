package AreaCircle;

public class Point {
    private int x;
    private int y;
    Point(){ //default constructor
        this.x = 0;
        this.y = 0;
    }
    public void setPoint(int x,int y){//set coordinates
        this.x = x;
        this.y = y;
    }
    public int getX(){return this.x;} //get x coordinates
    int getY(){return this.y;} //get y coordinates
    public void printPoint(){// print (x,y) coordinates
        System.out.println("Center Point : "+"X : " +this.x+"Y :"+y);
    }
}
