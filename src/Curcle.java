import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Font;

public class Curcle extends JPanel {
	Map<Integer, Color> colorMap = new HashMap<>();
	Random r = new Random();
	int randomKey = r.nextInt(6);
	public Curcle() {
		setPreferredSize(new Dimension(60, 60));
		setSize(new Dimension(176, 176));
		setMinimumSize(new Dimension(60, 60));
		setMaximumSize(new Dimension(60, 60));
		colorMap.put(1, new Color(222, 222, 222));
		colorMap.put(2, new Color(111, 111, 111));
		colorMap.put(3, new Color(29, 12, 13));
		colorMap.put(4, new Color(34, 15, 12));
		colorMap.put(5, new Color(43, 14, 15));
		colorMap.put(6, new Color(15, 12, 13));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("1");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 24, SpringLayout.WEST, this);
		lblNewLabel.setBackground(new Color(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		add(lblNewLabel);
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(colorMap.get(randomKey));
		g.fillOval(0, 0, 60, 60);
		g.setColor(Color.white);
	}
}
