import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 // 지금 새로 불러오면서 master 브랜치에 되어가지구 제가 민정씨 브랜치로 변경할게요!!아 넵!
public class CountPanel extends JPanel implements ActionListener {
	JTextField palyText;
	public boolean tryParse(String palyText) {
		try {
			Integer.parseInt(palyText); 
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}	
	
	public CountPanel(LottoFrame frame) {
		// 상단
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("플레이 수 : ");

		palyText = new JTextField(10);
		palyText.setBorder(BorderFactory.createLineBorder(Color.black));

		JButton btn = new JButton("입력");
		JButton nextBtn = new JButton("다음");
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeSelectPanel();
			}
		});
		btn.addActionListener(this);

		pnl.add(lbl);
		pnl.add(palyText);
		pnl.add(btn);
		pnl.add(nextBtn);

		add(pnl);
		
		// 하단
		JPanel pnl2 = new JPanel();
		JLabel lblPlay = new JLabel("플레이 수 : ");	// 플레이 수 글자 출력부분
		JLabel lblCount = new JLabel();
		
		pnl2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		pnl2.add(lblPlay);
		pnl2.add(lblCount);
		
		add(pnl2, "South");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int play = 0;	
		if (palyText.getText() == null || palyText.getText().isEmpty()) {
			// 빈칸일 때
			JOptionPane.showMessageDialog(null, "빈칸은 안됩니다! 돈 안벌꺼니!!!", 
					"왜 입력안하니", JOptionPane.WARNING_MESSAGE);
		} 
		else if(tryParse(palyText.getText()) == false){ // 문자열 입력일 때
			JOptionPane.showMessageDialog(null, "숫자로 입력해주세요!",
					"문자열은 안됩니다 숫자 숫자", JOptionPane.WARNING_MESSAGE);
			}
		
		else { 
			play = Integer.valueOf(palyText.getText());
			System.out.println(play);
			
			if (play <= 0) {	// 0 또는 마이너스 값 입력 했을 때
			JOptionPane.showMessageDialog(null, "최소 1번 이상 입력해야합니다.", 
					"경고창임", JOptionPane.WARNING_MESSAGE);
			}
			else if(play > 10) {	// 10번까지 가능
				JOptionPane.showMessageDialog(null, "너무 많이하는건 좋지않아요", 
						"너무 많이하지마", JOptionPane.WARNING_MESSAGE);
			}
	
		}
	}

}
