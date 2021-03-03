import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
// 3조 lotto
public class LottoFrame extends JFrame {
	int count;
	private CardLayout cards = new CardLayout();
	private SelectPanel selectPanel;
	JScrollPane scroll;
	JScrollPane scroll2;
	private ResultPanel resultPanel;
	private CountPanel countPanel;
	int play = 0;
	Map<Integer, ResultPanel> resultMap = new HashMap<>();
	BeforeResultPanel beforeResultPanel;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoFrame frame = new LottoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LottoFrame() {
		// 각 패널 생성
		countPanel = new CountPanel(this);
		selectPanel = new SelectPanel(this);
		countPanel = new CountPanel(this);
		resultPanel = new ResultPanel(
				this, selectPanel.getSelectNumber1(), 
				selectPanel.getSelectNumber2(), 
				selectPanel.getSelectNumber3(), 
				selectPanel.getSelectNumber4(), 
				selectPanel.getSelectNumber5());
		
		beforeResultPanel = new BeforeResultPanel(
				this, selectPanel.getSelectNumber1(), 
				selectPanel.getSelectNumber2(), 
				selectPanel.getSelectNumber3(), 
				selectPanel.getSelectNumber4(), 
				selectPanel.getSelectNumber5());		
		scroll = new JScrollPane(resultPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll2 = new JScrollPane(beforeResultPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 830, 530);
		
		// 패널 추가 (전환을 위해 이름을 붙임)
		getContentPane().setLayout(cards);
		getContentPane().add("Main", new MainPanel(this));
		getContentPane().add("Count", countPanel);
		getContentPane().add("Select", selectPanel); 
		getContentPane().add("BeforeResult", scroll2);
		getContentPane().add("Result", scroll);
		setLocationRelativeTo(null);
	}
	
	
	public ResultPanel getResultPanel() {
		return resultPanel;
	}

	// 메인 패널로 전환하는 메소드
	public void changeMainPanel() {
		cards.show(this.getContentPane(), "Main");
		countPanel.resetInput();	// 처음으로 돌아왔을 때 입력했던 횟수를 초기화
		selectPanel.resetNum();		// 처음으로 돌아왔을 때 과연 숫자는?! 뜰 수 있게
	}

	// 수량 선택 패널로 전환하는 메소드
	public void changeCountPanel() {
		cards.show(this.getContentPane(), "Count");
		selectPanel.removeAll();
	}
	
	// 숫자 선택 패널로 전환하는 메소드
	public void changeSelectPanel(int play) { 
		cards.show(this.getContentPane(), "Select");
		selectPanel.setPlay(play);
		selectPanel.setFinalPlay(play);
		selectPanel.setLabelText();
		selectPanel.setResetPlay();
	}
	
	// 전 결과 확인할 수 있는 패널로 전환하는 메소드
	public void changeBeforeResultPanel() {
		cards.show(this.getContentPane(), "BeforeResult");
		beforeResultPanel.setCount(selectPanel.getFinalPlay());
		beforeResultPanel.removeRandomList();
		beforeResultPanel.clearPanel();
		beforeResultPanel.createRandomCurcle(resultPanel.getNumber(), count);
		beforeResultPanel.loopResult(
				selectPanel.getFinalPlay(), 
				resultPanel.getNumber(), 
				resultPanel.getNumber2(), 
				resultPanel.getNumber3(), 
				resultPanel.getNumber4(), 
				resultPanel.getNumber5(), 
				resultPanel.getNumber6(), 
				resultPanel.getCurcleList());
	}
	
	// 결과 패널로 전환하는 메소드
	public void changeResultPanel(int play) {
		cards.show(this.getContentPane(), "Result");
		resultPanel.setPlayTest(countPanel.getPlay());
		resultPanel.removeRandomList();
		resultPanel.clearPanel();
		resultPanel.randomNumber();
		resultPanel.createRandomCurcle();
		resultPanel.loopResult();
		System.out.println(count);
		++count;
	}
	
	public void setPlay(int play) {
		this.play = play;
	}

}
