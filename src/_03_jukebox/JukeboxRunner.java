package _03_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JButton;
public class JukeboxRunner {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
		JFrame f = new JFrame();
		JButton b = new JButton();
		b.setBounds(100, 100, 20, 20);
		f.add(b);
	}
}
