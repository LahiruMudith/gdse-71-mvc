/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

import java.util.ArrayList;

/**
 *
 * @author Lahiru Mudith
 */
public class OrderDto {
    private String orderID;
    private String orderDate;
    private String custID;
    private ArrayList<OrderDetailDto> orderDetailDtos; 

    public OrderDto() {
    }

    public OrderDto(String orderID, String orderDate, String custID, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.custID = custID;
        this.orderDetailDtos = orderDetailDtos;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }
}
