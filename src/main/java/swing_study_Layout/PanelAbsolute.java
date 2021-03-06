package swing_study_Layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelAbsolute extends JPanel {
	private JTextField textField;

	
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 57, 15);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(195, 112, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(55, 194, 97, 23);
		add(btnNewButton);
	}
}
