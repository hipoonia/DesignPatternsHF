import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

	JFrame frame;
	
	public static void main (String[] args) {
	
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
	
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
	}
	
	class AngelListener implements ActionListener {
	
		public void actionPerformed(ActionEvent event) {
		
			System.out.println("Dont do it, you might regret it");
		}
	}
	
	class DevilListener implements ActionListener {
	
		public void actionPerformed(ActionEvent event) {
		
			System.out.println("Come on, do it!!!");
		}
	}
}