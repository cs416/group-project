package edu.ccsu.jpa;

import edu.ccsu.beans.Reservation;
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

public class ReservationSave 
{
    @PersistenceUnit(unitName = "HW3DBPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{reservation}")
    private Reservation reservation;
    public String saveInfo() 
    {
        String returnValue = "error";
        try {
            userTransaction.begin();
            EntityManager em = entityManagerFactory.createEntityManager();
            em.persist(reservation);
            userTransaction.commit();
            em.close();
            returnValue = "Confirmation";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation){
        this.reservation = reservation;
    }    
    
}
    
 
   
        