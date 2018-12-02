/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kshitiz
 */
public class PlasticCollectorWorkRequest extends WorkRequest {
    
    private String type;
    private String grade;
    private int rewards;
    private int moneyGiven;

    public int getMoneyGiven() {
        return moneyGiven;
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

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }
    
    
    
}
