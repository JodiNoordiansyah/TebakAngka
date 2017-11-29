/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber; 

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TebakAngkaWindow extends javax.swing.JFrame {

    /**
     * Creates new form TebakAngkaWindow
     */
    int angkaSoal;

    public TebakAngkaWindow() {
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

        jLabel1 = new javax.swing.JLabel();
        mulai = new javax.swing.JToggleButton();
        petunjukLabel = new javax.swing.JLabel();
        inputAngkaTextField = new javax.swing.JTextField();
        cekAngkaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("TEBAK ANGKA");

        mulai.setText("mulai");
        mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiActionPerformed(evt);
            }
        });

        petunjukLabel.setText("Klik Tombol Mulai");

        inputAngkaTextField.setEditable(false);
        inputAngkaTextField.setEnabled(false);
        inputAngkaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAngkaTextFieldActionPerformed(evt);
            }
        });

        cekAngkaButton.setText("Are You Sure?");
        cekAngkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekAngkaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekAngkaButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inputAngkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulai)
                            .addComponent(jLabel1)
                            .addComponent(petunjukLabel))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mulai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(petunjukLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputAngkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cekAngkaButton)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiActionPerformed
        // TODO add your handling code here:
        angkaSoal = generateAngka();
        petunjukLabel.setText("Masukan Angka antara 1 -100");
        inputAngkaTextField.setEditable(true);
        inputAngkaTextField.setEnabled(true);
        mulai.setEnabled(false);
    }//GEN-LAST:event_mulaiActionPerformed

    private void inputAngkaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAngkaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAngkaTextFieldActionPerformed

    private void cekAngkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekAngkaButtonActionPerformed
        // TODO add your handling code here:
        try{
        String tebakanString = inputAngkaTextField.getText();
        int tebakan = Integer.parseInt(tebakanString);
        if (tebakan == angkaSoal) {
            petunjukLabel.setText("Brilliant!");
            inputAngkaTextField.setEnabled(false);
            mulai.setEnabled(true);
        } else {

            String message;
            if (tebakan < angkaSoal) {
                message = "Angka anda lebih kecil.Coba lebih besar";
            } else {
                message = "Angka anda lebih besar. Coba lebih kecil";
            }

            petunjukLabel.setText(message);
        }
        }catch (Exception e){
            //petunjukLabel.setText("Masukkan ANGKA! ngerti angka enggak?");
            JOptionPane.showMessageDialog(rootPane, "Masukkan ANGKA! ngerti angka enggak?");
	//di sini ditangkap error
    }

    }//GEN-LAST:event_cekAngkaButtonActionPerformed

    private int generateAngka() {
        double random = Math.random() * 100;
        double ceilValue = Math.ceil(random);
        int generatedAngkaSoal = (int) ceilValue;
        return generatedAngkaSoal;

    }

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
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngkaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekAngkaButton;
    private javax.swing.JTextField inputAngkaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton mulai;
    private javax.swing.JLabel petunjukLabel;
    // End of variables declaration//GEN-END:variables
}
