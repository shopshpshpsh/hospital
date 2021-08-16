package com.company;
import java.util.Scanner;
public class lab {
        String facility;
        int lab_cost;
        void new_feci()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("facility:-");
            facility = input.nextLine();
            System.out.print("cost:-");
            lab_cost = input.nextInt();
        }
        void faci_list()
        {
            System.out.println(facility + "\t\t" + lab_cost);
        }
    }

