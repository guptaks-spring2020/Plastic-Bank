/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Analysis.JChartClass;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.IdentifyCollectors;
import Business.Organization.LabourDepartment;
import Business.Organization.Organization;
import Business.Organization.Warehouse;
import java.awt.CardLayout;
import java.awt.Component;
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
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plasticLentLayout = new javax.swing.GroupLayout(plasticLent);
        plasticLent.setLayout(plasticLentLayout);
        plasticLentLayout.setHorizontalGroup(
            plasticLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        plasticLentLayout.setVerticalGroup(
            plasticLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plasticBorrowedLayout = new javax.swing.GroupLayout(plasticBorrowed);
        plasticBorrowed.setLayout(plasticBorrowedLayout);
        plasticBorrowedLayout.setHorizontalGroup(
            plasticBorrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
        plasticBorrowedLayout.setVerticalGroup(
            plasticBorrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Analysis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(plasticLent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(plasticBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel1)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plasticLent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plasticBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(backJButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel plasticBorrowed;
    private javax.swing.JPanel plasticLent;
    // End of variables declaration//GEN-END:variables
}
