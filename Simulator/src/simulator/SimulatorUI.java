/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import javax.swing.UIManager;
import cpu.Simulation;
import cpu.Face;
import cpu.CPU;

/**
 *
 * @author RISHAV
 */
public class SimulatorUI extends javax.swing.JFrame {

    /**
     * Creates new form SimulatorUI
     */
    public SimulatorUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        testing = new javax.swing.JButton();
        HeadSim = new javax.swing.JLabel();
        diskCombo = new javax.swing.JComboBox<>();
        pageCombo = new javax.swing.JComboBox<>();
        cpuRB = new javax.swing.JRadioButton();
        pageRB = new javax.swing.JRadioButton();
        diskRB = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        testing.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        testing.setForeground(new java.awt.Color(51, 51, 255));
        testing.setText("Run Testing");
        testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testingActionPerformed(evt);
            }
        });

        HeadSim.setBackground(new java.awt.Color(0, 0, 0));
        HeadSim.setFont(new java.awt.Font("Abyssinica SIL", 0, 60)); // NOI18N
        HeadSim.setForeground(new java.awt.Color(0, 0, 255));
        HeadSim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeadSim.setText("Algorithm Simulator");

        diskCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        diskCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Scan", "CScan", "CLook", "FCFS", "SSTF" }));
        diskCombo.setEnabled(false);
        diskCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskComboActionPerformed(evt);
            }
        });

        pageCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "FIFO", "LRU", "OPT", "SCP" }));
        pageCombo.setEnabled(false);

        buttonGroup1.add(cpuRB);
        cpuRB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        cpuRB.setText("<html>\n&emsp;&emsp;&nbsp;CPU <br> &nbsp;Scheduling");
        cpuRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cpuRBItemStateChanged(evt);
            }
        });
        cpuRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(pageRB);
        pageRB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pageRB.setText("<html>\n&emsp;&emsp;Page<br> &nbsp;Replacement");
        pageRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pageRBItemStateChanged(evt);
            }
        });
        pageRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(diskRB);
        diskRB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        diskRB.setText("<html>     \n &emsp;&emsp;Disk <br> &nbsp;Scheduling");
        diskRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diskRBItemStateChanged(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 51, 51));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 102, 153));
        clear.setText("CLEAR");
        clear.setPreferredSize(new java.awt.Dimension(121, 51));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pageRB, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(testing, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpuRB, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diskRB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(pageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diskCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeadSim, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(HeadSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diskRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpuRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pageRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diskCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testing, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testingActionPerformed
        if(cpuRB.isSelected()==true)
        {
           
            //CPUScheduler spr = new CPUScheduler(ind);
            //spr.setVisible(true);
            String[] args={"kghih"};
            CPU.main(args);
            //Face sre = new Face();
            //sre.setVisible(true);
            setVisible(false);
        }
        else if(pageRB.isSelected()==true)
        {
            int ind = pageCombo.getSelectedIndex();
            PageScheduler pg = new PageScheduler(ind);
            pg.setVisible(true);
            setVisible(false);
        }
        else if(diskRB.isSelected()==true)
        {
            int ind = diskCombo.getSelectedIndex();
            DiskScheduler ds = new DiskScheduler(ind);
            ds.setVisible(true);
            setVisible(false);
        }
        // TODO add your handling code here:
        
    }//GEN-LAST:event_testingActionPerformed

    private void diskComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diskComboActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void cpuRBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cpuRBItemStateChanged
        cpuRB.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if(cpuRB.isSelected()==true)
            {
                pageCombo.setEnabled(false);
                diskCombo.setEnabled(false);
            }
                    
            
    }
       /* public void itemStateChanged(java.awt.event.ItemEvent e) {
    if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           cpuCombo.setEnabled(true);
    }
    else if (e.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
           cpuCombo.setEnabled(false);
    }
}*/
});

        // TODO add your handling code here:
    }//GEN-LAST:event_cpuRBItemStateChanged

    private void pageRBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pageRBItemStateChanged
pageRB.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if(pageRB.isSelected()==true)
            {
                pageCombo.setEnabled(true);
                diskCombo.setEnabled(false);
            }
                    
            
    }
       /* public void itemStateChanged(java.awt.event.ItemEvent e) {
    if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           cpuCombo.setEnabled(true);
    }
    else if (e.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
           cpuCombo.setEnabled(false);
    }
}*/
});
        // TODO add your handling code here:
    }//GEN-LAST:event_pageRBItemStateChanged

    private void diskRBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diskRBItemStateChanged
diskRB.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if(diskRB.isSelected()==true)
            {
                diskCombo.setEnabled(true);
                pageCombo.setEnabled(false);
            }  
    }
});
        // TODO add your handling code here:
    }//GEN-LAST:event_diskRBItemStateChanged

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        pageCombo.setEnabled(false);
        diskCombo.setEnabled(false);
        buttonGroup1.clearSelection();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void pageRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageRBActionPerformed

    private void cpuRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpuRBActionPerformed

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
            java.util.logging.Logger.getLogger(SimulatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadSim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton cpuRB;
    private javax.swing.JComboBox<String> diskCombo;
    private javax.swing.JRadioButton diskRB;
    private javax.swing.JButton exit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JComboBox<String> pageCombo;
    private javax.swing.JRadioButton pageRB;
    private javax.swing.JButton testing;
    // End of variables declaration//GEN-END:variables
}
