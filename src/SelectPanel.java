import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SelectPanel extends JPanel implements ActionListener {
	private JLabel lblSelectedNumDescD;
	List<JCheckBox> chkbxNum = new ArrayList<>();
	List<TreeSet> listSelectedNum = new ArrayList<>();
	TreeSet<Integer> selectedNum = new TreeSet<Integer>();
	private JButton btnConfirmNum;
	private JLabel lblCount;
	
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
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(Color.WHITE);
		pnlCenter.setBounds(155, 51, 334, 397);
		add(pnlCenter);
		pnlCenter.setLayout(null);
		
		JPanel pnlPrice = new JPanel();
		pnlPrice.setBackground(new Color(240, 248, 255));
		pnlPrice.setBounds(12, 10, 310, 57);
		pnlCenter.add(pnlPrice);
		pnlPrice.setLayout(null);
		
		JLabel lblPriceDesc = new JLabel("금액");
		lblPriceDesc.setBounds(25, 8, 30, 37);
		lblPriceDesc.setFont(new Font("굴림", Font.BOLD, 14));
		pnlPrice.add(lblPriceDesc);
		
		JLabel lblPrice = new JLabel("0");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setFont(new Font("굴림", Font.BOLD, 15));
		lblPrice.setBounds(192, 8, 57, 37);
		pnlPrice.add(lblPrice);
		
		JLabel lblWon = new JLabel("원");
		lblWon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWon.setFont(new Font("굴림", Font.BOLD, 15));
		lblWon.setBounds(261, 8, 30, 37);
		pnlPrice.add(lblWon);
		
		JPanel pnlNum = new JPanel();
		pnlNum.setBounds(12, 74, 310, 288);
		pnlCenter.add(pnlNum);
		pnlNum.setLayout(new GridLayout(0, 7));
		
		btnConfirmNum = new JButton("확인");
		btnConfirmNum.setBounds(245, 368, 77, 23);
		btnConfirmNum.setEnabled(false);
		pnlCenter.add(btnConfirmNum);
		
		JButton btnManualNum = new JButton("수동");
		btnManualNum.setBackground(new Color(176, 224, 230));
		btnManualNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnManualNum.setBounds(12, 150, 137, 134);
		add(btnManualNum);
		
		JButton btnRandomNum = new JButton("자동");
		btnRandomNum.setBackground(new Color(176, 224, 230));
		btnRandomNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnRandomNum.setBounds(12, 314, 137, 134);
		add(btnRandomNum);
		
		
		// 1 ~ 45 로또 선택 숫자 (기본 : 비활성화)
		int num = 1;
		for (int i = 0; i < 45; i++) {
			String stringNum = Integer.toString(num);
			chkbxNum.add(new JCheckBox(stringNum));
			pnlNum.add(chkbxNum.get(i));
			chkbxNum.get(i).setEnabled(false);
			chkbxNum.get(i).setFont(new Font("굴림", Font.BOLD, 13));
			num++;
			chkbxNum.get(i).addActionListener(this);
		}

		
		btnManualNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 45; i++) {
					chkbxNum.get(i).setEnabled(true);
				}
			}
		});
		
		btnRandomNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 45; i++) {
					chkbxNum.get(i).setEnabled(false);
				}
			}
		});
		
		add(btnManualNum);
		add(btnRandomNum);
		

		JPanel pnlCount = new JPanel();
		pnlCount.setBackground(Color.WHITE);
		pnlCount.setBounds(12, 51, 137, 73);
		add(pnlCount);
		pnlCount.setLayout(null);
		
		lblCount = new JLabel();	// 수량
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
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 45; i++) {
			if (chkbxNum.get(i).isSelected()) {
				if (selectedNum.size() < 5) {
					selectedNum.add(Integer.parseInt(chkbxNum.get(i).getText()));
				} else {
					btnConfirmNum.setEnabled(true);
				}
			}
		}
	}
	
	public void setLabelText(int play) {
		lblCount.setText(String.valueOf(play));
	}
}















