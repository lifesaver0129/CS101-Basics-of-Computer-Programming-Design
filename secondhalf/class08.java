package secondhalf;

//import java.util.Random;
public class class08 {
	public static void main(String[] args)
	/*
	 * { Random randomNumbers = new Random(); int face; for ( int counter = 1;
	 * counter <= 50; counter++ ) { face = 1 + randomNumbers.nextInt( 6 );
	 * System.out.printf( "%d  ", face ); if ( counter % 5 == 0 )
	 * System.out.println(); } }
	 */
	{
		int face;
		for (int counter = 1; counter <= 50; counter++) {
			for (int a = 1; a <= 5; a++) {
				face = (int) (Math.random() * 6) + 1;
				/*
				 * Random t = new Random(); face=t.nextInt(6)+1;
				 */
				System.out.print(face + " ");
			}
			System.out.println();
		}
	}
}
