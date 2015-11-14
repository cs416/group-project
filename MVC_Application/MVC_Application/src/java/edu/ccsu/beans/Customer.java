package edu.ccsu.beans;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import edu.ccsu.validators.State;

@Entity
@ManagedBean 
public class Customer implements Serializable 
{
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String zipcode;
    @Size (min=2)
    private String usstate;
    private String phone;
    private String email;
       
    public void Address() 
    {
        
    }
    
    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer Id) 
    {
        this.id = Id;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getStreet() 
    {
        return street;
    }

    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getUsstate() 
    {
        return usstate;
    }

    public void setUsstate(String usstate) 
    {
        this.usstate = usstate;
    }
    
    public String getZipcode() 
    {
        return zipcode;
    }

    public void setZipcode(String zipcode) 
    {
        this.zipcode = zipcode;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }
}
