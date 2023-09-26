package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {

        Connection myConnection;
        Statement myStatement;
        ResultSet myResultSet;

        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testProject","root","");
            System.out.println("Connection is successful");

            myStatement = myConnection.createStatement();
            myStatement.executeUpdate("delete from employees where id = 2");

            myResultSet = myStatement.executeQuery("select * from employees");

            while(myResultSet.next()){

                System.out.println(myResultSet.getString("second_name"));
            }

        }catch (Exception e){
            System.out.println("Something wrong happened");
        }
    }
}
