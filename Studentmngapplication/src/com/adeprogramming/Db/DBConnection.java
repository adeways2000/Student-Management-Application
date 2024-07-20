package com.adeprogramming.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user ="root";
            String pass = "root_pass_1234"; //replace with your password//
            String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";

            con= DriverManager.getConnection(url,user,pass);

        }
        catch (Exception ex) {

        }

        return con;
    }
}
