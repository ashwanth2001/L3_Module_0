package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JButton b1 = new JButton("Add Entry");
	JButton b2 = new JButton("Search by ID");
	JButton b3 = new JButton("View List");
	JPanel panel = new JPanel();
	JFrame j = new JFrame();

	public static void main(String[] args) {
		LogSearch l = new LogSearch();
		l.createUI();
	}

	void createUI() {
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		j.add(panel);
		j.pack();
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			String a1 = JOptionPane.showInputDialog("Enter an ID number.");
			int a2 = Integer.parseInt(a1);
			String b = JOptionPane.showInputDialog("Enter a name.");
			log.put(a2, b);
			// JOptionPane.showInputDialog(null, "Enter an ID number.");
		}
		if (e.getSource() == b2) {
			String IDNum = JOptionPane.showInputDialog("Search by ID");
			int IDInt = Integer.parseInt(IDNum);
			String ID = "";

			if (log.containsKey(IDInt)) {
				ID = log.get(IDInt);
				JOptionPane.showMessageDialog(null, ID);
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist.");
			}
		}
		if (e.getSource() == b3) {
			String list = "Guest Book: ";
			for (int s : log.keySet()) {
				String i = log.get(s);
				list = list + "\nID: " + s + "  Name: " + i;
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
	// * Create a HashMap of Integers for the keys and Strings for the values.
	// * Create a GUI with three buttons.
	// * Button 1: Add Entry
	// * When this button is clicked, use an input dialog to ask the user to
	// enter an ID number.
	// * After an ID is entered, use another input dialog to ask the user to
	// enter a name.
	// * Add this information as a new entry to your HashMap.
	// *
	// * Button 2: Search by ID
	// * When this button is clicked, use an input dialog to ask the user to
	// enter an ID number.
	// * If that ID exists, display that name to the user.
	// * Otherwise, tell the user that that entry does not exist.
	// *
	// * Button 3: View List
	// * When this button is clicked, display the entire list in a message
	// dialog in the following format:
	// * ID: 123 Name: Harry Howard
	// * ID: 245 Name: Polly Powers
	// * ID: 433 Name: Oliver Ortega
	// * etc...
	// *
	// * When this is complete, add a fourth button to your window.
	// * Button 4: Remove Entry
	// * When this button is clicked, prompt the user to enter an ID using an
	// input dialog.
	// * If this ID exists in the HashMap, remove it. Otherwise, notify the user
	// that the ID
	// * is not in the list.

}
