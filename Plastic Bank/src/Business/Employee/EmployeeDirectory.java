/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,String pno, String address, Date dob, String age){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        employee.setDob(dob);
        employee.setAge(age);
        employee.setPhoneNumber(pno);
        
        //employee.setEmail(email);
        employeeList.add(employee);
        return employee;
    }
    
     public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        
        employeeList.add(employee);
        return employee;
    }
     
      public void deleteEmployee(Employee employee){
       
        employeeList.remove(employee);
        //return employee;
    }
      
     
      
      public void addEmployee(Employee employee)
      {
       employeeList.add(employee);
      
      }
    
     
//     public boolean checkIfEmployeeExists(String username, ArrayList<Employee> list)
//     {
//     for(Employee e : list)
//     {
//     if(e.)
//     }
//     return true;
//     }
}