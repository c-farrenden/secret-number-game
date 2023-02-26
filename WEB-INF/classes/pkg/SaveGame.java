/* SaveGame.java
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

@WebServlet(urlPatterns = "/save")
public class SaveGame extends HttpServlet {
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
        // Clear previous data
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
        // Write new data to text file for saving
        FileWriter filewriter = new FileWriter(file, true);
        filewriter.write(bean.getSecretNum() + "\n");
        filewriter.write(bean.getBankOffer() + "\n");
        filewriter.write(bean.getSmallestNum() + "\n");
        filewriter.write(bean.getRoundNum() + "\n");
        for(int i = 0; i < bean.getNumRevealed().size(); i++)
        {
            filewriter.write(bean.getNumRevealed().get(i) + "\n");
        }
        filewriter.flush();
        filewriter.close();
        // Redirect
        response.sendRedirect("/c3374676_assignment2/Index.jsp?success=true");
    }
}