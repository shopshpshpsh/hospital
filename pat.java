package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pat extends patient {

        String url = "jdbc:postgresql://localhost:5433/postgres";
        String user = "postgres";
        String password = "ZHmedina2002.";

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;

        public void REQUEST() {
            try {
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM Patient WHERE PatientID <=3010");

                while (rs.next()) {
                    System.out.println(rs.getString("PatientID") + "  " + rs.getString("PatientFullName") + "  " + rs.getString("Gender") + " " + rs.getString("Disease"));

                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }


