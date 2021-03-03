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

public class BeforeResultPanel extends JPanel {
	List<Set> resultList = new ArrayList<>();
	Set<Integer> number = new TreeSet<>();
	Set<Integer> number2 = new TreeSet<>();
	Set<Integer> number3 = new TreeSet<>();
	Set<Integer> number4 = new TreeSet<>();
	Set<Integer> number5 = new TreeSet<>();
	Set<Integer> number6 = new TreeSet<>();
	int count = 0;
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
	public BeforeResultPanel(LottoFrame frame, Set<Integer> n1, Set<Integer> n2, Set<Integer> n3, Set<Integer> n4, Set<Integer> n5) {
		number2 = n1;
		
		number3 = n2;
		
		number4 = n3;
		
		number5 = n4;
		
		number6 = n5;
		
		for (int i = 0; i < 7; i++) {
			number.add(i);
			number2.add(i);
			number3.add(i);
			number4.add(i);
			number5.add(i);
			number6.add(i);
		}
		
		panel0.setBackground(SystemColor.window);
		panel0.setBounds(50, 100, 700, 80);
		add(panel0);
		
		panel1.setBackground(SystemColor.window);
		panel1.setBounds(50, 270, 700, 80);
		add(panel1);
		
		panel2.setBackground(SystemColor.window);
		panel2.setBounds(50, 370, 700, 80);
		add(panel2);
		
		panel3.setBackground(SystemColor.window);
		panel3.setBounds(50, 470, 700, 80);
		add(panel3);
		
		panel4.setBackground(SystemColor.window);
		panel4.setBounds(50, 570, 700, 80);
		add(panel4);
		
		panel5.setBackground(SystemColor.window);
		panel5.setBounds(50, 670, 700, 80);
		add(panel5);
		
		System.out.println(number);
		setPreferredSize(new Dimension(830, 800));
		setMaximumSize(new Dimension(830, 800));
		
		
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
		btnNewButton_1.setBounds(622, 15, 128, 39);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();	
			}
		});
		setLayout(null);
		setLayout(null);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("로또 결과");
		lblNewLabel.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 25));
		lblNewLabel.setBounds(370, 39, 104, 32);
		add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(370, 209, 104, 32);
		
		add(lblNewLabel_1);
		
	}

	
	public void createRandomCurcle(Set<Integer> number, int count) {
		int x = 10;
		curcleList = new CurcleList(number, number2);
		if (count > 0) {
			for (int j = 0; j < 7; j++) {
				Curcle curcle = curcleList.getResultList().get(j);
				curcle.setBounds(x, 1, 100, 100);
				x += 100;
				panel0.add(curcle);
			}
		}
		
	}
	
	public void curcleResult(Set<Integer> number, Set<Integer> numList, String a, int h, JPanel panel, List<Boolean> bList) {
		curcleList = new CurcleList(number, numList);
		int x = 10;
		JLabel alphabet = new JLabel(a);
		alphabet.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
		panel.add(alphabet);
		for (int i = 0; i < 6; i++) {
			Curcle curcle = curcleList.getSelectList().get(i);
			curcle.setBounds(x, h, 100, 100);
			x += 100;
			panel.add(curcle);
		}
		
		JLabel rank;
		if (curcleList.getCount() == 6 && curcleList.isOneTwo() == false) {
			rank = new JLabel("1 등");
			System.out.println("1등" + curcleList.isOneTwo());
		} else if (curcleList.getCount() == 6 && curcleList.isOneTwo() == true) {
			rank = new JLabel("2 등");
			System.out.println("2등" + curcleList.isOneTwo());
		} else if (curcleList.getCount() == 5 && curcleList.isOneTwo() == false) {
			rank = new JLabel("3 등");
			System.out.println("3등" + curcleList.isOneTwo());
		} else if (curcleList.getCount() == 4 && curcleList.isOneTwo() == false) {
			rank = new JLabel("4 등");
			System.out.println("4등" + curcleList.isOneTwo());
		} else if (curcleList.getCount() == 3 && curcleList.isOneTwo() == false) {
			rank = new JLabel("5 등");
			System.out.println("5등" + curcleList.isOneTwo() + count);
		} else {
			rank = new JLabel("낙점");
		} 
		rank.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
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
	
	public void loopResult(int play, Set<Integer> number, Set<Integer> number2, Set<Integer> number3, Set<Integer>number4, Set<Integer> number5, Set<Integer> number6, CurcleList curcleList) {
		System.out.println(play);
		switch (play) {
			case 5:
				curcleResult(number, number6, "E", 500, panel5, curcleList.getList2());
				System.out.println("5");
			case 4:
				curcleResult(number, number5, "D", 400, panel4, curcleList.getList2());
				System.out.println("4");
			case 3:
				curcleResult(number, number4, "C", 300, panel3, curcleList.getList2());
				System.out.println("3");
			case 2:
				curcleResult(number, number3, "B", 200, panel2, curcleList.getList2());
				System.out.println("2");
			case 1:
				curcleResult(number, number2, "A", 100, panel1, curcleList.getList2());
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Set<Integer> getNumber() {
		return number;
	}
	
	

}
