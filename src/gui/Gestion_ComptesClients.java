/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author jemacom
 */
public class Gestion_ComptesClients extends javax.swing.JFrame {

    /**
     * Creates new form GestionComptesClients
     */
    public Gestion_ComptesClients() {
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

        bt_mon_comptes = new javax.swing.JButton();
        bt_visualiser_statistique = new javax.swing.JButton();
        bt_gestion_comptes_gerant = new javax.swing.JButton();
        bt_a_propos = new javax.swing.JButton();
        bt_supprimer_compte_client = new javax.swing.JButton();
        bt_valider_comptes_clients = new javax.swing.JButton();
        bt_visualise_clients = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_mon_comptes.setText("Mon compte :");
        bt_mon_comptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mon_comptesActionPerformed(evt);
            }
        });

        bt_visualiser_statistique.setText("Visualiser statistique");
        bt_visualiser_statistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visualiser_statistiqueActionPerformed(evt);
            }
        });

        bt_gestion_comptes_gerant.setText("Gestion comptes gérants");

        bt_a_propos.setText("A propos");
        bt_a_propos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a_proposActionPerformed(evt);
            }
        });

        bt_supprimer_compte_client.setText("Supprimer compte client");

        bt_valider_comptes_clients.setText("Valider compte client");
        bt_valider_comptes_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_valider_comptes_clientsActionPerformed(evt);
            }
        });

        bt_visualise_clients.setText("Visualiver les comptes clients");
        bt_visualise_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visualise_clientsActionPerformed(evt);
            }
        });

        jLabel1.setText("Gestion comptes clients");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_mon_comptes)
                            .addComponent(bt_gestion_comptes_gerant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_visualiser_statistique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_a_propos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_valider_comptes_clients)
                            .addComponent(bt_supprimer_compte_client)
                            .addComponent(bt_visualise_clients))
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mon_comptes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_supprimer_compte_client))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_gestion_comptes_gerant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_valider_comptes_clients))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_visualiser_statistique, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_visualise_clients))
                .addGap(18, 18, 18)
                .addComponent(bt_a_propos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_visualiser_statistiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visualiser_statistiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_visualiser_statistiqueActionPerformed

    private void bt_a_proposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a_proposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_a_proposActionPerformed

    private void bt_valider_comptes_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_valider_comptes_clientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_valider_comptes_clientsActionPerformed

    private void bt_mon_comptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mon_comptesActionPerformed
        CompteAdmin ca = new CompteAdmin();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mon_comptesActionPerformed

    private void bt_visualise_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visualise_clientsActionPerformed
        Admin_VisualiseClients avc = new Admin_VisualiseClients();
        avc.setVisible(true);
    }//GEN-LAST:event_bt_visualise_clientsActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_ComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_ComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_ComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_ComptesClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_ComptesClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_a_propos;
    private javax.swing.JButton bt_gestion_comptes_gerant;
    private javax.swing.JButton bt_mon_comptes;
    private javax.swing.JButton bt_supprimer_compte_client;
    private javax.swing.JButton bt_valider_comptes_clients;
    private javax.swing.JButton bt_visualise_clients;
    private javax.swing.JButton bt_visualiser_statistique;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}