import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CountPanel extends JPanel implements ActionListener { 
	JTextField palyText;
	JLabel lblCount;
	int play = 0;
	
	public boolean tryParse(String palyText) {	// 텍스트 타일에 입력된 값이 문자열인지 정수 값인지 구분하기 위한 boolean
		try {
			Integer.parseInt(palyText); // 정수 값일 때 true값 반환
			return true;
		} catch (NumberFormatException e) {	// 문자열일 때	false값 반환
			return false;	
		}
	}
	
	public void resetInput() { // "처음으로"를 클릭한 다음 재시작 할 때 텍스트 타일 부분, 하단에 수량 출력 되는 부분이 공란으로 뜰 수 있게 해주고, 실행 값을 0 으로 만들어줌
		palyText.setText("");
		lblCount.setText("");
		play = 0;
	}
	
	public CountPanel(LottoFrame frame) {	// 화면에 보이는 라벨, 텍스트타일, 버튼 등을 보여주는 부분
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(layout);
		// 상단
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("플레이 수 : ");

		palyText = new JTextField(10);
		palyText.setBorder(BorderFactory.createLineBorder(Color.black));

		JButton btn = new JButton("입력");
		btn.addActionListener(this);	
		
		JButton nextBtn = new JButton("다음");	// 클릭 시 화면이 넘어가고 입력했던 수량도 같이 넘어간다.
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 수량이 0 또는 비어있을 때 오류 메세지 보여줌
				if(play == 0) {
					JOptionPane.showMessageDialog(null, "적어도 한 개 이상은 해야겠죠??", 
							"구매 안하고는 못해여", JOptionPane.WARNING_MESSAGE);
				}
				else if(play > 5 || play < 0) {	// 1 ~ 5의 범위가 벗어난 입력을 할 시에 오류메세지 보여줌
					JOptionPane.showMessageDialog(null, "1 ~ 5개만 구매 가능합니다.", 
							"수량 확인해주세용", JOptionPane.WARNING_MESSAGE);
				}
				
				else {
					frame.changeSelectPanel(play);	// 1 ~ 5의 값이 입력이 되었다면 play값을 들고서 다음 페이지로 이동
				}
			} 
		});
		

		pnl.add(lbl);
		pnl.add(palyText);
		
		// 하단
		JPanel pnl2 = new JPanel();
		JLabel lblPlay = new JLabel("수량  : ");	 // 수량 글자 출력
		lblCount = new JLabel();
		pnl2.setPreferredSize(new Dimension(200, 50));
		pnl2.setMaximumSize(new Dimension(120, 10)); 
		pnl2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		pnl2.add(lblPlay);
		pnl2.add(lblCount);

		
		// 중간 (입력, 다음)
		JPanel btnPnl = new JPanel();
		btnPnl.add(btn);
		btnPnl.add(nextBtn);
		pnl.setAlignmentX(0.5F);
		pnl.setAlignmentX(0.5F);
		pnl2.setAlignmentX(0.5F);
		
		add(Box.createVerticalGlue());
		add(pnl);
		add(btnPnl);
		add(pnl2);
		add(Box.createVerticalGlue());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	// 입력 클릭시 실행될 액션임(텍스타일에 입력된 값에 대하여)
			
		if (palyText.getText() == null || palyText.getText().isEmpty()) { // 빈칸일 때
			JOptionPane.showMessageDialog(null, "빈칸은 안됩니다! 돈 안벌꺼니!!!", 
					"왜 입력안하니", JOptionPane.WARNING_MESSAGE);
		} 
		else if(tryParse(palyText.getText()) == false){ // 문자열 입력일 때
			JOptionPane.showMessageDialog(null, "숫자로 입력해주세요!",
					"문자열은 안됩니다 숫자 숫자!!", JOptionPane.WARNING_MESSAGE);
			}
		else { 
			play = Integer.valueOf(palyText.getText());
			lblCount.setText(String.valueOf(play) + "개");
			
			if (play <= 0) {	// 0 또는 마이너스 값 입력 했을 때
			JOptionPane.showMessageDialog(null, "최소 1번 이상 입력해야합니다.", 
					"경고창임", JOptionPane.WARNING_MESSAGE);
			}
			else if(play > 5) {	// 5번까지 가능
				JOptionPane.showMessageDialog(null, "너무 많이 하는건 좋지않아요", 
						"너무 많이 하지마", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}
	
}