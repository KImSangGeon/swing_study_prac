package swing_study_Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;

import swing_study_Pannel.Department;
import swing_study_Pannel.DeptPanel1;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnSetDept;
	private JButton btnGetDept;
	private JButton btnClear;
	private DeptPanel1 pDept;

	public JPanelEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JPannel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new DeptPanel1();
		pDept.setBorder(new TitledBorder(null, "부서 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pDept, BorderLayout.CENTER);
		pDept.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnSetDept = new JButton("부서설정");
		btnSetDept.addActionListener(this);
		pBtn.add(btnSetDept);
		
		btnGetDept = new JButton("부서 가져오기");
		btnGetDept.addActionListener(this);
		pBtn.add(btnGetDept);
		
		btnClear = new JButton("초기화");
		btnClear.addActionListener(this);
		pBtn.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear) {
			actionPerformedBtnClear(e);
		}
		if (e.getSource() == btnGetDept) {
			actionPerformedBtnGetDept(e);
		}
		if (e.getSource() == btnSetDept) {
			actionPerformedBtnSetDept(e);
		}
	}
	protected void actionPerformedBtnSetDept(ActionEvent e) {
		Department dept = new Department(2, "연구", 10);
		pDept.setDepartment(dept);
	}
	protected void actionPerformedBtnGetDept(ActionEvent e) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
	protected void actionPerformedBtnClear(ActionEvent e) {
		pDept.clearTf();
	}
}
