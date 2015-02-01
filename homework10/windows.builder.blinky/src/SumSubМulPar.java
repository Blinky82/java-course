import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;


//Направете програма с графичен интерфейс, която има 2 полета за реални числа.
//Направете 4 бутона съответвно събиране, изваждане, умножение и делене.
//При натискане на съответния бутон програмата трябва да извежда прозорец с резултат от съответната операция.

public class SumSubМulPar extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstDigit;
	private JTextField txtSecondDigit;
	private double sum, sub, mul, par;
	
	sum = txtFirstDigit + txtSecondDigit;
	
	sub = txtFirstDigit - txtSecondDigit;
	
	mul = txtFirstDigit * txtSecondDigit;
	
	par = txtFirstDigit / txtSecondDigit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					String FirstDigit = this.FirstDigit.getText();
					int FirstDigit = Integer.parseInt(FirstDigit);
					
					String SecondDigit = this.SecondDigit.getText();
					int SecondDigit = Integer.parseInt(SecondDigit);
					
					SumSubМulPar frame = new SumSubМulPar();
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
	public SumSubМulPar() {
		
		setForeground(Color.BLACK);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFirstDigit = new JTextField();
		txtFirstDigit.setForeground(SystemColor.textHighlightText);
		txtFirstDigit.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtFirstDigit.setText("First digit");
		txtFirstDigit.setBounds(12, 12, 185, 68);
		contentPane.add(txtFirstDigit);
		txtFirstDigit.setColumns(10);
		
		txtSecondDigit = new JTextField();
		txtSecondDigit.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtSecondDigit.setText("Second digit");
		txtSecondDigit.setForeground(SystemColor.textHighlightText);
		txtSecondDigit.setBounds(251, 12, 185, 68);
		contentPane.add(txtSecondDigit);
		txtSecondDigit.setColumns(10);
		
		JButton btnNewButton = new JButton("Summation");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBounds(12, 138, 185, 56);
		contentPane.add(btnNewButton);
		
		JButton btnSubtraction = new JButton("Subtraction");
		btnSubtraction.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSubtraction.setBounds(251, 138, 185, 56);
		contentPane.add(btnSubtraction);	
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.setFont(new Font("Dialog", Font.BOLD, 16));
		btnMultiplication.setBounds(12, 207, 185, 56);
		contentPane.add(btnMultiplication);
		
		JButton btnPartition = new JButton("Partition");
		btnPartition.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPartition.setBounds(251, 207, 185, 56);
		contentPane.add(btnPartition);
		
		}
}