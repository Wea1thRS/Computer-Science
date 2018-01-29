/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Ethan
 */
public class TipCalculator extends javax.swing.JFrame {
    public double initialBill, finalBill;
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
    /**
     * Creates new form TipCalculator
     */
    public TipCalculator() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        totalBillLabel = new javax.swing.JLabel();
        billTextField = new javax.swing.JTextField();
        tenPercentTipButton = new javax.swing.JButton();
        fifteenPercentTipButton = new javax.swing.JButton();
        twentyPercentTipButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tipDisplayLabel = new javax.swing.JLabel();
        tipAmountLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tip Calculator");

        totalBillLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalBillLabel.setText("Total Bill:");

        billTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTextFieldActionPerformed(evt);
            }
        });

        tenPercentTipButton.setText("10%");
        tenPercentTipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenPercentTipButtonActionPerformed(evt);
            }
        });

        fifteenPercentTipButton.setText("15%");
        fifteenPercentTipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenPercentTipButtonActionPerformed(evt);
            }
        });

        twentyPercentTipButton.setText("20%");
        twentyPercentTipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyPercentTipButtonActionPerformed(evt);
            }
        });

        tipDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tipDisplayLabel.setText("Recommended Tip:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(totalBillLabel)
                        .addGap(18, 18, 18)
                        .addComponent(billTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tenPercentTipButton)
                                .addGap(129, 129, 129)
                                .addComponent(fifteenPercentTipButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(twentyPercentTipButton)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tipDisplayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBillLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenPercentTipButton)
                    .addComponent(twentyPercentTipButton)
                    .addComponent(fifteenPercentTipButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tipDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTextFieldActionPerformed
        // TODO add your handling code here:
        initialBill = Double.parseDouble(this.billTextField.getText());
    }//GEN-LAST:event_billTextFieldActionPerformed

    private void tenPercentTipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenPercentTipButtonActionPerformed
        // TODO add your handling code here:
        finalBill = Double.parseDouble(this.billTextField.getText())*0.1;
        this.tipAmountLabel.setText(format.format(finalBill));
    }//GEN-LAST:event_tenPercentTipButtonActionPerformed

    private void fifteenPercentTipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifteenPercentTipButtonActionPerformed
        // TODO add your handling code here:
        finalBill = Double.parseDouble(this.billTextField.getText())*0.15;
        this.tipAmountLabel.setText(format.format(finalBill));
    }//GEN-LAST:event_fifteenPercentTipButtonActionPerformed

    private void twentyPercentTipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyPercentTipButtonActionPerformed
        // TODO add your handling code here:
        finalBill = Double.parseDouble(this.billTextField.getText())*0.2;
        this.tipAmountLabel.setText(format.format(finalBill));
    }//GEN-LAST:event_twentyPercentTipButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billTextField;
    private javax.swing.JButton fifteenPercentTipButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton tenPercentTipButton;
    private javax.swing.JLabel tipAmountLabel;
    private javax.swing.JLabel tipDisplayLabel;
    private javax.swing.JLabel totalBillLabel;
    private javax.swing.JButton twentyPercentTipButton;
    // End of variables declaration//GEN-END:variables
}
