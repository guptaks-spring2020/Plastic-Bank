/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.WarehouseEmployeeRole.WarehouseEmployeeWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class WarehouseEmployeeRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new WarehouseEmployeeWorkArea(userProcessContainer, account, organization, business, network, enterprise);
    }
    
}
