/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Class.Cart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Class.utils.Auth;
import RMIConnections.Client;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author JUN WEI
 */
public class CustomerPlaceOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerOrderForm
     */
    public CustomerPlaceOrderForm() {
        initComponents();
        refresh();
        initialisedDocumentListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        itemNameTextField = new javax.swing.JTextField();
        itemNoTextField = new javax.swing.JTextField();
        itemPricePerUnitTextField = new javax.swing.JTextField();
        itemAvailableStockTextField = new javax.swing.JTextField();
        itemTotalPriceTextField = new javax.swing.JTextField();
        itemQuantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        searchItemTextField = new javax.swing.JTextField();
        cartLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerItemTable = new javax.swing.JTable();
        refreshButtonLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1025, 716));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Items");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Price Per Unit:");

        itemNameTextField.setEditable(false);
        itemNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemNameTextField.setToolTipText("Displays Item's Name\n");

        itemNoTextField.setEditable(false);
        itemNoTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemNoTextField.setToolTipText("Displays Item's Number");

        itemPricePerUnitTextField.setEditable(false);
        itemPricePerUnitTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemPricePerUnitTextField.setToolTipText("Displays Item's Price Per Unit");

        itemAvailableStockTextField.setEditable(false);
        itemAvailableStockTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAvailableStockTextField.setToolTipText("Displays Item's Remaining Quantity");

        itemTotalPriceTextField.setEditable(false);
        itemTotalPriceTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemTotalPriceTextField.setToolTipText("Displays Item's Total Price");

        itemQuantitySpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemQuantitySpinner.setToolTipText("Enter Item's Quantity To Order");
        itemQuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQuantitySpinnerStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Total Price:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Item No:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Available Stock:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Quantity:");

        addOrderButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addOrderButton.setText("Add Order");
        addOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderButtonMouseClicked(evt);
            }
        });
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 19, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(itemAvailableStockTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(itemTotalPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(itemNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(itemNameTextField)
                                .addComponent(itemQuantitySpinner))
                            .addComponent(itemPricePerUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addOrderButton)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(itemAvailableStockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(itemPricePerUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(itemQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemTotalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addComponent(addOrderButton)
                .addContainerGap())
        );

        searchItemTextField.setText("Search Item\n");
        searchItemTextField.setToolTipText("Search An Item");
        searchItemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemTextFieldActionPerformed(evt);
            }
        });

        cartLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cartLabel.setText("Cart");
        cartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartLabelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Home");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        CustomerItemTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CustomerItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item No", "Name", "Price Per Unit", "Remaining Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustomerItemTable.setToolTipText("Item Details");
        CustomerItemTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomerItemTable.setRowHeight(30);
        CustomerItemTable.setShowGrid(true);
        CustomerItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemClickedTableEvent(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerItemTable);
        if (CustomerItemTable.getColumnModel().getColumnCount() > 0) {
            CustomerItemTable.getColumnModel().getColumn(0).setResizable(false);
            CustomerItemTable.getColumnModel().getColumn(1).setResizable(false);
            CustomerItemTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            CustomerItemTable.getColumnModel().getColumn(2).setResizable(false);
            CustomerItemTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        refreshButtonLabel.setText("refresh");
        refreshButtonLabel.setToolTipText("refreshes the entire screen");
        refreshButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonLabelMouseClicked(evt);
            }
        });

        searchLabel.setText("Search");
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71)
                        .addComponent(cartLabel)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButtonLabel)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchLabel))
                    .addComponent(refreshButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchItemTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemTextFieldActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CustomerItemTable.getModel();
        try{
            String orderQuantity = String.valueOf(itemQuantitySpinner.getValue());
            int itemNo = Integer.valueOf(itemNoTextField.getText());
            String itemName = itemNameTextField.getText();
            Integer itemAvailableQuantity = Integer.valueOf(itemAvailableStockTextField.getText());
            double itemPrice = Double.valueOf(itemPricePerUnitTextField.getText());
            double itemTotalPrice = itemPrice*Integer.valueOf(orderQuantity);
            
            System.out.println(itemNo);
            if(itemQuantitySpinner.getValue()==""){
                JOptionPane.showMessageDialog(null, "Incomplete Order! Please try again");
            }
            else if(Auth.isValidOrderQuantity(itemAvailableQuantity, orderQuantity)){
                JOptionPane.showMessageDialog(null, "Invalid quantity! Please try again");
            }
            else{
                Integer itemQuantity = Integer.valueOf(orderQuantity);
            
                Cart item = new Cart("2","Jason",itemNo, itemName, itemPrice, itemQuantity, itemTotalPrice);
            
                String addStatus = Client.Object.addCart(item);
                
                JOptionPane.showMessageDialog(null, addStatus);
                itemQuantitySpinner.setValue(0);
                refresh();
            }
            } catch (Exception ex) {
                Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void itemClickedTableEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemClickedTableEvent
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CustomerItemTable.getModel();
        int selectedItemRowIndex = CustomerItemTable.getSelectedRow();
        
        
        itemNoTextField.setText(model.getValueAt(selectedItemRowIndex, 0).toString());
        itemNameTextField.setText(model.getValueAt(selectedItemRowIndex, 1).toString());
        itemAvailableStockTextField.setText(model.getValueAt(selectedItemRowIndex, 3).toString());
        itemPricePerUnitTextField.setText(model.getValueAt(selectedItemRowIndex, 2).toString());
    }//GEN-LAST:event_itemClickedTableEvent

    private void itemQuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQuantitySpinnerStateChanged
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CustomerItemTable.getModel();
        double itemPricePerUnit = Double.parseDouble(itemPricePerUnitTextField.getText());
        Integer itemQuantity = (Integer)itemQuantitySpinner.getValue();
        
        if(itemQuantity<0){
            JOptionPane.showMessageDialog(null, "Invalid quantity! Please try again");
            itemQuantitySpinner.setValue(0);
        }
        else{
            double itemTotalPrice = itemPricePerUnit*itemQuantity;
            itemTotalPriceTextField.setText(String.valueOf(itemTotalPrice));
        }
    }//GEN-LAST:event_itemQuantitySpinnerStateChanged

    private void addOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrderButtonMouseClicked

    private void refreshButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonLabelMouseClicked
        // TODO add your handling code here:
        
        try {
            DefaultTableModel model = Client.Object.viewTable();
            CustomerItemTable.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        refresh();
    }//GEN-LAST:event_refreshButtonLabelMouseClicked

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        // TODO add your handling code here:
        String searchItem = searchItemTextField.getText();
        try{
            if(Client.Object.searchItem(searchItem)){
                String searchedItem = Client.Object.getSearchItem(searchItem);
                DefaultTableModel model = (DefaultTableModel) CustomerItemTable.getModel();
                model.setRowCount(0);
                String[] splitSearchedItem = searchedItem.split(",");
                model.addRow(splitSearchedItem);
            }
            else{
                searchItemTextField.setText("Search Item");
                JOptionPane.showMessageDialog(null, "ItemName Not Found! Please try again");
                
            }
        }catch(Exception ex) {
            Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchLabelMouseClicked

    private void cartLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMouseClicked
        // TODO add your handling code here:
        new CustomerCartForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_cartLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPlaceOrderForm().setVisible(true);
            }
        });
    }
    
     private void refresh() {
        loadTable();
        addOrderButton.setEnabled(false);
        
        itemNoTextField.setText("");
        itemNameTextField.setText("");
        itemPricePerUnitTextField.setText("");
        itemAvailableStockTextField.setText("");
        itemTotalPriceTextField.setText("");
        searchItemTextField.setText("Search Item");
    }
     
     private void loadTable() {
        try {
            DefaultTableModel model = Client.Object.viewTable();
            CustomerItemTable.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(CustomerPlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initialisedDocumentListener(){
        DocumentListener inputListener = new DocumentListener(){
            private void updateButtonState(){
                boolean itemSelected = Auth.textFieldsFilled(itemNameTextField, itemNoTextField,itemPricePerUnitTextField, itemAvailableStockTextField); 
                
                addOrderButton.setEnabled(itemSelected);
            }
          
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtonState();            
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtonState();
            }
            
            
        };
        itemNoTextField.getDocument().addDocumentListener(inputListener);
        itemNameTextField.getDocument().addDocumentListener(inputListener);
        itemPricePerUnitTextField.getDocument().addDocumentListener(inputListener);
        itemAvailableStockTextField.getDocument().addDocumentListener(inputListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerItemTable;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JTextField itemAvailableStockTextField;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JTextField itemNoTextField;
    private javax.swing.JTextField itemPricePerUnitTextField;
    private javax.swing.JSpinner itemQuantitySpinner;
    private javax.swing.JTextField itemTotalPriceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refreshButtonLabel;
    private javax.swing.JTextField searchItemTextField;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
