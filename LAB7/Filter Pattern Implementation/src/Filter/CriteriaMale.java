/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CriteriaMale implements Criteria {
     @Override
   public List<Person> meetCriteria(List<Person>persons){ 
    List<Person> malePersons = new ArrayList<Person>();
    
    for (Person person : persons){
    if(person.getGender().equalsIgnoreCase("MALE")){
        malePersons.add(person);
    }
}
    return malePersons;
  }   

}