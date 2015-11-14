package edu.ccsu.jpa;
import edu.ccsu.beans.Customer;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean
public class CustomerSave 
{
    @PersistenceUnit(unitName = "HW3DBPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{customer}")
    private Customer customer;
    
    public String saveInfo() 
    {
        String returnValue = "error";
        try {
            userTransaction.begin();
            EntityManager em = entityManagerFactory.createEntityManager();
            em.persist(customer);
            userTransaction.commit();
            em.close();
            returnValue = "RegisterSave";
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return returnValue;
    }
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer=customer;
    }
  }
