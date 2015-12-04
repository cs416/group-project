package edu.ccsu.jpa;
import edu.ccsu.beans.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@ManagedBean

public class CustomerSave 
{
    @PersistenceUnit(unitName = "FinalProjectPU")
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
    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }    
    
    public List getMatchingName() {
        List<Customer> customers = new ArrayList();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String selectSQL = "select c from Customer c where c.firstName like :firstName and c.lastName like :lastName";
        try {
            Query selectQuery = entityManager.createQuery(selectSQL);
            selectQuery.setParameter("firstName", customer.getFirstName() + "%");
            selectQuery.setParameter("lastName", customer.getLastName() + "%");
            customers = selectQuery.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }  
    
   }
    
 
   
        
        