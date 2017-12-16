/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint2;

/**
 *
 * @author fuchin
 */
public class deliveryman<T> {
    private String name;
    private String orderid;
    private int minute;
    private double cost;
  private boolean check;
  

    public deliveryman() {
    }

    public deliveryman(String name, String orderid, int minute, double cost) {
        this.name = name;
        this.orderid = orderid;
        this.minute = minute;
        this.cost = cost;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\nDelivery man name: "+name+
                "\nOrder ID: "+orderid+
                "\nTime (minute): "+minute+
                "\nCost traveling: "+cost;
    }
    
}
