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
public class TransportWorkRequest extends WorkRequest{

    private String source;
    private String destination;
    private float transportationCost;
    private int numberOfTrucks;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(float transportationCost) {
        this.transportationCost = transportationCost;
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void setNumberOfTrucks(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }    
    
}
