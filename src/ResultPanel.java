import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingConstants;
import javax.swing.text.GapContent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Point;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ResultPanel extends JPanel implements ActionListener {
	List<Set> resultList = new ArrayList<>();
	Set<Integer> number = new TreeSet<>();
	Set<Integer> number2 = new TreeSet<>();
	Set<Integer> number3 = new TreeSet<>();
	Set<Integer> number4 = new TreeSet<>();
	Set<Integer> number5 = new TreeSet<>();
	Set<Integer> number6 = new TreeSet<>();
	TestFrame frame = new TestFrame();
	Random r = new Random();
	CurcleList curcleList;
	int amount = 5;
	JPanel panel0 = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	int play = 0;
	private final JLabel lblNewLabel_1 = new JLabel("당첨 결과");
	
	public ResultPanel(LottoFrame frame, Set<Integer> temp) {
		setPlayTest(play);
		number2.add(10);
		number2.add(20);
		number2.add(30);
		number2.add(40);
		number2.add(35);
		number2.add(45);
		number3 = temp;
		
		panel0.setBackground(Color.gray);
		panel0.setBounds(50, 100, 700, 80);
		add(panel0);
		
		panel1.setBackground(Color.gray);
		panel1.setBounds(50, 270, 700, 80);
		add(panel1);
		
		panel2.setBackground(Color.gray);
		panel2.setBounds(50, 370, 700, 80);
		add(panel2);
		
		panel3.setBackground(Color.gray);
		panel3.setBounds(50, 470, 700, 80);
		add(panel3);
		
		panel4.setBackground(Color.gray);
		panel4.setBounds(50, 570, 700, 80);
		add(panel4);
		
		panel5.setBackground(Color.gray);
		panel5.setBounds(50, 670, 700, 80);
		add(panel5);
		
		System.out.println(number);
		setPreferredSize(new Dimension(830, 800));
		setMaximumSize(new Dimension(830, 800));
		
		randomNumber();
		loopResult();
		
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setBounds(671, 15, 142, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();
			}
		});
		setLayout(null);
		setLayout(null);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("로또 결과");
		lblNewLabel.setBounds(370, 39, 82, 21);
		add(lblNewLabel);
		lblNewLabel_1.setBounds(380, 220, 82, 21);
		
		add(lblNewLabel_1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog(frame);
		dialog.setSize(100, 100);
		dialog.setVisible(true);
	}
	
	public void randomNumber() {
		int i = 0;
		while (number.size() < 7) {
			int ranNum = r.nextInt(45) + 1;
			number.add(ranNum);
		}
		int x = 10;
		curcleList = new CurcleList(number, number2);

		for (int j = 0; j < 7; j++) {
			Curcle curcle = curcleList.getResultList().get(j);
			curcle.setBounds(x, 1, 100, 100);
			x += 100;
			panel0.add(curcle);
		}
	}
	public void curcleResult(Set<Integer> numList, String a, int h, JPanel panel, List<Boolean> bList) {
		curcleList = new CurcleList(number, numList);
		int x = 10;
		int count = 0;
		JLabel alphabet = new JLabel(a);
		panel.add(alphabet);
		for (int i = 0; i < 6; i++) {
			Curcle curcle = curcleList.getSelectList().get(i);
			curcle.setBounds(x, h, 100, 100);
			x += 100;
			panel.add(curcle);
			if (bList.get(i) == true) {
				++count;
			}
		}
		JLabel rank;
		if (count == 6) {
			rank = new JLabel("1 등");
		} else if (count == 5) {
			rank = new JLabel("1 등");
			
		} else if (count == 4) {
			rank = new JLabel("1 등");
			
		} else if (count == 3) {
			rank = new JLabel("1 등");
		} else {
			rank = new JLabel("꽝");
		} 
		panel.add(rank);
		
	}
	public void clearPanel() {
		panel0.removeAll();
		panel1.removeAll();
		panel2.removeAll();
		panel3.removeAll();
		panel4.removeAll();
		panel5.removeAll();
	}
	
	public void loopResult() {
		System.out.println(getPlayTest());
		switch (getPlayTest()) {
			case 5:
				curcleResult(number3, "E", 500, panel5, curcleList.getList2());
				System.out.println("5");
			case 4:
				curcleResult(number3, "D", 400, panel4, curcleList.getList2());
				System.out.println("4");
			case 3:
				curcleResult(number3, "C", 300, panel3, curcleList.getList2());
				System.out.println("3");
			case 2:
				curcleResult(number3, "B", 200, panel2, curcleList.getList2());
				System.out.println("2");
			case 1:
				curcleResult(number2, "A", 100, panel1, curcleList.getList2());
				System.out.println("1");
		}
	}

	public void setPlayTest(int play) {
		this.play = play;
	}
	
	public int getPlayTest() {
		return play;
	}
	
	public void removeRandomList() {
		number.removeAll(number);
	}
}
