package AreaCircle;
public class Circle extends Point{
    private double radius; // private variable of radius

    // Constructor Assign The value

    Circle(int x,int y,double radius){
        this.setPoint(x, y);
        this.setRadius(radius);
    }

    // Set Radius Method

    public void setRadius(double radius) {
        if(radius <1) this.radius = 1;
        else this.radius = radius;
    }

    // get radius Method
    public double getRadius(){
        return this.radius;
    }
    // Find The Area
    public double area(){
      double pi = Math.PI;
      return pi*(this.radius*this.radius);   
    }
    
    // Override toString Method
    @Override
    public String toString(){
        return "Circle center (x,y) : ("+getX()+" , "+getY()+") \n"+
                "Radius : "+this.radius+"\n"+
                "Area : "+this.area();
    }
}
