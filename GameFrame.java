package snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame() {

		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SNAKE GAME");
		this.setResizable(false);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
}
