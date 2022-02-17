package lab21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight  extends JPanel implements ActionListener{
	
  
Color red_c,green_c,yellow_c;
	JRadioButton r1,r2,r3;
     TrafficLight()
{
	/*JFrame f = new JFrame("Traffic Light");
	f.setSize(500,500);
	f.setVisible(true);
	f.setLayout(null);*/
	
	setBounds(0,0,500,500);
	r1 = new JRadioButton("RED");
	r2 = new JRadioButton("YELLOW");
	r3 = new JRadioButton("GREEN");
	r1.setSelected(true);
	red_c=Color.red;
	yellow_c=getBackground();
	green_c=getBackground();
	ButtonGroup grp = new ButtonGroup();
grp.add(r1);
grp.add(r2);
grp.add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
	
add(r1);
add(r2);
add(r3);
}
    public void paintComponent (Graphics g)
    {
    	super.paintComponent(g);
    	g.drawOval(50,50,50,50);
    	g.drawOval(50,110,50,50);
    	g.drawOval(50,170,50,50);
    	g.setColor(red_c);
    	g.fillOval(50,50,50,50);
    	g.setColor(yellow_c);
    	g.fillOval(50,110,50,50);
    	g.setColor(green_c);
    	g.fillOval(50,170,50,50);
   
    }
    
    
    
    
    
    
    
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(r1.isSelected()==true)
		{
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
		
		}
		else if(r2.isSelected()==true)
		{
			red_c=getBackground();
			yellow_c=Color.yellow;
			green_c=getBackground();
		}
		else if(r3.isSelected()==true)
		{
			red_c=getBackground();
			yellow_c=getBackground();
			green_c=Color.green;
		}
		repaint();
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TrafficLight trf=new  TrafficLight();
JFrame f = new JFrame("Traffic Light");
f.setSize(500,500);
f.setVisible(true);
f.setLayout(null);
f.add(trf);
}
	

}
