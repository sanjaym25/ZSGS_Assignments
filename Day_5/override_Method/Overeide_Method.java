/*
 *2. Can we override private method, constructor, static method, final method? 
 Illustrate with an example.
 */
package Day_5.override_Method;

public class Overeide_Method {
    Overeide_Method(){
        System.out.println("Constructor Method");
    }
    private void privateMethod(){
        System.out.println("Private Method !");
    }   
    static void staticMethod(){
        System.out.println("Static Method !");
    }   
    final void finalMethod(){
        System.out.println("Final Method !");
    }   
}
class Main extends Overeide_Method{
    @Override
    Overeide_Method(){
        System.out.println("Override Constructor Method"); // No override the super class Constroctor
    }
    @Override
    private void privateMethod(){ // The method privateMethod() of type Main must override or implement a supertype method
        System.out.println("Override Private Method !");
    } 
    @Override
    static void staticMethod(){ // The method staticMethod() of type Main must override or implement a supertype method
        System.out.println("Override Static Method !");
    }
    @override
    final void finalMethod(){//Cannot override the final method from Overeide_Method
        System.out.println("Override Final Method !");
    }  
}
