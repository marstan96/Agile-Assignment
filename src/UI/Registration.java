package UI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import da.affiliatesDA;
import domain.Affiliates;
import Control.MaintainAffiliates;
import da.MenuDA;
import domain.Menu;
import Control.MaintainMenu;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
        String id = affiliatesDetails.readID().getAffiliatesID(); // Get the last menuID from database
        int number = Integer.parseInt(id.substring(1, 5)); // Get the behind four digit
        number += 1; // id + 1, Example: 1001 + 1 = 1002
        String word = id.substring(0, 1); // Get the first letter 'M'
        String ID = String.valueOf(word + number); // Get the first letter 'M' + the behind four digit
        jtfAffiliatesID.setText(ID);
    }
    

    private MaintainAffiliates affiliatesDetails = new MaintainAffiliates();
    private MaintainMenu menuDetails = new MaintainMenu();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfICNumber = new javax.swing.JTextField();
        jtfPhoneNumber = new javax.swing.JTextField();
        jtfAge = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtfAffiliatesID = new javax.swing.JTextField();
        ddlGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registration Fastest Deliveryman");

        jLabel2.setText("Name :");

        jLabel3.setText("Age : ");

        jLabel4.setText("Phone number : ");

        jLabel5.setText("Ic number : ");

        jLabel6.setText("Gender : ");

        jtfName.setColumns(10);

        jtfICNumber.setColumns(10);

        jtfPhoneNumber.setColumns(10);

        jtfAge.setColumns(10);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel7.setText("Affiliates ID : ");

        jtfAffiliatesID.setEditable(false);
        jtfAffiliatesID.setColumns(10);

        ddlGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        ddlGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfICNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(submit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAffiliatesID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfAffiliatesID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfICNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(submit)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        String ID,name, icNumber, phoneNumber ,gender;
        int age, num;
        ID = jtfAffiliatesID.getText();
        name = jtfName.getText();
        icNumber = jtfICNumber.getText();
        phoneNumber = jtfPhoneNumber.getText();
        age = Integer.parseInt(jtfAge.getText());
        num = ddlGender.getSelectedIndex();
        if(num == 0)
        {
            gender = "Male";
        }
        else
        {
            gender = "Female";
        }
        
        
        Affiliates details = new Affiliates(ID, name, icNumber, phoneNumber, age, gender);
        affiliatesDetails.addCustomerDetails(details);
        
        JOptionPane.showMessageDialog(null, "Successful Created", "Thank You", JOptionPane.INFORMATION_MESSAGE);
                            clear();

    }//GEN-LAST:event_submitActionPerformed

    public void clear() {
        String id = affiliatesDetails.readID().getAffiliatesID(); // Get the last menuID from database
        int number = Integer.parseInt(id.substring(1, 5)); // Get the behind four digit
        number += 1; // id + 1, Example: 1001 + 1 = 1002
        String word = id.substring(0, 1); // Get the first letter 'M'
        String ID = String.valueOf(word + number); // Get the first letter 'M' + the behind four digit
        jtfAffiliatesID.setText(ID);
        jtfName.setText("");
        jtfICNumber.setText("");
        ddlGender.setSelectedIndex(0);
        jtfPhoneNumber.setText("");
        jtfAge.setText("");

    }
    
    private void ddlGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlGenderActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ddlGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtfAffiliatesID;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfICNumber;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhoneNumber;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
