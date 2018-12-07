/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.PoorCollectors.PoorCollectorsDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 *  String name = nameJTextField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        Date dob = dateOfBirth.getDate();
        int age = Integer.parseInt(ageField.getText());
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PoorCollectorsDirectory poorCollectorsDirectory;
    private int organizationID;
    private static int counter=0;
    private String networkName;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    

    public PoorCollectorsDirectory getPoorCollectorsDirectory() {
        return poorCollectorsDirectory;
    }

    public void setPoorCollectorsDirectory(PoorCollectorsDirectory poorCollectorsDirectory) {
        this.poorCollectorsDirectory = poorCollectorsDirectory;
    }
    
    public enum Type{
        Admin("Admin Organization"), IdentifyCollectors("Identify Collectors"), Warehouse("Warehouse"), LabourDepartment("Labour Department");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        poorCollectorsDirectory = new PoorCollectorsDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
