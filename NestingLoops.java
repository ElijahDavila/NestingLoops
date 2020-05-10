public class NestingLoops
{
	public static void main( String[] args )
	{
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
			{
            for ( char c='A'; c <= 'E'; c++ )
            {
                System.out.println( c + " " + n );
            }
        }
		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
            // * You will add a line of code here.
            System.out.println();
		}

		System.out.println("\n");

	}
}

//My Answers
//1. The variable controlled by the inner loop of "CN" changes faster than the outer loop. 
//   Each time the outer loop iterates once, the inner loop iterates entirely.

//2. Rather than the char values repeating as they did when the "C" loop was the outer loop,
//   the char values repeat in sequence from A through E while the int values repeat the same 
//   int for each iteration of the "N" loop.

//3. Changing the print statement in the "B" loop to println changes the output to one iteration per line,
//   rather than printing all iterations on the same line.

//4. Adding a println statement after the inner "B" loop causes three iterations to print per line rather than
//   all iterations printing on the same line.