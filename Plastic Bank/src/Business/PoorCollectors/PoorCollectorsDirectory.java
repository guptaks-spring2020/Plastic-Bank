package Business.PoorCollectors;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 *  String name = nameJTextField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        Date dob = dateOfBirth.getDate();
        int age = Integer.parseInt(ageField.getText());
 */
public class PoorCollectorsDirectory {
    
    private ArrayList<PoorCollectors> collectorsList;

    public PoorCollectorsDirectory() {
        collectorsList = new ArrayList();
    }

    public ArrayList<PoorCollectors> getCollectorList() {
        return collectorsList;
    }
    
    public PoorCollectors createPoorCollectors(String name, String email, String address, Date dob, int age){
        PoorCollectors pc = new PoorCollectors();
        pc.setName(name);
        pc.setAddress(address);
        pc.setDob(dob);
        pc.setAge(age);
        pc.setEmail(email);
        
        collectorsList.add(pc);
        return pc;
    }
}