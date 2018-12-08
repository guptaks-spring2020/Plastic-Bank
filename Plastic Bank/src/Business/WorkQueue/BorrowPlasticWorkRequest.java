/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Warehouse;

/**
 *
 * @author raunak
 */
public class BorrowPlasticWorkRequest extends WorkRequest{
    
   
 private String type;
    private String grade;
    
    private int moneyGiven;
    private int totalMoney;
    
    private String sourceState;
    private String destinationState;
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getSourceState() {
        return sourceState;
    }

    public void setSourceState(String sourceState) {
        this.sourceState = sourceState;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public int getMoneyGiven() {
        return moneyGiven;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    
    
    
    public void setMoneyGiven(int moneyGiven) {
        this.moneyGiven = moneyGiven;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

  
    
    
}
