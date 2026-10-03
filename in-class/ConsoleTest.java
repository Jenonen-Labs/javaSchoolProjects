import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
*
* @author lawtonb
*/

          public class ConsoleTest

         {


  public static void main(String[] args) throws IOException
  {
             int i = 10;
             int j = 20;
            double d = 99.101;

            System.out.print( "Here are some values: " );
            System.out.println( i + " " + j + " " + d );
            System.out.println( "Enter an integer, a float, and a string:" );

            BufferedReader br;
            br = new BufferedReader( new InputStreamReader( System.in ) );
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer( line );
            int k = Integer.parseInt( st.nextToken() );
            float f = Float.parseFloat( st.nextToken());
            String s = st.nextToken();

            while( st.hasMoreTokens() )

            {
                      s += " " + st.nextToken();
            }

           System.out.println( " Here's your data:" );
           System.out.println( k );
           System.out.println( f );
           System.out.println( s );

   }

}