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
	JFrame j;
	JPanel panel;
	JLabel label;
	Stack<Character> back = new Stack<Character>();
	
	public static void main(String[] args) {
		TextUndoRedo a = new TextUndoRedo();
		a.createUI();
		
	}
	
	void createUI() {
		j = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		panel.add(label);
		j.add(panel);
		j.setVisible(true);
		j.setSize(400,100);
		j.addKeyListener(this);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String curr = label.getText();
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE&&curr.length()>0) {
			String popS = curr.substring(0, curr.length()-1);
			back.push(curr.charAt(curr.length()-1));
			label.setText(popS);
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			Character undo = back.pop();
			label.setText(curr+undo);
		}
		else {
		curr+=(char)e.getKeyCode();
		label.setText(curr);
		panel.repaint();
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
