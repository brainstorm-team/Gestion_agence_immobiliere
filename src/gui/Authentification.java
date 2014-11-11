/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.classes.AdminDAO;
import DAO.classes.ClientDAO;
import DAO.classes.GerantDAO;
import DAO.interfaces.IAdminDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Admin;
import entities.Client;
import entities.Gerant;
import entities.Util;
import entities.Utilisateur;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.swing.AccumulativeRunnable;

/**
 *
 * @author jemacom
 */
public class Authentification extends javax.swing.JFrame {

    
    /**
     * Creates new form Authentification
     */
    public Authentification() {
        initComponents();
        this.setLocationRelativeTo(null);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher(){
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                
                    switch (e.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            seConnecter();
                        }
                        break;
                        default :
                    return false;
                }
                return false;
            }     
    
        });
        
        
    }
    /**On a besoin de cette fonction pour se connecter 
    *soit en click sur le button "Se connecter" soit en tapant sur ENTRER
    */
    private void seConnecter(){
//       Admin agent  = AdminDAO.getInstance().findAdministrateurByLogin(login.getText());
//      Client agent1 = ClientDAO.getInstance().findClientByLogin(login.getText());
//      Gerant agent2 = GerantDAO.getInstance().findGerantByLogin(login.getText());
//      if( agent != null){
//          if(agent.getPass().equals(pass.getText())){
//              Acceuil_admin aa = new Acceuil_admin();
//              System.out.println("id agent = "+agent.getId());
//              Util.id_agent_connecte = agent.getId();
//              System.out.println("Id agent connecte = "+Util.id_agent_connecte);
//              Util.role_agent_connecte = "admin";
//              aa.setVisible(true);
//              this.setVisible(false);
//          }
//      }else if( agent1 != null){
//          if(agent1.getPass().equals(pass.getText())){
//              Acceuil_client ac = new Acceuil_client();
//              System.out.println("id agent = "+agent1.getId());
//              Util.id_agent_connecte = agent1.getId();
//              System.out.println("Id agent connecte = "+Util.id_agent_connecte);
//              Util.role_agent_connecte = "client";
//              ac.setVisible(true);
//              System.out.println(Util.id_agent_connecte);
//              this.setVisible(false);
//          }
//      }
//      else if (agent2 != null){
//          if (agent2.getPass().equals(pass.getText())){
//              Acceuil_gerant ag = new Acceuil_gerant();
//              System.out.println("id agent = "+agent2.getId());
//               Util.id_agent_connecte = agent2.getId();
//               Util.role_agent_connecte = "gerant";
//               System.out.println("Id agent connecte = "+Util.id_agent_connecte);
//              System.out.println(Util.id_agent_connecte);
//               ag.setVisible(true);
//              this.setVisible(false);
//          }
//      }
//      else {
//          JOptionPane.showMessageDialog(null, "Login incorrect ! ou pass incorrect ", "Error", 1);
//      } 
        Utilisateur user =new Utilisateur();
        user =AdminDAO.getInstance().findUserByLogin(login.getText());
        if(user != null){
        if(user.getRole().equals("client")){
            if (user.getPass().equals(pass.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                Acceuil_client acc = new Acceuil_client();
                acc.setVisible(true);
                this.setVisible(false);
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        }
        if(user.getRole().equals("gerant")){
        
        if (user.getPass().equals(pass.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                Acceuil_gerant acc = new Acceuil_gerant();
                acc.setVisible(true);
                this.setVisible(false);         
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        
        }  if(user.getRole().equals("administrateur")){
        
        if (user.getPass().equals(pass.getText())) {           
                JOptionPane.showMessageDialog(null, "Authentification avecc succes! ", "ok", 1);
                Acceuil_admin acc = new Acceuil_admin();
                acc.setVisible(true);
                this.setVisible(false);
                
            }  else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);}
        
        }}
        else {    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Error", 1);
        }
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_login = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        bt_se_connecter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        bt_inscrire = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        label_login.setText("Login :");

        label_pass.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        label_pass.setText("Pass :");

        bt_se_connecter.setText("Se connecter");
        bt_se_connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_se_connecterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Authentification :");
        jLabel3.setAutoscrolls(true);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setIconTextGap(65);
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 19));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 19));
        jLabel3.setPreferredSize(new java.awt.Dimension(155, 52));

        bt_inscrire.setText("S'inscrire ");
        bt_inscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inscrireActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 90, 90));
        jLabel4.setText("Si vous n'avais pas un compte ");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(182, 90, 90));
        jLabel5.setText("dans notre plateforme ,Veuillez ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_se_connecter)
                        .addGap(150, 150, 150)
                        .addComponent(bt_inscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_inscrire)
                    .addComponent(bt_se_connecter))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_se_connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_se_connecterActionPerformed
       seConnecter();
        
    }//GEN-LAST:event_bt_se_connecterActionPerformed

    private void bt_inscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inscrireActionPerformed
        Inscription ins = new Inscription();
        ins.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_inscrireActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    
                    new Authentification().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_inscrire;
    private javax.swing.JButton bt_se_connecter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_pass;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
