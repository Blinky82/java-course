import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtFamily;
	private JTextField txtAge;
	private JTextField txtSalary;
	private JTextField txtPhoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					    int[] txtAge, txtSalary;
					    int txtPhoneNumber, calculate1, calculate2;
					    String txtName, txtFamily;
					    
					    Scanner get = new Scanner(System.in);
					   
					    	String txtName = this.txtName.getText();
							int txtName = Integer.parseInt(txtName);
					        txtName = get.nextLine();
					        
					        String txtFamily = this.txtFamily.getText();
							int txtFamily = Integer.parseInt(txtFamily);
							txtFamily = get.nextLine();
					        
					        System.out.println();
					        txtAge = get.nextLine();
					        
					        System.out.println();
					        txtPhoneNumber = get.nextInt();
					        
					        System.out.println();
					        txtSalary = get.nextInt();
					        
					        for(i = 0; i < txtAge.length; i++); {
					        	calculte1 =  array[0];
					        }
					        	for(j = 0; j < txtSalary.length; j++); 
					        	
					        	calculte2 =  array[j]/2;
					        }
		
					Employee frame = new Employee(); {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setForeground(Color.LIGHT_GRAY);
		txtName = get.nextLine();
		txtName.setBounds(28, 32, 163, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtFamily = new JTextField();
		txtFamily.setText("Family");
		txtFamily.setForeground(Color.LIGHT_GRAY);
		txtFamily.setColumns(10);
		txtFamily.setBounds(232, 32, 163, 19);
		contentPane.add(txtFamily);
		
		txtAge = new JTextField();
		txtAge.setText("Age");
		txtAge.setForeground(Color.LIGHT_GRAY);
		txtAge.setColumns(10);
		txtAge.setBounds(28, 83, 163, 19);
		contentPane.add(txtAge);
		
		txtSalary = new JTextField();
		txtSalary.setText("Salary");
		txtSalary.setForeground(Color.LIGHT_GRAY);
		txtSalary.setColumns(10);
		txtSalary.setBounds(232, 83, 163, 19);
		contentPane.add(txtSalary);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone number");
		txtPhoneNumber.setForeground(Color.LIGHT_GRAY);
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(28, 144, 367, 19);
		contentPane.add(txtPhoneNumber);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(28, 212, 367, 25);
		contentPane.add(btnCalculate);
		
		
	}
}