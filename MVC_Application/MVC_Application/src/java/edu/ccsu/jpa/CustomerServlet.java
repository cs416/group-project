
package edu.ccsu.jpa;

import edu.ccsu.beans.Customer;
import edu.ccsu.beans.SignUp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/CustomerServlet"})
public class CustomerServlet extends HttpServlet 
{
    @PersistenceUnit(unitName = "HW3DBPU")
    private EntityManagerFactory entityManagerFactory;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException 
    {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Address Register</title>");      
      out.println("</head>");
      out.println("<body>");
      String first = request.getParameter("firstName");
      String last = request.getParameter("lastName");
      String street = request.getParameter("street");
      String city = request.getParameter("city");
      String state = request.getParameter("usState");
      String zipcode = request.getParameter("zipcode");
      String phone = request.getParameter("phone");
      String email = request.getParameter("email");
      
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
      Customer customer = new Customer();
      customer.setFirstName(first);
      customer.setLastName(last);
      customer.setStreet(street);
      customer.setCity(city);
      customer.setState(state);
      customer.setZipcode(zipcode);
      customer.setPhone(phone);
      customer.setEmail(email);
      entityManager.persist(customer);
      entityManager.getTransaction().commit();
      out.println(customer.getFirstName() + " " + "Welcome to our website!");
      out.println("</body>");
      out.println("</html>");
      
    }catch(Exception e)
    {
      out.println(e.getMessage());
    } finally {      
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
