# War of Cards   

This is a game whose concept originated from an exercise in Joyce Farrell's 2015 C# book.   
The implementation, however, is completely mine.   
This game is a hobby project. Its purpose is to practice OOP principles by modelling objects
from the real world. For example, a `Deck` consists of several `Card` objects, and a
`Game` is played with a `Deck`.

## This is how the game works:   
1. The user chooses to play against the computer or another person.
2. The name of the two players are entered. If the user is playing against the computer
       then player 2's name is automatically set to 'Computer'.
3. The game is played with a standard 52-card deck. There are 26 rounds in total. In each
       round, both players are dealt a card. The player holding the card with the higher rank
       wins 2 points, and the other player gains 0 points. If both players hold two cards
       having the same rank, then both players are awarded 1 point.
4. At the end of the game, the player with the higher score wins. Of course, a tie is also
       a possibility.   
5. `ACE` is considered the lowest ranked card in the game, while `KING` is the highest.

## Instructions to compile and run the game:
1. Create this folder hierarchy: `root/com/dharmeshsujeeun/warofcards`
2. Download the repository as a zip file and place it in the `warofcards` folder.
3. Extract the contents of the zip file in the `warofcards` folder.
4. Open a terminal and navigate to the `root` folder.
5. Type this command in the terminal and press Enter (to compile the code):   
    `javac com/dharmeshsujeeun/warofcards/*.java`
6. Type this command in the terminal and press Enter (to run the game):   
    `java com.dharmeshsujeeun.warofcards.RunGame`

In the near future I _may_ decide to implement a GUI version of this game using HTML5/CSS3/JavaScript, and host it
on my website, [dharmeshsujeeun.com](http://dharmeshsujeeun.com).
