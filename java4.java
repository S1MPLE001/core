/* THE ARRAY LIST CLASS */

 syntax for array LIST class
/*
 import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
        ArrayList<String> a=new  ArrayList<String>();
        for(int i=0;i<5;i++)
        {
             String  x;
             x=in.next();
             a.add(x);
        }
        out.println(a.size());
        for(int i=0;i<5;i++)
        {
            out.print(a[i]);
        }

     }
}
*/

/* THIS WILL GIVE ME SORTED ARRAY
import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
        TreeSet<Integer> a=new TreeSet<Integer>();

         for(int i=0;i<5;i++)
         {
              int x;
              x=in.nextInt();
              a.add(x);
         }
             out.println(a);


     }
}
*/
/*  ARRAYLIST */
/*import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();

         for(int i=0;i<5;i++)
         {
              String x;
              x=in.next();
              a.add(x);
         }
            out.print(a);
            // only single time print it will give me whole set


     }
}
*/
/*import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
        Vector<Integer> a=new Vector<Integer>(6);

         for(int i=0;i<5;i++)
         {  int x;
             x=in.nextInt();
              a.addElement(x);
         }
            /*Iterator<Integer>aItr=a.iterator();
            while(aItr.hasNext())
            {
                out.print(aItr.next()+" ");
            }

		for(int i:a)
            {
                out.print(i+" ");

            }

    out.print(a[0]);/// WHY IS THIS NOT WORKING IN VECTOR

     }
}
*/

/* THIS IS THE BASIC HASH SET MAP
IT SOTERD THE ALL VALUE WITH ITS VALUE
import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         HashMap<String,Integer>mp=new HashMap<String,Integer >();
         for(int i=0;i<n;i++)
         {
             String x;
             int y;
             x=in.next();
             y=in.nextInt();
             mp.put(x,y);
         }
         Set<Map.Entry<String,Integer> >set=mp.entrySet();
         // DISPLAY METHOD
         for(Map.Entry<String,Integer> it:set)
         {
             out.println(it.getKey()+" "+it.getValue());
         }
///// IN MAP getkey is used to get the first element in map & getvalue is used to get the second value
  IMP ponits
 int p=mp.get(2);
         out.print(p);
         /* IN WHICH GET IS USED TO FIND THE VALUE OF KEY */ :)
      }
}
/*

/*
QUESTION ...
1. WHAT IS THE DIFFERENCE B/w HASHMAP AND TREEMAP
/*
import java.util.*;
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
        Vector<Integer> a=new Vector<Integer>(6);

         for(int i=0;i<5;i++)
         {  int x;
             x=in.nextInt();
              a.addElement(x);
         }
         out.print(a.get(0));
         // get fxn is used to dispaly the value of vector>


      }
}

/* HOW TO USE PAIR IN JAVA */
import java.util.*;
import javafx.util.Pair;///for pair i declared a special package here javafx.util.Pair
/// why i use javafx ... :(
import static java.lang.System.out;
public class frr
{
     public static void main(String v[])
     {
        Scanner in=new Scanner(System.in);
    ArrayList <Pair <String,Integer> > a =
                       new ArrayList <Pair <String,Integer> > ();

         for(int i=0;i<3;i++)
         {  String x;
             int y;
             x=in.next();
             y=in.nextInt();
             a.add(new Pair <String,Integer> (x, y));

         }

        out.print(a.get(0));
   /// how to get its first & second element of pair
      }
}
/*
IN STRING I USE S.LENGTH() TO FIND THE LENGTH OF THE STRING
*/

/* how i write 1000006 in short form */
/*
SHORT FORM TO WRITE ..SYSTEM.OUT TO
  sout & tab
  */

  /*
  connection to intract with data base ...-----> this is code for connection to database
  package javaapplication5;
import java.sql.*;
public class JavaApplication5 {
public static void main(String[] args) {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery("select *from seit where marks >60");
         while(rs.next())
             System.out.println(rs.getInt(1)+" "+rs.getString(2));
         con.close();

    }
    catch(Exception e)
    {System.out.print(e);
    }
    }
float d=1e6f;
    if((int)d==1000000)
     out.printf("%.0f",d);
     how to print 10^6
}
*/
