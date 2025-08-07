/*
 * 5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
 */
package Polymorism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.prints();
        Polygon polygon = new Polygon();
        polygon.prints();
        Rectangle rectangle = new Rectangle();
        rectangle.prints();
        Triangle triangle = new Triangle();
        triangle.prints();
        Square square = new Square();
        square.prints();

    }
}
