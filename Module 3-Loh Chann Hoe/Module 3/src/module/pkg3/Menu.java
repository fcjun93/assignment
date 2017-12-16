/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg3;

/**
 *
 * @author User
 */
public class Menu extends Restaurant {

    private int no;
    private String item;
    private String price;

    public Menu(String name, String ID, String telNo, String address, int no,
            String item, String price) {
        super(name, ID, telNo, address);
        this.no = no;
        this.item = item;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" + "no=" + no + ", item=" + item + ", price=" + price + '}';
    }
    

}
