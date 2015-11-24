package edu.ccsu.jpa;

import edu.ccsu.beans.ReservationPickUp;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean
@Named
public class ReservationSavePickUp 
{
    @PersistenceUnit(unitName = "HW3DBPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{reservationPickUp}")
    private ReservationPickUp reservationPickUp;
    public String saveInfo() 
    {
        String returnValue = "error";
        try {
            userTransaction.begin();
            EntityManager em = entityManagerFactory.createEntityManager();
            em.persist(reservationPickUp);
            userTransaction.commit();
            em.close();
            returnValue = "ConfirmationPickUp";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
    public ReservationPickUp getReservationPickUp() {
        return reservationPickUp;
    }
    public void setReservationPickUp(ReservationPickUp reservationPickUp){
        this.reservationPickUp = reservationPickUp;
    }    
}
    
