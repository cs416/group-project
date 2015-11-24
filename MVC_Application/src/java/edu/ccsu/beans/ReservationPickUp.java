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
@ManagedBean(name = "reservationPickUp")
public class ReservationPickUp implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String airport = "JFK";
    private int rDay;
    private int rMonth;
    private int rYear;
    private int rHour;
    private int rMinute;
    private String ampm;
    
    public ReservationPickUp() {
        /*Left empty.*/
    }
    
    /*SETTERS*/
    public void setFirstName(String s){
        this.firstName = s;
    }
    
    public void setLastName(String s){
        this.lastName = s;
    }
    
    public void setEmail(String s){
        this.email = s;
    }
    public void setAirport(String s) {
        this.airport = s;
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
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getEmail(){
        return email;
    }
    public String getAirport() {
        return airport;
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
