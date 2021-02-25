import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Font;

public class Curcle extends JPanel {
	int number = 45;
	Map<Integer, Color> colorMap = new HashMap<>();
	Random r = new Random();
	JLabel lblNewLabel;
	
	public Curcle(Set<Integer> num) {

		
		setPreferredSize(new Dimension(60, 60));
		setSize(new Dimension(176, 176));
		setMinimumSize(new Dimension(60, 60));
		setMaximumSize(new Dimension(60, 60));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		lblNewLabel = new JLabel(String.valueOf(number));
		add(lblNewLabel);
		
		lblNewLabel.setBackground(new Color(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 24, SpringLayout.WEST, this);
	}
		
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		if (number < 16) {
			g.setColor(Color.red);
		} else if (number < 31) {
			g.setColor(Color.blue);
		} else if (number < 46) {
			g.setColor(Color.CYAN);
		}
		
		g.fillOval(0, 0, 60, 60);
	}
}
