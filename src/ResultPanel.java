import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
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

public class ResultPanel extends JPanel implements ActionListener {
	List<Set> resultList = new ArrayList<>();
	Set<Integer> number = new TreeSet<>();
	TestFrame frame = new TestFrame();
	private final JLabel lblNewLabel_1 = new JLabel("당첨 결과");
	NumberCurcle nc1 = new NumberCurcle(resultList, number);
	private final JLabel lblNewLabel = new JLabel("당신이 뽑은 숫자");
	
	
	public ResultPanel(LottoFrame frame) {
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(30);
		number.add(20);
		resultList.add(number);
		setPreferredSize(new Dimension(830, 530));
		setMaximumSize(new Dimension(830, 530));
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(120, 61, 600, 79);
		panel.add(nc1);
		add(panel);
		
		
		
		JButton resultButton = new JButton("당첨 결과 확인");
		resultButton.setBounds(128, 472, 153, 29);
		resultButton.addActionListener(this);
		add(resultButton);
		
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setBounds(553, 472, 105, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();
			}
		});
		add(btnNewButton_1);
		lblNewLabel_1.setBounds(328, 10, 78, 21);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(lblNewLabel_1);
		lblNewLabel.setBounds(343, 164, 138, 21);
		add(lblNewLabel);
		NumberList list = new NumberList(resultList, number);
		list.setBounds(174, 200, 500, 100);
		add(list);
		
		NumberList list_1 = new NumberList(resultList, number);
		list_1.setBounds(174, 325, 500, 100);
		add(list_1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog(frame);
		dialog.setSize(100, 100);
		dialog.setVisible(true);
	}
}
