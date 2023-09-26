package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection myConnection;
        Statement myStatement;
        ResultSet myResultSet;
        try{

            //Establece la conexión a la base de datos
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testProject","root","");
            System.out.println("Great, We are connected");

            myStatement = myConnection.createStatement();
            myResultSet = myStatement.executeQuery("select * from employees");

            while(myResultSet.next()){
                System.out.println(myResultSet.getString("area"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Something wrong happened");
        }




    }
}