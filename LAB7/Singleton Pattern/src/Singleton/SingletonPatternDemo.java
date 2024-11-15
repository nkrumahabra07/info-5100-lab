/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author HP
 */
public class SingletonPatternDemo {
    public static void main(String[]args){
    
    
    var object = SingleObject.getInstance();
    object.showMessage();
    
    }   
}
