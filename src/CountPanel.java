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

public class CountPanel extends JPanel implements ActionListener { 
//	SelectPanel selectPanel;
	JTextField palyText;
	JLabel lblCount;
	int play = 0;
	
	public boolean tryParse(String palyText) {
		try {
			Integer.parseInt(palyText); 
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public void resetInput() { 
		palyText.setText("");
		lblCount.setText("");
		play = 0 ;
	}
	
	public CountPanel(LottoFrame frame) {
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(layout);
		// 상단
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("플레이 수 : ");

		palyText = new JTextField(10);
		palyText.setBorder(BorderFactory.createLineBorder(Color.black));

		JButton btn = new JButton("입력");
		JButton nextBtn = new JButton("다음");	// 클릭 시 화면이 넘어가고 입력했던 수량도 같이 넘어간다.
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(play == 0) {
					JOptionPane.showMessageDialog(null, "적어도 한 개 이상은 해야겠죠??", 
							"구매 안하고는 못해여", JOptionPane.WARNING_MESSAGE);
				}
				else {
					frame.changeSelectPanel(play);	// 수량 넘어가는 부분
				}
			} 
		});
		btn.addActionListener(this);

		pnl.add(lbl);
		pnl.add(palyText);
		pnl.add(btn);
		pnl.add(nextBtn);

		add(Box.createVerticalGlue());
		
		add(pnl);
		
		// 중간
		JPanel pnl2 = new JPanel();
		JLabel lblPlay = new JLabel("수량  : ");	 // 수량 글자 출력
		lblCount = new JLabel();
		pnl2.setPreferredSize(new Dimension(200, 100));
		pnl2.setMaximumSize(new Dimension(150, 30)); 
		pnl2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		pnl2.add(lblPlay);
		pnl2.add(lblCount);
		
		add(pnl2);
		add(Box.createVerticalGlue());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			
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
			else if(play > 5) {	// 10번까지 가능
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