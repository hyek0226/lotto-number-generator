import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
// 3조 lotto
// 강민정
public class LottoFrame extends JFrame {

	private JPanel contentPane;
	private CardLayout cards = new CardLayout();
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public LottoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 830, 530);
		getContentPane().setLayout(cards);
		getContentPane().add("Main", new MainPanel(this));
		getContentPane().add("Count", new CountPanel(this));
		getContentPane().add("Select", new SelectPanel(this));
		getContentPane().add("Result", new ResultPanel(this));
	}
	
	public void changeMainPanel() {
		cards.show(this.getContentPane(), "Main");
	}

	public void changeCountPanel() {
		cards.show(this.getContentPane(), "Count");
	}
	
	public void changeSelectPanel() {
		cards.show(this.getContentPane(), "Select");
	}
	
	public void changeResultPanel() {
		cards.show(this.getContentPane(), "Result");
	}

}
