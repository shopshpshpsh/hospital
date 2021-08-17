package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class med extends medical{
    String url = "jdbc:postgresql://localhost:5433/postgres";
    String user = "postgres";
    String password = "KVdiana2003.";

    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;

    public void REQUEST() {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Medical WHERE MedID <=5010");

            while (rs.next()) {
                System.out.println(rs.getString("MedID") + "  " + rs.getString("MedicalName") + "  " + rs.getString("Company") + " " + rs.getString("DateOfIssue") + "  " + rs.getString("ExpiryDate")+ "  " + rs.getString("Cost"));

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
