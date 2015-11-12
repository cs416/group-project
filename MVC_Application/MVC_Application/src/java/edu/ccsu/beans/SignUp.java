package edu.ccsu.beans;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Ems
 */
@Entity
public class SignUp implements Serializable
{
    @Id
    @GeneratedValue
    private Integer id;
    private String customerID;
    private String password;   
      
    public SignUp()
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
