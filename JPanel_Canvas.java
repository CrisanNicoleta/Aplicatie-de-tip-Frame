/*Desenarea unui cerc in mai multe culori */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class JPanel_Canvas extends Applet {

	private static final long serialVersionUID = 1L;
public void paint(Graphics g1)  {

int r = 255,g=0,b=0;

   g = 0;
   for (r = 0; r <= 255; r ++)
{
 Color c = new Color(r, g, b);
 g1.setColor(c);
 g1.fillOval(10, 10, 400, 400);
}

   try {
  	 Thread.sleep(400);
   } catch(InterruptedException e)
   {}
    
   
   g=100;
    for (r = 0; r<= 255; r++) 
  {
   Color c = new Color(r, g, b);
   g1.setColor(c);
   g1.fillOval(10, 10,400, 400);
   
 }
    try {
     	 Thread.sleep(400);
      } catch(InterruptedException e)
      {}
       

    g=243;
    for (r = 0; r <= 255; r ++) 
    {
       Color c = new Color(r, g, b);
       g1.setColor(c);
       g1.fillOval(10, 10,400, 400);
       
}
    try {
     	 Thread.sleep(400);
      } catch(InterruptedException e)
      {}
       
    
    b=0;
    r=102;
    for (g = 0; g <= 153; g ++)
    {
    Color c = new Color(r, g, b);
    g1.setColor(c);
    g1.fillOval(10, 10, 400,400);
    }
    
    try {
     	 Thread.sleep(400);
      } catch(InterruptedException e)
      {}
    

    	    
      
r = 0;
g=223;
      for (b = 0; b <= 255; b ++)
      {
      Color c = new Color(r, g, b);
      g1.setColor(c);
      g1.fillOval(10, 10, 400, 400);
       }
      
      try {
    	  	 Thread.sleep(400);
    	   } catch(InterruptedException e)
    	   {}
      
      r = 0;
      g=41;
            for (b = 0; b <= 255; b ++)
            {
            Color c = new Color(r, g, b);
            g1.setColor(c);
            g1.fillOval(10, 10, 400, 400);
             }
            
            try {
          	  	 Thread.sleep(400);
          	   } catch(InterruptedException e)
          	   {}
    	    
            b = 159;
            for (r = 0; r <= 255; r ++)
            {
            Color c = new Color(r, g, b);
            g1.setColor(c);
            g1.fillOval(10, 10, 400, 400);
             }
            
            try {
          	  	 Thread.sleep(400);
          	   } catch(InterruptedException e)
          	   {}

            r = 130;
                  for (b = 0; b <= 255; b ++)
                  {
                  Color c = new Color(r, g, b);
                  g1.setColor(c);
                  g1.fillOval(10, 10, 400, 400);
                   }
                  
                  try {
                	  	 Thread.sleep(400);
                	   } catch(InterruptedException e)
                	   {}
   
                  r = 159;
                  g=161;
                  for (b = 0; b <= 161; b ++)
                  {
                  Color c = new Color(r, g, b);
                  g1.setColor(c);
                  g1.fillOval(10, 10, 400, 400);
                   }
                  
                  try {
                	  	 Thread.sleep(400);
                	   } catch(InterruptedException e)
                	   {}

               
                  
}

	public static void main(String args[ ]) {
		JFrame frame = new JFrame("Oval Sample");
		frame.add(new JPanel_Canvas( ));
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
