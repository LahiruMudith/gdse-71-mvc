/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.dto.CustomerDto;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import edu.ijse.mvc.db.DBConnection;



/**
 *
 * @author USER
 */
public class CustomerModel {
    public ArrayList<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        while(rst.next()){
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustID(rst.getString("CustID"));
            customerDto.setCustTitle(rst.getString("CustTitle"));
            customerDto.setCustName(rst.getString("CustName"));
            customerDto.setSalary(rst.getDouble("salary"));
            customerDto.setDOB(rst.getString("DOB"));
            customerDto.setCustAddress(rst.getString("CustAddress"));
            customerDto.setCity(rst.getString("City"));
            customerDto.setProvince(rst.getString("Province"));
            customerDto.setPostalCode(rst.getString("PostalCode"));
            customerDtos.add(customerDto);
        }
        return customerDtos;
    }
    public String save(CustomerDto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getCustID());
        statement.setString(2, dto.getCustTitle());
        statement.setString(3, dto.getCustName());
        statement.setString(4, dto.getDOB());
        statement.setDouble(5, dto.getSalary());
        statement.setString(6, dto.getCustAddress());
        statement.setString(7, dto.getCity());
        statement.setString(8, dto.getProvince());
        statement.setString(9, dto.getPostalCode());

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";

    }
    public CustomerDto getCustomer(String CustID) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, CustID);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustID(rst.getString("CustID"));
            customerDto.setCustTitle(rst.getString("CustTitle"));
            customerDto.setCustName(rst.getString("CustName"));
            customerDto.setSalary(rst.getDouble("salary"));
            customerDto.setDOB(rst.getString("DOB"));
            customerDto.setCustAddress(rst.getString("CustAddress"));
            customerDto.setCity(rst.getString("City"));
            customerDto.setProvince(rst.getString("Province"));
            customerDto.setPostalCode(rst.getString("PostalCode"));
            return customerDto;
        }
        return null;
    }      
    public String delete(String CustID) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "DELETE FROM Customer WHERE CustID=?";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, CustID);

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";
    }
    public String update(CustomerDto dto) throws SQLException, ClassNotFoundException {
        System.out.println(dto.toString());
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET CustTitle=?, CustName=?, DOB=?, salary=?, CustAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?";

        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, dto.getCustTitle());
        statement.setString(2, dto.getCustName());
        statement.setString(3, dto.getDOB());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getCustAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getProvince());
        statement.setString(8, dto.getPostalCode());
        statement.setString(9, dto.getCustID());

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";
    }
}
