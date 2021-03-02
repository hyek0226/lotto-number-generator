import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
// 임시 주석
public class SelectPanel extends JPanel implements ActionListener {
	LottoFrame lottoFrame;
	private JLabel lblSelectedNumDescD;
	private JLabel lblSelectedNumA;
	private JLabel lblSelectedNumB;
	private JLabel lblSelectedNumC;
	private JLabel lblSelectedNumD;
	private JLabel lblSelectedNumE;
	private String str;
	private JButton btnConfirmNum;
	private JLabel lblCount;
	private JButton btnManualNum;
	private JButton btnRandomNum;
	private JLabel lblPrice;
	List<Boolean> actionBoolean;
	List<JCheckBox> chkbxNum = new ArrayList<>();
	List<TreeSet> listSelectedNum = new ArrayList<>();
	
	int count = 0; // 진행 횟수
	int play; // 총 횟수

	
	// 선택된 6개 번호 담는 배열 A ~ E
	TreeSet<Integer> selectedNum = new TreeSet<Integer>();
	Set<Integer> temp = new TreeSet<>();
	
	Set<Integer> selectNumber1 = new TreeSet<>();
	Set<Integer> selectNumber2 = new TreeSet<>();
	Set<Integer> selectNumber3 = new TreeSet<>();
	Set<Integer> selectNumber4 = new TreeSet<>();
	Set<Integer> selectNumber5 = new TreeSet<>();
	
	private JButton btnNextPage;


	public void resetNum() {	//처음으로 돌아왔을 때 초기 화면에 뜨게 할 내용임
		lblSelectedNumA.setText("과연 숫자는?!");
		lblSelectedNumB.setText("과연 숫자는?!");
		lblSelectedNumC.setText("과연 숫자는?!");
		lblSelectedNumD.setText("과연 숫자는?!");
		lblSelectedNumE.setText("과연 숫자는?!");
	}
	
	// 생성자
	public SelectPanel(LottoFrame frame) {
//		selectNumber1.add(1);
//		selectNumber1.add(2);
//		selectNumber1.add(3);
//		selectNumber1.add(4);
//		selectNumber1.add(5);
//		selectNumber1.add(6);
//		
//		selectNumber2.add(1);
//		selectNumber2.add(2);
//		selectNumber2.add(3);
//		selectNumber2.add(4);
//		selectNumber2.add(5);
//		selectNumber2.add(7);
//	
//		selectNumber3.add(1);
//		selectNumber3.add(2);
//		selectNumber3.add(3);
//		selectNumber3.add(4);
//		selectNumber3.add(5);
//		selectNumber3.add(45);
//		
//		selectNumber4.add(1);
//		selectNumber4.add(2);
//		selectNumber4.add(3);
//		selectNumber4.add(4);
//		selectNumber4.add(43);
//		selectNumber4.add(45);
//		
//		selectNumber5.add(1);
//		selectNumber5.add(2);
//		selectNumber5.add(3);
//		selectNumber5.add(42);
//		selectNumber5.add(43);
//		selectNumber5.add(45);
		
		setBounds(100, 100, 830, 532);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		// Label : 자동 & 수동 설명
		JLabel lblCreateNumDesc = new JLabel("자동 번호로 발급 받기");
		lblCreateNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNumDesc.setBounds(12, 300, 137, 15);
		add(lblCreateNumDesc);
		
		JLabel lblSelectNumDesc = new JLabel("원하는 번호 직접 선택");
		lblSelectNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectNumDesc.setBounds(12, 134, 137, 15);
		add(lblSelectNumDesc);
		
		// Panel : 중앙 흰색 패널
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(Color.WHITE);
		pnlCenter.setBounds(155, 51, 334, 397);
		add(pnlCenter);
		pnlCenter.setLayout(null);
		
		// Panel : 가격 구성요소 패널
		JPanel pnlPrice = new JPanel();
		pnlPrice.setBackground(new Color(240, 248, 255));
		pnlPrice.setBounds(12, 10, 310, 57);
		pnlCenter.add(pnlPrice);
		pnlPrice.setLayout(null);
		
		JLabel lblPriceDesc = new JLabel("금액");
		lblPriceDesc.setBounds(25, 8, 30, 37);
		lblPriceDesc.setFont(new Font("굴림", Font.BOLD, 14));
		pnlPrice.add(lblPriceDesc);
		
		lblPrice = new JLabel("0");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setFont(new Font("굴림", Font.BOLD, 15));
		lblPrice.setBounds(192, 8, 57, 37);
		pnlPrice.add(lblPrice);
		
		JLabel lblWon = new JLabel("원");
		lblWon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWon.setFont(new Font("굴림", Font.BOLD, 15));
		lblWon.setBounds(261, 8, 30, 37);
		pnlPrice.add(lblWon);
		
		// Panel : 1 ~ 45 숫자 체크박스 담는 패널
		JPanel pnlNum = new JPanel();
		pnlNum.setBounds(12, 74, 310, 288);
		pnlCenter.add(pnlNum);
		pnlNum.setLayout(new GridLayout(0, 7));
		
		
		// Button : 번호 선택 후 확인 버튼
		btnConfirmNum = new JButton("확인");
		btnConfirmNum.setBounds(245, 368, 77, 23);
		btnConfirmNum.setEnabled(false);
		pnlCenter.add(btnConfirmNum);
		
		
		// Button : 수동 & 자동 버튼
		btnManualNum = new JButton("수동");
		btnManualNum.setBackground(new Color(176, 224, 230));
		btnManualNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnManualNum.setBounds(12, 150, 137, 134);
		add(btnManualNum);

		
		
//여기 버튼 수정했어요
		btnRandomNum = new JButton("자동");
		System.out.println(getCount());
//		if (getCount() <= 0) {
//			btnRandomNum.setEnabled(false);
//		}
		btnRandomNum.setActionCommand("자동");
		btnRandomNum.setBackground(new Color(176, 224, 230));
		btnRandomNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnRandomNum.setBounds(12, 314, 137, 134);
		btnRandomNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("자동")) {
					for (int i = 0; i < 45; i++) {
						chkbxNum.get(i).setEnabled(false);
					}
					count++;
					setLabelText(randomnum());
				}
				System.out.println(actionBoolean);
				
				System.out.println(count);
				
			}
		});
		
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

		// 수동 버튼 - 액션리스너 : 수동 버튼 누르면 체크박스 활성화
		btnManualNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 45; i++) {
					chkbxNum.get(i).setEnabled(true);
				}
//				++countAction;
//				System.out.println(countAction);
//				if (countAction > 0) {
//					System.out.println("눌렀음!");
//				}
			}
		});
		
		
		// 자동 버튼 - 액션리스너 : 자동 버튼 누르면 체크박스 비활성화
		btnRandomNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				play--;
				for (int i = 0; i < 45; i++) {
					chkbxNum.get(i).setEnabled(false);
				}
				setPlayEnable();
				setLabelText();
			}
		});
		
		add(btnManualNum);
		add(btnRandomNum);

		// Panel : 게임 수 구성요소 담는 패널
		JPanel pnlCount = new JPanel();
		pnlCount.setBackground(Color.WHITE);
		pnlCount.setBounds(12, 51, 137, 73);
		add(pnlCount);
		pnlCount.setLayout(null);
		
		// Label : 게임 수량
		lblCount = new JLabel();
		lblCount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCount.setFont(new Font("굴림", Font.BOLD, 15));
		lblCount.setBounds(103, 29, 22, 18);	
		pnlCount.add(lblCount);
		
		JLabel lblCountDesc = new JLabel("수량"); 
		lblCountDesc.setFont(new Font("돋움", Font.BOLD, 14));
		lblCountDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountDesc.setBounds(12, 13, 46, 49);
		pnlCount.add(lblCountDesc);
		
		
		// Button : 당첨 확인 버튼 , 다음 페이지 전환
		// 게임 끝나기 전 까지 비활해야함
		JButton btnNextPage = new JButton("당첨 확인");
		btnNextPage.setBackground(new Color(255, 192, 203));
		btnNextPage.setBounds(672, 455, 120, 31);
		btnNextPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				frame.changeResultPanel(play);
				frame.getResultPanel().setPlayTest(Integer.parseInt(lblCount.getText()));
				System.out.println(lblCount.getText());
			}
		});
		add(btnNextPage);
		// A ~ E 까지 수정, 삭제 버튼
		JButton btnEditNumA = new JButton("[ 수정 ]");
		btnEditNumA.setBorder(null);
		btnEditNumA.setBackground(new Color(211, 211, 211));
		btnEditNumA.setOpaque(false);
		btnEditNumA.setBounds(726, 108, 66, 31);
		add(btnEditNumA);
		
		JButton btnDeleteNumA = new JButton("[ 삭제 ]");
		btnDeleteNumA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//숫자를 입력하기 전엔 "과연 숫자는?!" 부분은 삭제를 눌러도 삭제되면 안된다.
				if(lblSelectedNumA.getText() != "과연 숫자는?!")	
				lblSelectedNumA.setText("");
			}
		});
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
		btnDeleteNumB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lblSelectedNumB.getText() != "과연 숫자는?!")
				lblSelectedNumB.setText("");
			}
		});
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
		btnDeleteNumC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lblSelectedNumC.getText() != "과연 숫자는?!")
				lblSelectedNumC.setText("");
			}
		});
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
		btnDeleteNumD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lblSelectedNumD.getText() != "과연 숫자는?!")
				lblSelectedNumD.setText("");
			}
		});
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
		btnDeleteNumE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lblSelectedNumE.getText() != "과연 숫자는?!")
				lblSelectedNumE.setText("");
			}
		});
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
		
		
		//여기서부터 A~E 라벨을 새로 만들었어요 총 5번 만든것이에요!
		lblSelectedNumA = new JLabel("과연 숫자는?!");
		lblSelectedNumA.setBounds(50, 0, 1000, 48);
		lblSelectedNumA.setFont(new Font("굴림", Font.BOLD, 15));
		pnlSelectedNumA.add(lblSelectedNumA);
		
		JLabel lblSelectedNumDescA = new JLabel("A");
		lblSelectedNumDescA.setOpaque(true);
		lblSelectedNumDescA.setBackground(new Color(255, 255, 255));
		lblSelectedNumDescA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescA.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescA.setBounds(0, 0, 23, 58);
		pnlSelectedNumA.add(lblSelectedNumDescA);
//		lblSelectedNumA = new JLabel(""); 
//		lblSelectedNumA.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSelectedNumA.setFont(new Font("굴림", Font.BOLD, 14));
//		lblSelectedNumA.setBounds(35, 11, 187, 36);
//		pnlSelectedNumA.add(lblSelectedNumA); 
		
		JLabel lblSelectedNumDesc = new JLabel("선택 번호 확인");
		lblSelectedNumDesc.setFont(new Font("굴림", Font.BOLD, 14));
		lblSelectedNumDesc.setBounds(12, 19, 116, 28);
		pnlSelectedNum.add(lblSelectedNumDesc);
		
		//초기화버튼 기능 추가
		JButton btnResetAllNum = new JButton("초기화");
		btnResetAllNum.setBackground(new Color(255, 192, 203));
		btnResetAllNum.setActionCommand("초기화");
		btnResetAllNum.setBounds(209, 24, 81, 23);
		pnlSelectedNum.add(btnResetAllNum);
		
		btnResetAllNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(btnResetAllNum.getActionCommand().equals("초기화")) {
				resetNum();
				count = 0;	
				if(getPlay() == 0) {
					play += 5;
					lblCount.setText(String.valueOf(getPlay()));
					lblPrice.setText(String.valueOf(getPlay() * 1000));
				}
				btnRandomNum.setEnabled(true);
				btnManualNum.setEnabled(true);
				btnConfirmNum.setEnabled(true);
			
				}
			}
			});
		
		JPanel pnlSelectedNumB = new JPanel();
		pnlSelectedNumB.setBackground(new Color(240, 248, 255));
		pnlSelectedNumB.setBounds(0, 126, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumB);
		pnlSelectedNumB.setLayout(null);
		
		lblSelectedNumB = new JLabel("과연 숫자는?!");
		lblSelectedNumB.setBounds(50, 0, 1000, 48);
		lblSelectedNumB.setFont(new Font("굴림", Font.BOLD, 15));
		pnlSelectedNumB.add(lblSelectedNumB);
		
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
		
		lblSelectedNumC = new JLabel("과연 숫자는?!");
		lblSelectedNumC.setBounds(50, 0, 1000, 48);
		lblSelectedNumC.setFont(new Font("굴림", Font.BOLD, 15));
		pnlSelectedNumC.add(lblSelectedNumC);
		
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
		
		lblSelectedNumD = new JLabel("과연 숫자는?!");
		lblSelectedNumD.setBounds(50, 0, 1000, 48);
		lblSelectedNumD.setFont(new Font("굴림", Font.BOLD, 15));
		pnlSelectedNumD.add(lblSelectedNumD);
		
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
		
		lblSelectedNumE = new JLabel("과연 숫자는?!");
		lblSelectedNumE.setBounds(50, 0, 1000, 48);
		lblSelectedNumE.setFont(new Font("굴림", Font.BOLD, 15));
		pnlSelectedNumE.add(lblSelectedNumE);
		
		JLabel lblSelectedNumDescE = new JLabel("E");
		lblSelectedNumDescE.setOpaque(true);
		lblSelectedNumDescE.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescE.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescE.setBackground(Color.WHITE);
		lblSelectedNumDescE.setBounds(0, 0, 23, 58);
		pnlSelectedNumE.add(lblSelectedNumDescE);
		
		// 확인 버튼
		ActionListener confirmNumber = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int cnt = getPlay() - 1;
				setPlay(cnt);
				count++;
				setLabelText(selectedNum);
				selectedNum.removeAll(selectedNum);
				ResetSelectedNum();
				setPlayEnable();
				setLabelText();
				ResetCheckBoxNum();
			}
		};
		btnConfirmNum.addActionListener(confirmNumber);
	}
	
	// 수동 - 숫자 6개 선택
	@Override
	public void actionPerformed(ActionEvent e) {
		btnConfirmNum.setEnabled(false);
		for(int i = 0; i < 45; i++) {
			if (chkbxNum.get(i).isSelected()) {
				if (selectedNum.size() <= 5) {
					selectedNum.add(Integer.parseInt(chkbxNum.get(i).getText()));
					if (selectedNum.size() == 6) {
						btnConfirmNum.setEnabled(true);
					}
				}
			} else if (chkbxNum.get(i).isSelected() == false) {
				selectedNum.remove(Integer.parseInt(chkbxNum.get(i).getText()));
			}
		}
	}
	
	public TreeSet randomnum() {
		TreeSet<Integer> randomSelectedNum = new TreeSet<Integer>();
		while(randomSelectedNum.size() < 6) {
			randomSelectedNum.add((int) (Math.random() * 45) + 1);
		}
		return randomSelectedNum;
	}
	
	
	public void setLabelText() {
		lblCount.setText(String.valueOf(getPlay()));
		lblPrice.setText(String.valueOf(getPlay() * 1000));
	}
	
	public Set<Integer> getTemp() {
		return temp;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void setLabelText(TreeSet<Integer> selectedNum) {
		if (count == 1) {
			lblSelectedNumA.setText(selectedNum.toString());
			Iterator<Integer> iterator = selectedNum.iterator();
			while (iterator.hasNext()) {
				selectNumber1.add(iterator.next());
			}
		} else if (count == 2) {
			lblSelectedNumB.setText(selectedNum.toString());
			Iterator<Integer> iterator = selectedNum.iterator();
			while (iterator.hasNext()) {
				selectNumber2.add(iterator.next());
			}
		} else if (count == 3) {
			lblSelectedNumC.setText(selectedNum.toString());
			Iterator<Integer> iterator = selectedNum.iterator();
			while (iterator.hasNext()) {
				selectNumber3.add(iterator.next());
			}
		} else if (count == 4) {
			lblSelectedNumD.setText(selectedNum.toString());
			Iterator<Integer> iterator = selectedNum.iterator();
			while (iterator.hasNext()) {
				selectNumber4.add(iterator.next());
			}
		} else if (count == 5) {
			lblSelectedNumE.setText(selectedNum.toString());
			Iterator<Integer> iterator = selectedNum.iterator();
			while (iterator.hasNext()) {
				selectNumber5.add(iterator.next());
			}
		}
	}
	
	public Set<Integer> getSelectNumber1() {
		return selectNumber1;
	}

	public Set<Integer> getSelectNumber2() {
		return selectNumber2;
	}

	public Set<Integer> getSelectNumber3() {
		return selectNumber3;
	}

	public Set<Integer> getSelectNumber4() {
		return selectNumber4;
	}

	public Set<Integer> getSelectNumber5() {
		return selectNumber5;
	}
	
	public void setPlayEnable() {
		if (play == 0) {
			btnRandomNum.setEnabled(false);
			btnManualNum.setEnabled(false);
			btnConfirmNum.setEnabled(false);
		}
	}

	
	public void ResetCheckBoxNum() {
		for (int i = 0; i < 45; i++) {
			chkbxNum.get(i).setSelected(false);
		}
	}
	
	public void ResetSelectedNum() {
		if (selectedNum.size() == 0) {
			btnConfirmNum.setEnabled(false);
		}
	}

	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}

	
}
















