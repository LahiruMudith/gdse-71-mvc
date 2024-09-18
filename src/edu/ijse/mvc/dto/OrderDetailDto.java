/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Lahiru Mudith
 */
public class OrderDetailDto {
    private String itemCode;
    private int orderQTY;
    private double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemCode, int orderQTY, int discount) {
        this.itemCode = itemCode;
        this.orderQTY = orderQTY;
        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderQTY() {
        return orderQTY;
    }

    public void setOrderQTY(int orderQTY) {
        this.orderQTY = orderQTY;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
