
package agile;
public class Order {
    private String restorantName;
    private int orderMade,complaint,month,year;

    public Order() {
    }

    public Order(String restorantName, int orderMade, int complaint, int month, int year) {
        this.restorantName = restorantName;
        this.orderMade = orderMade;
        this.complaint = complaint;
        this.month = month;
        this.year = year;
    }

    public String getRestorantName() {
        return restorantName;
    }

    public void setRestorantName(String restorantName) {
        this.restorantName = restorantName;
    }

    public int getOrderMade() {
        return orderMade;
    }

    public void setOrderMade(int orderMade) {
        this.orderMade = orderMade;
    }

    public int getComplaint() {
        return complaint;
    }

    public void setComplaint(int complaint) {
        this.complaint = complaint;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
