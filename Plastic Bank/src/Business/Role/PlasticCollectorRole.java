/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.IdentifyCollectors;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PlasticCollectorRole.PlasticCollectorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class PlasticCollectorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PlasticCollectorWorkAreaJPanel(userProcessContainer, account, (IdentifyCollectors)organization, enterprise, business, network);
    }
    
    
}
