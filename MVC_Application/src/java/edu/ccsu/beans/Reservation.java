/* ReservationBean.java                 @author(Cameron)           */
/* All data for a users registration from product select page.     */
package edu.ccsu.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@SessionScoped
@ManagedBean(name = "reservation")
public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String airport = "JFK";
    private String dropPick = "Dropped off"; /*References airport.*/
    private int rDay;
    private int rMonth;
    private int rYear;
    private int rHour;
    private int rMinute;
    private String ampm;
    
    public Reservation() {
        /*Left empty.*/
    }
    
    /*SETTERS*/
    public void setAirport(String s) {
        this.airport = s;
    }    
    public void setDropPick(String s) {
        this.dropPick = s;
    }    
    public void setrDay(int i) {
        this.rDay = i;
    }    
    public void setrMonth(int i) {
        this.rMonth = i;
    }
    public void setrYear(int i) {
        this.rYear = i;
    }
    public void setrHour(int i) {
        this.rHour = i;
    }
    public void setrMinute(int i) {
        this.rMinute = i;
    }    
    public void setAmpm(String s) {
        this.ampm = s;
    }
    
    /*GETTERS*/
    public String getAirport() {
        return airport;
    }
    public String getDropPick() {
        return dropPick;
    }
    public int getrDay() {
        return rDay;
    }
    public int getrMonth() {
        return rMonth;
    }
    public int getrYear() {
        return rYear;
    }
    public int getrHour() {
        return rHour;
    }
    public int getrMinute() {
        return rMinute;
    }
    public String getAmpm() {
        return ampm;
    }
}