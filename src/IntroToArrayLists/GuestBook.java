package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Add Name");
	JButton b2 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	int counter = 4;
	String s = "";

	public static void main(String[] args) {
		GuestBook c = new GuestBook();
		c.makeButtons();

		c.names.add("Bob Banders");
		c.names.add("Sandy Summers");
		c.names.add("Greg Ganders");
		c.names.add("Donny Doners");
	}

	public void makeButtons() {

		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			names.add(JOptionPane.showInputDialog("Type in your name."));
			counter++;
		}
		if (e.getSource() == b2) {
			s = "";
			// JTextField t = new JTextField(100);
			// JPanel p = new JPanel();
			// JFrame n = new JFrame();
			// p.add(t);
			// n.add(p);
			// n.pack();
			// n.setVisible(true);
			// n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			for (int i = 0; i < counter; i++) {
				int z = i + 1;
				s = s + "Guest " + z + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
			// t.setText(s);
			// JOptionPane.showMessageDialog(null, "Guest 1: " +s);
		}

	}
}
