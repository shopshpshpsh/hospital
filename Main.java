package com.company;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Calendar;
import java.sql.*;
public class Main<Default> {

    public static void main(String[] args) throws IOException, SQLException {

        doc doc1 = new doc();
        doc2 doc2 = new doc2();
        pat pat1 = new pat();
        med med1= new med();
        String url = "jdbc:postgresql://localhost:5433/postgres";
        String user = "postgres";
        String password = "ZHmedina2002."; //Establishing the connection with DBMS
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;

        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        lab[] l = new lab[20];
        facility[] f = new facility[20];
        int i;
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new facility();
        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;
        l[4].facility = "Spectra Laboratories";
        l[4].lab_cost = 2000;
        l[5].facility = "ARUP Laboratories";
        l[5].lab_cost = 3000;
        f[0].fac_name = "Ambulance";
        f[1].fac_name = "Admit Facility ";
        f[2].fac_name = "Canteen";
        f[3].fac_name = "Emergency";
        f[4].fac_name = "Birth centers";
        f[5].fac_name = "Nursing homes";
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {

                                doc2.REQUEST2();
                                break;
                            }
                            case 2: {
                                doc1.REQUEST();
                                {
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1) {

                            case 1: {
                                pat1.REQUEST();
                                {
                                }

                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1) {

                            case 1: {
                                med1.REQUEST();
                                {
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                l[count5].new_feci();
                                count5++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Facilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    l[j].faci_list();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Facilities List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                f[count6].add_faci();
                                count6++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].show_feci();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;

            }

        }
    }

    }}
