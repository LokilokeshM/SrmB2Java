package Day09_07;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneExample{
private static final long serialVersionUID = 1L;

private static void createAndShowGUI() {

	final JFrame frame = new JFrame("Scroll Pane Example");

	frame.setSize(500, 500);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().setLayout(new FlowLayout());

	JTextArea textArea = new JTextArea(20, 20);
	JScrollPane scrollableTextArea = new JScrollPane(textArea);

	scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	frame.getContentPane().add(scrollableTextArea);
}

public static void main(String[] args) {

	javax.swing.SwingUtilities.invokeLater(new Runnable() {

		public void run() {
			createAndShowGUI();
		}
	});
}
}
