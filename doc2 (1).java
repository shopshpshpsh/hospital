package com.company;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
public class doc2 {
    Scanner sc = new Scanner(System.in); //Scanner for inputs
    String url = "jdbc:postgresql://localhost:5433/postgres";
    String user = "postgres";
    String password = "KVDiana2003."; //Establishing the connection with DBMS

    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;

    public void REQUEST2()
    {
        System.out.println("Enter Doctor id ");
        int id = sc.nextInt();

        System.out.println("Enter Doctor Fullname ");
        String name1 = sc.nextLine();

        System.out.println("Enter Timing ");
        String timing = sc.nextLine();

        System.out.println("Enter Qualification ");
        String qf = sc.nextLine();

        System.out.println("Enter Doctor office");
        int office = sc.nextInt();


        try {

            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Doctor");
            stmt.executeUpdate("INSERT INTO Doctor" + " VALUES ('" + id + "','" + name1 + "', '" + timing + "', '" + qf + "','" + office + "')");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


