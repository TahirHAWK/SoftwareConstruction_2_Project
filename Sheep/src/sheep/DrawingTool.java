
package sheep;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();

	public DrawingTool(String title) {
		super(title);
		
		setLayout(new BorderLayout());

		constructButtonMenu();
		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		setVisible(true);
	}
	
	private void constructButtonMenu() {
		buttons.addButtonsToAPanel(this);
		buttons.addActionListener(this);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.getColorButtonGreen()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setHouses();
			System.out.println("green");
		} else if (e.getSource() == buttons.getColorButtonGray()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setTrees();
			System.out.println("gray");
		} else if (e.getSource() == buttons.getColorButtonBlack()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setVillage();
			System.out.println("black");
		} else if (e.getSource() == buttons.getSmall()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setTrees();
			System.out.println("small");
		} else if (e.getSource() == buttons.getMedium()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setVillage();
			System.out.println("medium");
		} else if (e.getSource() == buttons.getLarge()) {
			tidyUpDrawingArea();
//			drawing.getVillage().setVillage();
			System.out.println("large");
		} 
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();		
	}
	
	public static void main(String[] args) {
		new DrawingTool("Draw a Sheep");
	}
}
