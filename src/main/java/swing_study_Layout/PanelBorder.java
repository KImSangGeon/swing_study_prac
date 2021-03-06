package swing_study_Layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelBorder extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel Center = new JLabel("center");
		Center.setOpaque(true);
		Center.setBackground(Color.RED);
		Center.setHorizontalAlignment(SwingConstants.CENTER);
		add(Center, BorderLayout.CENTER);
		
		JLabel North = new JLabel("north");
		North.setBackground(Color.YELLOW);
		North.setOpaque(true);
		North.setHorizontalAlignment(SwingConstants.CENTER);
		add(North, BorderLayout.NORTH);
		
		JLabel South = new JLabel("south");
		South.setBackground(Color.MAGENTA);
		South.setOpaque(true);
		South.setHorizontalAlignment(SwingConstants.CENTER);
		add(South, BorderLayout.SOUTH);
		
		JLabel East = new JLabel("east");
		East.setBackground(Color.GREEN);
		East.setOpaque(true);
		East.setHorizontalAlignment(SwingConstants.CENTER);
		add(East, BorderLayout.EAST);
		
		JLabel West = new JLabel("west");
		West.setBackground(Color.BLUE);
		West.setOpaque(true);
		West.setHorizontalAlignment(SwingConstants.CENTER);
		add(West, BorderLayout.WEST);
	}

}
