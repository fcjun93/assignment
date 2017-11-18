/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class Agile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int selection = 0;
        do {
            selectMenu();
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    monthlyAffiliatesReport();
                    break;

                case 0:
                    exit(0);
            }
        } while (selection > 0 && selection < 2);
    }
    private static void monthlyAffiliatesReport(){
        int year =0;
        int month =0;
        int selection =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Month : ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Monthly Affiliates Report");
        System.out.println("Year: "+year+" Month: August");
        System.out.println("====================================================");
        System.out.println("Name                  Location       Type of Cuisine");
        System.out.println("I Love Kebab          Setapak        Arab");
        System.out.println("My D'light Cafe       WangsaMaju     Western");
        System.out.println("Restaurant Tau Long   Setapak        Chinese");
        System.out.println("John Dakgalbi         Setapak        Korean");
        System.out.println("====================================================");
        System.out.println("Total Affiliates Made This Month: 4");
        System.out.println("Total Affiliates Made: 39");
        System.out.println("You are not required to make more affiliates.");
        do {
            System.out.println("Press '1' for back to menu, Press '0' to exit.");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    selectMenu();
                    break;

                case 0:
                    exit(0);
            }
        } while (selection > 0 && selection < 2);
        
    }
   
     private static void selectMenu() {
        System.out.println("\nWelcome To Fastest DeliveryMan");
        System.out.println("******Generate Reports******");
        System.out.println("1. Monthly Affiliates Report");
        System.out.println("2. Back");
        System.out.println("0. Exit");
        System.out.print("Please enter the number to proceed:");
    }
    
}
