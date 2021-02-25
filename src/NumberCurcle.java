import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import java.util.Set;

import javax.swing.JPanel;

public class NumberCurcle extends JPanel {
	
	public NumberCurcle(List<Set> list, Set<Integer> num) {
		Curcle curcle1 = new Curcle(num);
		Curcle curcle2 = new Curcle(num);
		Curcle curcle3 = new Curcle(num);
		Curcle curcle4 = new Curcle(num);
		Curcle curcle5 = new Curcle(num);
		Curcle curcle6 = new Curcle(num);
		
		setLayout(new GridLayout(1, 5));
		curcle1.setMaximumSize(new Dimension(60, 60));
		add(curcle1);
		add(curcle2);
		add(curcle3);
		add(curcle4);
		add(curcle5);
		add(curcle6);
	}

}
