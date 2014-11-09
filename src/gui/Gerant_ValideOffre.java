/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.classes.FavorisDAO;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

/**
 *
 * @author jemacom
 */
public class Gerant_ValideOffre extends javax.swing.JFrame {

    private final JPopupMenu popup;
    /**
     * Creates new form GerantVerifieOffre
     */
    public Gerant_ValideOffre() {
        initComponents();
        this.setLocationRelativeTo(null);
        popup = new JPopupMenu();
        
        JMenuItem ValiderItem =  new JMenuItem("Valider cette offre");
        popup.add(ValiderItem);
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                JTable table =(JTable) e.getSource();
                Point p = e.getPoint();
                int row = table.rowAtPoint(p);
                
                
                System.out.println(row);
                if (e.getButton() ==  MouseEvent.BUTTON3){
                    popup.show(table , e.getX() , e.getY());
                }
            }
            
        });
        
        ValiderItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int row =table.getSelectedRow(); 
               System.out.println("my id "+table.getModel().getValueAt(table.getSelectedRow(), 10));
                FavorisDAO.getInstance().deleteFavoris((int)table.getModel().getValueAt(table.getSelectedRow(), 10));
                table.setModel(new ListFavoris());
            }
        });
        
        
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
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        accueil = new javax.swing.JButton();
        by_mon_compte = new javax.swing.JButton();
        bt_mes_offres = new javax.swing.JButton();
        bt_recherche = new javax.swing.JButton();
        bt_a_propos = new javax.swing.JButton();
        bt_retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new ListOffreNonValide());
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Liste des offres non validés :");

        accueil.setText("Accueil ");
        accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accueilActionPerformed(evt);
            }
        });

        by_mon_compte.setText("Mon compte");
        by_mon_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                by_mon_compteActionPerformed(evt);
            }
        });

        bt_mes_offres.setText("Mes offres");
        bt_mes_offres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mes_offresActionPerformed(evt);
            }
        });

        bt_recherche.setText("Recherche avancée");

        bt_a_propos.setText("A propos");

        bt_retour.setText("Retour");
        bt_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(accueil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(by_mon_compte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bt_mes_offres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_recherche)
                    .addComponent(bt_a_propos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bt_retour))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(accueil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(by_mon_compte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_mes_offres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_recherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_a_propos)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accueilActionPerformed
        Acceuil_gerant ag = new Acceuil_gerant();
        ag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_accueilActionPerformed

    private void bt_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retourActionPerformed
        Acceuil_gerant ag = new Acceuil_gerant();
        ag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_retourActionPerformed

    private void by_mon_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_by_mon_compteActionPerformed
        CompteGerant cg = new CompteGerant();
        cg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_by_mon_compteActionPerformed

    private void bt_mes_offresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mes_offresActionPerformed
        
    }//GEN-LAST:event_bt_mes_offresActionPerformed

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
            java.util.logging.Logger.getLogger(Gerant_ValideOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerant_ValideOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerant_ValideOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerant_ValideOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerant_ValideOffre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accueil;
    private javax.swing.JButton bt_a_propos;
    private javax.swing.JButton bt_mes_offres;
    private javax.swing.JButton bt_recherche;
    private javax.swing.JButton bt_retour;
    private javax.swing.JButton by_mon_compte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}