package Day09_07;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JTabbedPaneExample  {
	  public static void main(String args[]) {
	      JFrame frame = new JFrame("Technologies");
	      JTabbedPane tabbedPane = new JTabbedPane();
	      JPanel panel1, panel2, panel3, panel4, panel5;
	      panel1 = new JPanel();
	      panel2 = new JPanel();
	      panel3 = new JPanel();
	      panel4 = new JPanel();
	      panel5 = new JPanel();
	      tabbedPane.addTab("PHP", panel1);
	      tabbedPane.addTab("Blockchain ", panel2);
	      tabbedPane.addTab("Matlab", panel3);
	      tabbedPane.addTab("JSP ", panel4);
	      tabbedPane.addTab("Servlet", panel5);
	      frame.add(tabbedPane);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(550,350);
	      frame.setVisible(true);
	   }
}