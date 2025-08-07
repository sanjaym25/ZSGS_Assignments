//1. Illustrates with an example of using Singleton class.
package Day_8;
// create one time object singleto class
public class SingleTon {
    static SingleTon oneTimeObject;
    public static SingleTon setObject(){ 
        if(oneTimeObject == null){
            oneTimeObject = new SingleTon();
        }
        return oneTimeObject;
    }
}
class Main{
    public static void main(String[] args){
        SingleTon obj = SingleTon.setObject();
        SingleTon obj2 = SingleTon.setObject();
        System.out.println(obj == obj2); // same object Print true;
    }
}
