/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MainJframe extends javax.swing.JFrame {
    ImageIcon profilePicture;

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
        imagejButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imgjLabel4 = new javax.swing.JLabel();
        patientTypejComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

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

        imagejButton1.setText("Select image file");
        imagejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagejButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Image");

        patientTypejComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in", "Late", "Item 4" }));
        patientTypejComboBox1.setSelectedIndex(-1);
        patientTypejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypejComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Patient type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgjLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(patientTypejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagejButton1)))
                .addGap(138, 138, 138))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(phonenumberjLabel3)
                            .addComponent(EmailjLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2Email, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(enterLastNamejTextField1)
                                    .addComponent(enterFirstNameTextField))
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
                            .addComponent(jTextField1Phonenumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2Other)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgjLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientTypejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imagejButton1)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(SubmitjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            if(  this.jFormattedTextField1Age.getText()+("years") != null ) {
                age = this.jFormattedTextField1Age.getText();}
            else{
                throw new NullPointerException ("Please select a age or Patient Type.");
            }

            String Email = this.jTextField2Email.getText();
            if (name.trim().isEmpty() || phoneNumber.trim().isEmpty() || age.trim().isEmpty() || Email.trim().isEmpty() || gender.trim().isEmpty()
                    || patientType.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            String display = "Name:" +name+ "  \nGender: "+gender+   "  Age:  "  +age+ "\nPhone Number: " +phoneNumber+
            " \nEmail: " +Email+ "\nPatient Type" +patientType; 

            System.out.println(this.enterFirstNameTextField.getText()+" "+enterLastNamejTextField1.getText());

            System.out.println(this.buttonGroup1Gender.getSelection().getActionCommand());
            System.out.println(this.jFormattedTextField1Age.getText()+("years"));
            System.out.println(this.jTextField1Phonenumber.getText());
            System.out.println(this.jTextField2Email.getText());

            if (name.trim().isEmpty() || phoneNumber.trim().isEmpty()
                || age.trim().isEmpty() || Email.trim().isEmpty() || gender.trim().isEmpty() || patientType.isEmpty()) {

            }

            //JOptionPane.showMessageDialog(this, display);
           JOptionPane.showMessageDialog(this,display, "Succes",HEIGHT, profilePicture);
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

    private void imagejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagejButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    this.imgjLabel4.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                    //this.userInfo.setPic(new ImageIcon(edited_image));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_imagejButton1ActionPerformed

    private void patientTypejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypejComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypejComboBox1ActionPerformed

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
    private javax.swing.JButton imagejButton1;
    private javax.swing.JLabel imgjLabel4;
    private javax.swing.JFormattedTextField jFormattedTextField1Age;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2lastName;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Age;
    private javax.swing.JLabel jLabel3firstName;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1Male;
    private javax.swing.JRadioButton jRadioButton2Other;
    private javax.swing.JRadioButton jRadioButton3Female;
    private javax.swing.JTextField jTextField1Phonenumber;
    private javax.swing.JTextField jTextField2Email;
    private javax.swing.JComboBox<String> patientTypejComboBox1;
    private javax.swing.JLabel phonenumberjLabel3;
    // End of variables declaration//GEN-END:variables
}
