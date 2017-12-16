
package sprint1;


public class Order {
    private String orderitem;
    private int quantity;
    private double price;
   
    public Order(String orderitem, int quantity, double totalprice) {
        this.orderitem = orderitem;
        this.quantity = quantity;
        this.price = totalprice;
    }

    public String getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(String orderitem) {
        this.orderitem = orderitem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getprice() {
        return price;
    }

    
    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return 
                 "\n\t"+ orderitem + "\t\t"
                + quantity + "\t\t" + price;
    }
   
}
