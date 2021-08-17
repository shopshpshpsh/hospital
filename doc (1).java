package com.company;
import  java.util.Scanner;
import java.sql.DriverManager;
import java.sql.*;
import java.io.*;
public class doc extends doctor {

    String url = "jdbc:postgresql://localhost:5433/postgres";
    String user = "postgres";
    String password = "KVdiana2003.";

    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;

    public void REQUEST() throws IOException, SQLException {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Doctor WHERE DoctorID <=1010");

            while (rs.next()) {
                System.out.println(rs.getString("DoctorID") + "  " + rs.getString("DoctorFullName") + "  " + rs.getString("Timing") + " " + rs.getString("Qualification") + "  " + rs.getString("DoctorOffice"));

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
