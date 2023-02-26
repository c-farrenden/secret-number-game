<%-- WinGame.jsp
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
--%>

<jsp:useBean id="bean" scope="session" class="pkg.Bean" />
<!DOCTYPE html>
<html>
    <head>
        <title>Winner Page</title>
        <link rel='stylesheet' type='text/css' href='style.css' />
    </head>
    <body>
        <h1>You Win!</h1>
        <p>
        <%= "You receive a monetary prize for not revealing the secrete number: $"
            + bean.getMonetaryPrize() %>
        <br/><br/><a href="/c3374676_assignment2/Index.jsp">Return to main menu</a>
        </p>
    </body>
</html>