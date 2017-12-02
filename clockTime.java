/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilewspart;

/**
 *
 * @author User
 */
public class clockTime {

    private String id, time, date;
    private boolean clockIn;

    public clockTime(String id, String time, String date,boolean clockIn) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.clockIn=clockIn;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isClockIn() {
        return clockIn;
    }

    public void setClockIn(boolean clockIn) {
        this.clockIn = clockIn;
    }
    

    @Override
    public String toString() {

        if (clockIn == true) {
            return "Clock In Time: " + time
                    + "\nClock In Date: " + date;
        } else {
            return "Clock Out Time: " + time
                    + "\nClock Out Date: " + date;
        }

    }

}
