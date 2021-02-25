import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private LottoFrame frame;
	MainPanel(LottoFrame f) {
		frame = f;
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JButton btn1 = new JButton("로또 뽑기");
		JButton btn2 = new JButton("당첨자 확인");
		JLabel lbl1 = new JLabel("로또 진행 횟수와"
				+ "\n" + 
				" 번호를 뽑습니다.");
		JLabel lbl2 = new JLabel("당첨 결과를 확인해보세요.");
		
		lbl1.setBorder(BorderFactory.createLineBorder(Color.black));
		lbl2.setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeCountPanel();
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeResultPanel();
			}
		});	

		pnl1.add(btn1);
		pnl2.add(btn2);
		pnl1.add(lbl1);
		pnl2.add(lbl2);
		add(pnl1);
		add(pnl2);
	}

}
