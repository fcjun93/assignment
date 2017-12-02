/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint2;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author fuchin
 */
public class setdetail<T> implements setinterface<T> {
    private String no;
    private String orderid;
    private String restaurant;
    private String dname;
    private boolean check;
 private T[] array;
    private int size;
    private final static int MAX_SIZE = 100;

    public setdetail() {
        array = (T[]) new Object[MAX_SIZE];
    }


    public setdetail( String orderid, String restaurant, String dname) {
        
        this.orderid = orderid;
        this.restaurant = restaurant;
        this.dname = dname;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    @Override
    public boolean add(T newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(T anElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ID: "+ orderid +
                "\nRestaurant: "+ restaurant+
                "\nDelivery Man: "+ dname+"\n";
    }
    
    
}
