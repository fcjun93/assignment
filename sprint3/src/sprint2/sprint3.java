/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author fuchin
 */
public class sprint3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<deliveryman> dm = new ArrayList<>();
        
        
        deliveryman dm1=new deliveryman ("John","001",15,3.00);
        deliveryman dm2=new deliveryman ("Lee","023",39,7.00);
        deliveryman dm3=new deliveryman ("Stan","030",21,5.10);
        
         dm.add(dm1);
        dm.add(dm2);
        dm.add(dm3);
        
        List<deliveryman> tempdm = new ArrayList<>();

        for (int i = 0; i < dm.size(); i++) {
            tempdm.add(dm.get(i));
        }
        
        String name;
        
        do{
        System.out.println("Enter your name: ");
        name = sc.next();
        
        for (int i = 0; i < dm.size(); i++) {
               deliveryman check = dm.get(i);
                if (name.equals(check.getName())) {
                    System.out.println(""+check.toString());
                   
            }
                else 
                System.out.println("Invalid! Please enter your name again!");
                break;
            }
        
    }while (name!=null);
        
    
}}

