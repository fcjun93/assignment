package module.pkg3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Module3 {

    private static ListWithIteratorInterface<Order> currentOrder;

    private static String item;
    private static double price;
    private static double quantityPrice;

    private double totalPrice = 0.00;

    public static <T> void displayList(ListWithIteratorInterface<T> aList) {
        Iterator<T> iterator = aList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }

    public static void main(String[] args) {

        System.out.println("");

        Restaurant restaurant1 = new Restaurant("Indocafe", "1001", "011234518", "Jalan KL");
        Restaurant restaurant2 = new Restaurant("Supercafe", "1002", "011234518", "Jalan KL");
        Restaurant restaurant3 = new Restaurant("Ayamcafe", "1003", "011234518", "Jalan KL");
        currentOrder = new LListWithIterator<>();
        boolean continueOrder = false;
        do {
            System.out.println("\nPlease select a restaurant\n");
            System.out.println("1: " + restaurant1.getName());
            System.out.println("2: " + restaurant2.getName());
            System.out.println("3: " + restaurant3.getName());
            System.out.println("Q: Quit");

            Scanner scn = new Scanner(System.in);
            System.out.print("Selection: ");
            int selection = scn.next().charAt(0);

            do {
                System.out.println("");
                switch (selection) {

                    case '1':
                        System.out.println("\nIndocafe Menu");
                        System.out.println("=============================================");
                        System.out.println(rightPadding("No. ", 5) + rightPadding("Item", 30)
                                + priceJustified("Price", 10));
                        System.out.println(rightPadding("1. ", 5) + rightPadding("Fried Chicken", 30)
                                + priceJustified("3.00", 10));
                        System.out.println(rightPadding("2. ", 5) + rightPadding("Nugget", 30)
                                + priceJustified("0.50", 10));
                        System.out.println(rightPadding("3. ", 5) + rightPadding("Ice Cream", 30)
                                + priceJustified("1.00", 10));
                        selection = '1';
                        continueOrder = true;
                        break;

                    case '2':
                        System.out.println("\nSupercafe Menu");
                        System.out.println("=============================================");
                        System.out.println(rightPadding("No. ", 5) + rightPadding("Item", 30)
                                + priceJustified("Price", 10));
                        System.out.println(rightPadding("1. ", 5) + rightPadding("T-bone Steak", 30)
                                + priceJustified("35.00", 10));
                        System.out.println(rightPadding("2. ", 5) + rightPadding("Atlantic Lobster", 30)
                                + priceJustified("70.00", 10));
                        System.out.println(rightPadding("3. ", 5) + rightPadding("Seafood Platter", 30)
                                + priceJustified("200.00", 10));
                        selection = '2';
                        continueOrder = true;
                        break;

                    case '3':
                        System.out.println("\nAyamcafe Menu");
                        System.out.println("=============================================");
                        System.out.println(rightPadding("No. ", 5) + rightPadding("Item", 30)
                                + priceJustified("Price", 10));
                        System.out.println(rightPadding("1. ", 5) + rightPadding("Super Ayam Set 1", 30)
                                + priceJustified("35.00", 10));
                        System.out.println(rightPadding("2. ", 5) + rightPadding("Super Ayam Set 2", 30)
                                + priceJustified("70.00", 10));
                        System.out.println(rightPadding("3. ", 5) + rightPadding("Ultimate Ayam Set", 30)
                                + priceJustified("200.00", 10));
                        selection = '3';
                        continueOrder = true;
                        break;

                    case 'Q':
                        System.exit(0);
                    case 'q':
                        System.exit(0);

                    default:
                        System.out.println("Invalid selection! Please try again.");
                        continueOrder = false;
                        break;

                }
                int i = 0;

                if (continueOrder == true) {
                    i++;
                    System.out.print("\nSelect an item: ");
                    int menuSelection = scn.nextInt();
                    System.out.print("Select quantity: ");
                    int quantity = scn.nextInt();

                    System.out.println("Added " + quantity + " Item" + menuSelection + " into the cart.");
                    // List orderList = new ArrayList(); 
                    //orderList.add(i,"" + menuSelection + quantity);

                    //System.out.println(selection);
                    //System.out.println(menuSelection);
                    if (selection == '1' && menuSelection == 1) {
                        item = "Fried Chicken";
                        price = 3.00;

                    } else if (selection == '1' && menuSelection == 2) {
                        item = "Nugget";
                        price = 0.50;

                    } else if (selection == '1' && menuSelection == 3) {
                        item = "Ice-cream";
                        price = 1.00;

                    } else if (selection == '2' && menuSelection == 1) {
                        item = "T-bone Steak";
                        price = 35.00;

                    } else if (selection == '2' && menuSelection == 2) {
                        item = "Atlantic Lobster";
                        price = 70.00;

                    } else if (selection == '2' && menuSelection == 3) {
                        item = "Seafood Platter";
                        price = 200.00;

                    } else if (selection == '3' && menuSelection == 1) {
                        item = "Super Ayam Set 1";
                        price = 35.00;

                    } else if (selection == '3' && menuSelection == 2) {
                        item = "Super Ayam Set 2";
                        price = 70.00;

                    } else if (selection == '3' && menuSelection == 3) {
                        item = "Ultimate Ayam Set";
                        price = 200.00;

                    } else {
                        price = 0.00;
                    }

                    quantityPrice = quantity * price;

                    BigDecimal result;
                    result = round((float) quantityPrice, 2);
                    
                    BigDecimal unitPrice;
                    unitPrice = round((float) price, 2);

                    System.out.println("\nYour order");
                    System.out.println("============================================================================");
                    System.out.println(rightPadding("No. ", 15) + rightPadding("Item", 18)
                            + priceJustified("Unit Price (RM)", 15)
                            + priceJustified("Quantity", 12)
                            + priceJustified("Price (RM)", 15));
                    currentOrder.add(new Order(item, unitPrice, quantity, result));
                    displayList(currentOrder);
                    System.out.println("");

                    boolean checkout;
                    do {

                        checkout = true;
                        System.out.println("Continue order or check out?");
                        System.out.println("1: Continue     2: Check out");
                        int option = scn.nextInt();
                        if (option == 1) {
                            continueOrder = true;
                        } else if (option == 2) {
                            System.out.println("Your order will be delivered shortly. Thank you for choosing Fastest Deliveryman. ");
                            continueOrder = false;
                            System.exit(0);
                            break;
                        } else {
                            System.out.println("Invalid input! Please try again.");
                            checkout = false;
                        }
                    } while (checkout == false);
                }

            } while (continueOrder == true);
        } while (continueOrder == false);
    }

    public static String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }

    public static String priceJustified(String str, int num) {
        return String.format("%" + num + "s", str);
    }
}
