
/*  TRY AND CATCH IN JAVA CLASS  */
import java.io.DataInputStream; // SAME as a Scanner
import java.io.IOException;
class frr
{
    public static void callme()
    {
         int x=5;
       int y=0;
       System.out.print(x/y);
    }
     public static void main(String[] v)
             throws IOException
     {
         DataInputStream in=new DataInputStream(System.in);
         String s=null;

       /*try
       {
       s=in.readLine();
       }
       catch(Exception g)
       {}
*/
        s=in.readLine();
       // Thread.sleep(3000);
       System.out.print(s);


     }
}
