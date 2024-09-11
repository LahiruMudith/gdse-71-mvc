/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.ItemView;
import edu.ijse.mvc.view.CustomerView;
import edu.ijse.mvc.view.LayoutFrame;
import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new LayoutFrame().setVisible(true);
//        try {
//            Connection connection = DBConnection.getInstance().getConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        CustomerView customerView = new CustomerView();
//        customerView.setLocationRelativeTo(null);
//        customerView.setVisible(true);
//        ItemView itemView = new ItemView();
//        itemView.setLocationRelativeTo(null);
//        itemView.setVisible(true);
        
    }
    
}
