package com.babushka.nestingDoll;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dog {

    public String dogFact() {

        String fact = "";

        try {
            String url = "jdbc:mysql://localhost:3306/nestingdoll?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, "root", "lösenord");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM dog WHERE DogID = 2");
            while (rs.next()) {
                fact = rs.getString("fact");
                System.out.println(fact);
            }

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return fact;
    }





    /*public List<Dog> getAllGames() {
        List<Dog> gameList = new ArrayList<>();

        try {
            String query = "select * from dog";
            PreparedStatement stmt = connection.prepareStatement(query);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                gameList.add(new Dog(resultSet.getInt("ID"),
                        resultSet.getString("Fact"), resultSet.getString("Description");

            }


        } catch (SQLException e) {
            System.out.println("något gick fel" + e);
        }

        return dogList;
    }*/
}

