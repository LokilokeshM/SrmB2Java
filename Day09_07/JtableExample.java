package Day09_07;
	
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JtableExample {
	public static void main(String args[]) {
		//rows of the table
		final Object r[][] = {
		{"Adam", "13" , "Doctor"},
		{"Anna", "21" ,"Engineer"},
		{"Annamu", "31" ,"Technician"},
		{"Iza", "41" ,"Physician"},
		{"Norah", "11" , "Author"},
		{"Naashy", "12" ,"Artist"},
		{"Poosa", "33" ,"Actor"},
		{"Pichi", "14" ,"Author"},
		{"Kunjol", "31" ,"Police"},
		{"Thukidi", "12" ,"Doctor"},
		{"Sam", "13" , "Engineer"},
		{"Kukku", "24" ,"Technician"},
		};

		final Object h[] = {"Name", "Age" ,"Occupation"};

		JFrame fr = new JFrame(" Printing table");
	
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		final JTable tb = new JTable(r, h);
		
		JScrollPane sp = new JScrollPane(tb);
		fr.add(sp , BorderLayout.CENTER);
		
		JButton button = new JButton("click this button to Print");
	
		ActionListener act = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	
		try {
		tb.print();
		} catch (PrinterException pe) {
		System.err.println("Error printing: " + pe.getMessage());
		}
		}
		};
		button.addActionListener(act);
		fr.add(button, BorderLayout.SOUTH);

		fr.setSize(300, 150);
		fr.setVisible(true);
		}
}
