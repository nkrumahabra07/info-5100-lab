/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utililty;

import MODEL.Patient;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author rishabhkaushick
 */
public class DatabaseConnector {
    // data members
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw";
    
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addPatient(Patient p1) throws SQLException{
        String query = "INSERT INTO Patient(FirstName,LastName, Gender, Age, Email, PhoneNumber, PatientType) VALUES (?, ?, ?) ";
        // String query = "INSERT INTO patient(first_name, last_name, gender, patient_type, age) VALUES (?, ?, ?, ?, ?) ";
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getFirstName());
            stmt.setString(2, p1.getLastName());
            stmt.setString(3, p1.getGender());
            stmt.setString(4, p1.getAge());
            stmt.setString(5, p1.getEmail()); 
            stmt.setString(6, p1.getPhoneNumber());
            stmt.setString(7, p1.getPatientType());
           
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            // After this query will look like:
//            "INSERT INTO patient(first_name, gender, patient_type) VALUES ('Rish', 'Male', 'Appointment') "
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    // R - Read: Getting all the values from the database
    public static ArrayList<Patient> getPatients(){
        ArrayList <Patient> patients = new ArrayList();
        String query = "SELECT * FROM Patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFirstName(rs.getString("firstName"));
                 p1.setLastName(rs.getString("LastName"));
//              p1.setLastName(rs.getString("lastName"));
                p1.setGender(rs.getString("Gender"));
                p1.setPatientType(rs.getString("patientType"));
                patients.add(p1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return patients;
    }
    
    public static void getPatientName(){
        String query = "SELECT firstName, last_name FROM Patient";
    }
     
    // U - Update: Changing a value in the database
    public static void updatePatient(Patient oldPatient, Patient updatedPatient){
            String query = "UPDATE Patient SET firstName = ?,LastName = ?, Gender = ?, Phonenumber = ?,gender = ?, Age= ?,  PatientType = ? WHERE id = ? ";
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedPatient.getFirstName());
            stmt.setString(2, updatedPatient.getLastName());
            stmt.setString(3, updatedPatient.getGender());
            stmt.setString(3, updatedPatient.getAge());
            stmt.setString(4, updatedPatient.getPatientType());
            stmt.setInt(4, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM Patient WHERE id = ? ;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
