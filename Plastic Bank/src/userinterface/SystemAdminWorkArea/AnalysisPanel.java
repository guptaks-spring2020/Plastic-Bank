/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.IdentifyCollectors;
import Business.Organization.LabourDepartment;
import Business.Organization.Organization;
import Business.Organization.Warehouse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.AnalysisPanel;
/**
 *
 * @author nikitalalwani
 */
public class AnalysisPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    static ArrayList<Double> plasticCount;
    Map<String, Integer> map;
    
    public AnalysisPanel(JPanel userProcessContainer,EcoSystem ecosystem) throws IOException {
                this.map = new HashMap<String, Integer>();

        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        initComponents();
        analysisForPlasticCount();
        analysisForPlasticBoroowed();
        analysisForPlasticLent();
       // analysisForEmployeeHiring();
    }
    
    public void analysisForPlasticBoroowed() throws IOException {
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        float count = (float) 0.0;
        
        for (Network nw: networkList){
            for(Enterprise er: nw.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization og: er.getOrganizationDirectory().getOrganizationList()){
                    if (og instanceof Warehouse){
                        Warehouse org = (Warehouse)og;
                        map.put(nw.getName(), org.getPlasticBorrowed());
                }
            }
        }

        }
        System.out.println("-------borrowed"+map);
        JChartClass chart = new JChartClass( "PLASTIC BORROWED", map);
        JPanel pan = chart.createDemoPanel();
        pan.setVisible(true);
        pan.setSize( 300 , 300 ); 
        plasticBorrowed.add(pan);
        this.invalidate();
    }
    
    
//borrowed pie chart
    
     public void analysisForPlasticCount() throws IOException {
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        float count = (float) 0.0;
        
        for (Network nw: networkList){
            for(Enterprise er: nw.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization og: er.getOrganizationDirectory().getOrganizationList()){
                    if (og instanceof Warehouse){
                        Warehouse org = (Warehouse)og;
                        map.put(nw.getName(), org.getPlasticCount());
                }
            }
        }

        }
        System.out.println("Count-------" +map);
        JChartClass chart = new JChartClass( "PLASTIC QUANTITY", map);
        JPanel pan = chart.createDemoPanel();
        pan.setVisible(true);
        pan.setSize( 300 , 300 ); 
        chartPanel.add(pan);
        this.invalidate();
    }
    
      
     public void analysisForPlasticLent() throws IOException {
        ArrayList<Network> networkList=ecosystem.getNetworkList();
      //  Organization org = null;
        float count = (float) 0.0;
        
        for (Network nw: networkList){
            for(Enterprise er: nw.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization og: er.getOrganizationDirectory().getOrganizationList()){
                    if (og instanceof Warehouse){
                        Warehouse org = (Warehouse)og;
                        map.put(nw.getName(), org.getPlasticLent());
                }
            }
        }

        }
        System.out.println("Lent-------" +map);
        JChartClass chart = new JChartClass( "PLASTIC LENT", map);
        JPanel pan = chart.createDemoPanel();
        pan.setVisible(true);
        pan.setSize( 300 , 300 ); 
        plasticLent.add(pan);
        this.invalidate();
    }
     
  public void analysisForEmployeeHiring() throws IOException {
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        int employeeCount = 0;
        int labourCount = 0;
        int convertedCount = 0;
        
        for (Network nw: networkList){
            for(Enterprise er: nw.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization og: er.getOrganizationDirectory().getOrganizationList()){
                    if (og instanceof IdentifyCollectors){
                        IdentifyCollectors org = (IdentifyCollectors)og;
                        employeeCount = org.getEmployeeDirectory().getEmployeeList().size();
                }
                 if (og instanceof LabourDepartment){
                 LabourDepartment org = (LabourDepartment)og;
                 org.getEmployeeDirectory().getEmployeeList();
                 labourCount = org.getEmployeeDirectory().getEmployeeList().size();
                }
                  System.out.println("convertedCount-------" +labourCount);
                  System.out.println("convertedCount-------" +employeeCount);

                 convertedCount = ((labourCount - employeeCount)/employeeCount)*100;
                         System.out.println("convertedCount-------" +convertedCount);
            }
        }

        }
        System.out.println("Lent-------" +map);
        JChartClass chart = new JChartClass( "Plastic Lent", map);
        JPanel pan = chart.createDemoPanel();
        pan.setVisible(true);
        pan.setSize( 300 , 300 ); 
        plasticLent.add(pan);
        this.invalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chartPanel = new javax.swing.JPanel();
        plasticLent = new javax.swing.JPanel();
        plasticBorrowed = new javax.swing.JPanel();

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plasticLentLayout = new javax.swing.GroupLayout(plasticLent);
        plasticLent.setLayout(plasticLentLayout);
        plasticLentLayout.setHorizontalGroup(
            plasticLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        plasticLentLayout.setVerticalGroup(
            plasticLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plasticBorrowedLayout = new javax.swing.GroupLayout(plasticBorrowed);
        plasticBorrowed.setLayout(plasticBorrowedLayout);
        plasticBorrowedLayout.setHorizontalGroup(
            plasticBorrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        plasticBorrowedLayout.setVerticalGroup(
            plasticBorrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(plasticLent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plasticBorrowed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plasticBorrowed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plasticLent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel;
    private javax.swing.JPanel plasticBorrowed;
    private javax.swing.JPanel plasticLent;
    // End of variables declaration//GEN-END:variables
}
