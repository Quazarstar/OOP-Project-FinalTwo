package experiments.oop.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x14435708
 */
public class ChemPg extends javax.swing.JFrame {

    /**
     * Creates new form ChemPg
     */
    public ChemPg() {
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
        CTitle = new javax.swing.JLabel();
        CTopic = new javax.swing.JLabel();
        CPic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CHField = new javax.swing.JTextArea();
        CCont = new javax.swing.JButton();
        CQuestions = new javax.swing.JButton();

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
        Return.setBounds(0, 0, 67, 23);

        Proceed.setText("click to do question");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        getContentPane().add(Proceed);
        Proceed.setBounds(149, 746, 150, 23);

        CTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CTitle.setText("Chemistry ");
        getContentPane().add(CTitle);
        CTitle.setBounds(190, 130, 130, 22);

        CTopic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CTopic.setText("acids and bases");
        getContentPane().add(CTopic);
        CTopic.setBounds(180, 190, 140, 17);

        CPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/experiments/oop/project/litmuspaper.jpg"))); // NOI18N
        getContentPane().add(CPic);
        CPic.setBounds(40, 30, 390, 270);

        CHField.setColumns(20);
        CHField.setRows(5);
        jScrollPane1.setViewportView(CHField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 90, 290, 200);

        CCont.setText("continue lesson");
        CCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CContActionPerformed(evt);
            }
        });
        getContentPane().add(CCont);
        CCont.setBounds(170, 300, 150, 23);

        CQuestions.setText("click to do questions");
        CQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CQuestionsActionPerformed(evt);
            }
        });
        getContentPane().add(CQuestions);
        CQuestions.setBounds(170, 320, 150, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void hideButton(){
CQuestions.setVisible(false);
}
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        MainMenu myMain = new MainMenu();
      myMain.setVisible(true);
      dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        // TODO add your handling code here:
        ChemQs myChemQs = new ChemQs();
        myChemQs.setVisible(true);
        dispose();
                
    }//GEN-LAST:event_ProceedActionPerformed

    private void CQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CQuestionsActionPerformed
        // TODO add your handling code here:
        ChemQs myChemQs = new ChemQs();
        myChemQs.setVisible(true);
        dispose();
    }//GEN-LAST:event_CQuestionsActionPerformed
int CClicked = 0;
    private void CContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CContActionPerformed
        // TODO add your handling code here:
        String clessonTxt[] = new String[4];
        clessonTxt[1]="Chemistry\n"
               + "\n"
               + "\nTopic: Acids and bases"
               + "\n"
               + "\nacids produce H+ ions in aqueous solutions"
               + "\nbases produce OH- ions in aqueous solutions"
               + "\nProperties of acids are: "
                   + "\nTastes sour"
                   + "\nacids change litmus from blue to red";
        clessonTxt[2]="Chemistry\n"
               + "\n"
               + "\nTopic: Acids and bases part 2"
               + "\n"
               + "\nProterties of acids(cont):"
               + "\nreact with bases to form salts and water"
               + "\nacids are proton donors"
               + "\nAn example of acids would be from cirix "
               + "\nfruits soft drinks";
        clessonTxt[3]="Chemistry\n"
               + "\n"
               + "\nTopic: Acids and bases part 3"
               + "\n"
               + "\nProperties of Bases are:"
               + "\nthey taste bitter"
               + "\nfeel slippery or soapy"
               + "\nbases don't change the color of litmus; "
               + "\nthey can turn red (acidified) litmus back to blue"
               + "\n";
        
        CClicked++;
       int CCount = 0;
       while(CCount <= CClicked){
       if(CClicked==1){
           CTitle.setVisible(false);
           CTopic.setVisible(false);
           CPic.setVisible(false);
           CHField.setText(clessonTxt[1]);
       }
       else if(CClicked==2){
       CHField.setText( clessonTxt[2]);
       }
       else if(CClicked==3){
           CCont.setVisible(false);
            CQuestions.setVisible(true);
       CHField.setText(clessonTxt[3]);
       }
       
       CCount++;
       }
      
    }//GEN-LAST:event_CContActionPerformed

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
            java.util.logging.Logger.getLogger(ChemPg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChemPg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChemPg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemPg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChemPg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CCont;
    private javax.swing.JTextArea CHField;
    private javax.swing.JLabel CPic;
    private javax.swing.JButton CQuestions;
    private javax.swing.JLabel CTitle;
    private javax.swing.JLabel CTopic;
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Return;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
