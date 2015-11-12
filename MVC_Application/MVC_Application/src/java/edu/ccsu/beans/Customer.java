package edu.ccsu.beans;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customer")
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
    private String usState;
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
        return usState;
    }

    public void setState(String usState) 
    {
        this.usState = usState;
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
