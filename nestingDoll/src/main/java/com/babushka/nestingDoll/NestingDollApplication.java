package com.babushka.nestingDoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class NestingDollApplication {

    public static void main(String[] args) {
        SpringApplication.run(NestingDollApplication.class, args);

        try {
            String url = "jdbc:mysql://localhost:3306/nestingdoll?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url,"root","Sigurd1121");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM dog");
            while ( rs.next() ) {
                String fact = rs.getString("fact");
                System.out.println(fact);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}

