import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class NumberList extends JPanel {
	public NumberList(List<Set> list, Set<Integer> num) {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("A");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 24, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 33, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		NumberCurcle nc1 = new NumberCurcle(list, num);
		springLayout.putConstraint(SpringLayout.NORTH, nc1, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, nc1, 19, SpringLayout.EAST, lblNewLabel);
		add(nc1);
		
		JLabel lblNewLabel_1 = new JLabel("1등");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 24, SpringLayout.EAST, nc1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -27, SpringLayout.SOUTH, this);
		add(lblNewLabel_1);

	}

}
