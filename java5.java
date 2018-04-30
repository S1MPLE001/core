/*  COLOR TO THE FRAME */
/*package javaapplication7;

 import java.awt.*;
public class appwin extends Frame {
    appwin(String title)
    {
        super(title);
    }

    public void  paint(Graphics g)
    {
    setForeground(Color.red);
     setBackground(Color.cyan);
     Color c1=new Color(202,146,20);
      Color c2=new Color(202,146,20);
       Color c3=new Color(202,146,20);
       g.setColor(c1);
       g.drawLine(7, 64, 78, 100);
       g.setColor(c2);
       g.drawLine(50, 32, 300, 78);
       g.setColor(c3);
       g.drawLine(100, 78, 50, 40);
       g.setColor(Color.yellow);
       g.drawLine(200, 92, 100, 100);
       g.setColor(Color.red);
       g.drawOval(50, 60, 50, 60);
       g.fillOval(42,83, 44,88);
     g.drawString("DOMINGO",20,40);
    }
    public static void main(String v[])
            throws Exception
    {
         appwin a=new  appwin("FRAME WINDOW");
         a.setSize(new Dimension(700,600));
         a.setVisible(true);
         //Thread.sleep(5000);
        //a.setTitle("AN -AT BASED ");
                  //appwin a=new  appwin("FRAME WINDOW");
                  Thread.sleep(100000);
                  a.setVisible(false);
                  System.exit(0);

    }
}
*/



FONTS IN JAVA
/*
package javaapplication7;

 import java.awt.*;
public class appwin extends Frame {
    appwin(String title)
    {
        super(title);
    }
    public void  paint(Graphics g)
    {
    setForeground(Color.red);
     setBackground(Color.cyan);
     Font c1=new Font("ZINDABAAD",Font.BOLD,50);
      Font c2=new Font("DOMINGO",Font.ITALIC,25);
       Font c3=new Font("VICRANT",Font.ITALIC+Font.BOLD,25);

       g.setFont(c1);
      // g.drawLine(7, 64, 78, 100);
      for(int i=20;i<=400;i+=80)
      {
       g.drawString("DOMINGO",i,200);
      }
       g.setFont(c2);
        g.drawString("vicrant",20,60);
      // g.drawLine(50, 32, 300, 78);
       g.setFont(c3);
      // g.drawLine(100, 78, 50, 40);

     g.drawString("S1mple",20,80);
    }
    public static void main(String v[])
            //throws Exception
    {
         appwin a=new  appwin("FRAME WINDOW");
         a.setSize(new Dimension(700,600));
         a.setVisible(true);
         //Thread.sleep(5000);
        //a.setTitle("AN -AT BASED ");
                  //appwin a=new  appwin("FRAME WINDOW");
                  Thread.sleep(4000);
                  a.setVisible(false);
                  System.exit(0);

    }
}

*/

/*   FRAME AND APPLET */
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
/*

import java.applet.Applet;
import java.awt.*;
class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
public class appfr extends Applet
{
    Frame f;
 public void init() {
     f=new SampleFrame("THIS IS MY FIRST ");
     f.setSize(250,250);
     f.setVisible(true);

    }
 public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }



 */

 /*
 /*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
/* LABELS ---------------------------------->
public class appfr extends Applet
{
    //Frame f;
 public void init() {
   Color c =new Color(100,100,255);
     setBackground(c);
     Label one =new Label("ONE");
     Label two =new Label("TWO");
      Label three=new Label("THREE");
      add(one);
      add(two);
      add(three);

    }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/

/*
CHECK BOX IN --------->>>JAVA
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
/*public class appfr extends Applet
{
    //Frame f;
    CheckboxGroup gp;

 public void init() {
     Checkbox a,b,c;
        Color d =new Color(100,100,255);
     setBackground(d);
    a=new Checkbox("A",gp,true);
     b=new Checkbox("B",gp,false);
      c=new Checkbox("C",gp,false);
     add(a);
     add(b);
     add(c);
    }
 public void paint(Graphics g)
 {
     String s;
     s="domingo";
     g.drawString(s, 20,100);
 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/
/*
public class appfr extends Applet
{
    //Frame f;
    Choice a,b;

 public void init() {
     //Checkbox a,b,c;
        Color d =new Color(100,100,255);
     setBackground(d);
    a=new Choice();
     b=new Choice();

     a.add("nor");
     a.add("sou");
     b.add("dom");
     b.add("com");
    add(a);
     add(b);

    }
    */
/*  LIST----------------------->>>>>>>>>>>>>>>>>>>>>
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
/*import java.applet.Applet;
import java.awt.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
/*public class appfr extends Applet
{
    //Frame f;
    List a,b;

 public void init() {
     //Checkbox a,b,c;
        Color d =new Color(100,100,255);
     setBackground(d);
    a=new List(4,true);
     b=new List(4,false);

     a.add("nor");
     a.add("sou");
     b.add("dom");
     b.add("com");
    add(a);
     add(b);

    }
 public void paint(Graphics g)
 {
     String s;
     Font c1=new Font("ZINDABAAD",Font.BOLD,50);

     g.setFont(c1);
     g.setColor(Color.yellow);
     s="domingo";
     g.drawString(s, 20,100);
 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/

/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet
{
    //Frame f;
    TextField a,b;

 public void init() {
     //Checkbox a,b,c;
        Color d =new Color(100,100,255);
     setBackground(d);
     Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("NAME: ",Label.RIGHT);
    a=new TextField(12);
     b=new TextField(8);

    add(a);
     add(b);
     add(ab);
             add(bb);

    }
 public void paint(Graphics g)
 {
     String s;
     Font c1=new Font("ZINDABAAD",Font.BOLD,50);

     g.setFont(c1);
     g.setColor(Color.yellow);
     s="domingo";
     g.drawString(s, 20,100);
 }
}
/*
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/

/* ................................BUTTON---------------------------------------------*/
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet implements ActionListener
{
    //Frame f;
   // TextField a,b;
   Button yes,no,maybe;
    String s;
 public void init() {
     //Checkbox a,b,c;
    /* Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("NAME: ",Label.RIGHT);
     */
    yes=new Button("yes");
     no=new Button("no");
      maybe=new Button("maybe");
    add(yes);
     add(no);
     add(maybe);
          yes.addActionListener(this);
          no.addActionListener(this);
          maybe.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {

     String str=ae.getActionCommand();
     if(str.equals("yes"))
         s="YOU PASSED YES";
     else  if(str.equals("no"))
         s="YOU PASSED NO";
     else
         s="KUCH BII";
     repaint();

    }
 public void paint(Graphics g)
 {
     Color d =new Color(100,100,255);
     setBackground(d);
     Font c1=new Font("",Font.BOLD,30);

     g.setFont(c1);
     g.setColor(Color.yellow);
     //s="domingo";
     //g.drawString(s, 20,100);
     //showStatus(s);
 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/
/*-------------------------------------------------------------------------------------------------------------------*/
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //for interface ....this is requried
import java.applet.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet implements ItemListener
{
    //Frame f;
   // TextField a,b;
   Checkbox a,b,c;
    String s;
 public void init() {
     //Checkbox a,b,c;
    /* Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("NAME: ",Label.RIGHT);
     */
    a=new Checkbox("A",null,true);
     b=new Checkbox("B");
      c=new Checkbox("C");
    add(a);
     add(b);
     add(c);
          a.addItemListener(this);
          b.addItemListener(this);
          c.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
    repaint();
 }

 public void paint(Graphics g)
 {
     Color d =new Color(100,100,255);
     setBackground(d);
     Font c1=new Font("",Font.BOLD,15);

     g.setFont(c1);
     g.setColor(Color.red);
     s="currentState";
     g.drawString(s, 20,60);
     s="A STATUS: "+a.getState();
     g.setColor(Color.yellow);
     g.drawString(s, 20,80);
      s="B STATUS: "+b.getState();
     g.drawString(s, 20,100);
      s="C STATUS: "+c.getState();
     g.drawString(s, 20,120);

     //showStatus(s);
 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/
*/
/*****************************************************
ADDITION
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //for interface ....this is requried
import java.applet.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet implements ItemListener
{
    //Frame f;
   // TextField a,b;
   Checkbox a,b,c,d;
   CheckboxGroup cb,cbg;
    String s;
 public void init() {
     //Checkbox a,b,c;
    /* Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("NAME: ",Label.RIGHT);
     */
    cbg=new CheckboxGroup();
    cb=new CheckboxGroup();

    a=new Checkbox("1",cbg,true);
     b=new Checkbox("2",cbg,false);
      c=new Checkbox("3",cb,true);
      d=new Checkbox("4",cb,false);
    add(a);
     add(b);
     add(c);
     add(d);
          a.addItemListener(this);
          b.addItemListener(this);
          c.addItemListener(this);
           d.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
    repaint();
 }

 public void paint(Graphics g)
 {
     Color d =new Color(100,100,255);
     setBackground(d);
     Font c1=new Font("",Font.BOLD,25);
    Font c2=new Font("",Font.BOLD,15);
     g.setFont(c1);
     g.setColor(Color.red);
     s="currentState";
     //s+=cbg.getSelectedCheckbox().getLabel()+cb.getSelectedCheckbox().getLabel();
     g.drawString(s,20, 100);
     int p=Integer.parseInt(cbg.getSelectedCheckbox().getLabel())+Integer.parseInt(cb.getSelectedCheckbox().getLabel());
     g.drawString(p+"",20, 120);
 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/
/*
/*
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //for interface ....this is requried
import java.applet.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet implements ActionListener
{
    //Frame f;
  TextField a,b;
  // Checkbox a,b,c,d;
   //CheckboxGroup cb,cbg;
    String s;
 public void init() {
     //Checkbox a,b,c;
     Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("PASSWORD: ",Label.RIGHT);

     a=new TextField(12);
     b=new TextField(8);
     b.setEchoChar('.');
       add(ab);
    add(a);
      add(bb);
    add(b);
  b.addActionListener(this);
   a.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
    repaint();
 }

 public void paint(Graphics g)
 {
     Color d =new Color(100,100,255);
     setBackground(d);
     Font c1=new Font("",Font.BOLD,25);
    Font c2=new Font("",Font.BOLD,15);
     g.setFont(c1);
     g.setColor(Color.red);
     //s="value :";
     //s+=cbg.getSelectedCheckbox().getLabel()+cb.getSelectedCheckbox().getLabel();
     //g.drawString(s,10, 100);
    // int p=Integer.parseInt(cbg.getSelectedCheckbox().getLabel())+Integer.parseInt(cb.getSelectedCheckbox().getLabel());
     g.drawString("name :"+a.getText(),20,100);
       g.drawString("password :"+b.getText(),20,120);


 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/

/*----------------------------------------------------------------------------------------------------------------------------
/*
/* CALUCLATOR ------------------------------>>>>>>>>>>>>>>>>>>>>>WITH USING GRAPHICS
<applet code="AppletFrame" width=300 height=150 >
</applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //for interface ....this is requried
import java.applet.*;
/*class SampleFrame extends Frame {
  SampleFrame(String title)
  {
      super(title);
  }
  public void paint(Graphics g)
  {
      g.drawString("THIS IS THE WINDOW",10,40);
  }
}
*/
public class appfr extends Applet implements ActionListener
{
    //Frame f;
  TextField a,b;
  Button add,sub,mul,div;
  // Checkbox a,b,c,d;
   //CheckboxGroup cb,cbg;
    String s1="";
 public void init() {
     //Checkbox a,b,c;
     Label ab=new Label("NAME: ",Label.RIGHT);
     Label bb=new Label("PASSWORD: ",Label.RIGHT);

     a=new TextField(12);
     b=new TextField(8);
     add= new Button("+");
     sub= new Button("-");
     mul=new Button("*");
     //b.setEchoChar('.');
       add(ab);
    add(a);
      add(bb);
    add(b);
    add(add);add(sub);add(mul);
  add.addActionListener(this);
  sub.addActionListener(this);
  mul.addActionListener(this);

 }
 public void actionPerformed(ActionEvent ae)
 {
     String s=ae.getActionCommand();
     int p;
     if(s.equals("+"))
     {
         p=Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
         s1=p+"";
     }
      if(s.equals("-"))
     {
         p=Integer.parseInt(a.getText())-Integer.parseInt(b.getText());
          s1=p+"";
     }
       if(s.equals("*"))
     {
         p=Integer.parseInt(a.getText())*(Integer.parseInt(b.getText()));
          s1=p+"";
     }
    repaint();
 }

 public void paint(Graphics g)
 {
     Color d =new Color(100,100,255);
     setBackground(d);
     Font c1=new Font("",Font.BOLD,25);
    Font c2=new Font("",Font.BOLD,15);
     g.setFont(c1);
     g.setColor(Color.red);
     //s="value :";
     //s+=cbg.getSelectedCheckbox().getLabel()+cb.getSelectedCheckbox().getLabel();
     //g.drawString(s,10, 100);
    // int p=Integer.parseInt(cbg.getSelectedCheckbox().getLabel())+Integer.parseInt(cb.getSelectedCheckbox().getLabel());
     g.drawString("RESULT : "+s1,20,100);
       //g.drawString("password :"+b.getText(),20,120);


 }
}
 /*public void start()
 {
     f.setVisible(true);
 }
 public void stop()
 {
      f.setVisible(false);
 }
 public void paint(Graphics g)
 {g.drawString("this is the win",10,20);
 }


 }
*/
