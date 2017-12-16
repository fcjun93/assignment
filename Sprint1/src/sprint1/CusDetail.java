
package sprint1;


public class CusDetail {
    private String cusname;
    private String cusid;
    private String location;

    public CusDetail(String cusname, String cusid, String location) {
        this.cusname = cusname;
        this.cusid = cusid;
        this.location = location;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

     @Override
    public String toString() {
        return "\nCustomer name : "+cusname+
                "\nCustomer id : "+cusid+
                "\nLocation : "+location;
        
    }
}
