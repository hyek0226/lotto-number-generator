import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SelectPanel extends JPanel {
	public SelectPanel(LottoFrame frame) {
		setBounds(100, 100, 830, 532);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblCreateNumDesc = new JLabel("자동 번호로 발급 받기");
		lblCreateNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNumDesc.setBounds(12, 300, 137, 15);
		add(lblCreateNumDesc);
		
		JLabel lblSelectNumDesc = new JLabel("원하는 번호 직접 선택");
		lblSelectNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectNumDesc.setBounds(12, 134, 137, 15);
		add(lblSelectNumDesc);
		
		JPanel pnlNumber = new JPanel();
		pnlNumber.setBackground(Color.WHITE);
		pnlNumber.setBounds(155, 51, 335, 397);
		add(pnlNumber);
		pnlNumber.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(12, 10, 317, 57);
		pnlNumber.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("금액");
		lblNewLabel.setBounds(25, 8, 30, 37);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4_1 = new JLabel("0");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(192, 8, 57, 37);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("원");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(261, 8, 30, 37);
		panel.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.setBounds(252, 364, 77, 23);
		pnlNumber.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1");
		chckbxNewCheckBox.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setBounds(6, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2");
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBounds(55, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("3");
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2.setBounds(102, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("4");
		chckbxNewCheckBox_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3.setBounds(149, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("5");
		chckbxNewCheckBox_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4.setBounds(196, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("6");
		chckbxNewCheckBox_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5.setBounds(241, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("7");
		chckbxNewCheckBox_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1.setBounds(287, 86, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("8");
		chckbxNewCheckBox_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_6.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_6.setBounds(6, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("9");
		chckbxNewCheckBox_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_1.setBounds(55, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("10");
		chckbxNewCheckBox_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_1.setBounds(102, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("11");
		chckbxNewCheckBox_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3_1.setBounds(149, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("12");
		chckbxNewCheckBox_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4_1.setBounds(196, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4_1);
		
		JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("13");
		chckbxNewCheckBox_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_2.setBounds(241, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_2);
		
		JCheckBox chckbxNewCheckBox_5_1_1 = new JCheckBox("14");
		chckbxNewCheckBox_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1_1.setBounds(287, 121, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1_1);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("15");
		chckbxNewCheckBox_7.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_7.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_7.setBounds(6, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("16");
		chckbxNewCheckBox_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_2.setBounds(55, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("17");
		chckbxNewCheckBox_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_2.setBounds(102, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("18");
		chckbxNewCheckBox_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3_2.setBounds(149, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3_2);
		
		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("19");
		chckbxNewCheckBox_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4_2.setBounds(196, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4_2);
		
		JCheckBox chckbxNewCheckBox_5_3 = new JCheckBox("20");
		chckbxNewCheckBox_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_3.setBounds(241, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_3);
		
		JCheckBox chckbxNewCheckBox_5_1_2 = new JCheckBox("21");
		chckbxNewCheckBox_5_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1_2.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1_2.setBounds(287, 159, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1_2);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("22");
		chckbxNewCheckBox_8.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_8.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_8.setBounds(6, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("23");
		chckbxNewCheckBox_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_3.setBounds(55, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("24");
		chckbxNewCheckBox_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_3.setBounds(102, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_3);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("25");
		chckbxNewCheckBox_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3_3.setBounds(149, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3_3);
		
		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("26");
		chckbxNewCheckBox_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4_3.setBounds(196, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4_3);
		
		JCheckBox chckbxNewCheckBox_5_4 = new JCheckBox("27");
		chckbxNewCheckBox_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_4.setBounds(241, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_4);
		
		JCheckBox chckbxNewCheckBox_5_1_3 = new JCheckBox("7");
		chckbxNewCheckBox_5_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1_3.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1_3.setBounds(287, 196, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1_3);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("29");
		chckbxNewCheckBox_9.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_9.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_9.setBounds(6, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("30");
		chckbxNewCheckBox_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_4.setBounds(55, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_2_4 = new JCheckBox("31");
		chckbxNewCheckBox_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_4.setBounds(102, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_4);
		
		JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("32");
		chckbxNewCheckBox_3_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3_4.setBounds(149, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3_4);
		
		JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("33");
		chckbxNewCheckBox_4_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4_4.setBounds(196, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4_4);
		
		JCheckBox chckbxNewCheckBox_5_5 = new JCheckBox("34");
		chckbxNewCheckBox_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_5.setBounds(241, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_5);
		
		JCheckBox chckbxNewCheckBox_5_1_4 = new JCheckBox("35");
		chckbxNewCheckBox_5_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1_4.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1_4.setBounds(287, 233, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1_4);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("36");
		chckbxNewCheckBox_10.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_10.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_10.setBounds(6, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("37");
		chckbxNewCheckBox_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_5.setBounds(55, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_2_5 = new JCheckBox("38");
		chckbxNewCheckBox_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_5.setBounds(102, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_5);
		
		JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("39");
		chckbxNewCheckBox_3_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_3_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_3_5.setBounds(149, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_3_5);
		
		JCheckBox chckbxNewCheckBox_4_5 = new JCheckBox("40");
		chckbxNewCheckBox_4_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_4_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_4_5.setBounds(196, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_4_5);
		
		JCheckBox chckbxNewCheckBox_5_6 = new JCheckBox("41");
		chckbxNewCheckBox_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_6.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_6.setBounds(241, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_6);
		
		JCheckBox chckbxNewCheckBox_5_1_5 = new JCheckBox("42");
		chckbxNewCheckBox_5_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_5_1_5.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_5_1_5.setBounds(287, 271, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_5_1_5);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("43");
		chckbxNewCheckBox_11.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_11.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_11.setBounds(6, 306, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("44");
		chckbxNewCheckBox_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_1_6.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_1_6.setBounds(55, 306, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_2_6 = new JCheckBox("45");
		chckbxNewCheckBox_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox_2_6.setFont(new Font("굴림", Font.BOLD, 13));
		chckbxNewCheckBox_2_6.setBounds(102, 306, 42, 23);
		pnlNumber.add(chckbxNewCheckBox_2_6);
		
		JButton btnSelectNum = new JButton("수동");
		btnSelectNum.setBackground(new Color(176, 224, 230));
		btnSelectNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnSelectNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelectNum.setBounds(12, 150, 137, 134);
		add(btnSelectNum);
		
		JButton btnCreateNum = new JButton("자동");
		btnCreateNum.setBackground(new Color(176, 224, 230));
		btnCreateNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnCreateNum.setBounds(12, 314, 137, 134);
		add(btnCreateNum);
		
		JPanel pnlCount = new JPanel();
		pnlCount.setBackground(Color.WHITE);
		pnlCount.setBounds(12, 51, 137, 73);
		add(pnlCount);
		pnlCount.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4.setBounds(103, 25, 9, 18);
		pnlCount.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("수량");
		lblNewLabel_3.setFont(new Font("돋움", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(23, 9, 46, 49);
		pnlCount.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("당첨 확인");
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setBounds(678, 458, 117, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeResultPanel();
			}
		});
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("[ 수정 ]");
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(211, 211, 211));
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBounds(726, 108, 66, 31);
		add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("[ 삭제 ]");
		btnNewButton_3_1.setBorder(null);
		btnNewButton_3_1.setBackground(new Color(220, 220, 220));
		btnNewButton_3_1.setOpaque(false);
		btnNewButton_3_1.setBounds(726, 137, 66, 31);
		add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("[ 수정 ]");
		btnNewButton_3_2.setOpaque(false);
		btnNewButton_3_2.setBorder(null);
		btnNewButton_3_2.setBackground(new Color(211, 211, 211));
		btnNewButton_3_2.setBounds(726, 177, 66, 31);
		add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1_1 = new JButton("[ 삭제 ]");
		btnNewButton_3_1_1.setOpaque(false);
		btnNewButton_3_1_1.setBorder(null);
		btnNewButton_3_1_1.setBackground(new Color(220, 220, 220));
		btnNewButton_3_1_1.setBounds(726, 206, 66, 31);
		add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_3 = new JButton("[ 수정 ]");
		btnNewButton_3_3.setOpaque(false);
		btnNewButton_3_3.setBorder(null);
		btnNewButton_3_3.setBackground(new Color(211, 211, 211));
		btnNewButton_3_3.setBounds(726, 243, 66, 31);
		add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_2 = new JButton("[ 삭제 ]");
		btnNewButton_3_1_2.setOpaque(false);
		btnNewButton_3_1_2.setBorder(null);
		btnNewButton_3_1_2.setBackground(new Color(220, 220, 220));
		btnNewButton_3_1_2.setBounds(726, 272, 66, 31);
		add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_4 = new JButton("[ 수정 ]");
		btnNewButton_3_4.setOpaque(false);
		btnNewButton_3_4.setBorder(null);
		btnNewButton_3_4.setBackground(new Color(211, 211, 211));
		btnNewButton_3_4.setBounds(726, 311, 66, 31);
		add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_3 = new JButton("[ 삭제 ]");
		btnNewButton_3_1_3.setOpaque(false);
		btnNewButton_3_1_3.setBorder(null);
		btnNewButton_3_1_3.setBackground(new Color(220, 220, 220));
		btnNewButton_3_1_3.setBounds(726, 340, 66, 31);
		add(btnNewButton_3_1_3);
		
		JButton btnNewButton_3_5 = new JButton("[ 수정 ]");
		btnNewButton_3_5.setOpaque(false);
		btnNewButton_3_5.setBorder(null);
		btnNewButton_3_5.setBackground(new Color(211, 211, 211));
		btnNewButton_3_5.setBounds(726, 377, 66, 31);
		add(btnNewButton_3_5);
		
		JButton btnNewButton_3_1_4 = new JButton("[ 삭제 ]");
		btnNewButton_3_1_4.setOpaque(false);
		btnNewButton_3_1_4.setBorder(null);
		btnNewButton_3_1_4.setBackground(new Color(220, 220, 220));
		btnNewButton_3_1_4.setBounds(726, 406, 66, 31);
		add(btnNewButton_3_1_4);
		
		JPanel pnlSelectedNum = new JPanel();
		pnlSelectedNum.setBackground(Color.WHITE);
		pnlSelectedNum.setBounds(493, 51, 302, 397);
		add(pnlSelectedNum);
		pnlSelectedNum.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(0, 58, 234, 58);
		pnlSelectedNum.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 23, 58);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("선택 번호 확인");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 19, 116, 28);
		pnlSelectedNum.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("초기화");
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setBounds(209, 24, 81, 23);
		pnlSelectedNum.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(240, 248, 255));
		panel_1_1.setBounds(0, 126, 234, 58);
		pnlSelectedNum.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("B");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(0, 0, 23, 58);
		panel_1_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(240, 248, 255));
		panel_1_2.setBounds(0, 194, 234, 58);
		pnlSelectedNum.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("C");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(0, 0, 23, 58);
		panel_1_2.add(lblNewLabel_2_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(240, 248, 255));
		panel_1_3.setBounds(0, 262, 234, 58);
		pnlSelectedNum.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("D");
		lblNewLabel_2_3.setOpaque(true);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_3.setBounds(0, 0, 23, 58);
		panel_1_3.add(lblNewLabel_2_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(240, 248, 255));
		panel_1_4.setBounds(0, 327, 234, 58);
		pnlSelectedNum.add(panel_1_4);
		panel_1_4.setLayout(null);
		
		JLabel lblNewLabel_2_4 = new JLabel("E");
		lblNewLabel_2_4.setOpaque(true);
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_4.setBounds(0, 0, 23, 58);
		panel_1_4.add(lblNewLabel_2_4);
		
		JButton btn = new JButton("다음");
		btn.setBounds(42, 488, 129, 29);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btn);
		
	}
}
