/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import MODEL.Patient;
import Utililty.DatabaseConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class VIewJPanel1 extends javax.swing.JPanel {
    ArrayList <Patient> patients;
    Patient selectedPatient;
    ImageIcon profilePicture;
    Patient p1;
    /**
     * Creates new form FormJPanel
     */
    public VIewJPanel1() {
        initComponents();
        
        populateTable();
        disableAll();
        
    }
 public VIewJPanel1(Patient p1) throws Exception{
     this.p1 = p1;
     initComponents();
     PopulateData();
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3firstName = new javax.swing.JLabel();
        enterFirstNameTextField = new javax.swing.JTextField();
        jLabel2lastName = new javax.swing.JLabel();
        enterLastNamejTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SubmitjButton1 = new javax.swing.JButton();
        jRadioButton1Male = new javax.swing.JRadioButton();
        jRadioButton3Female = new javax.swing.JRadioButton();
        jRadioButton2Other = new javax.swing.JRadioButton();
        jLabel3Age = new javax.swing.JLabel();
        phonenumberjLabel3 = new javax.swing.JLabel();
        jTextField1Phonenumber = new javax.swing.JTextField();
        EmailjLabel4 = new javax.swing.JLabel();
        jTextField2Email = new javax.swing.JTextField();
        jFormattedTextField1Age = new javax.swing.JFormattedTextField();
        patientTypejComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientjTable = new javax.swing.JTable();
        EditjButton = new javax.swing.JButton();
        DeletejButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Registration");

        jLabel3firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3firstName.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3firstName.setText("First Name:");

        jLabel2lastName.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2lastName.setText("Last Name:");

        enterLastNamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterLastNamejTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Gender:");

        SubmitjButton1.setText("Submit");
        SubmitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitSubmitjButton1ActionPerformed(evt);
            }
        });

        buttonGroup1Gender.add(jRadioButton1Male);
        jRadioButton1Male.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton1Male.setText("Male");
        jRadioButton1Male.setActionCommand("MALE");

        buttonGroup1Gender.add(jRadioButton3Female);
        jRadioButton3Female.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton3Female.setText("Female");
        jRadioButton3Female.setActionCommand("FEMALE");

        buttonGroup1Gender.add(jRadioButton2Other);
        jRadioButton2Other.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton2Other.setText("Prefer not to say");
        jRadioButton2Other.setActionCommand("OTHER");

        jLabel3Age.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3Age.setText("Age:");

        phonenumberjLabel3.setForeground(new java.awt.Color(255, 153, 0));
        phonenumberjLabel3.setText("Phone number:");

        EmailjLabel4.setForeground(new java.awt.Color(255, 153, 0));
        EmailjLabel4.setText("E-mail");

        jFormattedTextField1Age.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField1Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1AgeActionPerformed(evt);
            }
        });

        patientTypejComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in", "Late", "Item 4" }));
        patientTypejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypejComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Patient type");

        patientjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Age", "Email", "Phone Number", "Patient Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientjTable);

        EditjButton.setText("Edit");
        EditjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditjButtonActionPerformed(evt);
            }
        });

        DeletejButton1.setText("Delete Row");
        DeletejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(patientTypejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(138, 138, 138))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3firstName))
                                .addComponent(phonenumberjLabel3)
                                .addComponent(EmailjLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2Email)
                                        .addComponent(enterLastNamejTextField1)
                                        .addComponent(enterFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2Other)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButton1Male)
                                                .addComponent(jRadioButton3Female))
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel3Age)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jTextField1Phonenumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(159, 159, 159)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(EditjButton)
                        .addGap(33, 33, 33)
                        .addComponent(DeletejButton1)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditjButton)
                            .addComponent(DeletejButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3firstName)
                                    .addComponent(enterFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2lastName)
                                    .addComponent(enterLastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jRadioButton1Male))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3Female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2Other)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3Age)
                                    .addComponent(jFormattedTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonenumberjLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailjLabel4)
                            .addComponent(jTextField2Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientTypejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitSubmitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitSubmitjButton1ActionPerformed
        try{
            String name = this.enterFirstNameTextField.getText()+" "+enterLastNamejTextField1.getText();
            String patientType = this.patientTypejComboBox1.getSelectedItem().toString();
            String gender = "";

            // Check if gender is selected
            if (this.buttonGroup1Gender.getSelection() != null) {
                gender = this.buttonGroup1Gender.getSelection().getActionCommand();
            } else {
                throw new NullPointerException("Please select a gender.");
            }
            String phoneNumber = this.jTextField1Phonenumber.getText();
            String age = "";
            if(  this.jFormattedTextField1Age.getText()+("years") != null) {
                age = this.jFormattedTextField1Age.getText();}
            else{
                throw new NullPointerException("Please select a age.");
            }

            String Email = this.jTextField2Email.getText();
            if (name.trim().isEmpty() || phoneNumber.trim().isEmpty() || age.trim().isEmpty() || Email.trim().isEmpty() || gender.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            String display = "Name:" +name+ "  \nGender: "+gender+   "  Age:  "  +age+ "\nPhone Number: " +phoneNumber+
            " \nEmail: " +Email;

            System.out.println(this.enterFirstNameTextField.getText()+" "+enterLastNamejTextField1.getText());

            System.out.println(this.buttonGroup1Gender.getSelection().getActionCommand());
            System.out.println(this.jFormattedTextField1Age.getText()+("years"));
            System.out.println(this.jTextField1Phonenumber.getText());
            System.out.println(this.jTextField2Email.getText());

            if (name.trim().isEmpty() || phoneNumber.trim().isEmpty()
                || age.trim().isEmpty() || Email.trim().isEmpty() || gender.trim().isEmpty()) {

            }

            JOptionPane.showMessageDialog(this, display);
        }
        catch (NullPointerException e) {
            String errorMessage = e.getMessage() != null ? e.getMessage() : "Please enter all values.";
            JOptionPane.showMessageDialog(this, errorMessage);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitSubmitjButton1ActionPerformed

    private void jFormattedTextField1AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1AgeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1AgeActionPerformed
  
    
    
    
    
    
    private void patientTypejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypejComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypejComboBox1ActionPerformed

    
            public void populateTable(){
        this.patients = DatabaseConnector.getPatients();
        DefaultTableModel model = (DefaultTableModel) this.patientjTable.getModel();
        model.setRowCount(0);
        for (Patient p1: patients){
        Object [] row = new Object[8];

        //Object [] rows = new Object[N];
        row[0] = p1.getId();
        row[1] = p1.getFirstName();
        row[2] = p1.getLastName();
         row[3] = p1.getAge();
        row[4] = p1.getGender();
        row[5] = p1.getEmail();
        row[6] = p1.getPhoneNumber();
        row[7] = p1.getPatientType();
       
        model.addRow(row);
      
        

}
   }
public void enableAll(){

    this.enterFirstNameTextField.setEnabled(true);
    this.jRadioButton1Male.setEnabled(true);
    this.jRadioButton2Other.setEnabled(true);
    this.patientTypejComboBox1.setEnabled(true);
    this.jRadioButton3Female.setEnabled(true);
    this.enterFirstNameTextField.setEnabled(true);
    this.jFormattedTextField1Age.setEnabled(true);
    this.enterFirstNameTextField.setEnabled(true);
    this.jTextField1Phonenumber.setEnabled(true);
    this.jTextField2Email.setEnabled(true);
    
    
    






}

public void disableAll(){

    this.enterFirstNameTextField.setEnabled(false);
    this.jRadioButton1Male.setEnabled(false);
    this.jRadioButton2Other.setEnabled(false);
    this.patientTypejComboBox1.setEnabled(false);
    this.jRadioButton3Female.setEnabled(false);
    this.enterFirstNameTextField.setEnabled(false);
    this.jFormattedTextField1Age.setEnabled(false);
    this.enterFirstNameTextField.setEnabled(false);
    this.jTextField1Phonenumber.setEnabled(false);
    this.jTextField2Email.setEnabled(false);
    
    
    
}

    private void EditjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditjButtonActionPerformed
        // TODO add your handling code here:
        enableAll();
        
        int selectedRowIndex = this.patientjTable.getSelectedRow();
        
        this.selectedPatient = this.patients.get(selectedRowIndex);
        
        
        
        
        
    }//GEN-LAST:event_EditjButtonActionPerformed

    private void DeletejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.patientjTable.getSelectedRow();
        this.selectedPatient = this.patients.get(selectedRowIndex);
        try{
        
        DatabaseConnector.deletePatient(selectedPatient);
        System.out.println("Deleted row sucessfully");
        populateTable();
 }catch (Exception e) {
 System.out.println("Unable to delete row");
 System.out.println();
     
 }
        
               
    }//GEN-LAST:event_DeletejButton1ActionPerformed

    private void enterLastNamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterLastNamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterLastNamejTextField1ActionPerformed
   private void PopulateData() throws Exception {
      this.enterFirstNameTextField.setText(p1.getFirstName() );
        
      this.enterLastNamejTextField1.setText(p1.getFirstName());
    this.jTextField2Email.setText(p1.getEmail());
    this.jFormattedTextField1Age.setText(p1.getAge());
    this.jTextField1Phonenumber.setText(p1.getPhoneNumber());
    String gender = p1.getGender();
      if(gender.equals("MALE")){
         this.buttonGroup1Gender.setSelected( this.jRadioButton1Male.getModel(),true);
    }else if (gender.equals("FEMALE")){
        this.buttonGroup1Gender.setSelected( this.jRadioButton3Female.getModel(),true); 
    }else{this.buttonGroup1Gender.setSelected(this.jRadioButton2Other.getModel(),true);
    }
    
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletejButton1;
    private javax.swing.JButton EditjButton;
    private javax.swing.JLabel EmailjLabel4;
    private javax.swing.JButton SubmitjButton1;
    private javax.swing.ButtonGroup buttonGroup1Gender;
    private javax.swing.JTextField enterFirstNameTextField;
    private javax.swing.JTextField enterLastNamejTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField1Age;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2lastName;
    private javax.swing.JLabel jLabel3Age;
    private javax.swing.JLabel jLabel3firstName;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1Male;
    private javax.swing.JRadioButton jRadioButton2Other;
    private javax.swing.JRadioButton jRadioButton3Female;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1Phonenumber;
    private javax.swing.JTextField jTextField2Email;
    private javax.swing.JComboBox<String> patientTypejComboBox1;
    private javax.swing.JTable patientjTable;
    private javax.swing.JLabel phonenumberjLabel3;
    // End of variables declaration//GEN-END:variables

 
}