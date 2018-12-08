/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FactoryRole;
//possible merge error 
//import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikitalalwani
 */
public class RecyclingFactory extends Organization{

       public RecyclingFactory() {
        super(Organization.Type.RecyclingFactory.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList();
        roles.add(new FactoryRole());
        return roles;    
    }
    
}
