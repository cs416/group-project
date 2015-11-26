package edu.ccsu.jpa;

import edu.ccsu.beans.SignUp;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean
public class SignUpSave
{
    
    @PersistenceUnit(unitName = "FinalProjectDBPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{signUp}")
    private SignUp signUp;

    public String saveInfo() {
        String returnValue = "error";
        try {
            userTransaction.begin();
            EntityManager em = entityManagerFactory.createEntityManager();
            em.persist(signUp);
            userTransaction.commit();
            em.close();
            returnValue = "RegisterCustomer";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
    
    public SignUp getSignUp()
    {
        return signUp;
    }
    
    public void setSignUp(SignUp signUp)
    {
        this.signUp=signUp;
    }
}

