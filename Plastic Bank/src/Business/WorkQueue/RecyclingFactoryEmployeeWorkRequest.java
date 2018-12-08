/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author nikitalalwani
 */
public class RecyclingFactoryEmployeeWorkRequest extends WorkRequest {
    private String grade;
    //private float quantity;
    private float price;
    private float type;
    private float sellPrice;
    private int transportationCost;
    private int numberOfTrucks;

    public int getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(int transportationCost) {
        this.transportationCost = transportationCost;
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void setNumberOfTrucks(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getType() {
        return type;
    }

    public void setType(float type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

   

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
