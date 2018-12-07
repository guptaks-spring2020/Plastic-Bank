/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.WarehouseEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class Warehouse extends Organization{
    
    private int plasticCount;
    private int plasticBorrowed;
    private Map<String, Integer> plasticTypeTrack;
    

    public Map<String, Integer> getPlasticTypeTrack() {
        return plasticTypeTrack;
    }

    public void setPlasticTypeTrack(Map<String, Integer> plasticTypeTrack) {
        this.plasticTypeTrack = plasticTypeTrack;
    }

    public Warehouse() {
        super(Organization.Type.Warehouse.getValue());
    }

    public int getPlasticBorrowed() {
        return plasticBorrowed;
    }

    public void setPlasticBorrowed(int plasticBorrowed) {
        this.plasticBorrowed = plasticBorrowed;
    }

    public int getPlasticCount() {
        return plasticCount;
    }

    public void setPlasticCount(int plasticCount) {
        this.plasticCount = plasticCount;
    }

    public void addPlastic(int pCount)
    {
    this.plasticCount = this.plasticCount + pCount;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehouseEmployeeRole());
        return roles;
    }
     
   
    
    
}
