/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agile {

    private List<Affiliates> listData = new ArrayList<>();
    private List<DeliveryMan> listDM = new ArrayList<>();
    private List<Order> listOrder = new ArrayList<>();
    private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public Agile() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        do {
            selectMenu();
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    monthlyAffiliatesReport();
                    break;
                    
                case 2:
                    monthlyDeliveryManReport();
                    break;
                    
                case 3:
                    monthlyOrderReport();
                    break;

                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Please insert 0-3 only");
            }
        } while (selection != 0);

    }

    private void initialize() {
        listData.add(new Affiliates("I Love Kebab", "Setapak ", "Western", 8, 2017));
        listData.add(new Affiliates("Joe's Pizza", "Genting Klang", "Italian", 9, 2017));
        listData.add(new Affiliates("John's Dakgalbi", "WangsaMaju", "Arab", 9, 2017));
        listData.add(new Affiliates("My D'light Cafe", "WangsaMaju", "Western", 10, 2017));
        listData.add(new Affiliates("Restaurant TaPu", "Setapak ", "Chinese", 10, 2017));
        listData.add(new Affiliates("WingZone", "Melawati", "Korean", 10, 2017));
        
        listDM.add(new DeliveryMan("Alan Shearer",500,220,5,9,2017));
        listDM.add(new DeliveryMan("Alan Smith",585,215,5,9,2017));
        listDM.add(new DeliveryMan("Alex Hunter",520,225,0,9,2017));
        listDM.add(new DeliveryMan("Danny Williams",510,220,2,9,2017));
        listDM.add(new DeliveryMan("Gareth Walker",550,200,8,9,2017));
        listDM.add(new DeliveryMan("Wayne Rooney",540,230,1,9,2017));
        listDM.add(new DeliveryMan("Zlatan Ibrahimovic",570,250,6,9,2017));
        
        listDM.add(new DeliveryMan("Alan Shearer",705,225,3,10,2017));
        listDM.add(new DeliveryMan("Alan Smith",790,220,2,10,2017));
        listDM.add(new DeliveryMan("Alex Hunter",725,230,1,10,2017));
        listDM.add(new DeliveryMan("Danny Williams",715,225,2,10,2017));
        listDM.add(new DeliveryMan("Gareth Walker",755,205,6,10,2017));
        listDM.add(new DeliveryMan("Wayne Rooney",745,235,4,10,2017));
        listDM.add(new DeliveryMan("Zlatan Ibrahimovic",775,250,5,10,2017));
        
        listOrder.add(new Order("I Love Kebab",420,2,10,2017));
        listOrder.add(new Order("Joe's Pizza",450,6,10,2017));
        listOrder.add(new Order("John's Dakgalbi",410,3,10,2017));
        listOrder.add(new Order("My D'light Cafe",370,5,10,2017));
        listOrder.add(new Order("Restaurant TaPu",415,7,10,2017));
        listOrder.add(new Order("WingZone",387,4,10,2017));
        
        listOrder.add(new Order("I Love Kebab",485,5,11,2017));
        listOrder.add(new Order("Joe's Pizza",442,1,11,2017));
        listOrder.add(new Order("John's Dakgalbi",433,3,11,2017));
        listOrder.add(new Order("My D'light Cafe",388,2,11,2017));
        listOrder.add(new Order("Restaurant TaPu",450,4,11,2017));
        listOrder.add(new Order("WingZone",395,2,11,2017));
        
    }
    
    private void monthlyDeliveryManReport(){
        int year = 0;
        int month = 0;
        double cal = 0;
        String winner = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = scanner.nextInt();
        System.out.print("Enter Month : ");
        month = scanner.nextInt();
        System.out.println("\nMonthly Delivery Man Report");
        System.out.println("Year: " + year + " Month:" + months[month - 1]);
        System.out.println("=============================================================================");
        System.out.printf("%-30s%14s%19s%14s\n","Name","Delivery Made","Working Hours","Complaint");
        for(DeliveryMan dm : listDM){
            if(dm.getMonth()==month&&dm.getYear()==year){
                System.out.printf("%-30s%14.0f%19.0f%14.0f\n",dm.getName(),dm.getDeliveryMade(),dm.getTotalWorkingHour(),dm.getComplaint());
                double temp = ((dm.getDeliveryMade()-dm.getComplaint())/dm.getTotalWorkingHour());
                if(temp>cal){
                    cal = temp;
                    winner = dm.getName();
                }
            }
        }
        System.out.println("\nDelivery Man of the month: "+winner+" with a workrate of "+String.format("%.2f",cal)+" per hour.");
        System.out.println("Back To Menu.\n");
    }
    
    private void monthlyOrderReport(){
        int year = 0;
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = scanner.nextInt();
        System.out.print("Enter Month : ");
        month = scanner.nextInt();
        System.out.println("\nMonthly Order Report");
        System.out.println("Year: " + year + " Month:" + months[month - 1]);
        System.out.println("==========================================================");
        System.out.printf("%-30s%14s%14s\n","Name","Order Made","Complaint");
        for(Order order : listOrder){
            if(order.getMonth()==month&&order.getYear()==year){
                System.out.printf("%-30s%14d%14d\n",order.getRestorantName(),order.getOrderMade(),order.getComplaint());
            }
        }
        System.out.println("Back To Menu.\n");
    }

    private void monthlyAffiliatesReport() {
        int year = 0;
        int month = 0;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = scanner.nextInt();
        System.out.print("Enter Month : ");
        month = scanner.nextInt();
        System.out.println("\nMonthly New Affiliates Report");
        System.out.println("Year: " + year + " Month:" + months[month - 1]);
        System.out.println("===================================================================================");
        System.out.println("Name                    Location                Type of Cuisine         Date Joined");
        for (Affiliates affiliates : listData) {
            if (affiliates.getMonth() == month && affiliates.getYear() == year) {
                System.out.println(affiliates.getName() + "\t\t" + affiliates.getLocation() + "\t\t" + affiliates.getType() + "\t\t\t4 "+ months[affiliates.getMonth()-1] +" "+ affiliates.getYear());
                total++;
            }
        }
        System.out.println("\nTotal Affiliates Made This Month: "+total);
        System.out.println("Total Affiliates Made: "+listData.size());
        System.out.println("Back To Menu.\n");
    }

    private void selectMenu() {
        System.out.println("\nWelcome To Fastest DeliveryMan");
        System.out.println("******Generate Reports******");
        System.out.println("1. Monthly New Affiliates Report");
        System.out.println("2. Monthly Delivery Man Report");
        System.out.println("3. Monthly Order Report");
        System.out.println("0. Exit");
        System.out.print("Please enter the number to proceed:");
    }

    public static void main(String[] args) {
        new Agile();
    }
}
