/* MainServlet.java
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

@WebServlet(urlPatterns = "/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException {
        HttpSession session = request.getSession();
        // Redirect
        response.sendRedirect("/c3374676_assignment2/Main.jsp?success=true");
    }
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
        // Check if num is not null
        if(request.getParameter("num") != null)
        {
            int num = Integer.parseInt(request.getParameter("num"));
            // Check if numbers entered are between 1 and 11
            if(num < 1 || num > 11)
            {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                dispatcher.forward(request, response);
                return;
            }
            // Loop through list and check if num is equal to a number already added to the list (number already revealed)
            for(int x = 0; x < bean.getNumRevealed().size(); x++)
            {
                if(num == bean.getNumRevealed().get(x))
                {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            // Add number to list of numbers revealed
            bean.getNumRevealed().add(num);
        }
        // Check if num2 is not null
        if(request.getParameter("num2") != null)
        {
            int num2 = Integer.parseInt(request.getParameter("num2"));
            // Check if numbers entered are between 1 and 11
            if(num2 < 1 || num2 > 11)
            {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                dispatcher.forward(request, response);
                return;
            }
            // Loop through list and check if num is equal to a number already added to the list (number already revealed)
            for(int x = 0; x < bean.getNumRevealed().size(); x++)
            {
                if(num2 == bean.getNumRevealed().get(x))
                {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            // Add number to list of numbers revealed
            bean.getNumRevealed().add(num2);
        }
        // Check if num3 is not null
        if(request.getParameter("num3") != null)
        {
            int num3 = Integer.parseInt(request.getParameter("num3"));
            // Check if numbers entered are between 1 and 11
            if(num3 < 1 || num3 > 11)
            {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                dispatcher.forward(request, response);
                return;
            }
            // Loop through list and check if num is equal to a number already added to the list (number already revealed)
            for(int x = 0; x < bean.getNumRevealed().size(); x++)
            {
                if(num3 == bean.getNumRevealed().get(x))
                {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            // Add number to list of numbers revealed
            bean.getNumRevealed().add(num3);
        }
        // Check if num4 is not null
        if(request.getParameter("num4") != null)
        {
            int num4 = Integer.parseInt(request.getParameter("num4"));
            // Check if numbers entered are between 1 and 11
            if(num4 < 1 || num4 > 11)
            {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                dispatcher.forward(request, response);
                return;
            }
            // Loop through list and check if num is equal to a number already added to the list (number already revealed)
            for(int x = 0; x < bean.getNumRevealed().size(); x++)
            {
                if(num4 == bean.getNumRevealed().get(x))
                {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ErrorPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            // Add number to list of numbers revealed
            bean.getNumRevealed().add(num4);
        }      
        // Loop through numbers revealed
        for(int i = 0; i < bean.getNumRevealed().size(); i++)
        {
            // Check if any numbers in list equal the secret number
            if(bean.getNumRevealed().get(i) == bean.getSecretNum())
            {
                response.sendRedirect("/c3374676_assignment2/GameOver.jsp?success=true");
                return;
            }
        }
        // Set smallest number to 1
        int z = 1;
        bean.setSmallestNum(z);
        // Sort list in order (avoids issues with wrong smallest number)
        Collections.sort(bean.getNumRevealed());
        // Loop through list
        for(int x = 0; x < bean.getNumRevealed().size(); x++)
        {
            // Check if the smallest number is in the list (has been revealed) or is equal to the secret number
            if(bean.getNumRevealed().get(x) == bean.getSmallestNum() || bean.getSecretNum() == bean.getSmallestNum())
            {
                // If so as above, increment smallest number
                z++;
                bean.setSmallestNum(z);
            }
        }
        // Set round numbers depending on current round number (increment by 1 each time)
        if(bean.getRoundNum() == 1)
        {
            bean.setRoundNum(2);
        }
        else if(bean.getRoundNum() == 2)
        {
            bean.setRoundNum(3);
        }
        else if(bean.getRoundNum() == 3)
        {
            bean.setRoundNum(4);
        }
        else if(bean.getRoundNum() == 4)
        {
            response.sendRedirect("/c3374676_assignment2/WinGame.jsp?success=true");
            return;
        }
        // Redirect to offer page
        response.sendRedirect("/c3374676_assignment2/BankOffer.jsp?success=true");
    }
}