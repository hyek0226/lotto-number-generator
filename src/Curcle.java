import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import java.awt.Font;

public class Curcle extends JPanel {
	private int number = 45;
	private Map<Integer, Color> colorMap = new HashMap<>();
	private Random r = new Random();
	private JLabel lblNewLabel;
	private boolean b = false;
	
	public Curcle(int n, boolean b) {
		// 숫자와 불린 값을 파라미터와 연결
		number = n;
		this.b = b;
		
		// 기본 배경 설정 (투명)
		setBackground(new Color(0,0,0,0));
		
		// 사이즈 설정
		setPreferredSize(new Dimension(60, 60));
		setSize(new Dimension(176, 176));
		setMinimumSize(new Dimension(60, 60));
		setMaximumSize(new Dimension(60, 60));
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		// 받아온 숫자를 라벨에 삽입
		JLabel label = new JLabel(String.valueOf(n));
		springLayout.putConstraint(SpringLayout.NORTH, label, 15, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 20, SpringLayout.WEST, this);
		label.setFont(new Font("함초롬바탕", Font.BOLD, 21));
		setAlignmentY(SwingConstants.CENTER);
		setAlignmentX(SwingConstants.CENTER);
		
		// boolean 값 (true = 맞은 숫자, false = 틀린숫자) 에 따라 흰색, 검은색 글자가 뜨도록 설정
		if (b == true) {
			label.setForeground(Color.white);
		} else {
			label.setForeground(Color.black);
		}
		add(label);
	}
		
	// 공을 만드는 메소드
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 배경 색깔 지정하는 if문 구절
		// 틀린 숫자면 투명, 맞은 숫자면 숫자에 따라 다른 색깔 나타나게 만듬
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
		// 원 생성
		g.fillOval(0, 0, 60, 60);
	}
}
