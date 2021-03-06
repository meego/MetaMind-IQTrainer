/*
 * StartFrame.java
 *
 * Created on June 9, 2008, 12:29 PM
 */

package metamind;

/**
 *
 * @author  rain
 */
public class StartFrame extends javax.swing.JFrame {
    
    /** Creates new form StartFrame */
    public StartFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        label1 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jComboBox2 = new javax.swing.JComboBox();
        label4 = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        jComboBox3 = new javax.swing.JComboBox();
        label6 = new java.awt.Label();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        jComboBox4 = new javax.swing.JComboBox();
        label8 = new java.awt.Label();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        StatisticsBtn = new javax.swing.JButton();
        StartTrainingBtn = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox();
        label10 = new java.awt.Label();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        label11 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MetaMind v1.0b");
        setMinimumSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ExpandVision", "RotateMatrix", "SymbolMemory" }));
        jComboBox1.setName("ModuleSelector1"); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, -1));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("Complexity:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jTextField1.setText("12");
        jTextField1.setName("complexity1"); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 20, 20));

        jTextField2.setText("12");
        jTextField2.setName("rounds1"); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 20, 20));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("Training Module");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 20));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("Rounds:");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RotateMatrix", "ExpandVision", "SymbolMemory" }));
        jComboBox2.setName("ModuleSelector1"); // NOI18N
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, -1));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setText("Complexity:");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        jTextField3.setText("12");
        jTextField3.setName("complexity1"); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 20, 20));

        jTextField4.setText("12");
        jTextField4.setName("rounds1"); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 20, 20));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setText("Rounds:");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ExpandVision", "RotateMatrix", "SymbolMemory" }));
        jComboBox3.setName("ModuleSelector1"); // NOI18N
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setText("Complexity:");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jTextField5.setText("12");
        jTextField5.setName("complexity1"); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 20, 20));

        jTextField6.setText("12");
        jTextField6.setName("rounds1"); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 20, 20));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setText("Rounds:");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SymbolMemory", "ExpandVision", "RotateMatrix" }));
        jComboBox4.setName("ModuleSelector1"); // NOI18N
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, -1));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setText("Complexity:");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        jTextField7.setText("12");
        jTextField7.setName("complexity1"); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 20, 20));

        jTextField8.setText("12");
        jTextField8.setName("rounds1"); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 20, 20));

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setText("Rounds:");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 20));

        StatisticsBtn.setText("Statistics");
        StatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(StatisticsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        StartTrainingBtn.setText("Start Training");
        StartTrainingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTrainingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(StartTrainingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MathPattern", "SymbolMemory", "ExpandVision", "RotateMatrix" }));
        jComboBox5.setName("ModuleSelector1"); // NOI18N
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, -1));

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setText("Complexity:");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 20));

        jTextField9.setText("12");
        jTextField9.setName("complexity1"); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 20, 20));

        jTextField10.setText("12");
        jTextField10.setName("rounds1"); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 20, 20));

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setText("Rounds:");
        getContentPane().add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsBtnActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_StatisticsBtnActionPerformed

    private void StartTrainingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTrainingBtnActionPerformed
        // TODO add your handling code here:
        new TrainingManager();
}//GEN-LAST:event_StartTrainingBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartTrainingBtn;
    private javax.swing.JButton StatisticsBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
    
}
