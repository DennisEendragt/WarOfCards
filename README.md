# War of Cards (work in progress)  

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

## Compiling instructions:
    1. Coming soon... on Aug 15/16   

In the near future I *may* decide to implement a GUI version of this game using HTML5/CSS3/JavaScript, and host it
on my website, [dharmeshsujeeun.com](http://dharmeshsujeeun.com).
