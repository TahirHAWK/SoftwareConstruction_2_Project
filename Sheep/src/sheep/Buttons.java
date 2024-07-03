package sheep;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.security.PublicKey;

public class Buttons {
	private JLabel label1, label2, label3;
	private JButton ColorButtonGreen = new JButton("Green");
	private JButton ColorButtonGray = new JButton("Gray");
	private JButton ColorButtonBlack = new JButton("Black");
	private JButton small = new JButton("small");
	private JButton large = new JButton("large");
	private JButton head = new JButton("head");
	private JButton body = new JButton("body");
	private JButton sheep = new JButton("sheep");

	public void addActionListener(ActionListener listener) {
		ColorButtonGreen.addActionListener(listener);
		ColorButtonGray.addActionListener(listener);
		ColorButtonBlack.addActionListener(listener);
		small.addActionListener(listener);
		large.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		label1 = new JLabel();
		label1.setText("Color:");
		
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));
		menu.add(label1);
		menu.add(ColorButtonGreen);
		menu.add(ColorButtonGray);
		menu.add(ColorButtonBlack);
		label2 = new JLabel();
		
		
		label2.setText("Size:");
		menu.add(label2);
		menu.add(small);
		menu.add(large);
		
		label3 = new JLabel();
		
		label3.setText("States:");
		menu.add(label3);
		menu.add(head);
		menu.add(body);
		menu.add(sheep);
		
		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getColorButtonGreen() {
		return ColorButtonGreen;
	}

	public JButton getColorButtonGray() {
		return ColorButtonGray;
	}

	public JButton getColorButtonBlack() {
		return ColorButtonBlack;
	}
	public JButton getSmall() {
		return small;
	}

	public JButton getLarge() {
		return large;
	}
	public JButton getHead() {
		return head;
	}
	public JButton getBody() {
		return body;
	}
	public JButton getSheep() {
		return sheep;
	}
}
