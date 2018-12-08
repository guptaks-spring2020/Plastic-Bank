/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseEmployeeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Warehouse;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PlasticCollectorWorkRequest;
import Business.WorkQueue.BorrowPlasticWorkRequest;
import Business.WorkQueue.EmploymentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class WarehouseEmployeeWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Warehouse warehouse;
    private Network network;
    private Enterprise enterprise;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public WarehouseEmployeeWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Network network, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.warehouse = (Warehouse)organization;
        this.network = network;
        this.enterprise = enterprise;
        
        populateTable1();
        populateTable2();
        populateTable3();
        populateEmploymentTable();
    }
    
    public void populateTable1(){
        DefaultTableModel model = (DefaultTableModel)PurchaseCounter.getModel();
        
        model.setRowCount(0);
        System.out.println("##"+warehouse.getWorkQueue().getWorkRequestList());
        for(WorkRequest request : warehouse.getWorkQueue().getWorkRequestList()){
            
            if(request instanceof PlasticCollectorWorkRequest)
            {
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request.getStatus();
             row[3] = request.getQuant();
            row[4] = ((PlasticCollectorWorkRequest)request).getType();
           
            row[5] = ((PlasticCollectorWorkRequest)request).getGrade();
            row[6] = request.getQuant();
            row[7] = ((PlasticCollectorWorkRequest)request).getMoneyGiven();
            model.addRow(row);
            }
            
            
            
         
        }
        plasticCount.setText(String.valueOf(warehouse.getPlasticCount()));
    }

    
    
     public void populateTable2(){
        DefaultTableModel model = (DefaultTableModel)borrowPlasticTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
              Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
             row[3] = ((BorrowPlasticWorkRequest)request).getSourceState();
             row[4] = ((BorrowPlasticWorkRequest)request).getDestinationState();
            row[5] = request.getStatus();
            row[6] = request.getQuant();
            row[7] = ((BorrowPlasticWorkRequest)request).getMoneyGiven();
            model.addRow(row);
            //request.getReceiver().setRole(new );
          //  request.getReceiver().getRole().
        }
        
        plasticCount.setText(String.valueOf(warehouse.getPlasticCount()));
    }
    
     
     public void populateTable3(){
        DefaultTableModel model = (DefaultTableModel)borrowPlasticTable2.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : warehouse.getWorkQueue().getWorkRequestList()){
            if(request instanceof BorrowPlasticWorkRequest){
              Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
             row[3] = ((BorrowPlasticWorkRequest)request).getSourceState();
             row[4] = ((BorrowPlasticWorkRequest)request).getDestinationState();
            row[5] = request.getStatus();
            row[6] = request.getQuant();
            row[7] = ((BorrowPlasticWorkRequest)request).getMoneyGiven();
            model.addRow(row);
            }
        }
        plasticCount.setText(String.valueOf(warehouse.getPlasticCount()));
    }
     
     
    public void populateEmploymentTable(){
        DefaultTableModel model = (DefaultTableModel)EmploymentRequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : warehouse.getWorkQueue().getWorkRequestList()){
            if(request instanceof EmploymentWorkRequest){
              Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
             row[4] = ((EmploymentWorkRequest)request).getRewards();
             
            model.addRow(row);
            }
        }
        plasticCount.setText(String.valueOf(warehouse.getPlasticCount()));
    }
       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        borrowPlasticTable = new javax.swing.JTable();
        assignJButton1 = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        plasticCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PurchaseCounter = new javax.swing.JTable();
        assignJButton3 = new javax.swing.JButton();
        borrowPlastic = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowPlasticTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EmploymentRequest = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        plasticRequestJTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        supplyPlastic = new javax.swing.JButton();
        assignToMe = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowPlasticTable.setFont(new java.awt.Font("Times", 0, 16)); // NOI18N
        borrowPlasticTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Source State", "Destination State", "Status", "Quantity", "Money Given"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(borrowPlasticTable);
        if (borrowPlasticTable.getColumnModel().getColumnCount() > 0) {
            borrowPlasticTable.getColumnModel().getColumn(1).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(2).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(3).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(4).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(5).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(6).setResizable(false);
            borrowPlasticTable.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 600, 150));

        assignJButton1.setText("Assign to me");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });
        add(assignJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, -1));

        processJButton.setText("Check Plastic");
        processJButton.setEnabled(false);
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 110, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times", 1, 24)); // NOI18N
        jLabel1.setText("Plastic Bank");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        plasticCount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        plasticCount.setForeground(new java.awt.Color(255, 0, 0));
        plasticCount.setText("jLabel3");
        add(plasticCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Plastic Count");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Plastic Purchase Counter");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Lend Plastic Counter");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        PurchaseCounter.setFont(new java.awt.Font("Times", 0, 16)); // NOI18N
        PurchaseCounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Plastic Type", "Grade", "Quantity", "Money Given"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PurchaseCounter);
        if (PurchaseCounter.getColumnModel().getColumnCount() > 0) {
            PurchaseCounter.getColumnModel().getColumn(1).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(2).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(3).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(4).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(4).setHeaderValue("Plastic Type");
            PurchaseCounter.getColumnModel().getColumn(5).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(5).setHeaderValue("Grade");
            PurchaseCounter.getColumnModel().getColumn(6).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(6).setHeaderValue("Quantity");
            PurchaseCounter.getColumnModel().getColumn(7).setResizable(false);
            PurchaseCounter.getColumnModel().getColumn(7).setHeaderValue("Money Given");
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 600, 150));

        assignJButton3.setText("Forward To Logistics");
        assignJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton3ActionPerformed(evt);
            }
        });
        add(assignJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 170, -1));

        borrowPlastic.setText("Borrow Plastic");
        borrowPlastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowPlasticActionPerformed(evt);
            }
        });
        add(borrowPlastic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 150, -1));

        borrowPlasticTable2.setFont(new java.awt.Font("Times", 0, 16)); // NOI18N
        borrowPlasticTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Source State", "Destination State", "Status", "Quantity", "Money Charged"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(borrowPlasticTable2);
        if (borrowPlasticTable2.getColumnModel().getColumnCount() > 0) {
            borrowPlasticTable2.getColumnModel().getColumn(1).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(2).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(3).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(4).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(5).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(6).setResizable(false);
            borrowPlasticTable2.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 600, 160));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Borrow Plastic Counter");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        EmploymentRequest.setFont(new java.awt.Font("Times", 0, 16)); // NOI18N
        EmploymentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Rewards"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(EmploymentRequest);
        if (EmploymentRequest.getColumnModel().getColumnCount() > 0) {
            EmploymentRequest.getColumnModel().getColumn(1).setResizable(false);
            EmploymentRequest.getColumnModel().getColumn(2).setResizable(false);
            EmploymentRequest.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 460, 150));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Plastic Collector Employment Counter");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, 30));

        jButton1.setText("Assign to me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jButton2.setText("Validate Seller");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, -1, -1));

        plasticRequestJTable.setFont(new java.awt.Font("Times", 0, 16)); // NOI18N
        plasticRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Rewards"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(plasticRequestJTable);
        if (plasticRequestJTable.getColumnModel().getColumnCount() > 0) {
            plasticRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            plasticRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            plasticRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 460, 150));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 1100, 20));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Manufacturer Requests");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1100, 20));

        supplyPlastic.setText("Supply Plastic");
        supplyPlastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplyPlasticActionPerformed(evt);
            }
        });
        add(supplyPlastic, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, -1, -1));

        assignToMe.setText("Assign to me");
        add(assignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        processJButton.setEnabled(true);
        int selectedRow = PurchaseCounter.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a row from the table");
            return;
        }
        
        WorkRequest request = (WorkRequest)PurchaseCounter.getValueAt(selectedRow, 0);
        System.out.println("###"+request.getStatus());
        if(request.getStatus().equals("Completed"))
        {
          JOptionPane.showMessageDialog(null, "This request has already been processed");
          processJButton.setEnabled(false);
          return;
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable1();
        //checkPlastic.setEnabled(false);
        
    }//GEN-LAST:event_assignJButton1ActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = PurchaseCounter.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a value from the table");
            return;
        }
        
        PlasticCollectorWorkRequest request = (PlasticCollectorWorkRequest)PurchaseCounter.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed"))
            
        {
         JOptionPane.showMessageDialog(null, "This request has already been processed");
          
          return;
        }
        
        request.setStatus("Processing");
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request, warehouse);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable1();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton3ActionPerformed
        // TODO add your handling code here:
        
        
          int selectedRow = borrowPlasticTable2.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a value from the table");
            return;
        }
        
        BorrowPlasticWorkRequest request = (BorrowPlasticWorkRequest)borrowPlasticTable2.getValueAt(selectedRow, 0);
        
        if(request.getQuant()>warehouse.getPlasticCount())
        {
         JOptionPane.showMessageDialog(null, "Infsufficient Plastic Funds to address this request");
         return;
        }
            
        if(request.getStatus().equals("Completed"))
            
        {
         JOptionPane.showMessageDialog(null, "This request has already been processed");
          
          return;
        }
        
        request.setStatus("Processing");
        
        LendPlasticJpanel lendPlasticJpanel = new LendPlasticJpanel();
        userProcessContainer.add("LendPlasticJpanel", lendPlasticJpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignJButton3ActionPerformed

    private void borrowPlasticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowPlasticActionPerformed
        // TODO add your handling code here:
       
        
        
    
        BorroPlasticJPanel plasticBorrow = new BorroPlasticJPanel(userProcessContainer,userAccount, network, business );
        userProcessContainer.add("BorroPlasticJPanel", plasticBorrow);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
       
    }//GEN-LAST:event_borrowPlasticActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Network network
        int selectedRow = EmploymentRequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a value from the table");
            return;
        }

        EmploymentWorkRequest request = (EmploymentWorkRequest)EmploymentRequest.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed"))

        {
            JOptionPane.showMessageDialog(null, "This request has already been processed");

            return;
        }

        request.setStatus("Processing");

        HirePlasticSeller hirePlasticSeller = new HirePlasticSeller(userProcessContainer, request,userAccount,  warehouse,  business,  network, enterprise);
        userProcessContainer.add("HirePlasticSeller", hirePlasticSeller);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = EmploymentRequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a row from the table");
            return;
        }

        WorkRequest request = (WorkRequest)PurchaseCounter.getValueAt(selectedRow, 0);
        System.out.println("###"+request.getStatus());
        if(request.getStatus().equals("Completed"))
        {
            JOptionPane.showMessageDialog(null, "This request has already been processed");
            processJButton.setEnabled(false);
            return;
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateEmploymentTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void supplyPlasticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplyPlasticActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       userProcessContainer.add("ProcessPlastic", new ProcessPlasticRequestJPanel(userProcessContainer, userAccount, enterprise, warehouse, business));
       layout.next(userProcessContainer);
    }//GEN-LAST:event_supplyPlasticActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmploymentRequest;
    private javax.swing.JTable PurchaseCounter;
    private javax.swing.JButton assignJButton1;
    private javax.swing.JButton assignJButton3;
    private javax.swing.JButton assignToMe;
    private javax.swing.JButton borrowPlastic;
    private javax.swing.JTable borrowPlasticTable;
    private javax.swing.JTable borrowPlasticTable2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel plasticCount;
    private javax.swing.JTable plasticRequestJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton supplyPlastic;
    // End of variables declaration//GEN-END:variables
}
