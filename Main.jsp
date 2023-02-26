<%-- Main.jsp
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
--%>

<jsp:useBean id="bean" scope="session" class="pkg.Bean" />
<!DOCTYPE html>
<html>
    <head>
        <title>Main Page</title>
        <link rel='stylesheet' type='text/css' href='style.css' />
    </head>
    <body>
        <h1><%= "Round " + bean.getRoundNum() %></h1>
        <p>
        <form action="/c3374676_assignment2/main" method="POST">
        <%-- Check if round number is 1 --%>
        <% if(bean.getRoundNum() == 1) { %>
            <p>Secret number has been generated.</p>
            Input a number:
            <input type="number" name="num" required /><br/><br/>
            <button type="submit" value="Submit">Submit Number</button>
        <%-- Check if round number is 2 --%>
        <% } else if(bean.getRoundNum() == 2) { %>
            Input a number:
            <input type="number" name="num" required /><br/><br/>
            Input a second number:
            <input type="number" name="num2" required /><br/><br/>
            <button type="submit" value="Submit">Submit Numbers</button>
        <%-- Check if round number is 3 --%>
        <% } else if(bean.getRoundNum() == 3) { %>
            Input a number:
            <input type="number" name="num" required /><br/><br/>
            Input a second number:
            <input type="number" name="num2" required /><br/><br/>
            Input a third number:
            <input type="number" name="num3" required /><br/><br/>
            <button type="submit" value="Submit">Submit Numbers</button>
        <%-- Check if round number is 4 --%>
        <% } else if(bean.getRoundNum() == 4) { %>
            Input a number:
            <input type="number" name="num" required /><br/><br/>
            Input a second number:
            <input type="number" name="num2" required /><br/><br/>
            Input a third number:
            <input type="number" name="num3" required /><br/><br/>
            Input a fourth number:
            <input type="number" name="num4" required /><br/><br/>
            <button type="submit" value="Submit">Submit Numbers</button>
        <% } %>
        </p>
        </form>
    </body>
</html>