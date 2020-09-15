package drow;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class drow extends Applet implements MouseMotionListener , ActionListener{

	
	// add gui tools
	Button clc;
	Button gry;
	Button green;
	Button pink;
	Button red;
	Button yew;
	Button wh;
	Button bl;
	Button pi;
	JPanel ppp = new JPanel();
	
	// this defult color
	private Color col=Color.BLACK;
	
	@Override
	public void init() // the firest fun will start
	{
		
	   //do  some design to the gui
		
		ppp.setBounds(500, 500, 100, 10);
		clc=new Button("clc");
		clc.setBackground(Color.white);
		 /////
		gry=new Button("gry");
		gry.setBackground(Color.gray);
		gry.setForeground(Color.white);
		
		pink=new Button("pink");
		pink.setBackground(Color.pink);

		green=new Button("green");
		green.setBackground(Color.green);
		 
		red=new Button("red");
		red.setBackground(Color.red);
		 
		////////////
		 
		yew=new Button("yellow");
		yew.setBackground(Color.yellow);
		
		bl=new Button("black");
		bl.setBackground(Color.black);
		bl.setForeground(Color.white);
		
		
		pi=new Button("blue");
		pi.setBackground(Color.blue);
		
		ppp.add(clc ,0,0);
		ppp.add(yew,0,1);
		ppp.add(bl,0,2);
		ppp.add(pi,0,3);
		ppp.add(gry,0,4);
		ppp.add(green,0,5);
		ppp.add(red,0,6);
		ppp.add(pink,0,7);
		
		add(ppp);
		addMouseMotionListener(this);
	     clc.addActionListener(this);
	     yew.addActionListener(this);
	     bl.addActionListener(this);
	     pi.addActionListener(this);
	     gry.addActionListener(this);
	    green.addActionListener(this);
	     red.addActionListener(this);
	     pink.addActionListener(this);

	     
	    
	}
	public void mouseDragged(MouseEvent arg0) { // add event to the mouse to drow
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(col);
		//g.fillRect(arg0.getX(), arg0.getY(), 10, 10);
		g.fillOval(arg0.getX(), arg0.getY(), 10, 10);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		String act=	arg0.getActionCommand(); // get the color
		
	switch(act) // changing the color
	{
case "clc" :repaint(); break;
	case "black" :col=Color.BLACK; break;
	case "yellow" :col=Color.YELLOW; break;
	case "blue" :col=Color.BLUE; break;
	case "gry" :col=Color.gray; break;
	case "green" :col=Color.green; break;
	case "red" :col=Color.red; break;
	case "pink" :col=Color.pink; break;

	}
}
}