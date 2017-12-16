package agilewspart;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class trackTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String id;
        boolean check = false;
        double hour, mins;
        double time;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("================= Track order remaining time =================");
            do{
                System.out.println("Please enter your order id: ");
                id = scn.next();
                if(id.equals("1003")){
                    System.out.println("Invalid ID!!!");
                }
            }while(id.equals("1003"));
            
            System.out.println("Enter the distance(km)");
            double distance = scn.nextDouble();
            System.out.println("Enter the speed(km/h)");
            double speed = scn.nextDouble();
            time = distance / speed;
            do {
                System.out.println("Please enter your traffic status");
                System.out.println("1. Heavy");
                System.out.println("2. Normal");
                System.out.println("3. Smooth");
                String option = scn.next();

                switch (option) {
                    case "1":
                        time*=1.5;
                        check = true;
                        break;
                    case "2":
                        time*=1.25;
                        check=true;
                        break;
                    case "3":
                        check = true;
                        break;
                    default:
                        System.out.println("Invalid input!!!");
                        break;
                }
                
            } while (check == false);

            if (time < 1) {
                mins = time * 60;
                System.out.println("Your order will be arrive in " + Math.ceil(mins) + " minutes");
            
            }
            
            else {
                mins = time % 1;
                hour = time - mins;
                mins *= 60;
                System.out.println("Your order will be arrive in " + hour + " hours " + Math.ceil(mins) + " minutes");
            }

        } while (!id.equals("q"));

    }
    

}
