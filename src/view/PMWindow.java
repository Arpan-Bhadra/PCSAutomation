package view;

import java.awt.*;

import javax.swing.*;

public class PMWindow extends JFrame{

	Container container=null;
	public PMWindow() {
		container=getContentPane();
		
		
		this.setTitle("PME Home Screen");
		this.setVisible(true);
		this.setBounds(10,10,500,1600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
}