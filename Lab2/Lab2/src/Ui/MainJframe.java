/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
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
        jButton1picture = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registration");

        jLabel3firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3firstName.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3firstName.setText("First Name:");

        jLabel2lastName.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2lastName.setText("Last Name:");

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Gender:");

        SubmitjButton1.setText("Submit");
        SubmitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitSubmitjButton1ActionPerformed(evt);
            }
        });

        buttonGroup1Gender.add(jRadioButton1Male);
        jRadioButton1Male.setText("Male");
        jRadioButton1Male.setActionCommand("MALE");

        buttonGroup1Gender.add(jRadioButton3Female);
        jRadioButton3Female.setText("Female");
        jRadioButton3Female.setActionCommand("FEMALE");

        buttonGroup1Gender.add(jRadioButton2Other);
        jRadioButton2Other.setText("Prefer not to say");
        jRadioButton2Other.setActionCommand("OTHER");

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

        jButton1picture.setText("picture");
        jButton1picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1pictureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(phonenumberjLabel3)
                            .addComponent(EmailjLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton2Other)
                                    .addComponent(jTextField2Email, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(enterLastNamejTextField1)
                                    .addComponent(enterFirstNameTextField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1Male)
                                        .addComponent(jRadioButton3Female))
                                    .addGap(65, 65, 65)
                                    .addComponent(jLabel3Age)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField1Phonenumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1picture)
                    .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3firstName)
                            .addComponent(enterFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2lastName)
                            .addComponent(enterLastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton1Male))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3Female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3Age)
                            .addComponent(jFormattedTextField1Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addComponent(jRadioButton2Other)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberjLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailjLabel4)
                    .addComponent(jTextField2Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1picture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitSubmitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitSubmitjButton1ActionPerformed
      try{
        String name = this.enterFirstNameTextField.getText()+" "+enterLastNamejTextField1.getText();
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

    private void jButton1pictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1pictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1pictureActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailjLabel4;
    private javax.swing.JButton SubmitjButton1;
    private javax.swing.ButtonGroup buttonGroup1Gender;
    private javax.swing.JTextField enterFirstNameTextField;
    private javax.swing.JTextField enterLastNamejTextField1;
    private javax.swing.JButton jButton1picture;
    private javax.swing.JFormattedTextField jFormattedTextField1Age;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2lastName;
    private javax.swing.JLabel jLabel3Age;
    private javax.swing.JLabel jLabel3firstName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1Male;
    private javax.swing.JRadioButton jRadioButton2Other;
    private javax.swing.JRadioButton jRadioButton3Female;
    private javax.swing.JTextField jTextField1Phonenumber;
    private javax.swing.JTextField jTextField2Email;
    private javax.swing.JLabel phonenumberjLabel3;
    // End of variables declaration//GEN-END:variables
}
