/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jemacom
 */
public class Admin extends Utilisateur{

    public Admin(int Id, String nom, String prenom, String email, String telephone, String adresse, String login, String pass) {
        super(Id, nom, prenom, email, telephone, adresse, login, pass, "administrateur");
    }

    public Admin() {
    }

    
   

    
    
    
}
