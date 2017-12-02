/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcpartb;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author hp
 */
public class JcPartB {

    static Scanner input = new Scanner(System.in);
    static DeliveryMan newDeliveryMan = new DeliveryMan();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cont="y";

        do {
            createNewDeliveryMan();

          System.out.println(newDeliveryMan);
            System.out.print("Continue?(Y/N)");
            cont = input.nextLine();
        } while (cont.equals("y"));

    }
    //do tittle
    // ic validation
    //do automate calculate date to age

    public static void createNewDeliveryMan() {
        String name;
        String type = "";
        String sel;
        String IC;
        String status="Active";
        CharSequence inputStr;
        Pattern pattern;
        Matcher matcher;
        System.out.println("New Deliveryman Registration\n");
//        

        do {
           


       

    

            System.out.print("Enter new name      : ");
            name = input.nextLine();
            inputStr = name;

            pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
            matcher = pattern.matcher(inputStr);
            if (!matcher.matches()) {
                System.out.println("Invalid name\n");

            }
        } while (!matcher.matches());

        boolean icVerify;
        do {
            icVerify = true;
            System.out.print("\nEnter IC (no hyphen): ");
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
            }
        } while (icVerify == false);

        int age = 0;
        
        do {
            //s
            
            try{
             System.out.println("\nPlease enter date of birth in YYYY-MM-DD: ");
             String date = input.nextLine();

             LocalDate dob = LocalDate.parse(date);

//            System.out.println("Age is:" + getAge(dob));    
//            System.out.print("\nEnter age           : ");
//            age = input.nextInt();
//            input.nextLine();
              age=getAge(dob);
            if (getAge(dob) < 17 || getAge(dob) > 60) {
                System.out.println("Please enter again! The age must be between 18 and 60");

            }
            
            }  catch(Exception ex){
                 System.out.println("Invalid format. Please enter again!");

                    }
            //s
        } while ((age < 17 || age > 60));

        do {
            System.out.println("\n 1)Full time\n 2)Part Time");
            System.out.print("\nSelect the type     : ");
            sel = input.next();
            if (sel.equals("1")) {
                type = "Full time";
            } else if (sel.equals("2")) {
                type = "Part time";
            } else {
                type = "Invalid input";
                System.out.println("Invalid input");
            }
        } while (type.equals("Invalid input"));
        newDeliveryMan = new DeliveryMan(name, IC, age, type,status);

//        Writer writer = null;
//        try {
//            writer = new BufferedWriter(new OutputStreamWriter(
//                    new FileOutputStream("DeliveryMan.txt"), "utf-8"));
//            writer.write("\nName: " + name + "\nIC  : " + IC + "\nAge : " + age + "\nType: " + type);
//        } catch (IOException ex) {
//            // report
//        } finally {
//            try {
//                writer.close();
//            } catch (Exception ex) {/*ignore*/
//            }
//        }
        System.out.println("\nThe new Deliveryman is added .");

    }

    // Returns age given the date of birth
    public static int getAge(LocalDate dob) {

        LocalDate curDate = LocalDate.now();

        return Period.between(dob, curDate).getYears();

    }

}
