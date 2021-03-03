import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class NoResultPanel extends JPanel {

	/**
	 * 전 결과가 없을 때 나타나는 패널
	 */
	public NoResultPanel(LottoFrame frame) {
		
		setPreferredSize(new Dimension(830, 530));
		setMaximumSize(new Dimension(830, 530));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("아직 결과를 보지 못했어요!");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 156, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -223, SpringLayout.SOUTH, this);
		lblNewLabel.setFont(new Font("함초롬바탕", Font.PLAIN, 40));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("처음으로 ");
		btnNewButton.setForeground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 69, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -321, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -109, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -190, SpringLayout.EAST, this);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("함초롬바탕", Font.PLAIN, 20));
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.changeMainPanel();
			}
			
		});

	}

}
