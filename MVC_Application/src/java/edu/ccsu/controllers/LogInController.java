package edu.ccsu.controller;

import edu.ccsu.beans.LogIn;
import edu.ccsu.beans.SignUp;
import edu.ccsu.beans.LogIn;
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

/**
 *
 * @author cw1491
 */
@ManagedBean
public class LogInController 
{

    @PersistenceUnit(unitName = "FinalProjectPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{signUp}")
    private SignUp signUp;
    @ManagedProperty(value = "#{logIn}")
    private LogIn logIn;
    
    public String getMatchingIDPS() 
    { 
        String targetpage="Navigation01";
        List<SignUp> customers = new ArrayList();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String selectSQL = "select s from SignUp s where s.customerID like :customerID";
        try {
            Query selectQuery = entityManager.createQuery(selectSQL);
            selectQuery.setParameter("customerID", signUp.getCustomerID()+ "%");
            customers = selectQuery.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (customers.contains(logIn.customerID))
        
        return targetpage;
        return targetpage;
        
    }
    public SignUp getSignUp() {
        return signUp;
    }

    public void setSignUp(SignUp signUp) {
        this.signUp = signUp;
    }
    
    public LogIn getLogIn()
    {
        return logIn;
    }  
    
    public void setLogIn(LogIn logIn)
    {
        this.logIn = logIn;
    }
}
  