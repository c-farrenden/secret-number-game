<%-- Index.jsp
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>Avoid the Secrete Number</title>
        <link rel='stylesheet' type='text/css' href='style.css' />
    </head>
    <body>
        <h1>Avoid the Secrete Number</h1>
        <form action="/c3374676_assignment2/Main.jsp" method="POST">
            <input type='submit' value='New Game'/><br/><br/>
        </form>
        <form action="/c3374676_assignment2/load" method="POST">
            <input type='submit' value='Load Game'/>
        </form>
        <%-- Wipe data from session so that a new game can be created --%>
        <% session.invalidate(); %>
    </body>
</html>