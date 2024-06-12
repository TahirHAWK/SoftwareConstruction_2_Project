
package sheep;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
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
			drawing.changeColor(Color.green);
			System.out.println("green");
		} else if (e.getSource() == buttons.getColorButtonGray()) {
			tidyUpDrawingArea();
			drawing.changeColor(Color.DARK_GRAY);
			System.out.println("gray");
		} else if (e.getSource() == buttons.getColorButtonBlack()) {
			tidyUpDrawingArea();
			drawing.changeColor(Color.black);
			System.out.println("black");
		} else if (e.getSource() == buttons.getSmall()) {
			tidyUpDrawingArea();
			drawing.changeSize(1);
			System.out.println("small");
		}  else if (e.getSource() == buttons.getLarge()) {
			tidyUpDrawingArea();
			drawing.changeSize(3);
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
