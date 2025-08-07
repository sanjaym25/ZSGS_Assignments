/*
 * 3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
final int getX(){return x;} //get x coordinates
final int getY() return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file. Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses the private members x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number; otherwise, it is set to the default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point. Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
4. Write
 */
package AreaCircle;

public class Area {
    public static void main(String[] args) {
        Circle area = new Circle(2, 2, 1);
        area.setRadius(2);
        System.out.println(area);
    }
}
