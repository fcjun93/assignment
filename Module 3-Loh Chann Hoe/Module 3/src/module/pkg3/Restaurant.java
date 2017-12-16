
package module.pkg3;


public class Restaurant{
   private String name;
   private String ID;
   private String telNo;
   private String address;

    public Restaurant(String name, String ID, String telNo, String address) {
        this.name = name;
        this.ID = ID;
        this.telNo = telNo;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
   
    public String toString(){
        return "\nname: " + this.name +
                "\nID: " + this.ID +
                "\ntelNo: " + this.getTelNo() +
                "\naddress" + this.address;   
    }
}
