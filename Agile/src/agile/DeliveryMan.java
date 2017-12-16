
package agile;
public class DeliveryMan {
    private String name;
    private int month,year;
    private double deliveryMade,totalWorkingHour,complaint;

    public DeliveryMan() {
    }

    public DeliveryMan(String name, double deliveryMade, double totalWorkingHour, double complaint, int month, int year) {
        this.name = name;
        this.deliveryMade = deliveryMade;
        this.totalWorkingHour = totalWorkingHour;
        this.complaint = complaint;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeliveryMade() {
        return deliveryMade;
    }

    public void setDeliveryMade(double deliveryMade) {
        this.deliveryMade = deliveryMade;
    }

    public double getTotalWorkingHour() {
        return totalWorkingHour;
    }

    public void setTotalWorkingHour(double totalWorkingHour) {
        this.totalWorkingHour = totalWorkingHour;
    }

    public double getComplaint() {
        return complaint;
    }

    public void setComplaint(double complaint) {
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
