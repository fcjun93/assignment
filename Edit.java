/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcpartb;

import java.util.Scanner;
import static jcpartb.JcPartB.createNewDeliveryMan;
import static jcpartb.JcPartB.newDeliveryMan;

/**
 *
 * @author hp
 */
public class Edit {

    static Scanner input = new Scanner(System.in);
    static DeliveryMan[] newDeliveryMan = new DeliveryMan[10];

    public static void main(String[] args) {
        newDeliveryMan[0] = new DeliveryMan("Tan tin tong", "123456789012", 45, "Full time", "Active");
        newDeliveryMan[1] = new DeliveryMan("Ali baba", "890803107082", 18, "Part time", "Active");
        String test1 = "123456789012";
        String test2 = "123456789011";
        String test;
        String cont = "y";
        String status = "";
        int count = 1;
        System.out.println("==============================");
        System.out.print("Change Staff 's Status\n");
        System.out.println("==============================");
        do {

            System.out.print("\nEnter Staff IC: ");
            test = input.next();
            //     do loop for checking ic
            for (int i = 0; i < newDeliveryMan.length; ++i) {
                if (newDeliveryMan[i] instanceof DeliveryMan) {
                    if (((DeliveryMan) newDeliveryMan[i]).
                            getIC().equals(test)) {
                        System.out.println(newDeliveryMan[i]);
                        System.out.println("Current status is " + (newDeliveryMan[i]).getStatus());

                        System.out.println("Do you want to change status?(y/n) ");
                        String change = input.next();

                        if (change.equals("y")) {
                            System.out.println("==============================");
                            System.out.println("Select the status");
                            System.out.println("==============================");
                            System.out.println("Press [1] For Resigned");
                            System.out.println("Press [2] For Retired");
                            System.out.println("Press [3] For Terminated");
                            System.out.println("Press [4] For Active");
                            System.out.print("Which one to select ? ");
                            int selection = input.nextInt();

                            switch (selection) {
                                case 1:
                                    status = "Resigned";
                                    newDeliveryMan[i].setStatus(status);

                                    System.out.println(newDeliveryMan[i]);
                                    System.out.println("Current status is " + (newDeliveryMan[i]).getStatus());
                                    break;

                                case 2:
                                    status = "Retired";
                                    newDeliveryMan[i].setStatus(status);
                                    System.out.println(newDeliveryMan[i]);
                                    System.out.println("Current status is " + (newDeliveryMan[i]).getStatus());
                                    break;

                                case 3:
                                    status = "Terminated";
                                    newDeliveryMan[i].setStatus(status);
                                    System.out.println(newDeliveryMan[i]);
                                    System.out.println("Current status is " + (newDeliveryMan[i]).getStatus());
                                    break;

                                case 4:
                                    status = "Active";
                                    newDeliveryMan[i].setStatus(status);
                                    System.out.println(newDeliveryMan[i]);
                                    System.out.println("Current status is " + (newDeliveryMan[i]).getStatus());
                                    break;

                                default:
                                    System.out.println("You have entry a invalid number. Enter number [1 - 4]");
                                    break;

                            }

                        }

                        count++;

                    }

                }
            }
            // 
            if (count <= 1) {

                System.out.print("Staff is not existed\n");

            }

        } while (count <= 1);

    }
}
