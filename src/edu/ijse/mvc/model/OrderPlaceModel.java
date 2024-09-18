/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import edu.ijse.mvc.dto.OrderDetailDto;

/**
 *
 * @author Lahiru Mudith
 */
public class OrderPlaceModel {
    OrderDetailDto orderDetailDto = new OrderDetailDto();
    public String placeOrder(OrderDto orderDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            
            String insertOrders = "INSERT INTO Orders VALUES(?,?,?);";
            PreparedStatement insertOrder = connection.prepareStatement(insertOrders);
            insertOrder.setString(1, orderDto.getOrderID());
            insertOrder.setString(2, orderDto.getOrderDate());
            insertOrder.setString(3, orderDto.getCustID());
            
            boolean isOrderSaved = insertOrder.executeUpdate() > 0;
            
            if(isOrderSaved){
                boolean isOrderDetailSaved = true;
                
                for(OrderDetailDto detailDto : orderDto.getOrderDetailDtos()){
                    String insertOrderDetails = "INSERT INTO OrderDetail VALUES(?,?,?,?);";
                    PreparedStatement insertOrderDetail = connection.prepareStatement(insertOrderDetails);
                    insertOrderDetail.setString(1, orderDto.getOrderID());
                    insertOrderDetail.setString(2, detailDto.getItemCode());
                    insertOrderDetail.setInt(3, detailDto.getOrderQTY());
                    insertOrderDetail.setDouble(4, detailDto.getDiscount());
                    
                    if(!(insertOrderDetail.executeUpdate()> 0)){
                        isOrderDetailSaved = false;
                    }
                }
                
                if(isOrderDetailSaved){
                    boolean isItemUpdated = true;
                    for(OrderDetailDto detailDto : orderDto.getOrderDetailDtos()){
                        String updateQty = "UPDATE item SET QtyOnHand = QtyOnHand-? WHERE ItemCode=?";
                        PreparedStatement itemUpdateStatment = connection.prepareStatement(updateQty);
                        itemUpdateStatment.setInt(1, detailDto.getOrderQTY());
                        itemUpdateStatment.setString(2, detailDto.getItemCode());
                        
                        if(!(itemUpdateStatment.executeUpdate()>0)){
                            isItemUpdated = false;
                        }
                        
                        if(isItemUpdated){
                        connection.commit();
                        return "Done";
                    } else {
                        connection.rollback();
                        return "Item update Error";
                    }
                    }
                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }
            }else {
                return "Order Update Fail";
            }
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
        return "Hi";
    }
}
