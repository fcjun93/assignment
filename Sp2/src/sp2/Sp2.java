package sp2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sp2 {

    // public static int count = 0;
    public static String[] items = {"NASI LEMAK", "COCACOLA", "NUGGET", "NUTRILITE", "100PLUS", "FISH AND CHIPS"};
    public static String item;
    public static String type;
    public static Double price;
    //public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String cont;

        System.out.println("Elaine Cafe House");
        do {
            Scanner input = new Scanner(System.in);
            AddNewItem();
            System.out.println("");
            System.out.println("Continue?(Y/N)");
            cont = input.nextLine();

        } while (cont.equals("y")||cont.equals("Y"));

    }

    public static void AddNewItem() {
        Scanner input = new Scanner(System.in);
        DecimalFormat decim = new DecimalFormat("0.00");

        System.out.print("\nMenu Item : ");
        item = input.nextLine();
        item = item.toUpperCase();
        System.out.print("Item Type : ");
        type = input.nextLine();
        type = type.toUpperCase();
        System.out.print("Unit Price: RM ");
        price = input.nextDouble();
        price = Double.parseDouble(decim.format(price));

        if (item.equals(items[0])
                || item.equals(items[1])
                || item.equals(items[2])
                || item.equals(items[3])
                || item.equals(items[4])
                || item.equals(items[5])) {
            System.out.println("Duplicate menu item.");

        } else {
            if (price <= 0) {
                System.out.println("Please input the valid unit price.");
            } else {

                if (type.equals("DRINK") || type.equals("FOOD")) {
                    System.out.println("\nItem Added Successfully!");
                    System.out.println("==========================");
                    System.out.println("Menu Item : " + item);
                    System.out.println("Item Type : " + type);
                    System.out.println("Unit Price: RM " + decim.format(price));

                } else {
                    System.out.println("Item type must be DRINK OR FOOD");
                }
            }
        }
    }

}
