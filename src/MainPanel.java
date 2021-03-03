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
import java.awt.Font;
import java.awt.SystemColor;

public class MainPanel extends JPanel {
	private LottoFrame frame;
	MainPanel(LottoFrame f) {
		frame = f;
		JPanel pnl1 = new JPanel();
		pnl1.setBackground(SystemColor.control);
		JPanel pnl2 = new JPanel();
		pnl2.setBackground(SystemColor.control);
		JButton btn1 = new JButton("로또 뽑기");
		btn1.setBounds(80, 70, 95, 30);
		btn1.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		btn1.setBackground(Color.CYAN);
		JButton btn2 = new JButton("당첨자 확인");
		btn2.setBounds(84, 42, 115, 27);
		btn2.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		btn2.setBackground(Color.PINK);
		JLabel lbl1 = new JLabel("로또 진행 횟수와"
				+ "\n" + 
				" 번호를 뽑습니다.");
		lbl1.setBounds(190, 75, 218, 21);
		lbl1.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		JLabel lbl2 = new JLabel("당첨 결과를 확인해보세요.");
		lbl2.setBounds(209, 45, 168, 21);
		lbl2.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		
//		lbl1.setBorder(BorderFactory.createLineBorder(Color.black));
//		lbl2.setBorder(BorderFactory.createLineBorder(Color.black));
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
				frame.changeBeforeResultPanel();
			}
		});	
		f.setSize(new Dimension(500,500));
		pnl1.setLayout(null);
		
		pnl1.add(btn1);
		pnl2.setLayout(null);
		pnl2.add(btn2);
		pnl1.add(lbl1);
		pnl2.add(lbl2);
		add(pnl1);
		add(pnl2);
	}
}
