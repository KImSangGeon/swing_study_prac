package swing_study_Pannel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class DeptPanel1 extends JPanel {
	private JTextField tFDeptNo;
	private JTextField tFDeptName;
	private JTextField tFFloor;

	/**
	 * Create the panel.
	 */
	public DeptPanel1() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "부서정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblDeptNo = new JLabel("부서번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tFDeptNo = new JTextField();
		add(tFDeptNo);
		tFDeptNo.setColumns(10);
		
		JLabel lblDeptName = new JLabel("부서이름");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tFDeptName = new JTextField();
		tFDeptName.setColumns(10);
		add(tFDeptName);
		
		JLabel lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tFFloor = new JTextField();
		tFFloor.setColumns(10);
		add(tFFloor);
	}
	
	public Department getDepartment() {
		int deptNo = Integer.parseInt(tFDeptNo.getText().trim());
		String deptName = tFDeptName.getText().trim();
		int floor = Integer.parseInt(tFFloor.getText().trim());
		return new Department (deptNo, deptName, floor);
	}
	
	public void setDepartment(Department department) {
		tFDeptNo.setText(department.getDeptNo() + "");
		tFDeptName.setText(department.getDeptName());
		tFFloor.setText(department.getFloor() + "");
	}
	public void clearTf() {
		tFDeptNo.setText("");
		tFDeptName.setText("");
		tFFloor.setText("");
	}

}
