/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments.oop.project;

/**
 *
 * @author Alex
 */
public class Hl3 extends javax.swing.JFrame {

    /**
     * Creates new form Hl3
     */
    public Hl3() {
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

        hlImage = new javax.swing.JLabel();
        hl3Imagebutton = new javax.swing.JButton();
        Hl3desc = new javax.swing.JLabel();
        hl3steps = new javax.swing.JButton();
        hl3Scrollpane = new javax.swing.JScrollPane();
        hl3text = new javax.swing.JTextArea();
        homeButtonHL = new javax.swing.JButton();
        Physicshead = new javax.swing.JLabel();
        backgroundEx3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        hlImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/art4098_1.jpg"))); // NOI18N
        getContentPane().add(hlImage);
        hlImage.setBounds(130, 30, 180, 100);

        hl3Imagebutton.setText("Click to see image of experiement.");
        hl3Imagebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hl3ImagebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(hl3Imagebutton);
        hl3Imagebutton.setBounds(110, 350, 230, 23);

        Hl3desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hl3desc.setText("Description of experiment. Click here to go to steps:");
        getContentPane().add(Hl3desc);
        Hl3desc.setBounds(10, 134, 360, 20);

        hl3steps.setText("Steps");
        hl3steps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hl3stepsActionPerformed(evt);
            }
        });
        getContentPane().add(hl3steps);
        hl3steps.setBounds(370, 130, 60, 23);

        hl3Scrollpane.setToolTipText("");

        hl3text.setColumns(20);
        hl3text.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        hl3text.setLineWrap(true);
        hl3text.setRows(5);
        hl3text.setText("Experiment to set up a simple electric circuit; use appropriate instruments to measure current, potential difference(voltage) and resistance, and establish the relationship between them.\n\nEquipment required:\n1.Low voltage power supply\n2.Rheostat\n3.Voltmeter\n4.Milliammeter\n5.330 Ω resistor \n6.Silicon diode\n");
        hl3Scrollpane.setViewportView(hl3text);

        getContentPane().add(hl3Scrollpane);
        hl3Scrollpane.setBounds(10, 160, 420, 210);

        homeButtonHL.setText("Home");
        homeButtonHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonHLActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonHL);
        homeButtonHL.setBounds(0, 0, 80, 23);

        Physicshead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Physicshead.setText("Physics Experiment");
        getContentPane().add(Physicshead);
        Physicshead.setBounds(160, 0, 320, 30);

        backgroundEx3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        backgroundEx3.setText("jLabel1");
        getContentPane().add(backgroundEx3);
        backgroundEx3.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hl3stepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hl3stepsActionPerformed
        Hl3steps myHl3steps = new Hl3steps();
        myHl3steps.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_hl3stepsActionPerformed

    private void homeButtonHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonHLActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonHLActionPerformed

    private void hl3ImagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hl3ImagebuttonActionPerformed
        Hl3image myCircuit = new Hl3image();
        myCircuit.setVisible(true);
        dispose();
    }//GEN-LAST:event_hl3ImagebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Hl3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hl3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hl3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hl3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hl3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hl3desc;
    private javax.swing.JLabel Physicshead;
    private javax.swing.JLabel backgroundEx3;
    private javax.swing.JButton hl3Imagebutton;
    private javax.swing.JScrollPane hl3Scrollpane;
    private javax.swing.JButton hl3steps;
    private javax.swing.JTextArea hl3text;
    private javax.swing.JLabel hlImage;
    private javax.swing.JButton homeButtonHL;
    // End of variables declaration//GEN-END:variables
}