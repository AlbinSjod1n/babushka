package com.babushka.nestingDoll;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//public class Dog {
//
//
//    public List<Dog> getAllGames() {
//        List<Dog> gameList = new ArrayList<>();
//
//        try {
//            String query = "select * from dog";
//            PreparedStatement stmt = connection.prepareStatement(query);
//
//            ResultSet resultSet = stmt.executeQuery();
//
//            while (resultSet.next()){
//                gameList.add(new Dog(resultSet.getInt("ID"),
//                        resultSet.getString("Fact"),resultSet.getString("Description");
//
//            }
//
//
//        }catch (SQLException e){
//            System.out.println("något gick fel" + e);
//        }
//
//        return dogList;
//    }}
//
