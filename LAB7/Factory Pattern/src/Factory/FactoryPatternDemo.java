/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author HP
 */
public class FactoryPatternDemo {
    public static void main(String[] arg){
   ShapeFactory shapeFactory = new ShapeFactory();
   //get an object of circle and call its draw method
   Shape shape1 =shapeFactory.getShape("CIRCLE");
   //call draw method of circle
   
   shape1.draw();
   //get an object of Rectangle and call its draw method.
     Shape shape2 =shapeFactory.getShape("RECTANGLE");
     
     //call draw method of rectangle
     shape2.draw();
     
     //get an object of Square and call its draw method.
     Shape shape3 = shapeFactory.getShape("SQUARE");
     
//call draw method of square
     shape3.draw();
    
    
    
    }
      
}
