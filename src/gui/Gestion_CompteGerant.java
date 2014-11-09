package gui;
import DAO.classes.GerantDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Gerant;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import technique.DataSource;
import technique.TableGerant;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENT
 */
public class Gestion_CompteGerant extends javax.swing.JFrame {

    /**
     * Creates new form gestcompclient_adm
     */
    public Gestion_CompteGerant() {
        initComponents();
    }

    
    
      public void update(){

          jTable1.setModel(new TableGerant());
           
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTF_prenom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTF_password = new javax.swing.JTextField();
        jTF_nom = new javax.swing.JTextField();
        jTF_telephone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jTF_postal = new javax.swing.JTextField();
        jTF_login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jtf_id = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jB_modifier = new javax.swing.JButton();
        jB_ajouter = new javax.swing.JButton();
        jB_suuprimer = new javax.swing.JButton();
        jB_clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Gestion compte Gerant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gestion de compte Client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mon compte ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Visualiser statistique ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jTable1.setModel(new TableGerant());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 480, 130);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Nom");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 40, 70, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Prénom");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 70, 49, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("EmailL");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 130, 50, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Login");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 190, 34, 14);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Password");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 220, 70, 14);
        jPanel4.add(jTF_prenom);
        jTF_prenom.setBounds(110, 70, 100, 27);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Téléphone");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 100, 70, 14);
        jPanel4.add(jTF_password);
        jTF_password.setBounds(110, 220, 100, 27);
        jPanel4.add(jTF_nom);
        jTF_nom.setBounds(110, 40, 100, 27);
        jPanel4.add(jTF_telephone);
        jTF_telephone.setBounds(110, 100, 100, 27);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Adresse Postal");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, 160, 90, 14);
        jPanel4.add(jTF_email);
        jTF_email.setBounds(110, 130, 100, 27);
        jPanel4.add(jTF_postal);
        jTF_postal.setBounds(110, 160, 100, 27);
        jPanel4.add(jTF_login);
        jTF_login.setBounds(110, 190, 100, 27);

        jLabel3.setText("Id");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 10, 34, 17);
        jPanel4.add(Jtf_id);
        Jtf_id.setBounds(110, 10, 100, 27);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jB_modifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_modifier.setText("Modifier");
        jB_modifier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modifierActionPerformed(evt);
            }
        });
        jPanel7.add(jB_modifier);
        jB_modifier.setBounds(20, 60, 90, 20);

        jB_ajouter.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_ajouter.setText("Ajouter");
        jB_ajouter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ajouterActionPerformed(evt);
            }
        });
        jPanel7.add(jB_ajouter);
        jB_ajouter.setBounds(20, 30, 90, 20);

        jB_suuprimer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_suuprimer.setText("Supprimer");
        jB_suuprimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_suuprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_suuprimerActionPerformed(evt);
            }
        });
        jPanel7.add(jB_suuprimer);
        jB_suuprimer.setBounds(20, 90, 90, 20);

        jB_clear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jB_clear.setText("vider");
        jB_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearActionPerformed(evt);
            }
        });
        jPanel7.add(jB_clear);
        jB_clear.setBounds(20, 120, 90, 20);

        jLabel7.setText("Commande");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Gérant information");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Gestion_CompteGerant admin=new  Gestion_CompteGerant();
          admin.setVisible(true);
        this.setVisible(false);
        pack();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         // compteAdmin_principale admin=new compteAdmin_principale();
//          admin.setVisible(true);
//        this.setVisible(false);
//        pack();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Chart chart=new Chart();
        chart.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jB_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_modifierActionPerformed
        // TODO add your handling code here:
        try {
            String value1=Jtf_id.getText();
            String value2=jTF_nom.getText();
            String value3=jTF_prenom.getText();
            String value4=jTF_telephone.getText();
            String value5=jTF_email.getText();
            String value6=jTF_postal.getText();
            String value7=jTF_login.getText();
            String value8=jTF_password.getText();

            String requete="UPDATE  `data`.`gerant` SET  `prenom` =  '"+value3+"',\n" +
            "`nom` =  '"+value2+"',\n" +
            "`email` =  '"+value5+"',\n" +
            "`telephone` =  '"+value4+"',\n" +
            "`adresse` =  '"+value6+"',\n" +
            "`login` =  '"+value7+"',\n" +
            "`pass` =  '"+value8+"' WHERE  `gerant`.`Id` ='"+value1+"';";
            PreparedStatement ps =  DataSource.getInstance().prepareStatement(requete);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Vous avez modifier un gerant!!");

        } catch (SQLException e) {
        }
        update();
    }//GEN-LAST:event_jB_modifierActionPerformed

    private void jB_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ajouterActionPerformed
        // TODO add your handling code here:

       Gerant gerant = new   Gerant(WIDTH,jTF_nom.getText() , jTF_email.getText(), jTF_prenom.getText(), Integer.parseInt(jTF_telephone.getText()), jTF_postal.getText(), jTF_login.getText(), jTF_password.getText());
      GerantDAO gerantDAO=new GerantDAO();
        gerantDAO.ajoutGerant(gerant);
        JOptionPane.showMessageDialog(this, "Vous avez ajouté un gerant!!");
        update();

        //JTab_admin.jB_ajouter(new Object[]{});
    }//GEN-LAST:event_jB_ajouterActionPerformed

    private void jB_suuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_suuprimerActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "vous voulez le supprimer ","delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String value1=Jtf_id.getText();

                String requete="DELETE FROM `gerant` WHERE  `gerant`.`Id` ='"+value1+"';";
                PreparedStatement ps =  DataSource.getInstance().prepareStatement(requete);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vous avez supprimer gerant!!");
            } catch (SQLException ex) {
                //Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        update();
    }//GEN-LAST:event_jB_suuprimerActionPerformed

    private void jB_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearActionPerformed
        // TODO add your handling code here:
        Jtf_id.setText("");
        jTF_nom.setText("");
        jTF_prenom.setText("");
        jTF_telephone.setText("");
        jTF_email.setText("");
        jTF_postal.setText("");
        jTF_login.setText("");
        jTF_password.setText("");

    }//GEN-LAST:event_jB_clearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        System.out.println(""+row);
        //int id =(int) (jTable1.getValueAt(row, 0));
        String nom =(jTable1.getValueAt(row, 1).toString());
        String prenom =(jTable1.getValueAt(row, 2).toString());
        String telphone =(jTable1.getValueAt(row, 3).toString());
        String email =(jTable1.getValueAt(row, 4).toString());
        String adresse =(jTable1.getValueAt(row, 5).toString());
        String login =(jTable1.getValueAt(row, 6).toString());
        String password =(jTable1.getValueAt(row, 6).toString());
       Jtf_id.setText((jTable1.getValueAt(row, 0).toString()));
      jTF_nom.setText(nom);
     jTF_prenom.setText(prenom);
      jTF_telephone.setText(telphone);
     jTF_email.setText(email);
     jTF_postal.setText(adresse);
    jTF_login.setText(login);
     jTF_password.setText(password);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Gestion_CompteClient admin=new Gestion_CompteClient();
          admin.setVisible(true);
        this.setVisible(false);
        pack();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_CompteGerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_CompteGerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_CompteGerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_CompteGerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                try {
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    new Gestion_CompteGerant().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Gestion_CompteGerant.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Gestion_CompteGerant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtf_id;
    private javax.swing.JButton jB_ajouter;
    private javax.swing.JButton jB_clear;
    private javax.swing.JButton jB_modifier;
    private javax.swing.JButton jB_suuprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_email;
    private javax.swing.JTextField jTF_login;
    private javax.swing.JTextField jTF_nom;
    private javax.swing.JTextField jTF_password;
    private javax.swing.JTextField jTF_postal;
    private javax.swing.JTextField jTF_prenom;
    private javax.swing.JTextField jTF_telephone;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}