import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
// 3조 lotto
public class LottoFrame extends JFrame {
	private JPanel contentPane;
	private CardLayout cards = new CardLayout();
	private SelectPanel selectPanel;
	private CountPanel countPanel;
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
		selectPanel = new SelectPanel(this);	
		countPanel = new CountPanel(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 830, 530);
		getContentPane().setLayout(cards);
		getContentPane().add("Main", new MainPanel(this));
		getContentPane().add("Count", countPanel);
		getContentPane().add("Select", selectPanel); 
		getContentPane().add("Result", new ResultPanel(this));
	}
	
	public void changeMainPanel() {
		cards.show(this.getContentPane(), "Main");
		countPanel.resetInput();
	}

	public void changeCountPanel() {
		cards.show(this.getContentPane(), "Count");
	}
	
	public void changeSelectPanel(int play) { 
		cards.show(this.getContentPane(), "Select");
		selectPanel.setLabelText(play);
		selectPanel.playGame(play);
	}
	
	public void changeResultPanel() {
		cards.show(this.getContentPane(), "Result");
	}

}