/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;
import java.util.Arrays;

/**
 *
 * @author RISHAV
 */
public class disksimulator extends javax.swing.JFrame {

   
    public graphxy g;
    public disksimulator() {
        initComponents();
    }
    public static int heaP=0;
    public static int[] ioArray;
    public static int n=0;
    public static int v = 0;
    public disksimulator(int headP,int ioA[],int num,int value)
    {
        initComponents();
        heaP = headP;
        ioArray = new int[num];
        ioArray = ioA;
        n = num;
        v = value;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        head = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setFont(new java.awt.Font("aakar", 1, 10)); // NOI18N
        setResizable(false);

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jButton1.setText("Show Graph");
        jButton1.setActionCommand("showgraph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        output.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        head.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("OUTPUT ARRAY");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("THROUGHPUT VALUE");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setText("DISK SCHEDULING ALGORITHMS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 274, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              
                
                switch(v){
                    case 1:
                        Scan obj1 = new Scan(heaP, ioArray);
                        int r1[] = obj1.method();
                        int r12 = obj1.method3();
                        String S1="";
                        System.out.println(r12);
                        for(int i=0;i<r1.length;i++){
                            S1 = S1 +(r1[i]+" ");
                        }
                        output.setText(S1);
                        S1 = Integer.toString(r12);
                        head.setText(S1);
                        //Graph G = new Graph(r1,r1.length);
                        g = new graphxy(r1,r1.length,"SCAN");
			//G.test(r1,r1.length,"SCAN");
                        break;
                    case 2:
                        Cscan obj2 = new Cscan(heaP, ioArray);
                        int r2[] = obj2.method();
                        int r22 = obj2.method3();
                        String S2="";
                        System.out.println(r22);
                        for(int i=0;i<r2.length;i++){
                            S2 = S2 +(r2[i]+" ");
                        }
                        output.setText(S2);
                        S2 = Integer.toString(r22);
                        head.setText(S2);
                        //Graph G1 = new Graph(r2,r2.length);
                        g = new graphxy(r2,r2.length,"CSCAN");
			//G1.test(r2,r2.length,"CSCAN");
                        break;
                    case 3:
                        Clook obj3 = new Clook(heaP, ioArray);
                        int r3[] = obj3.method();
                        int r32 = obj3.method3();
                        String S3="";
                        System.out.println(r32);
                        for(int i=0;i<r3.length;i++){
                            S3 = S3 +(r3[i]+" ");
                        }
                        output.setText(S3);
                        S3 = Integer.toString(r32);
                        head.setText(S3);
                        //Graph G2 = new Graph(r3,r3.length);
                        g = new graphxy(r3,r3.length,"CSCAN");
			//G2.test(r3, r3.length,"CLOOK");
                        break;
                    case 4:
                        FCFS obj4 = new FCFS(heaP, ioArray);
                        int r4[] = obj4.method();
                        int r42 = obj4.method3();
                
                        System.out.println(r42);
                        String S4="";
                        for(int i=0;i<r4.length;i++){
                            S4 = S4+(r4[i]+" ");
                        }
                        output.setText(S4);
                        S4 = Integer.toString(r42);
                        head.setText(S4);
                        //Graph G3 = new Graph(r4,r4.length);
                        g = new graphxy(r4,r4.length,"CSCAN");
			//G3.test(r4,r4.length,"FCFS");
                        break;
                    case 5:
                        SSTF obj5 = new SSTF(heaP, ioArray);
                        int r5[] = obj5.method();
                        int r52 = obj5.method3();
                
                        System.out.println(r52);
                        String S5="";
                        for(int i=0;i<r5.length;i++){
                            S5=S5+(r5[i]+" ");
                        }
                        output.setText(S5);
                        S5 = Integer.toString(r52);
                        head.setText(S5);
                        //Graph G4 = new Graph(r5,r5.length);
                        g = new graphxy(r5,r5.length,"SSTF");
			//G4.test(r5,r5.length,"SSTF");
                        break;
                        
                }               
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed
    
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
            java.util.logging.Logger.getLogger(disksimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(disksimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(disksimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(disksimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new disksimulator().setVisible(true);
               
            }  
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField head;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField output;
    // End of variables declaration//GEN-END:variables
}
