/*import static java.lang.System.out;
// U CAN WRITE NOW ONLY OUT.PRINT ...IN PLACE OF SYSTEM.OUT.PRINT
import java.util.*;  //this is a fully qualified name
// * import  all the classes
class frr
{
     public static void main(String v[])
     {
       Scanner in=new Scanner(System.in);
       /*
       int[][] a=new int[3][3];
       //DECLRATION OF A TWO DIMENSIONAL ARRAY
       int[][] b=new int[3][3];
       int[][] c=new int[3][3];
	*/

	/* STRING
	import static java.lang.System.out;
       int p;
      String s;
      s=in.next();
       /// ALL FXN OF STRing in java
      String x=in.next();
      p=s.length();
      out.print(p+" "+"\n");

      String y;
       out.print(s.concat(x)+" "+"\n");
       char c;
       c=s.charAt(0);
        out.print(c+" "+"\n");
		y=s.substring(0,3);
         out.print(y+" "+"\n");
         s=s.toLowerCase();
          out.print(s+" "+"\n");
          x=x.toUpperCase();
          out.print(x+" "+"\n");

           char z[]=s.toCharArray();
           //out.print(z+" "+"\n");
           for(int i=0;i<s.length();i++)
               System.out.print(z[i]);


       }
}
     */
// object resprestitation of primitive data types are called wrapper class

//eg:
//WrappeFloat.java
											*/
      /*
       Integer x=new Integer(14);
       HERE X IS MY OBJECT ..... :) : ):
       out.print(x+"\n");
   String s=Integer.toBinaryString(59);
   String s1=Integer.toOctalString(73);// NICE FXN
   String s2=Integer.toHexString(93);
   out.print(s+"\n"+s1+"\n"+s2);
       */
       /*  atoi is used to convert string no. into integer ...in C  */
		/*
		#include<bits/stdc++.h>
       int man(int argc ,char *argv[])
       {
       IN c ..TO PASS ARGUMENT IN C ...HERE ARGC IN NO. OF ELEMENT & argv is my value */

        /*
       	  //int n=in.nextInt();
     Character ch=new Character('x');s
      out.print(ch.charValue());
      THIS IS TO TAKE CHARCTER

       	  */

       	  //   atoi fxn in java Integer.parseInt(arg[i]); :) :)

   //PACKAGES -: not contain a capital letters
   	/*
   	collection of classe
   	*/
   	//java has a sub packages
  /*
   	1. lang
   	2. io
	3. util
	4. awt
	5. applet
	*/

/*
// here i created my own package
package info;
import java.util.Scanner;
public class frrr {
     public static void main(String v[])
     {
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int m=in.nextInt();
          int l=in.nextInt();
          int p=Math.max(n,Math.max(m,l));
          System.out.print(p);

     }
     if((Character.isLowerCase('R'))
	System.out.print("CHARACTER IS LOWER");
	else
	System.out.print("CHARACTER IS UPPER");

		if(Character.iswhitespace(' '))
	System.out.print("character is whitespace");


     /*
}

/*  INTERFACE ------------- :) :)  */
/*	//import static java.lang.System.out;
//import java.util.*;
interface man{
       void dis();

}
class sum implements man{
       public void dis()
       {
            System.out.print("HAHAHA");
       }
}

class frr
{
     public static void main(String args[])
     {
      //Scanner in=new Scanner(System.in);

       sum in=new sum();
       in.dis();
}
}

     */

     /*

     //import static java.lang.System.out;
//import java.util.*;
class pla
{
     String name;
     void getname(String n)
     {
          name=n;
     }
     void put()
     {
          System.out.println(name);
     }
}
class rec extends pla
{
     double avg,rate;
     void get(double avg,double rate)
     {
          this.avg=avg;
          this.rate=rate;
     }
     @Override

     void put()
     {
          super.put();
          System.out.println(avg+" "+rate);
     }


}
interface ipl
{
     void displayear();
}
interface info
{
     public void getteam(String t);
}
class match extends rec implements ipl,info{

   long  earn;
   match(long earn)
{
 this.earn=earn;
}
   public void displayear()
   {
        System.out.println(earn);
   }
   public void getteam(String s)
   {
        System.out.println(s);
   }
}
class frr
{
     public static void main(String v[])
     {
         match in=new match(5000);
         in.getname("domingo");
         in.put();
         in.get(40, 20);
         in.put();
         in.displayear();
         in.getteam("rajd");
         }
}

*/

 /*

 // using constants in interface
interface ipl
{
     double z=5;
}
interface info
{
     int t=5;
}
class frr implements ipl
{
     public static void main(String v[])
     {
         System.out.print(z*3+" "+info.t*8);
         // i can use here also like ipl.z*3
          // bcz it is by default public
     }

}

*/

// using constants in interface
/*
interface ipl
{
     double z=5;

}
interface info extends ipl // interface also extends in interface
{
     int t=5;
}
class frr implements info
{
     public static void main(String v[])
     {
          // WHEN I HAVE A TWO SAME VARIABLE
         System.out.print(ipl.z+" "+info.t);
                    //this is by default is public
     }

}
*/


