package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	String s = "";
	JFrame j = new JFrame();
	JPanel panel = new JPanel();
	JLabel label= new JLabel(s);
	Stack<String> input = new Stack<String>();
	Stack<String> back = new Stack<String>();
	
	public static void main(String[] args) {
		TextUndoRedo a = new TextUndoRedo();
		a.createUI();
		
	}
	
	void createUI() {
		panel.add(label);
		j.add(panel);
		j.pack();
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char add = e.getKeyChar();
		label.setText(label.getText()+s);
		input.push(Character.toString(add));
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String add1 = input.pop();
			back.push(add1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * J
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
}
