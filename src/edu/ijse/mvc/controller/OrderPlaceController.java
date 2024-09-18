/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;
import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderPlaceModel;
import java.sql.SQLException;

/**
 *
 * @author Lahiru Mudith
 */
public class OrderPlaceController {
    OrderPlaceModel orderPlaceModel = new OrderPlaceModel();
    
    public String  placeOrderSave(OrderDto orderDto) throws ClassNotFoundException, SQLException {
        String output = orderPlaceModel.placeOrder(orderDto);  
        return output;
    }
}
