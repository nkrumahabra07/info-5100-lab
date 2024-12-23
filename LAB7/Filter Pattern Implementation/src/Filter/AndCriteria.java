/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filter;

import java.util.List;

/**
 *
 * @author HP
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria; 
    
    public AndCriteria(Criteria criteria, Criteria otherCriteria){
    this.criteria = criteria;
    this.otherCriteria = otherCriteria;
    }
    @Override
     public List<Person> meetCriteria(List<Person> persons){
   List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
    return otherCriteria.meetCriteria(firstCriteriaPersons);
}
}