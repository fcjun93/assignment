/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilewspart;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AgileWSpart {

    public static void main(String[] args) {
        List<Name> nameList = new ArrayList<>();
        List<clockTime> clockTimeList = new ArrayList<>();

        Name name1 = new Name("1001", "Tan Joo Huat");
        Name name2 = new Name("1002", "Hordan");
        Name name3 = new Name("1006", "John");

        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);

        String userID;

        Scanner scn = new Scanner(System.in);
        Date d = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        

        do {
            System.out.println("Date: " + date.format(d));
            boolean check = false;
            System.out.println("=================== Staff Time Clock ===================");
            System.out.println("Please insert your staffId(\"q\" for quit): ");
            userID = scn.next();
            
            //check if the userID is valid
            for (int i = 0; i < nameList.size(); i++) {
                Name checkId = nameList.get(i);
                

                if (checkId.getId().equals(userID)) {
                    check = true;
                }
            }
            //
//            clockTime ha = new clockTime("1006","1200","12/3/2017",true);
//            clockTime ha2 = new clockTime("1006","1500","12/3/2017",true);
//            clockTime ha3 = new clockTime("1006","1600","12/3/2017",true);
//            clockTimeList.add(ha);
//            clockTimeList.add(ha2);
//            clockTimeList.add(ha3);
            
            //if valid userID            
            if (check == true) {
                List<clockTime> checkClockTimeList = new ArrayList<>();
                
                // copy the userID all clock time to new array List
                for (int i = 0; i < clockTimeList.size(); i++) {
                    clockTime checkClock = clockTimeList.get(i);
                    if (checkClock.getId().equals(userID)) {
                        checkClockTimeList.add(checkClock);
                    }
                }
                //System.out.println(checkClockTimeList);
                
                clockTime clock,checkLast;
                if(!checkClockTimeList.isEmpty()){
                    
                    
                    int lastStatus = checkClockTimeList.size()-1;
                    checkLast = checkClockTimeList.get(lastStatus);
                    if(checkLast.isClockIn() == true){
                        clock = new clockTime(userID,time.format(d),date.format(d),false);
                    }
                    else{
                        clock = new clockTime(userID,time.format(d),date.format(d),true);
                    }
                    
                }
                else{
                    clock = new clockTime(userID,time.format(d),date.format(d),true);
                }

                clockTimeList.add(clock);
                int index = userID.charAt(3) - 1 - '0';

                System.out.println(nameList.get(index));
                System.out.println(clock);
                
                
                
            } else if (userID.equals("q")) {
                System.out.println("Thank You!!");
            } else {
                System.out.println("Cannot find the Id!!!");
            }
            System.out.println("");

        } while (!userID.equals("q"));

    }

}
