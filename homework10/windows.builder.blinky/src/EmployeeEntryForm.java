package Company;

import java.awt.Button;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

public class EmployeeEntryForm extends JDialog implements ActionListener {
	private ArrayList<Employee> employees;

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtFamily;
	private JFormattedTextField txtAge;
	private JFormattedTextField txtSalary;
	private JTextField txtPhoneNumber;
	private JTextField txtName_1;
	private NumberFormat amountFormater;
	private NumberFormat ageFormater;

	private JLabel txtNameLabel;
	private JLabel txtFamilyLabel;
	private JLabel txtAgeLabel;
	private JLabel txtSalaryLabel;
	private JLabel txtPhoneNumberLabel;
	private JLabel txtName_1Label;

	public EmployeeEntryForm() {
		init();
	}

	public void init() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtNameLabel = new JLabel();
		txtNameLabel.setText("First Name");
		txtNameLabel.setBounds(10, 27, 80, 20);
		contentPane.add(txtNameLabel);

		txtName = new JTextField();
		txtName.setBackground(SystemColor.WHITE);
		txtName.setBounds(100, 27, 151, 20);
		contentPane.add(txtName);
		
		txtFamilyLabel = new JLabel();
		txtFamilyLabel.setText("Family");
		txtFamilyLabel.setBounds(10, 57, 80, 20);
		contentPane.add(txtFamilyLabel);
		
		txtFamily = new JTextField();
		txtFamily.setBackground(SystemColor.WHITE);
		txtFamily.setBounds(100, 57, 151, 20);
		contentPane.add(txtFamily);

		txtAgeLabel = new JLabel();
		txtAgeLabel.setText("Age");
		txtAgeLabel.setBounds(10, 87, 80, 20);
		contentPane.add(txtAgeLabel);
		
		ageFormater = NumberFormat.getNumberInstance();
		txtAge = new JFormattedTextField(ageFormater);
		txtAge.setBackground(SystemColor.WHITE);
		txtAge.setBounds(100, 87, 151, 20);
		contentPane.add(txtAge);

		txtSalaryLabel = new JLabel();
		txtSalaryLabel.setText("Salary");
		txtSalaryLabel.setBounds(10, 117, 80, 20);
		contentPane.add(txtSalaryLabel);
		
		amountFormater = NumberFormat.getNumberInstance();
		txtSalary = new JFormattedTextField(amountFormater);
		txtSalary.setBackground(SystemColor.WHITE);
		txtSalary.setBounds(100, 117, 151, 20);
		contentPane.add(txtSalary);

		txtPhoneNumberLabel = new JLabel();
		txtPhoneNumberLabel.setText("Phone num.");
		txtPhoneNumberLabel.setBounds(10, 147, 80, 20);
		contentPane.add(txtPhoneNumberLabel);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBackground(SystemColor.WHITE);
		txtPhoneNumber.setBounds(100, 147, 151, 20);
		contentPane.add(txtPhoneNumber);

		txtName_1Label = new JLabel();
		txtName_1Label.setText("Add info");
		txtName_1Label.setBounds(10, 177, 80, 20);
		contentPane.add(txtName_1Label);
		
		txtName_1 = new JTextField();
		txtName_1.setBackground(SystemColor.WHITE);
		txtName_1.setBounds(100, 177, 151, 20);
		contentPane.add(txtName_1);

		Button button = new Button("Add Employee");
		button.addActionListener(this);

		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(300, 220, 130, 30);
		contentPane.add(button);

	}

	public ArrayList<Employee> getEmployer() {
		return employees;
	}

	public void setEmployer(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (txtAge.getText().isEmpty() || txtFamily.getText().isEmpty()
				|| txtName.getText().isEmpty() || txtName_1.getText().isEmpty()
				|| txtPhoneNumber.getText().isEmpty()
				|| txtSalary.getText().isEmpty()) {
			JOptionPane
					.showMessageDialog(contentPane, "Please fill all fields");
			return;
		}

		Employee tmp = new Employee();
		tmp.setTxtName(txtName.getText());
		tmp.setTxtFamily(txtFamily.getText());
		tmp.setTxtName_1(txtName_1.getText());
		tmp.setTxtPhoneNumber(txtPhoneNumber.getText());
		tmp.setTxtAge((long) txtAge.getValue());
		tmp.setTxtSalary((long) txtSalary.getValue());
		this.employees.add(tmp);
		System.out.println("Action performed");
		clearText();
		//this.dispose();
	}
	public void clearText()
	{
		txtAge.setText("");
		txtFamily.setText("");
		txtName.setText("");
		txtName_1.setText("");
		txtPhoneNumber.setText("");
		txtSalary.setText("");
	}

}
