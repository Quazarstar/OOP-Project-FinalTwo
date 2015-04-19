package experiments.oop.project;

import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x14435708
 */
public class PhysPg extends javax.swing.JFrame {

    /**
     * Creates new form PhysPg
     */
    public PhysPg() {
        initComponents();
        hideButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Return = new javax.swing.JButton();
        Proceed = new javax.swing.JButton();
        ContL = new javax.swing.JButton();
        PhsLTitle = new javax.swing.JLabel();
        PhsLTopic = new javax.swing.JLabel();
        PPic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PLBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 415));
        getContentPane().setLayout(null);

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return);
        Return.setBounds(0, 0, 65, 23);

        Proceed.setText("click to do questions");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed);
        Proceed.setBounds(150, 330, 150, 23);

        ContL.setText("continue lesson");
        ContL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContLActionPerformed(evt);
            }
        });
        getContentPane().add(ContL);
        ContL.setBounds(150, 310, 150, 23);

        PhsLTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhsLTitle.setForeground(new java.awt.Color(255, 255, 255));
        PhsLTitle.setText("Physics");
        getContentPane().add(PhsLTitle);
        PhsLTitle.setBounds(190, 60, 90, 22);

        PhsLTopic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PhsLTopic.setForeground(new java.awt.Color(255, 255, 255));
        PhsLTopic.setText("Topic: Refraction");
        getContentPane().add(PhsLTopic);
        PhsLTopic.setBounds(170, 150, 130, 17);

        PPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/refraction.jpg"))); // NOI18N
        getContentPane().add(PPic);
        PPic.setBounds(40, 30, 380, 280);

        PLBox.setEditable(false);
        PLBox.setColumns(20);
        PLBox.setRows(5);
        jScrollPane1.setViewportView(PLBox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 55, 290, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void hideButton(){
Proceed.setVisible(false);
}
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        MainMenu myMain = new MainMenu();
      myMain.setVisible(true);
      dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        // TODO add your handling code here:
        PhysQs myPhysQs = new PhysQs();
        myPhysQs.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProceedActionPerformed
int Pclicked = 0;
    private void ContLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContLActionPerformed
        // TODO add your handling code here:
        String plessonTxt[] = new String[4];
        plessonTxt[1]="Physics "
                + "\n "
                + "\nTopic:Refraction"
                + "\n "
                + "\nRefracion is the change of direction of a"
                + "\nbeam of light when it enters from one medium"
                + "\nfrom another."
                + "\n"
                + "\nWhen light hits a thicker(slower) medium"
                + "\nthe bottom part of the ray slows down"
                + "\nand the ray bends";
        plessonTxt[2]="Physics "
                + "\n "
                + "\nTopic:Refraction part 2"
                + "\n"
                   + "\nIn our lives a common example of refraction is"
                   + "\nwhen we look at the distorted image in the"
                   + "\nwater. If you dip a pencil in water you will"
                   + "\nsee it bend. That is because the light "
                   + "\nreflecting off the pencil is bending when it "
                   + "\nleaves the water";
        plessonTxt[3]="Physics "
                + "\n "
                + "\nTopic:Refraction part 3"
                + "\n"
                   + "\nIn the first image you've seen the glass prism"
                   + "\nand what it shows is the fact White light is "
                   + "\nmade up of a full spectrum of colors. Each "
                   + "\ncolor has a different wavelength, and bends "
                   + "\nat a different angle. This is the same effect"
                   + "\n that produces rainbows in the atmosphere";
        
          Pclicked++;   
       int Pcount = 0;
       while(Pcount <= Pclicked){
       
           if(Pclicked==1){
       PPic.setVisible(false);
       PhsLTitle.setVisible(false);
       PhsLTopic.setVisible(false);
        PLBox.setText(plessonTxt[1]);
       }
           else if(Pclicked==2){
           PLBox.setText(plessonTxt[2]);
       }
           else if(Pclicked==3){
               Proceed.setVisible(true);
               
               ContL.setVisible(false);
             
           PLBox.setText(plessonTxt[3]);
           }  
           Pcount++;
       }
      
  
        
        
        
    }//GEN-LAST:event_ContLActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhysPg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysPg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContL;
    private javax.swing.JTextArea PLBox;
    private javax.swing.JLabel PPic;
    private javax.swing.JLabel PhsLTitle;
    private javax.swing.JLabel PhsLTopic;
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Return;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}