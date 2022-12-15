/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Community;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import model.Systemm;

/**
 *
 * @author Raushan
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    Community community;
    HospitalDirectory hospitalDirectory;
    public LoginFrame() {
        initComponents();
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        doctorDirectory = new DoctorDirectory();
        community = new Community();
        hospitalDirectory = new HospitalDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        buttonSystem = new javax.swing.JRadioButton();
        buttonPatient = new javax.swing.JRadioButton();
        buttonDOctor = new javax.swing.JRadioButton();
        buttonHospital = new javax.swing.JRadioButton();
        buttonCommunity = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Password:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonSystem.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        buttonSystem.setForeground(new java.awt.Color(255, 51, 51));
        buttonSystem.setText("System");

        buttonPatient.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        buttonPatient.setForeground(new java.awt.Color(255, 51, 51));
        buttonPatient.setText("Patient");
        buttonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPatientActionPerformed(evt);
            }
        });

        buttonDOctor.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        buttonDOctor.setForeground(new java.awt.Color(255, 51, 51));
        buttonDOctor.setText("Doctor");

        buttonHospital.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        buttonHospital.setForeground(new java.awt.Color(255, 51, 51));
        buttonHospital.setText("Hospital");

        buttonCommunity.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        buttonCommunity.setForeground(new java.awt.Color(255, 51, 51));
        buttonCommunity.setText("Community");
        buttonCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCommunityActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hospital Management System");
        jLabel3.setPreferredSize(new java.awt.Dimension(440, 186));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(buttonSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(buttonPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDOctor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(428, 428, 428))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDOctor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        if(buttonSystem.isSelected() && !buttonPatient.isSelected() && !buttonDOctor.isSelected() && !buttonHospital.isSelected() && !buttonCommunity.isSelected()){
            if( txtUserName.getText().matches("sysadmin") && txtPassword.getText().matches("sysadmin")){
                SystemPanel patient = new SystemPanel(personDirectory,patientDirectory,doctorDirectory,community,hospitalDirectory);
                patient.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }        
        }
        else if(!buttonSystem.isSelected() && buttonPatient.isSelected() && !buttonDOctor.isSelected() && !buttonHospital.isSelected() && !buttonCommunity.isSelected()){
            if( txtUserName.getText().matches("patient") && txtPassword.getText().matches("patient")){
                PatientFrame patient = new PatientFrame(personDirectory,patientDirectory,doctorDirectory,community,hospitalDirectory);
                patient.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }        
        }
        else if(!buttonSystem.isSelected() && !buttonPatient.isSelected() && buttonDOctor.isSelected() && !buttonHospital.isSelected() && !buttonCommunity.isSelected()){
            if( txtUserName.getText().matches("doctor") && txtPassword.getText().matches("doctor")){
                DoctorFrame patient = new DoctorFrame(personDirectory,patientDirectory,doctorDirectory,community,hospitalDirectory);
                patient.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }        
        }
        else if(!buttonSystem.isSelected() && !buttonPatient.isSelected() && !buttonDOctor.isSelected() && buttonHospital.isSelected() && !buttonCommunity.isSelected()){
            if( txtUserName.getText().matches("hosadmin") && txtPassword.getText().matches("hosadmin")){
                HospitalFrame patient = new HospitalFrame(personDirectory,patientDirectory,doctorDirectory,community,hospitalDirectory);
                patient.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }        
        }
        else if(!buttonSystem.isSelected() && !buttonPatient.isSelected() && !buttonDOctor.isSelected() && !buttonHospital.isSelected() && buttonCommunity.isSelected()){
            if( txtUserName.getText().matches("commadmin") && txtPassword.getText().matches("commadmin")){
                CommFrame patient = new CommFrame(personDirectory,patientDirectory,doctorDirectory,community,hospitalDirectory);
                patient.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }        
        }
        
        else{
                JOptionPane.showMessageDialog(this, "Please select one Role ");
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCommunityActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void buttonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPatientActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonCommunity;
    private javax.swing.JRadioButton buttonDOctor;
    private javax.swing.JRadioButton buttonHospital;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JRadioButton buttonPatient;
    private javax.swing.JRadioButton buttonSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
