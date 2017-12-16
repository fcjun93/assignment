/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcpartb;

/**
 *
 * @author hp
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class update2 {

    static Scanner input = new Scanner(System.in);
    static DeliveryMan newDeliveryMan = new DeliveryMan();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        newDeliveryMan = new DeliveryMan("Ali baba", "123456789012", 21, "123456789", "Baker street", "Part time", "Active");
        String checkz = "";
        String id;
        do {
            System.out.println("Search staff's IC ");
            System.out.println("==================");
            System.out.print("Please key in the staff IC to update: ");
             id = input.next();
            System.out.println(newDeliveryMan);
           
                System.out.print("Are you sure you want to make changes to this staff?(Y/N) :");
                int check = input.next().charAt(0);
                if (check == 'y' || check == 'Y') {
                    System.out.println("\f");

                    System.out.println("Update Staff's information");
                    System.out.println("==========================");
                    System.out.println("==========================");
                    System.out.println("1.Name.\n"
                            + "2.IC.\n"
                            + "3.Age.\n"
                            + "4.Contact number\n"
                            + "5.Address\n"
                            + "6.Type\n");

                    int selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            CharSequence inputStr;
                            Pattern pattern;
                            Matcher matcher;
                            String name;
                            do {

                                System.out.print("Enter new name      : ");
                                name = input.next();
                                inputStr = name;

                                pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
                                matcher = pattern.matcher(inputStr);
                                if (!matcher.matches()) {
                                    System.out.println("Invalid name\n");

                                }
                            } while (!matcher.matches());

                            newDeliveryMan.setName(name);
                            System.out.println("\nName is updated .");
                            System.out.println(newDeliveryMan);
                            break;
                        case 2:

                            boolean icVerify;
                            String IC;
                            do {
                                icVerify = true;
                                System.out.print("\nEnter new IC (no hyphen): ");
                                IC = input.nextLine();
                                for (int i = 0; i < IC.length(); i++) {
                                    if (Character.isDigit(IC.charAt(i)) == false) {
                                        icVerify = false;
                                    }
                                }

                                if (icVerify == false) {
                                    System.out.println("Invalid IC entered!  Please enter digits only.");
                                } else if (IC.length() != 12) {
                                    System.out.println("Invalid IC entered! PLease enter 12 digits.");
                                    icVerify = false;
                                } else {
                                    newDeliveryMan.setIC(IC);
                                    System.out.println("IC is updated");
                                    System.out.println(newDeliveryMan);

                                }
                            } while (icVerify == false);

                            break;

                        case 3:
                            System.out.println("Enter the new age");
                            int age = input.nextInt();
                            newDeliveryMan.setAge(age);
                            System.out.println("\nAge is updated .");
                            System.out.println(newDeliveryMan);

                            break;
                        case 4:
                            System.out.println("Enter the new contact number");
                            String contact = input.next();
                            System.out.println("\nContact number is updated .");
                            newDeliveryMan.setContact(contact);
                            System.out.println(newDeliveryMan);

                            break;
                        case 5:
                            System.out.println("Enter the new address");
                            String address = input.next();
                            System.out.println("\nAddress is updated .");
                            newDeliveryMan.setAddress(address);
                            System.out.println(newDeliveryMan);
                            break;
                        case 6:
                            int check1;
                            String type;
                            do {
                                System.out.println("\n 1)Full time\n 2)Part Time");
                                System.out.print("\nSelect the type     : ");
                                check1 = input.nextInt();
                                if (check1 != 1 && check1 != 2) {
                                    System.out.print("Please only choose between 1 or 2.");
                                } else if (check1 == 1) {
                                    type = "Full time";
                                    newDeliveryMan.setType(type);
                                    System.out.println(newDeliveryMan);
                                } else {
                                    type = "Part time";
                                    newDeliveryMan.setType(type);
                                    System.out.println(newDeliveryMan);
                                }
                            } while (check1 != 1 && check1 != 2);

                            break;
                        default:
                            System.out.println("You have entry a invalid number. Enter number [1 - 6]");
                            break;
                    }
//case end

                    System.out.print("Continue?(Y/N)");
                    checkz = input.nextLine();

                }
                checkz = input.nextLine();
            
//            } else {
//                System.out.println("Staff no existed");

            
        } while (checkz.equals("y"));
    }
}
