package Day09_07;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JComboBoxExample {
	 private static void createAndShowGUI() {
		 
	      
	        final JFrame frame = new JFrame("Split Pane Example");
	 
	     
	        frame.setSize(500, 300);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	      
	        frame.getContentPane().setLayout(new GridLayout(1, 1));
	 
	        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	 
	        tabbedPane.addTab("Java", makePanel("8am to 12pm"));
	        tabbedPane.addTab("React", makePanel("2pm to 6pm"));
	 
	        frame.getContentPane().add(tabbedPane);
	 
	    }
	 
	    private static JPanel makePanel(String text) {
	        JPanel p = new JPanel();
	        p.add(new Label(text));
	        p.setLayout(new GridLayout(1, 1));
	        return p;
	    }
	 
	    public static void main(String[] args) {
	 
	 
	 
	  javax.swing.SwingUtilities.invokeLater(new Runnable() {
	 
	public void run() {
	 
	    createAndShowGUI(); 
	 
	}
	 
	  });
	    }
	 
}
