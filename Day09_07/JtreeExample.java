package Day09_07;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JtreeExample {
	JFrame f;  
	JtreeExample(){  
	    f=new JFrame();   
	    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Car");  
	    DefaultMutableTreeNode color=new DefaultMutableTreeNode("Brand");  
	    DefaultMutableTreeNode font=new DefaultMutableTreeNode("model");  
	    style.add(color);  
	    style.add(font);  
	    DefaultMutableTreeNode red=new DefaultMutableTreeNode("Skoda");  
	    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Honda");  
	    DefaultMutableTreeNode black=new DefaultMutableTreeNode("Hyundai");  
	    DefaultMutableTreeNode green=new DefaultMutableTreeNode("VW");  
	    color.add(red); color.add(blue); color.add(black); color.add(green);      
	    JTree jt=new JTree(style);  
	    f.add(jt);  
	    f.setSize(200,200);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new JtreeExample();  
	}}
