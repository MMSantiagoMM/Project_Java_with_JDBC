package org.example;

import java.sql.*;

public class Optimize {
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/platziDB";
        String user = "black-programmer";
        String password = "N3wPassw0rd*";

        try( Connection myConnection = DriverManager.getConnection(url,user,password);Statement myStatement = myConnection.createStatement();
        ResultSet myResultSet = myStatement.executeQuery("select * from Usuario");){

            while(myResultSet.next()){
                System.out.println(myResultSet.getString("first_name"));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Algo salió mal" + e);
        }
    }

}
