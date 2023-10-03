package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Insert {
    public static void main(String[] args) {
        Connection myConnection;
        PreparedStatement myPreparedStatement;
        ResultSet myResultSet;

        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/platziDB","black-programmer","N3wPassw0rd*");
            System.out.println("Connection is successful");
            String sql = "insert into Usuario (first_name, second_name, area) values (?,?,?)";

            myPreparedStatement = myConnection.prepareStatement(sql);
            myPreparedStatement.setString(1,"Santiago");
            myPreparedStatement.setString(2,"Mapura");
            myPreparedStatement.setString(3,"Software");

            int rowsAffected = myPreparedStatement.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Creating new employee");
            }

        }catch (Exception e){
            System.out.println("Something wrong happened " + e);
        }
    }
}
