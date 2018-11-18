package game.orca;

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;

public class ArrowArrowRevolutionMultiplayer {
	public void game(){
		JFrame jframe = new JFrame("ORCA Game");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // set the jframe size and location, and make it visible
		jframe.setSize(screenSize	.width, screenSize.height);
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	}
}