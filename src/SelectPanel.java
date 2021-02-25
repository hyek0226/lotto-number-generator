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
	private JLabel lblSelectedNumDescD;
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
		
		JLabel lblPriceDesc = new JLabel("금액");
		lblPriceDesc.setBounds(25, 8, 30, 37);
		lblPriceDesc.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(lblPriceDesc);
		
		JLabel lblPrice = new JLabel("0");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setFont(new Font("굴림", Font.BOLD, 15));
		lblPrice.setBounds(192, 8, 57, 37);
		panel.add(lblPrice);
		
		JLabel lblWon = new JLabel("원");
		lblWon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWon.setFont(new Font("굴림", Font.BOLD, 15));
		lblWon.setBounds(261, 8, 30, 37);
		panel.add(lblWon);
		
		JButton btnConfirmNum = new JButton("확인");
		btnConfirmNum.setBounds(252, 364, 77, 23);
		pnlNumber.add(btnConfirmNum);
		
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
		
		JCheckBox chckbxNewCheckBox_5_1_3 = new JCheckBox("28");
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
		
		JButton btnManualNum = new JButton("수동");
		btnManualNum.setBackground(new Color(176, 224, 230));
		btnManualNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnManualNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManualNum.setBounds(12, 150, 137, 134);
		add(btnManualNum);
		
		JButton btnRandomNum = new JButton("자동");
		btnRandomNum.setBackground(new Color(176, 224, 230));
		btnRandomNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnRandomNum.setBounds(12, 314, 137, 134);
		add(btnRandomNum);
		
		JPanel pnlCount = new JPanel();
		pnlCount.setBackground(Color.WHITE);
		pnlCount.setBounds(12, 51, 137, 73);
		add(pnlCount);
		pnlCount.setLayout(null);
		
		JLabel lblCount = new JLabel("0");
		lblCount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCount.setFont(new Font("굴림", Font.BOLD, 15));
		lblCount.setBounds(103, 25, 9, 18);
		pnlCount.add(lblCount);
		
		JLabel lblCountDesc = new JLabel("수량");
		lblCountDesc.setFont(new Font("돋움", Font.BOLD, 14));
		lblCountDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountDesc.setBounds(23, 9, 46, 49);
		pnlCount.add(lblCountDesc);
		
		JButton btnNextPage = new JButton("당첨 확인");
		btnNextPage.setBackground(new Color(255, 192, 203));
		btnNextPage.setBounds(672, 455, 120, 31);
		btnNextPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeResultPanel();
			}
		});
		add(btnNextPage);
		
		JButton btnEditNumA = new JButton("[ 수정 ]");
		btnEditNumA.setBorder(null);
		btnEditNumA.setBackground(new Color(211, 211, 211));
		btnEditNumA.setOpaque(false);
		btnEditNumA.setBounds(726, 108, 66, 31);
		add(btnEditNumA);
		
		JButton btnDeleteNumA = new JButton("[ 삭제 ]");
		btnDeleteNumA.setBorder(null);
		btnDeleteNumA.setBackground(new Color(220, 220, 220));
		btnDeleteNumA.setOpaque(false);
		btnDeleteNumA.setBounds(726, 137, 66, 31);
		add(btnDeleteNumA);
		
		JButton btnEditNumB = new JButton("[ 수정 ]");
		btnEditNumB.setOpaque(false);
		btnEditNumB.setBorder(null);
		btnEditNumB.setBackground(new Color(211, 211, 211));
		btnEditNumB.setBounds(726, 177, 66, 31);
		add(btnEditNumB);
		
		JButton btnDeleteNumB = new JButton("[ 삭제 ]");
		btnDeleteNumB.setOpaque(false);
		btnDeleteNumB.setBorder(null);
		btnDeleteNumB.setBackground(new Color(220, 220, 220));
		btnDeleteNumB.setBounds(726, 206, 66, 31);
		add(btnDeleteNumB);
		
		JButton btnEditNumC = new JButton("[ 수정 ]");
		btnEditNumC.setOpaque(false);
		btnEditNumC.setBorder(null);
		btnEditNumC.setBackground(new Color(211, 211, 211));
		btnEditNumC.setBounds(726, 243, 66, 31);
		add(btnEditNumC);
		
		JButton btnDeleteNumC = new JButton("[ 삭제 ]");
		btnDeleteNumC.setOpaque(false);
		btnDeleteNumC.setBorder(null);
		btnDeleteNumC.setBackground(new Color(220, 220, 220));
		btnDeleteNumC.setBounds(726, 272, 66, 31);
		add(btnDeleteNumC);
		
		JButton btnEditNumD = new JButton("[ 수정 ]");
		btnEditNumD.setOpaque(false);
		btnEditNumD.setBorder(null);
		btnEditNumD.setBackground(new Color(211, 211, 211));
		btnEditNumD.setBounds(726, 311, 66, 31);
		add(btnEditNumD);
		
		JButton btnDeleteNumD = new JButton("[ 삭제 ]");
		btnDeleteNumD.setOpaque(false);
		btnDeleteNumD.setBorder(null);
		btnDeleteNumD.setBackground(new Color(220, 220, 220));
		btnDeleteNumD.setBounds(726, 340, 66, 31);
		add(btnDeleteNumD);
		
		JButton btnEditNumE = new JButton("[ 수정 ]");
		btnEditNumE.setOpaque(false);
		btnEditNumE.setBorder(null);
		btnEditNumE.setBackground(new Color(211, 211, 211));
		btnEditNumE.setBounds(726, 377, 66, 31);
		add(btnEditNumE);
		
		JButton btnDeleteNumE = new JButton("[ 삭제 ]");
		btnDeleteNumE.setOpaque(false);
		btnDeleteNumE.setBorder(null);
		btnDeleteNumE.setBackground(new Color(220, 220, 220));
		btnDeleteNumE.setBounds(726, 406, 66, 31);
		add(btnDeleteNumE);
		
		JPanel pnlSelectedNum = new JPanel();
		pnlSelectedNum.setBackground(Color.WHITE);
		pnlSelectedNum.setBounds(493, 51, 302, 397);
		add(pnlSelectedNum);
		pnlSelectedNum.setLayout(null);
		
		JPanel pnlSelectedNumA = new JPanel();
		pnlSelectedNumA.setBackground(new Color(240, 248, 255));
		pnlSelectedNumA.setBounds(0, 58, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumA);
		pnlSelectedNumA.setLayout(null);
		
		JLabel lblSelectedNumDescA = new JLabel("A");
		lblSelectedNumDescA.setOpaque(true);
		lblSelectedNumDescA.setBackground(new Color(255, 255, 255));
		lblSelectedNumDescA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescA.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescA.setBounds(0, 0, 23, 58);
		pnlSelectedNumA.add(lblSelectedNumDescA);
		
		JLabel lblSelectedNumDesc = new JLabel("선택 번호 확인");
		lblSelectedNumDesc.setFont(new Font("굴림", Font.BOLD, 14));
		lblSelectedNumDesc.setBounds(12, 19, 116, 28);
		pnlSelectedNum.add(lblSelectedNumDesc);
		
		JButton btnResetAllNum = new JButton("초기화");
		btnResetAllNum.setBackground(new Color(255, 192, 203));
		btnResetAllNum.setBounds(209, 24, 81, 23);
		pnlSelectedNum.add(btnResetAllNum);
		
		JPanel pnlSelectedNumB = new JPanel();
		pnlSelectedNumB.setBackground(new Color(240, 248, 255));
		pnlSelectedNumB.setBounds(0, 126, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumB);
		pnlSelectedNumB.setLayout(null);
		
		JLabel lblSelectedNumDescB = new JLabel("B");
		lblSelectedNumDescB.setOpaque(true);
		lblSelectedNumDescB.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescB.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescB.setBackground(Color.WHITE);
		lblSelectedNumDescB.setBounds(0, 0, 23, 58);
		pnlSelectedNumB.add(lblSelectedNumDescB);
		
		JPanel pnlSelectedNumC = new JPanel();
		pnlSelectedNumC.setBackground(new Color(240, 248, 255));
		pnlSelectedNumC.setBounds(0, 194, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumC);
		pnlSelectedNumC.setLayout(null);
		
		JLabel lblSelectedNumDescC = new JLabel("C");
		lblSelectedNumDescC.setOpaque(true);
		lblSelectedNumDescC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescC.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescC.setBackground(Color.WHITE);
		lblSelectedNumDescC.setBounds(0, 0, 23, 58);
		pnlSelectedNumC.add(lblSelectedNumDescC);
		
		JPanel pnlSelectedNumD = new JPanel();
		pnlSelectedNumD.setBackground(new Color(240, 248, 255));
		pnlSelectedNumD.setBounds(0, 262, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumD);
		pnlSelectedNumD.setLayout(null);
		
		lblSelectedNumDescD = new JLabel("D");
		lblSelectedNumDescD.setOpaque(true);
		lblSelectedNumDescD.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescD.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescD.setBackground(Color.WHITE);
		lblSelectedNumDescD.setBounds(0, 0, 23, 58);
		pnlSelectedNumD.add(lblSelectedNumDescD);
		
		JPanel pnlSelectedNumE = new JPanel();
		pnlSelectedNumE.setBackground(new Color(240, 248, 255));
		pnlSelectedNumE.setBounds(0, 327, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumE);
		pnlSelectedNumE.setLayout(null);
		
		JLabel lblSelectedNumDescE = new JLabel("E");
		lblSelectedNumDescE.setOpaque(true);
		lblSelectedNumDescE.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescE.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescE.setBackground(Color.WHITE);
		lblSelectedNumDescE.setBounds(0, 0, 23, 58);
		pnlSelectedNumE.add(lblSelectedNumDescE);
		
	}
}
