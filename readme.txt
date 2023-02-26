To start the game (main menu) visit: http://localhost:8080/c3374676_assignment2/Index.jsp

Bean class (Bean.java) includes getters and setters for storing data needed for the game and validation.
There is one main servlet (MainServlet.java) that handles requests and will redirect the user based on the conditions met.
There is one main jsp file (Main.jsp) that will display each round and will submit to the main servlet for processing.

BankOffer.jsp at the end of each round, WinGame.jsp for when the user wins the game and GameOver.jsp when the secret number is revealed.

Some of the validations will redirect the user to an error page where the game will be reset and allow them to redirect back to the main menu (Index.jsp).

Data is cleared each time returning to the index page so that new games can commence.

I implemented game saving by writing the data to a text file. This text file will be read when loading a previous game and will set the corresponding values of the game state when saved. 
This is processed by a SaveGame.java servlet and LoadGame.java servlet. When the game is loaded it will load the next round the user is up to.
Note: that this only saves to a set file (saveFile.txt) and doesnt save according to usernames.