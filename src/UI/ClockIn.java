/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Arrays;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;

/**
 *
 * @author renmi
 */
public class ClockIn extends javax.swing.JFrame {
        private List<String> clockIn = Arrays.asList("");
        private List<String> clockOut = Arrays.asList("");
        private Date now = new Date();
    /**
     * Creates new form ClockIn
     */
    public ClockIn() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlbStaffName = new javax.swing.JLabel();
        jcbStaffName = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaClock = new javax.swing.JTextArea();
        jbtClockIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtClockOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbStaffName.setText("Staff name: ");

        jcbStaffName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Please select]", "Billy", "Alex", "Edward", "Derik", "" }));
        jcbStaffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStaffNameActionPerformed(evt);
            }
        });

        jtaClock.setColumns(20);
        jtaClock.setRows(5);
        jScrollPane1.setViewportView(jtaClock);

        jbtClockIn.setText("CLOCK IN");
        jbtClockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClockInActionPerformed(evt);
            }
        });

        jLabel2.setText("STAFF CLOCK IN");

        jbtClockOut.setText("CLOCK OUT");
        jbtClockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClockOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel1))
                                    .addComponent(jcbStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jbtClockOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtClockIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jlbStaffName))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addComponent(jlbStaffName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtClockIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtClockOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbStaffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStaffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbStaffNameActionPerformed

    private void jbtClockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClockInActionPerformed
        clockIn.add(jcbStaffName.getSelectedItem().toString());
//        System.out.print(""+clockIn.get(0));
        jtaClock.setText(null);
        jtaClock.setText(""+jcbStaffName.getSelectedItem().toString()+"had clock in at "
        +now);
    }//GEN-LAST:event_jbtClockInActionPerformed

    private void jbtClockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClockOutActionPerformed
        String staffName = jcbStaffName.getSelectedItem().toString();
        if(clockIn.contains(""+staffName))
        clockIn.remove(staffName);
        clockOut.add(staffName);
        jtaClock.setText(null);
        jtaClock.setText(""+staffName+"had clock out at "
        +now);
        
    }//GEN-LAST:event_jbtClockOutActionPerformed

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
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtClockIn;
    private javax.swing.JButton jbtClockOut;
    private javax.swing.JComboBox<String> jcbStaffName;
    private javax.swing.JLabel jlbStaffName;
    private javax.swing.JTextArea jtaClock;
    // End of variables declaration//GEN-END:variables
}
