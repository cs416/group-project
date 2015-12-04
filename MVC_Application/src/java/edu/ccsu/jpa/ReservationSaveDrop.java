package edu.ccsu.jpa;

import edu.ccsu.beans.ReservationDrop;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@ManagedBean
@Named
public class ReservationSaveDrop
{
    @PersistenceUnit(unitName = "FinalProjectPU")
    private EntityManagerFactory entityManagerFactory;
    @Resource
    private UserTransaction userTransaction;
    @ManagedProperty(value = "#{reservationDrop}")
    private ReservationDrop reservationDrop;
    
    public String saveInfo() 
    {
        String returnValue = "error";
        try {
            userTransaction.begin();
            EntityManager em = entityManagerFactory.createEntityManager();
            em.persist(reservationDrop);
            userTransaction.commit();
            em.close();
            returnValue = "ConfirmationDrop";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
    public ReservationDrop  getReservationDrop() {
        return reservationDrop;
    }
    public void setReservationDrop(ReservationDrop reservationDrop){
        this.reservationDrop = reservationDrop;
    }    
}
    
