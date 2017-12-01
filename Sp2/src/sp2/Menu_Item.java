package sp2;

public class Menu_Item {
    private String item;
    private double price;
    private String type;

    public Menu_Item() {
    }
     Menu_Item(String item,double price,String type){
         this.item=item;
         this.price=price;
         this.type=type;
     }

    
    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
   
    public String toString() {
        return "Menu_Item\nitem=" + item + "\nprice=" + price + "\ntype=" + type;
    }


}
