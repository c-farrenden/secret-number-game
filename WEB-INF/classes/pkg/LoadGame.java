/* LoadGame.java
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
*/

package pkg;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/load")
public class LoadGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        // Get/set bean
        Bean bean = (Bean) session.getAttribute("bean");
        if(bean == null)
        {
            bean = new Bean();
            session.setAttribute("bean", bean);
        }
        // Get text file
        String file = this.getServletContext().getRealPath("/") + "saveFile.txt";
        File fileObject = new File(file);
        Scanner myReader = new Scanner(fileObject);
        // If there is nothing saved to the file, send the user to an error page
        if(myReader.hasNext() == false)
        {
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
            dispatcher.forward(request, response);
            return;
        }
        // Set data from text file
        bean.setSecretNum(myReader.nextInt());
        bean.setBankOffer(myReader.nextInt());
        bean.setSmallestNum(myReader.nextInt());
        bean.setRoundNum(myReader.nextInt());
        // Loop to add each int to list
        while (myReader.hasNext()) 
        {
            bean.getNumRevealed().add(myReader.nextInt());
        }
        // Clear data once loaded
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
        // Redirect
        response.sendRedirect("/c3374676_assignment2/main?success=true");
    }
}