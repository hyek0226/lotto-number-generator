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
	boolean b = false;
	public Curcle(int n, boolean b) {
		number = n;
		this.b = b;
		setBackground(new Color(0,0,0,0));
		setPreferredSize(new Dimension(60, 60));
		setSize(new Dimension(176, 176));
		setMinimumSize(new Dimension(60, 60));
		setMaximumSize(new Dimension(60, 60));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel label = new JLabel(String.valueOf(n));
		springLayout.putConstraint(SpringLayout.NORTH, label, 15, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 20, SpringLayout.WEST, this);
		label.setFont(new Font("함초롬바탕", Font.BOLD, 21));
		if (b == true) {
			label.setForeground(Color.white);
		} else {
			label.setForeground(Color.black);
		}
		add(label);
	}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (!b) {
			g.setColor(new Color(1, 1, 1, 0));
		} else {
			if (number <= 0) {
				g.setColor(new Color(0, 0, 0, 0));
			} else if (number < 11) {
				g.setColor(new Color(255, 228, 0));
			} else if (number < 21) {
				g.setColor(new Color(90, 174, 255));
			} else if (number < 31) {
				g.setColor(new Color(255, 108, 108));
			} else if (number < 41) {
				g.setColor(new Color(213, 213, 213));
			} else if (number < 46) {
				g.setColor(new Color(207, 255, 36));
			}
		}
		g.fillOval(0, 0, 60, 60);
	}
}
