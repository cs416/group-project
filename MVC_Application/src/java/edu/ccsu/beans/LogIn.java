package edu.ccsu.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@ManagedBean
public class LogIn implements Serializable
{
    @Id
    @GeneratedValue
    private Integer id;
    public String customerID="";
    private String password="";   
      
    public LogIn()
    {
        
    }
    
    public String getCustomerID()
    {
        return customerID;
    }
    
    public void setCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
}
