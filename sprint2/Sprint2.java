package sprint2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sprint2 {

    public static void main(String[] args) {
        List<setdetail> detail = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean login = false;

        setdetail detail1 = new setdetail("001", "Domino", " ");
        setdetail detail2 = new setdetail("002", "PizzaHut", " ");
        setdetail detail3 = new setdetail("003", "McDonarld", " ");

        detail.add(detail1);
        detail.add(detail2);
        detail.add(detail3);

        List<setdetail> tempDetail = new ArrayList<>();

        for (int i = 0; i < detail.size(); i++) {
            tempDetail.add(detail.get(i));
        }
        
        int num;
        String x;

        do {
            for (int i=0; i<tempDetail.size();i++){
            System.out.println("No."+(i+1)+"\n"+tempDetail.get(i));
            }
            System.out.println("Select a no. (enter 0 for show overview): ");
            num = sc.nextInt();
            if (num != 0) {
            setdetail checkid = tempDetail.get(num - 1);

            System.out.println("enter deliveryman name : ");
            x = sc.next();
                System.out.println("");
            for (int i = 0; i < detail.size(); i++) {
                setdetail check = detail.get(i);
                if (checkid.getOrderid().equals(check.getOrderid())) {
                    check.setDname(x);
                    detail.set(i, check);
                }
            }

            
                tempDetail.remove(num - 1);
            }
            //System.out.println("Welcome to Fastest Deliveryman System");
        } while (num != 0);
        System.out.println("\n\n");
        for (int i = 0; i < detail.size(); i++) {
        System.out.println("No."+(i+1)+"\n"+detail.get(i));
        }

//     System.out.println("Assign task to delieveryman ");
//     System.out.println("\n*********************************************************\n");
//         for (int i=001;i<006;i++){
//         System.out.println("ORDER No: "+"00"+i);
//         System.out.print("Deliveryman name : ");
//         
//         String deliveryman=sc.nextLine();
//        System.out.println("\n*********************************************************\n");
//         }
    }

}
