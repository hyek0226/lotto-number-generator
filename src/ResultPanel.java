import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ResultPanel extends JPanel {
	// 랜덤 숫자 담는 배열
	private List<Integer> number = new ArrayList<>();
	// 1회차 ~ 5회차 숫자 담는 배열
	private Set<Integer> number2 = new TreeSet<>();
	private Set<Integer> number3 = new TreeSet<>();
	private Set<Integer> number4 = new TreeSet<>();
	private Set<Integer> number5 = new TreeSet<>();
	private Set<Integer> number6 = new TreeSet<>();
	
	private int count = 0;
	private Random r = new Random();
	private CurcleList curcleList;
	
	// 공을 담는 패널들
	private JPanel panel0 = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	
	private int play = 0;
	private final JLabel lblNewLabel_1 = new JLabel("당첨 결과");
	
	public ResultPanel(LottoFrame frame, Set<Integer> n1, Set<Integer> n2, Set<Integer> n3, Set<Integer> n4, Set<Integer> n5) {
		
		// 숫자 선택 패널 (selectPanel)에서 파라미터로 받아온 배열들과 현재 클래스 필드 안 배열들을 연결
		number2 = n1;
		
		number3 = n2;
		
		number4 = n3;
		
		number5 = n4;
		
		number6 = n5;
		
		// 패널 색깔, 사이즈, 위치 선정
		panel0.setBackground(Color.WHITE);
		panel0.setBounds(50, 100, 700, 80);
		add(panel0);
		
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(50, 270, 700, 80);
		add(panel1);
		
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(50, 370, 700, 80);
		add(panel2);
		
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(50, 470, 700, 80);
		add(panel3);
		
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(50, 570, 700, 80);
		add(panel4);
		
		panel5.setBackground(Color.WHITE);
		panel5.setBounds(50, 670, 700, 80);
		add(panel5);
		
		// 패널 사이즈 설정
		setPreferredSize(new Dimension(830, 800));
		setMaximumSize(new Dimension(830, 800));
		
		// 처음으로 가는 버튼
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setFont(new Font("함초롬바탕", Font.BOLD, 18));
		btnNewButton_1.setForeground(SystemColor.window);
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(629, 27, 121, 36);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();	
			}
		});
		add(btnNewButton_1);

		setLayout(null);
		
		// 라벨들
		JLabel lblNewLabel = new JLabel("로또 결과");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.PLAIN, 25));
		lblNewLabel.setBounds(360, 27, 108, 46);
		add(lblNewLabel);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(360, 197, 108, 46);
		add(lblNewLabel_1);
		
	}
	
	// 랜덤한 보너스 숫자를 생성하는 메소드
	public int randomBonusNumber() {
		int bonus = 0;
		do {
			bonus = r.nextInt(45) + 1;
		} while (number.contains(bonus));
		return bonus;
	}
	
	// 랜덤한 결과 리스트를 생성하는 메소드
	public void randomNumber() {
		Set<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			int ranNum = r.nextInt(45) + 1;
			set.add(ranNum);
		}
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			number.add(iterator.next());
		}
		number.add(randomBonusNumber());
	}
	
	
	// 랜덤한 공을 생성하는 메소드
	public void createRandomCurcle() {
		int x = 10;
		curcleList = new CurcleList(number, number2);
		// curcleList에서 만들어진 Curcle을 받아서 패널에 추가
		for (int j = 0; j < 7; j++) {
			Curcle curcle = curcleList.getResultList().get(j);
			curcle.setBounds(x, 1, 100, 100);
			x += 100;
			panel0.add(curcle);
		}
	}
	
	// 공을 만드는 클래스를 생성하는 메소드
	public void curcleResult(Set<Integer> numList, String a, int h, JPanel panel, List<Boolean> bList) {
		// CurcleList 클래스 생성 (랜덤 배열과 선택한 배열을 파라미터로 받음)
		curcleList = new CurcleList(number, numList);
		// 알파벳 생성
		JLabel alphabet = new JLabel(a);
		alphabet.setFont(new Font("함초롬바탕", Font.PLAIN, 25));
		panel.add(alphabet);
		
		int x = 10;
		// curcleList에서 만들어진 Curcle을 받아서 패널에 추가
		for (int i = 0; i < 6; i++) {
			Curcle curcle = curcleList.getSelectList().get(i);
			curcle.setBounds(x, h, 100, 100);
			x += 100;
			panel.add(curcle);
		}
		
		// 1등 ~ 5등 가르는 if문 구절
		// 갯수와 1등 2등을 가르는 boolean 값으로 구별함
		JLabel rank;
		if (curcleList.getCount() == 6 && curcleList.isOneTwo() == false) {
			rank = new JLabel("1 등");
		} else if (curcleList.getCount() == 6 && curcleList.isOneTwo() == true) {
			rank = new JLabel("2 등");
		} else if (curcleList.getCount() == 5 && curcleList.isOneTwo() == false) {
			rank = new JLabel("3 등");
		} else if (curcleList.getCount() == 4 && curcleList.isOneTwo() == false) {
			rank = new JLabel("4 등");
		} else if (curcleList.getCount() == 3 && curcleList.isOneTwo() == false) {
			rank = new JLabel("5 등");
		} else {
			rank = new JLabel("낙첨");
		} 
		rank.setFont(new Font("함초롬바탕", Font.PLAIN, 20));
		panel.add(rank);
	}
	
	// 패널에 생긴 공을 지워주는 메소드
	// 반복 게임을 수행하면 계속 공이 추가되기 때문에 사용
	public void clearPanel() {
		panel0.removeAll();
		panel1.removeAll();
		panel2.removeAll();
		panel3.removeAll();
		panel4.removeAll();
		panel5.removeAll();
	}
	
	// 횟수를 받아와 curcleResult를 횟수만큼 호출하는 메소드
	// 스위치문 케이스를 거꾸로 설정
	public void loopResult() {
		switch (getPlayTest()) {
			case 5:
				curcleResult(number6, "E", 500, panel5, curcleList.getList2());
			case 4:
				curcleResult(number5, "D", 400, panel4, curcleList.getList2());
			case 3:
				curcleResult(number4, "C", 300, panel3, curcleList.getList2());
			case 2:
				curcleResult(number3, "B", 200, panel2, curcleList.getList2());
			case 1:
				curcleResult(number2, "A", 100, panel1, curcleList.getList2());
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

	public List<Integer> getNumber() {
		return number;
	}

	public Set<Integer> getNumber2() {
		return number2;
	}

	public Set<Integer> getNumber3() {
		return number3;
	}

	public Set<Integer> getNumber4() {
		return number4;
	}

	public Set<Integer> getNumber5() {
		return number5;
	}

	public Set<Integer> getNumber6() {
		return number6;
	}

	public CurcleList getCurcleList() {
		return curcleList;
	}
	
	

}
