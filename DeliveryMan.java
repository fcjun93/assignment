/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcpartb;

/**
 *
 * @author hp
 */
public class DeliveryMan {

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
  private String name;
  private String IC;
  private int age;
  private String type; 
  private String status="Active";

  public DeliveryMan(){
  
  }


    DeliveryMan(String name, String IC, int age, String type, String status) {
        this.name=name;
        this.IC=IC;
        this.age=age;
        this.type=type;
        this.status=status;
    }

//    DeliveryMan(String name, String IC, int age, String type) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

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
     * @return the IC
     */
    public String getIC() {
        return IC;
    }

    /**
     * @param IC the IC to set
     */
    public void setIC(String IC) {
        this.IC = IC;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
  
    public String toString(){
     return "\nName: " + name + "\nIC  : " + IC + "\nAge : " + age +"\nType: " + type;
    }
}
