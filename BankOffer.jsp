<%-- BankOffer.jsp
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
--%>

<jsp:useBean id="bean" scope="session" class="pkg.Bean" />
<!DOCTYPE html>
<html>
    <head>
        <title>Bank Offer</title>
        <link rel='stylesheet' type='text/css' href='style.css' />
    </head>
    <body>
        <h1>Bank Offer</h1>
        <h2><%= "Your Offer: $" + bean.getBankOffer() %></h2>
        <p>
            <a href="/c3374676_assignment2/Index.jsp">Accept</a>
            <a href="/c3374676_assignment2/Main.jsp">Continue</a><br/><br/>
            <form action="/c3374676_assignment2/save" method="POST">
                <input type='submit' value='Save Game'/>
            </form>
        </p>
    </body>
</html>