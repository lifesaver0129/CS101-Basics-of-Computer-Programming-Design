package secondhalf;
import java.util.Random;
public class class084 {
	private static final Random randomNumbers = new Random();
	// enumeration with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
public static void main( String[] args )
{
   int myPoint = 0; // point if no win or loss on first roll
   Status gameStatus; // can contain CONTINUE, WON or LOST
   int sumOfDice = rollDice(); // first roll of the dice
   // determine game status and point based on first roll
   switch ( sumOfDice )
   { case SEVEN: // win with 7 on first roll
   case YO_LEVEN: // win with 11 on first roll
	   gameStatus = Status.WON;
break;
   case SNAKE_EYES: // lose with 2 on first roll
   case TREY: // lose with 3 on first roll
   case BOX_CARS: // lose with 12 on first roll
  gameStatus = Status.LOST;
break;
default:
	   gameStatus = Status.CONTINUE; // game is not over
	    myPoint = sumOfDice; //
         System.out.printf( "Point is %d\n", myPoint );
         break; // optional at end of switch
   } // end switch
// while game is not complete
while ( gameStatus == Status.CONTINUE ) // not WON or LOST 
	{
      sumOfDice = rollDice(); // roll dice again
      // determine game status
      if ( sumOfDice == myPoint ) // win by making point
         gameStatus = Status.WON;
// create random number generator for use in method rollDice
      else
    	  if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
    	  gameStatus = Status.LOST; }//end while
    	  //
    	  if
    	 
    	  ( gameStatus == Status.WON )
    	  System.out.println( "Player wins" );
    	        else
    	           System.out.println( "Player loses" );
    	     } 
    	     public static int rollDice()
    	     {
    	
    	  int die1 = 1 + randomNumbers.nextInt( 6 ); 
    	  int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll
    	        int sum = die1 + die2; // sum of die values
    	        // display results of this roll
    	        System.out.printf( "Player rolled %d + %d = %d\n",
    	           die1, die2, sum );
    	        return sum; 
    	     }
    	     }

