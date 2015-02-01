import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//Направете програма за управление на служители във фирма. 
//Програмата трябва да съдържа форма за въвеждане на служител (име фамилия, телфон, години, месечна заплата в лева). 
//Формата трябва да се показва при натискане на бутон добави служител. Главната форма на програмата трябва да съдържа 
//бутон „Изцисли“. След натискането на бутона програмата трябва да изведе на екрана средната заплата на всички 
//служители, най-младият служител и съответно най-възрастния служител.

public class CompanyProfile extends JFrame {

	private JPanel contentPane;

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

	/**
	 * Create the frame.
	 */
	public CompanyProfile() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrNarkonLtd = new JTextArea();
		txtrNarkonLtd.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 17));
		txtrNarkonLtd.setText("Narkon LTD");
		txtrNarkonLtd.setBackground(SystemColor.scrollbar);
		txtrNarkonLtd.setBounds(37, 27, 251, 20);
		contentPane.add(txtrNarkonLtd);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(458, 111, -170, 68);
		contentPane.add(btnNewButton);
		
		Button button = new Button("Enter Employee");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Employee j2 = new Employee();
				j2.setVisible(true);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(136, 100, 204, 85);
		contentPane.add(button);
		
	}
}