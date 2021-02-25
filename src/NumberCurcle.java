import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class NumberCurcle extends JPanel {
	Curcle curcle1 = new Curcle();
	Curcle curcle2 = new Curcle();
	Curcle curcle3 = new Curcle();
	Curcle curcle4 = new Curcle();
	Curcle curcle5 = new Curcle();
	Curcle curcle6 = new Curcle();
	public NumberCurcle() {
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
