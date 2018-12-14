package com.babushka.nestingDoll;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DataBaseConnection {
    public Connection con = connect("jdbc:mysql://localhost:3306/nestingdoll?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

    private Connection connect(String url) {

        System.out.println("Creating connection");
        try {
            var connection = DriverManager.getConnection(url, "root", "Sigurd1121");
//            var connection = DriverManager.getConnection(url, "root", "1BROR2john");
            System.out.println("Connected");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}