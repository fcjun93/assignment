/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilewspart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AgileWSpart {

    public static void main(String[] args) {
        Name[] list = new Name[3];
        list[0] = new Name("1001", "Tan Jok Huat");
        list[1] = new Name("1002", "Lim Jia Rong");
        list[2] = new Name("1003", "Lee Yi Fung");

        String userID;
        Scanner scn = new Scanner(System.in);
        Date d = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        do {
            System.out.println("=======================Staff Clock In=======================");
            System.out.println("Please Enter your staff ID(\"q\" for quit):");
            userID = scn.nextLine().toLowerCase();

            if ("1001".equals(userID)) {
                System.out.println(list[0]);
                System.out.println("Date: " + date.format(d));
                System.out.println("Clock in Time: " + time.format(d) + "\n");

            } else if (userID.equals("1002")) {
                System.out.println(list[1]);
                System.out.println("Date: " + date.format(d));
                System.out.println("Clock in Time: " + time.format(d) + "\n");
            } else if (userID.equals("1003")) {
                System.out.println(list[2]);
                System.out.println("Date: " + date.format(d));
                System.out.println("Clock in Time: " + time.format(d) + "\n");
            } else if (userID.equals("q")) {
                System.out.println("Thank you For Using!!");
            } else {
                System.out.println("Invalid Input!!!" + "\n");
            }

        } while (!userID.equals("q"));

    }

}
