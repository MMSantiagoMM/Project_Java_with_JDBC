package org.example;

import java.sql.*;

public class Update {
    public static void main(String[] args) {

        Connection myConnection;
        Statement myStatement;
        ResultSet myResultSet;

        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testProject","root","");
            System.out.println("Connection is successful");

            myStatement = myConnection.createStatement();
            myStatement.executeUpdate("update employees set second_name = 'Mosquera'  where id = 1");

            myResultSet = myStatement.executeQuery("select * from employees");

            while(myResultSet.next()){

                System.out.println(myResultSet.getString("second_name"));
            }

        }catch (Exception e){
            System.out.println("Something wrong happened");
        }
    }
    }

