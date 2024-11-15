/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filter;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CriteriaFemale implements Criteria {
    
   public List<Person> meetCriteria(List<Person>persons){ 
     List<Person> femalePersons = new ArrayList<Person>();
    
    for (Person person : persons){
    if(person.getGender().equalsIgnoreCase("FEMALE")){
        femalePersons.add(person);
    }
}
    return femalePersons;
  }   

}