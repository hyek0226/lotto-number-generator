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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.SystemColor;
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
	
	int finalPlay;
	
	JButton btnEditNumA;
	JButton btnEditNumB;
	JButton btnEditNumC;
	JButton btnEditNumD;
	JButton btnEditNumE;
	
	boolean editConfirm;


	public void resetNum() {	//처음으로 돌아왔을 때 초기 화면에 뜨게 할 내용임
		lblSelectedNumA.setText("과연 숫자는?!");
		lblSelectedNumB.setText("과연 숫자는?!");
		lblSelectedNumC.setText("과연 숫자는?!");
		lblSelectedNumD.setText("과연 숫자는?!");
		lblSelectedNumE.setText("과연 숫자는?!");
	}
	
	// 생성자
	public SelectPanel(LottoFrame frame) {
		setBackground(UIManager.getColor("Button.background"));
		setBounds(100, 100, 830, 532);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblSelectNumDesc = new JLabel("원하는 번호 직접 선택");
		lblSelectNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectNumDesc.setBounds(14, 137, 137, 15);
		add(lblSelectNumDesc);
		
		// Panel : 중앙 흰색 패널
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(255, 255, 255));
		pnlCenter.setBounds(155, 34, 338, 428);
		add(pnlCenter);
		pnlCenter.setLayout(null);
		
		// Panel : 가격 구성요소 패널
		JPanel pnlPrice = new JPanel();
		pnlPrice.setBackground(new Color(224, 255, 255));
		pnlPrice.setBounds(12, 25, 310, 57);
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
		pnlNum.setBounds(12, 99, 310, 288);
		pnlCenter.add(pnlNum);
		pnlNum.setLayout(new GridLayout(0, 7));
		
		
		// Button : 번호 선택 후 확인 버튼
		btnConfirmNum = new JButton("확인");
		btnConfirmNum.setBackground(SystemColor.menu);
		btnConfirmNum.setBounds(237, 395, 85, 23);
		btnConfirmNum.setEnabled(false);
		pnlCenter.add(btnConfirmNum);
		
		
		// Button : 수동 & 자동 버튼
		btnManualNum = new JButton("수동");
		btnManualNum.setBackground(new Color(175, 238, 238));
		btnManualNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnManualNum.setBounds(16, 158, 137, 100);
		add(btnManualNum);

		
		
//여기 버튼 수정했어요
		btnRandomNum = new JButton("자동");
		System.out.println(getCount());
		btnRandomNum.setActionCommand("자동");
		btnRandomNum.setBackground(new Color(175, 238, 238));
		btnRandomNum.setFont(new Font("돋움", Font.BOLD, 20));
		btnRandomNum.setBounds(16, 313, 137, 106);
		btnRandomNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("자동")) {
					for (int i = 0; i < 45; i++) {
						chkbxNum.get(i).setEnabled(false);
					}
					count++;
					setLabelText(randomnum());
				}
				setEnableEditBtn();
				System.out.println(count);
				afterChangeNum();
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
			}
		});
		
		
		// 자동 버튼 - 액션리스너 : 자동 버튼 누르면 체크박스 비활성화
		btnRandomNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getPlay() > 0) {
					--play;
				}
				for (int i = 0; i < 45; i++) {
					chkbxNum.get(i).setEnabled(false);
				}
				setPlayEnable();
				setLabelText();
				afterChangeNum();
			}
		});
		
		add(btnManualNum);
		add(btnRandomNum);

		// Panel : 게임 수 구성요소 담는 패널
		JPanel pnlCount = new JPanel();
		pnlCount.setBackground(new Color(255, 255, 255));
		pnlCount.setBounds(12, 34, 147, 428);
		add(pnlCount);
		pnlCount.setLayout(null);
		
		// Label : 게임 수량
		lblCount = new JLabel();
		lblCount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCount.setFont(new Font("굴림", Font.BOLD, 15));
		lblCount.setBounds(103, 47, 22, 18);	
		pnlCount.add(lblCount);
		
		JLabel lblCountDesc = new JLabel("수량"); 
		lblCountDesc.setFont(new Font("돋움", Font.BOLD, 14));
		lblCountDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountDesc.setBounds(12, 31, 46, 49);
		pnlCount.add(lblCountDesc);
		
		// Label : 자동 & 수동 설명
		JLabel lblCreateNumDesc = new JLabel("자동 번호로 발급 받기");
		lblCreateNumDesc.setBounds(2, 261, 137, 15);
		pnlCount.add(lblCreateNumDesc);
		lblCreateNumDesc.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Button : 당첨 확인 버튼 , 다음 페이지 전환
		// 게임 끝나기 전 까지 비활해야함
//		JButton btnNextPage = new JButton("당첨 확인");
//		btnNextPage.setBackground(new Color(255, 192, 203));
//		btnNextPage.setBounds(672, 455, 120, 31);
//		btnNextPage.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				count = 0;
//				frame.changeResultPanel(play);
//				frame.getResultPanel().setPlayTest(Integer.parseInt(lblCount.getText()));
//				System.out.println(lblCount.getText());
//			}
//		});
//		add(btnNextPage);
		
		// A ~ E 까지 수정 버튼
		btnEditNumA = new JButton("[ 수정 ]");
		btnEditNumA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				btnRandomNum.setEnabled(true);	// 자동
				btnManualNum.setEnabled(true);	// 수동
				setLabelText();
				selectNumber1.removeAll(selectNumber1);
				editConfirm = false;
				lblSelectedNumA.setBackground(Color.yellow);
				setEditBtnEnable(0);
			}
		});
		btnEditNumA.setBorder(null);
		btnEditNumA.setBackground(new Color(211, 211, 211));
		btnEditNumA.setOpaque(false);
		btnEditNumA.setBounds(726, 108, 66, 31);
		add(btnEditNumA);
		
		btnEditNumB = new JButton("[ 수정 ]");
		btnEditNumB.setOpaque(false);
		btnEditNumB.setBorder(null);
		btnEditNumB.setBackground(new Color(211, 211, 211));
		btnEditNumB.setBounds(726, 177, 66, 31);
		btnEditNumB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 1;
				btnRandomNum.setEnabled(true);	// 자동
				btnManualNum.setEnabled(true);	// 수동
				setLabelText();
				selectNumber2.removeAll(selectNumber2);
				editConfirm = false;
				lblSelectedNumB.setBackground(Color.yellow);
				setEditBtnEnable(count);
			}
		});
		add(btnEditNumB);
		
		btnEditNumC = new JButton("[ 수정 ]");	
		btnEditNumC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 2;
				btnRandomNum.setEnabled(true);	// 자동
				btnManualNum.setEnabled(true);	// 수동
				setLabelText();
				selectNumber3.removeAll(selectNumber3);
				editConfirm = false;
				lblSelectedNumC.setBackground(Color.yellow);
				setEditBtnEnable(count);
			}
		});
		btnEditNumC.setOpaque(false);
		btnEditNumC.setBorder(null);
		btnEditNumC.setBackground(new Color(211, 211, 211));
		btnEditNumC.setBounds(726, 243, 66, 31);
		add(btnEditNumC);
		
		btnEditNumD = new JButton("[ 수정 ]");
		btnEditNumD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 3;
				btnRandomNum.setEnabled(true);	// 자동
				btnManualNum.setEnabled(true);	// 수동
				setLabelText();
				selectNumber4.removeAll(selectNumber4);
				editConfirm = false;
				lblSelectedNumD.setBackground(Color.yellow);
				setEditBtnEnable(count);
			}
		});
		btnEditNumD.setOpaque(false);
		btnEditNumD.setBorder(null);
		btnEditNumD.setBackground(new Color(211, 211, 211));
		btnEditNumD.setBounds(726, 311, 66, 31);
		add(btnEditNumD);
		
		btnEditNumE = new JButton("[ 수정 ]");
		btnEditNumE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 4;
				btnRandomNum.setEnabled(true);	// 자동
				btnManualNum.setEnabled(true);	// 수동
				setLabelText();
				selectNumber5.removeAll(selectNumber5);
				editConfirm = false;
				lblSelectedNumE.setBackground(Color.yellow);
				setEditBtnEnable(count);
			}
		});
		btnEditNumE.setOpaque(false);
		btnEditNumE.setBorder(null);
		btnEditNumE.setBackground(new Color(211, 211, 211));
		btnEditNumE.setBounds(726, 377, 66, 31);
		add(btnEditNumE);

//		btnEditNumA.setEnabled(false);
//		btnEditNumB.setEnabled(false);
//		btnEditNumC.setEnabled(false);
//		btnEditNumD.setEnabled(false);
//		btnEditNumE.setEnabled(false);
		editButtonfalse();
		
		JPanel pnlSelectedNum = new JPanel();
		pnlSelectedNum.setBackground(new Color(255, 255, 255));
		pnlSelectedNum.setBounds(493, 34, 311, 428);
		add(pnlSelectedNum);
		pnlSelectedNum.setLayout(null);
		
		JPanel pnlSelectedNumA = new JPanel(); 
		pnlSelectedNumA.setBackground(new Color(255, 250, 250));
		pnlSelectedNumA.setBounds(0, 58, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumA);
		pnlSelectedNumA.setLayout(null);
		
		
		//여기서부터 A~E 라벨을 새로 만들었어요 총 5번 만든것이에요!
		lblSelectedNumA = new JLabel("과연 숫자는?!");
		lblSelectedNumA.setBounds(35, 20, 199, 18);
		lblSelectedNumA.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumA.setOpaque(true);
		lblSelectedNumA.setBackground(new Color(255, 250, 250));
		
		pnlSelectedNumA.add(lblSelectedNumA);
		
		JLabel lblSelectedNumDescA = new JLabel("A");
		lblSelectedNumDescA.setOpaque(true);
		lblSelectedNumDescA.setBackground(new Color(255, 192, 203));
		lblSelectedNumDescA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescA.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescA.setBounds(0, 0, 23, 58);
		pnlSelectedNumA.add(lblSelectedNumDescA);
		
		JLabel lblSelectedNumDesc = new JLabel("선택 번호 확인");
		lblSelectedNumDesc.setFont(new Font("굴림", Font.BOLD, 14));
		lblSelectedNumDesc.setBounds(2, 20, 116, 28);
		pnlSelectedNum.add(lblSelectedNumDesc);
		
		//초기화버튼 기능 추가
		JButton btnResetAllNum = new JButton("초기화");
		btnResetAllNum.setBackground(SystemColor.menu);
		btnResetAllNum.setBounds(221, 25, 81, 23);
		btnResetAllNum.setActionCommand("초기화");
		pnlSelectedNum.add(btnResetAllNum);
		
		btnResetAllNum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(btnResetAllNum.getActionCommand().equals("초기화")) {
				resetNum();
				setPanelColor();
				count = 0;	
				if(getPlay() < getFinalPlay()) {
					play = getFinalPlay();
					lblCount.setText(String.valueOf(getFinalPlay()));
					lblPrice.setText(String.valueOf(getFinalPlay() * 1000));
					removeAll();
				}
				btnRandomNum.setEnabled(true);
				btnManualNum.setEnabled(true);
				btnConfirmNum.setEnabled(true);
				
				editButtonfalse();
			
				}
			}
			});
		
		JPanel pnlSelectedNumB = new JPanel();
		pnlSelectedNumB.setBackground(new Color(255, 250, 250));
		pnlSelectedNumB.setBounds(0, 126, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumB);
		pnlSelectedNumB.setLayout(null);
		
		lblSelectedNumB = new JLabel("과연 숫자는?!");
		lblSelectedNumB.setBounds(35, 20, 199, 18);
		lblSelectedNumB.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumB.setOpaque(true);
		lblSelectedNumB.setBackground(new Color(255, 250, 250));

		pnlSelectedNumB.add(lblSelectedNumB);
		
		JLabel lblSelectedNumDescB = new JLabel("B");
		lblSelectedNumDescB.setOpaque(true);
		lblSelectedNumDescB.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescB.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescB.setBackground(new Color(255, 192, 203));
		lblSelectedNumDescB.setBounds(0, 0, 23, 58);
		pnlSelectedNumB.add(lblSelectedNumDescB);
		
		JPanel pnlSelectedNumC = new JPanel();
		pnlSelectedNumC.setBackground(new Color(255, 250, 250));
		pnlSelectedNumC.setBounds(0, 194, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumC);
		pnlSelectedNumC.setLayout(null);
		
		lblSelectedNumC = new JLabel("과연 숫자는?!");
		lblSelectedNumC.setBounds(35, 20, 199, 18);
		lblSelectedNumC.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumC.setOpaque(true);
		lblSelectedNumC.setBackground(new Color(255, 250, 250));
		pnlSelectedNumC.add(lblSelectedNumC);
		
		JLabel lblSelectedNumDescC = new JLabel("C");
		lblSelectedNumDescC.setOpaque(true);
		lblSelectedNumDescC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescC.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescC.setBackground(new Color(255, 192, 203));
		lblSelectedNumDescC.setBounds(0, 0, 23, 58);
		pnlSelectedNumC.add(lblSelectedNumDescC);
		
		JPanel pnlSelectedNumD = new JPanel();
		pnlSelectedNumD.setBackground(new Color(255, 250, 250));
		pnlSelectedNumD.setBounds(0, 262, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumD);
		pnlSelectedNumD.setLayout(null);
		
		lblSelectedNumD = new JLabel("과연 숫자는?!");
		lblSelectedNumD.setBounds(35, 20, 199, 18);
		lblSelectedNumD.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumD.setOpaque(true);
		lblSelectedNumD.setBackground(new Color(255, 250, 250));
		pnlSelectedNumD.add(lblSelectedNumD);
		
		lblSelectedNumDescD = new JLabel("D");
		lblSelectedNumDescD.setOpaque(true);
		lblSelectedNumDescD.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescD.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescD.setBackground(new Color(255, 192, 203));
		lblSelectedNumDescD.setBounds(0, 0, 23, 58);
		pnlSelectedNumD.add(lblSelectedNumDescD);
		
		JPanel pnlSelectedNumE = new JPanel();
		pnlSelectedNumE.setBackground(new Color(255, 250, 250));
		pnlSelectedNumE.setBounds(0, 327, 234, 58);
		pnlSelectedNum.add(pnlSelectedNumE);
		pnlSelectedNumE.setLayout(null);
		
		lblSelectedNumE = new JLabel("과연 숫자는?!");
		lblSelectedNumE.setBounds(35, 20, 199, 18);
		lblSelectedNumE.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumE.setOpaque(true);
		lblSelectedNumE.setBackground(new Color(255, 250, 250));
		pnlSelectedNumE.add(lblSelectedNumE);
		
		JLabel lblSelectedNumDescE = new JLabel("E");
		lblSelectedNumDescE.setOpaque(true);
		lblSelectedNumDescE.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNumDescE.setFont(new Font("굴림", Font.BOLD, 15));
		lblSelectedNumDescE.setBackground(new Color(255, 192, 203));
		lblSelectedNumDescE.setBounds(0, 0, 23, 58);
		pnlSelectedNumE.add(lblSelectedNumDescE);
		
		
		// 당첨 확인 버튼 : 다음 페이지 전환
		JButton btnNextPage_1 = new JButton("당첨 확인");
		btnNextPage_1.setBounds(209, 395, 93, 23);
		pnlSelectedNum.add(btnNextPage_1);
		btnNextPage_1.setBackground(SystemColor.menu);
		btnNextPage_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmEditSuccess();
				System.out.println(play);
				if (play <= 0 && editConfirm == true) { 
					frame.changeResultPanel(getFinalPlay());
					count = 0;
					editButtonfalse();
				} else if (play > 0){
					JOptionPane.showMessageDialog(null, play + " 번 남았습니다.", "돈안벌꺼니", JOptionPane.WARNING_MESSAGE);
				} else if (editConfirm == false)  {
					JOptionPane.showMessageDialog(null, "수정이 안된 회차가 있습니다.", "돈안벌꺼니", JOptionPane.WARNING_MESSAGE);
				} 
				frame.getResultPanel().setPlayTest(Integer.parseInt(lblCount.getText()));
				System.out.println(lblCount.getText());
				
			}
		});
		
		// 확인 버튼
		ActionListener confirmNumber = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getPlay() > 0) {
					--play;
				}
				count++;
				setLabelText(selectedNum);
				selectedNum.removeAll(selectedNum);
				ResetSelectedNum();
				setPlayEnable();
				setLabelText();
				ResetCheckBoxNum();
				setEnableEditBtn();
				afterChangeNum();
			}
		};
		btnConfirmNum.addActionListener(confirmNumber);
	}
	
	// 수동 : 숫자 6개 선택
	@Override
	public void actionPerformed(ActionEvent e) {
		btnConfirmNum.setEnabled(false);
		for(int i = 0; i < 45; i++) {
			if (chkbxNum.get(i).isSelected()) {
				if (selectedNum.size() <= 5) {
					selectedNum.add(Integer.parseInt(chkbxNum.get(i).getText()));
					if (selectedNum.size() >= 6) {
						btnConfirmNum.setEnabled(true);
						setCheckBoxNumEnable();
					}
				}
			} else if (chkbxNum.get(i).isSelected() == false) {
				selectedNum.remove(Integer.parseInt(chkbxNum.get(i).getText()));
			}
		}
		System.out.println(selectedNum);
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
	
	public void editButtonfalse() {
		btnEditNumA.setEnabled(false);
		btnEditNumB.setEnabled(false);
		btnEditNumC.setEnabled(false);
		btnEditNumD.setEnabled(false);
		btnEditNumE.setEnabled(false);
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
		if (play <= 0) {
			btnRandomNum.setEnabled(false);
			btnManualNum.setEnabled(false);
			btnConfirmNum.setEnabled(false);
		}
	}

	
	public void setResetPlay() {
		btnRandomNum.setEnabled(true);
		btnManualNum.setEnabled(true);
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

	public void setCheckBoxNumEnable() {
		for (int i = 0; i < 45; i++) {
			chkbxNum.get(i).setEnabled(false);
		}
	}
	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}


	public int getFinalPlay() {
		return finalPlay;
	}

	public void setFinalPlay(int finalPlay) {
		this.finalPlay = finalPlay;
	}

	
	public void removeAll() {
		selectNumber1.removeAll(selectNumber1);
		selectNumber2.removeAll(selectNumber2);
		selectNumber3.removeAll(selectNumber3);
		selectNumber4.removeAll(selectNumber4);
		selectNumber5.removeAll(selectNumber5);
	}
	public void setEnableEditBtn() {	// 값이 들어있을 때에만 수정버튼 클릭 가능
		if (getPlay() == 0) {
			switch (getFinalPlay()) {
			case 5:
				btnEditNumE.setEnabled(true);
			case 4:
				btnEditNumD.setEnabled(true);
			case 3:
				btnEditNumC.setEnabled(true);
			case 2:
				btnEditNumB.setEnabled(true);
			case 1:
				btnEditNumA.setEnabled(true);
			}
		}
	}
	public void setPanelColor() {
		lblSelectedNumA.setBackground(new Color(255, 250, 250));
		lblSelectedNumB.setBackground(new Color(255, 250, 250));
		lblSelectedNumC.setBackground(new Color(255, 250, 250));
		lblSelectedNumD.setBackground(new Color(255, 250, 250));
		lblSelectedNumE.setBackground(new Color(255, 250, 250));
	}
	
	// 수정이 완료되었는지 확인하는 메소드, 최종 횟수에 따라 각 개수의 배열에 값이 다들어갔는지 확인
	public void confirmEditSuccess() {
		switch (getFinalPlay()) {
		case 1:
			if (selectNumber1.size() == 6) {
				editConfirm = true;
			}
			break;
		case 2:
			if (selectNumber1.size() == 6 && selectNumber2.size() == 6) {
				editConfirm = true;
			}
			break;
		case 3:
			if (selectNumber1.size() == 6 && selectNumber2.size() == 6 && selectNumber3.size() == 6) {
				editConfirm = true;
			}
			break;
		case 4:
			if (selectNumber1.size() == 6 && selectNumber2.size() == 6 && selectNumber3.size() == 6 && selectNumber4.size() == 6) {
				editConfirm = true;
			}
			break;
		case 5:
			if (selectNumber1.size() == 6 && selectNumber2.size() == 6 && selectNumber3.size() == 6 && selectNumber4.size() == 6 && selectNumber5.size() == 6) {
				editConfirm = true;
			}
			break;
			
		}
	}
	public void afterChangeNum() {
		lblSelectedNumA.setBackground(new Color(255, 250, 250));
		lblSelectedNumB.setBackground(new Color(255, 250, 250));
		lblSelectedNumC.setBackground(new Color(255, 250, 250));
		lblSelectedNumD.setBackground(new Color(255, 250, 250));
		lblSelectedNumE.setBackground(new Color(255, 250, 250));
	}
	public void setEditBtnEnable(int btnEditNum) {
		JButton[] arr = {btnEditNumA, btnEditNumB, btnEditNumC, btnEditNumD, btnEditNumE}; 
		for (int i = 0; i < arr.length; i++) {
			if (i == btnEditNum) {
				arr[i].setEnabled(true);
			} else {
				arr[i].setEnabled(false);
			}
		}
	}
}








