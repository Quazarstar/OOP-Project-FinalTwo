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
public class Hl3steps extends javax.swing.JFrame {

    /**
     * Creates new form Hl3steps
     */
    public Hl3steps() {
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
        backEx3step = new javax.swing.JButton();
        hl3ScrollSteps = new javax.swing.JScrollPane();
        stepsarea3 = new javax.swing.JTextArea();
        Hl3steps = new javax.swing.JLabel();
        homeButtonHL = new javax.swing.JButton();
        Physicstepshead = new javax.swing.JLabel();
        backgroundsteps3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        hlImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/art4098_1.jpg"))); // NOI18N
        getContentPane().add(hlImage);
        hlImage.setBounds(130, 30, 180, 100);

        backEx3step.setText("Back");
        backEx3step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEx3stepActionPerformed(evt);
            }
        });
        getContentPane().add(backEx3step);
        backEx3step.setBounds(0, 0, 80, 23);

        stepsarea3.setColumns(20);
        stepsarea3.setLineWrap(true);
        stepsarea3.setRows(5);
        stepsarea3.setText("1.Set up the circuit as shown.\n2.\n Note the current (I) and potential difference (V).3.Adjust the variable resistor (rheostat) to get a new set of values.4.Repeat about 6 times and then plot a graph of potentialdifference against current.5.Record the results in a table and then draw a graph of  potential difference against current.\nResult\nThe fact that we get a straight line through the origin shows that\nthe potential difference is\ndirectly proportional \nto the current\n(this means that if we double the potential difference, the currentwill double also)");
        hl3ScrollSteps.setViewportView(stepsarea3);

        getContentPane().add(hl3ScrollSteps);
        hl3ScrollSteps.setBounds(0, 160, 440, 220);

        Hl3steps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hl3steps.setText("Outline of steps required to conduct experiment. ");
        getContentPane().add(Hl3steps);
        Hl3steps.setBounds(40, 130, 360, 20);

        homeButtonHL.setText("Home");
        homeButtonHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonHLActionPerformed(evt);
            }
        });
        getContentPane().add(homeButtonHL);
        homeButtonHL.setBounds(0, 20, 80, 23);

        Physicstepshead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Physicstepshead.setText("Physics experiment steps.");
        getContentPane().add(Physicstepshead);
        Physicstepshead.setBounds(130, 0, 320, 30);

        backgroundsteps3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/6805727-plain-backgrounds.jpg"))); // NOI18N
        backgroundsteps3.setText("jLabel1");
        getContentPane().add(backgroundsteps3);
        backgroundsteps3.setBounds(0, 0, 440, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backEx3stepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEx3stepActionPerformed
        Hl3 myHl3 = new Hl3();
        myHl3.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backEx3stepActionPerformed

    private void homeButtonHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonHLActionPerformed
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonHLActionPerformed

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
            java.util.logging.Logger.getLogger(Hl3steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hl3steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hl3steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hl3steps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hl3steps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hl3steps;
    private javax.swing.JLabel Physicstepshead;
    private javax.swing.JButton backEx3step;
    private javax.swing.JLabel backgroundsteps3;
    private javax.swing.JScrollPane hl3ScrollSteps;
    private javax.swing.JLabel hlImage;
    private javax.swing.JButton homeButtonHL;
    private javax.swing.JTextArea stepsarea3;
    // End of variables declaration//GEN-END:variables
}