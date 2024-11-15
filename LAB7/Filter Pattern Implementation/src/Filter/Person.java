/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filter;

/**
 *
 * @author HP
 */
public class Person {
   private String name;
   private String gender;
   private String maritalStatus;
   
  public Person(String name, String gender, String maritalStatus){
  this.name = name;
  this.gender = gender;
  this.maritalStatus = maritalStatus;
  }
  public String getName(){
      
       return name;
      
  }
  public String getGender(){
      
       return gender;
          
  } 
  
   public String getMaritalStatus(){
      
       return maritalStatus;
          
  } 
}
