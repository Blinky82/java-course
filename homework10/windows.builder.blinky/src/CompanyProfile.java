package Company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

//Направете програма за управление на служители във фирма. 
//Програмата трябва да съдържа форма за въвеждане на служител (име фамилия, телфон, години, месечна заплата в лева). 
//Формата трябва да се показва при натискане на бутон добави служител. Главната форма на програмата трябва 
//да съдържа 
//бутон „Изцисли“. След натискането на бутона програмата трябва да изведе на екрана средната заплата на всички 
//служители, най-младият служител и съответно най-възрастния служител.

public class CompanyProfile extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	Button calcButton;
	Button button;

	/**
	 * Create the frame.
	 */
	public CompanyProfile() {
		init();
	}

	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JTextArea txtrNarkonLtd = new JTextArea();
		txtrNarkonLtd
				.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 17));
		txtrNarkonLtd.setText("Narkon LTD");
		txtrNarkonLtd.setBackground(SystemColor.scrollbar);
		txtrNarkonLtd.setBounds(37, 27, 251, 20);
		contentPane.add(txtrNarkonLtd);

		button = new Button("Enter Employee");
		button.addActionListener(this);
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(286, 210, 130, 35);
		contentPane.add(button);

		calcButton = new Button("Calculate");
		calcButton.addActionListener(this);
		calcButton.setFont(new Font("Dialog", Font.BOLD, 16));
		calcButton.setBounds(140, 210, 130, 35);
		contentPane.add(calcButton);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyProfile frame = new CompanyProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (source == this.button) {
			EmployeeEntryForm j2 = new EmployeeEntryForm();
			j2.setEmployer(employees);
			j2.setVisible(true);
			j2.setModal(true);
			System.out.println("Employees count: " + employees.size());
		} else {
			if (employees.size() > 0) {
				double avgSalary = 0;
				int minAge = Integer.MAX_VALUE;
				int maxAge = Integer.MIN_VALUE;
				for (int i = 0; i < employees.size(); i++) {
					avgSalary += employees.get(i).getSalary();
					int currAge = (int) employees.get(i).getAge();
					if (currAge < minAge) {
						minAge = currAge;
					}
					if (currAge > maxAge) {
						maxAge = currAge;
					}
				}
				avgSalary /= employees.size();
				JOptionPane.showMessageDialog(this, Math.round(avgSalary) + " "
						+ maxAge + " " + minAge);
			} else {
				JOptionPane.showMessageDialog(this, "No employees added");
			}
		}
	}
}