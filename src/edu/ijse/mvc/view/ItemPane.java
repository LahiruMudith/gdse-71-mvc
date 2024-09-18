/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.controller.ItemController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Mudith
 */
public class ItemPane extends javax.swing.JPanel {
    ItemController itemController = new ItemController();
    /**
     * Creates new form ItemPane
     */
    public ItemPane() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitel = new javax.swing.JLabel();
        tyu = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        tgh = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        thi = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        dfv = new javax.swing.JLabel();
        rty = new javax.swing.JLabel();
        txtoh = new javax.swing.JTextField();
        txtUpdate = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        ttSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();

        lblTitel.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        lblTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitel.setText("Item From");

        tyu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tyu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tyu.setText("Item Code");

        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tgh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tgh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tgh.setText("Description");

        txtDocument.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDocument.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtSize.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        thi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        thi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        thi.setText("Pack Size");

        txtPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        dfv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dfv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dfv.setText("Unit Price");

        rty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rty.setText("QOH");

        txtoh.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtUpdate.setBackground(new java.awt.Color(0, 255, 51));
        txtUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpdate.setText("Update");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        txtDelete.setBackground(new java.awt.Color(255, 255, 0));
        txtDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        ttSave.setBackground(new java.awt.Color(255, 0, 0));
        ttSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ttSave.setText("Save");
        ttSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttSaveActionPerformed(evt);
            }
        });

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(thi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(tyu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocument)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dfv, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rty, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtoh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 146, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ttSave)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tyu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tgh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dfv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtoh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDelete)
                    .addComponent(txtUpdate)
                    .addComponent(ttSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        updateItem();// TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        deleteItem();// TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void ttSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttSaveActionPerformed
        saveItem();        // TODO add your handling code here:
    }//GEN-LAST:event_ttSaveActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        searchItem();  // TODO add your handling code here:
    }//GEN-LAST:event_txtTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dfv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel rty;
    private javax.swing.JLabel tgh;
    private javax.swing.JLabel thi;
    private javax.swing.JButton ttSave;
    private javax.swing.JTextField txtCode;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTable txtTable;
    private javax.swing.JButton txtUpdate;
    private javax.swing.JTextField txtoh;
    private javax.swing.JLabel tyu;
    // End of variables declaration//GEN-END:variables
    private void loadTable(){
    String colums[]= {"Item Code","Description","Pack Size","Unit Price","Qty On Hand"};
    DefaultTableModel dtm = new DefaultTableModel(colums,0){
          public boolean isCellEditable(int row, int column) {
                return false;
            }
    };
     try {
            ArrayList<ItemDto> itemDtos = itemController.getAllItems();
            for (ItemDto itemDto : itemDtos) {
                Object[] rowData = {itemDto.getItemCode(), itemDto.getDescription(), itemDto.getPackSize(), itemDto.getUnitPrice(), itemDto.getQoh()};
                dtm.addRow(rowData);
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
     txtTable.setModel(dtm);
    }
    private void saveItem(){
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
            
            try {
            String resp = itemController.saveItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            
    }

    private void clearFrom() {
            txtCode.setText("");
            txtDocument.setText("");
            txtSize.setText("");
            txtPrice.setText("");
            txtoh.setText("");
    }   
    private void searchItem() {
        String itemCode = (String) txtTable.getValueAt(txtTable.getSelectedRow(), 0);
        System.out.println(itemCode);

        try {

            ItemDto itemDto = itemController.searchItem(itemCode);
            if (itemDto != null) {
                txtCode.setText(itemDto.getItemCode());
                txtDocument.setText(itemDto.getDescription());
                txtSize.setText(itemDto.getPackSize());
                txtPrice.setText(Double.toString(itemDto.getUnitPrice()));
                txtoh.setText(Integer.toString(itemDto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    private void deleteItem() {
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
        try {
            String itemCode = txtCode.getText();
            String resp = itemController.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void updateItem() {
        ItemDto itemDto = new ItemDto(
            txtCode.getText(),
            txtDocument.getText(),
            txtSize.getText(),
            Double.parseDouble(txtPrice.getText()),
            Integer.parseInt(txtoh.getText()));
        try {
            String resp = itemController.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearFrom();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
