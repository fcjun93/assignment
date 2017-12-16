
package sprint1;
import java.util.Scanner;
public class Sprint1 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
     CusDetail[] cusdetail = new CusDetail[3];
     cusdetail[0] = new CusDetail("Mary","232321","PV10");
     cusdetail[1] = new CusDetail("John","535323","PV15");
     cusdetail[2] = new CusDetail("Cindy","657651","PV21");
    
     Order[] order = new Order[4];
     order[0] = new Order("Nasi Lemak", 2, 13.90);
     order[1] = new Order("Mee Goreng XXL", 1, 10.90);
     order[2] = new Order("Milo Big Size", 2, 3.80);
     order[3] = new Order("Burger Sam", 3, 5.80);
     
     
     boolean login=false;
     System.out.println("Welcome to Fastest Deliveryman System");
     System.out.println("Select Option");
     System.out.println("1. View Customer Order 2. Assign task to delieveryman 3. Exit");
     int detect = sc.nextInt();
     if(detect == 1){
         login =true;
     }
     if (login == true){
     System.out.print("*********************************************************\n");
     System.out.println("*\t\t   Customer Order \t\t\t*");
     System.out.print("*********************************************************\n\n");
     System.out.print("*********************************************************");
           
            System.out.println(""+cusdetail[0]);
            System.out.println(""+order[0]+order[2]);
            System.out.println("*********************************************************");
            System.out.println("\t\t\t\tTotal Price: RM 17.70");
             System.out.println("*********************************************************");
       
            System.out.println(""+cusdetail[1]);
            System.out.println(""+order[1]);
           System.out.println("*********************************************************");
           System.out.println("\t\t\t\tTotal Price: RM 10.90");
            System.out.println("*********************************************************");
        
            System.out.println(""+cusdetail[2]); 
            System.out.println(""+order[3]+order[1]+order[2]+order[0]);
            System.out.println("*********************************************************");
            System.out.println("\t\t\t\tTotal Price: RM 34.40");
             System.out.println("*********************************************************");
     }
    
}}
