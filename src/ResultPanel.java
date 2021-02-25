import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.text.GapContent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Point;
import javax.swing.JInternalFrame;

public class ResultPanel extends JPanel implements ActionListener {
	TestFrame frame = new TestFrame();
	private final JLabel lblNewLabel_1 = new JLabel("당첨 결과");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JPanel panel_1 = new JPanel();
	NumberCurcle nc1 = new NumberCurcle();
	private final JLabel lblNewLabel = new JLabel("당신이 뽑은 숫자");
	
	public ResultPanel(LottoFrame frame) {
		
		URL imgURL = this.getClass().getResource("curcle.jpg");

		ImageIcon image = new ImageIcon(imgURL);
		setPreferredSize(new Dimension(830, 530));
		setMaximumSize(new Dimension(830, 530));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(120, 61, 600, 79);
		panel.add(nc1);
		add(panel);
		
		
		
		JButton resultButton = new JButton("당첨 결과 확인");
		resultButton.setBounds(128, 472, 153, 29);
		resultButton.addActionListener(this);
		add(resultButton);
		
		JButton btnNewButton_1 = new JButton("처음으로");
		btnNewButton_1.setBounds(553, 472, 105, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();
			}
		});
		add(btnNewButton_1);
		lblNewLabel_1.setBounds(328, 10, 78, 21);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(lblNewLabel_1);
		scrollPane.setBounds(120, 200, 600, 210);
		
		add(scrollPane);
		panel_1.setPreferredSize(new Dimension(500, 700));
		panel_1.setMaximumSize(new Dimension(500, 32767));

		scrollPane.setViewportView(panel_1);
		lblNewLabel.setBounds(343, 164, 138, 21);
		
		add(lblNewLabel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog(frame);
		dialog.setSize(100, 100);
		dialog.setVisible(true);
	}
}
