/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseEmployeeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PlasticBankEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Warehouse;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BorrowPlasticWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitiz
 */
public class BorroPlasticJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BorrowPlastic
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    private Warehouse warehouse;
    public BorroPlasticJPanel(Warehouse warehouse, JPanel userProcessContainer, UserAccount account, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        this.warehouse = warehouse;
        jLabel5.setText(network.getName());
        //valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        borrowPlastic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        borrowPlastic.setBackground(new java.awt.Color(51, 51, 51));
        borrowPlastic.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        borrowPlastic.setText("Borrow");
        borrowPlastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowPlasticActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Quantity:");

        jLabel3.setText("Kgs");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel4.setText("Borrow Plastic");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Source City");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(borrowPlastic)))))
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(borrowPlastic))
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WarehouseEmployeeWorkArea dwjp = (WarehouseEmployeeWorkArea) component;
        dwjp.populateTable2();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void borrowPlasticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowPlasticActionPerformed

        
        //String type = (String)typeOfPlastic.getSelectedItem();
        int quantity = Integer.parseInt(quantityText.getText());
        
        BorrowPlasticWorkRequest request = new BorrowPlasticWorkRequest();
        request.setQuant(quantity);
        request.setSender(userAccount);
        request.setStatus("Requested");
        //request.setDestinationState(network.getName());
        //request.setType(type);
        request.setWarehouse(warehouse);
        request.setSourceState(network.getName());
        //warehouse.addPlastic(quantity);
       // warehouse.setPlasticBorrowed(quantity);
       // warehouse.addPlasticBorrowed(quantity);
        
        Organization org = null;
        
        

        //         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            //            if (organization instanceof IdentifyCollectors){
                //                org = organization;
                //                break;
                //            }
            //        }

        for (Network net : business.getNetworkList()){
            if(net.getName().equals(network.getName()))
            {
            continue;
            }
            for(Enterprise ep: net.getEnterpriseDirectory().getEnterpriseList())
            {

                if(ep instanceof PlasticBankEnterprise)
                {
                    for (Organization organization : ep.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof Warehouse){
                            org = organization;
                            System.out.println(net +"##"+org);
                            org.getWorkQueue().getWorkRequestList().add(request);
                           
                            break;
                        }
                    }

                }
            }

        }
        if (org!=null){
            //            org.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Plastic borrow request has been sent!!");
        
    }//GEN-LAST:event_borrowPlasticActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton borrowPlastic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField quantityText;
    // End of variables declaration//GEN-END:variables
}
