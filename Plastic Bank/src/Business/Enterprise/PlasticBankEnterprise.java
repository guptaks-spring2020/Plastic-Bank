/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitiz
 */
public class PlasticBankEnterprise extends Enterprise {
    
    public PlasticBankEnterprise(String name){
        super(name,EnterpriseType.PlasticBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}