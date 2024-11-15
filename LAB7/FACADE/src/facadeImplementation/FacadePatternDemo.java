/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeImplementation;

/**
 *
 * @author HP
 */
public class FacadePatternDemo {

    /**
     *
     * @param arg
     */
    public static void main(String[]arg){
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
       shapeMaker.drawRectangle(); 
       shapeMaker.drawSquare();
    }
    
}
