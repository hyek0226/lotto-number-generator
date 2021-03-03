import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class BeforeResultPanel extends JPanel {
	// 랜덤 숫자 넣는 배열
	Set<Integer> number = new TreeSet<>();
	// 1~5회차에 선택한 숫자 넣는 배열
	Set<Integer> number2 = new TreeSet<>();
	Set<Integer> number3 = new TreeSet<>();
	Set<Integer> number4 = new TreeSet<>();
	Set<Integer> number5 = new TreeSet<>();
	Set<Integer> number6 = new TreeSet<>();
	
	int count = 0;
	Random r = new Random();
	
	// CurcleList
	CurcleList curcleList;
	// 로또 결과 넣는 패널
	JPanel panel0 = new JPanel();
	// 당첨 결과 넣는 패널
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	// 플레이 횟수 받아오는 정수
	int play = 0;
	private final JLabel lblNewLabel_1 = new JLabel("당첨 결과");
	
	public BeforeResultPanel(LottoFrame frame, Set<Integer> n1, Set<Integer> n2, Set<Integer> n3, Set<Integer> n4, Set<Integer> n5) {
		
		// 정수 배열들에게 임시의 값을 넣어줌
		// (오류 방지)
		for (int i = 0; i < 7; i++) {
			number.add(i);
			number2.add(i);
			number3.add(i);
			number4.add(i);
			number5.add(i);
			number6.add(i);
		}
		
		// 정수 넣는 패널의 색깔과 위치 선정
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
		
		// 예전 결과 확인 패널의 사이즈
		setPreferredSize(new Dimension(830, 800));
		setMaximumSize(new Dimension(830, 800));
		
		
		// 처음으로 돌아가는 버튼
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("함초롬바탕", Font.PLAIN, 20));
		btnNewButton_1.setBounds(622, 15, 128, 39);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();	
			}
		});
		add(btnNewButton_1);
		
		setLayout(null);
		
		// 라벨
		JLabel lblNewLabel = new JLabel("로또 결과");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.PLAIN, 25));
		lblNewLabel.setBounds(370, 39, 104, 32);
		add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(370, 209, 104, 32);
		
		add(lblNewLabel_1);
		
	}
	
	// getter setter
	public void setPlayTest(int play) {
		this.play = play;
	}
	
	public int getPlayTest() {
		return play;
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

	// 전에 랜덤으로 뽑힌 결과의 정수 배열을 받아와 공 리스트를 생성해주는 메소드
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
	
	// 전에 선택한 결과의 정수 배열을 받아와 공 리스트를 생성해주는 메소드
	public void curcleResult(Set<Integer> number, Set<Integer> numList, String a, int h, JPanel panel, List<Boolean> bList) {
		// CurcleList 클래스 생성 (랜덤 배열과 선택한 배열을 파라미터로 받음)
		curcleList = new CurcleList(number, numList);
		// 알파벳 생성 (파라미터로 A~E 받음)
		JLabel alphabet = new JLabel(a);
		alphabet.setFont(new Font("함초롬바탕", Font.PLAIN, 20));
		panel.add(alphabet);
		
		int x = 10;
		// curcleList에서 생성한 Curcle 클래스를 순회하여 패널에 추가
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
	public void loopResult(int play, Set<Integer> number, Set<Integer> number2, Set<Integer> number3, Set<Integer>number4, Set<Integer> number5, Set<Integer> number6, CurcleList curcleList) {
		System.out.println(play);
		switch (play) {
			case 5:
				curcleResult(number, number6, "E", 500, panel5, curcleList.getList2());
			case 4:
				curcleResult(number, number5, "D", 400, panel4, curcleList.getList2());
			case 3:
				curcleResult(number, number4, "C", 300, panel3, curcleList.getList2());
			case 2:
				curcleResult(number, number3, "B", 200, panel2, curcleList.getList2());
			case 1:
				curcleResult(number, number2, "A", 100, panel1, curcleList.getList2());
		}
	}

	
	
	// 랜덤한 배열을 모두 삭제해주는 메소드
	// 배열이 잔존하기 때문에 게임이 초기화 될 때마다 필요함
	public void removeRandomList() {
		number.removeAll(number);
	}



	
	
	

}
