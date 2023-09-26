package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection myConnection = null;
        Statement myStatement = null;
        ResultSet myResultSet = null;
        try{
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testProject","root","");
            System.out.println("Great, We can do connection");

            myStatement = myConnection.createStatement();
            myResultSet = myStatement.executeQuery("select * from employees");

            while(myResultSet.next()){
                System.out.println(myResultSet.getString("first_name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Something wrong happened");
        }




    }
}