 > **Nikita Kozino**   
 >    
 >  __Assignment 6__   
 >  
 >  For this assignment I will be refactoring my homework 4. While reviewing my code, I noticed that there are quite a few things I can do to make my code look better, and make it more readable. One of the things that immediately stands out is, I have two separate classes for player's ships, ShipPlayer1 and ShipPlayer 2. I created a superclass Player, that combines the functionality of the ShipPlayer1 and ShipPlayer2 classes, so these two classes can be deleted altogether. I think it allows for a much more compact and comprehensible code than having a separate class for each player.  
 > 
 >  Another thing that I noticed right inside the Player class I just created, I don't need two separate methods to place the ships, as I had before, it would make much more sense to have one method to place player ships. Thus I extracted a method place(), which prompts the user to input x and y coordinates to place his/her ship on the game board, which makes the code even more compact and readable, without implementing any unnecessary almost identical methods. 
>
> 	In the class Shoot, I noticed that the method playerShoot() is too long an quite hard to read. So one thing that I decided to do is replace method playerShoot() with method object and declared a private class ShotPlace inside the Shoot class. It does not necessarily reduce the amount of code, it just makes the method a little shorter, thus more readable, as I separate it into two methods, one for the player 1, and the other for player 2, namely invoke1() and invoke2(). 
