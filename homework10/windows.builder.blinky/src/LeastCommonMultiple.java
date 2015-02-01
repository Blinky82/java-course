import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import java.unit.Scanner;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Component;
import java.util.Scanner;
 
import javax.swing.Box;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
 
 
public class LeastCommonMultiple extends JFrame {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @wbp.nonvisual location=-386,59
	 */
	private final JCheckBox checkBox = new JCheckBox("New check box");
	private JButton btnNewButton;
	private JTextField txtAddYourDigit;
	private JTextField txtAddYourSecond;
 
	/**
	 * Launch the application.
	 */
 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Scanner aScanner = new Scanner(System.in);
					 
				      System.out.print("Enter the value of m: ");
				      int m = aScanner.nextInt();
				      System.out.print("Enter the value of n: ");
				      int n = aScanner.nextInt();
				      int lcm = (n == m || n == 1) ? m :(m == 1 ? n : 0);
		 
				      if (lcm == 0) {
				         int mm = m, nn = n;
				         while (mm != nn) {
				             while (mm < nn) { mm += m; }
				             while (nn < mm) { nn += n; }
				         }  
				         lcm = mm;
				      }
				      System.out.println("lcm(" + m + ", " + n + ") = " + lcm);
					
					LeastCommonMultiple frame = new LeastCommonMultiple();
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
	public LeastCommonMultiple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 194);
		getContentPane().setLayout(null);
 
		btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(0, 141, 215, 28);
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		getContentPane().add(btnNewButton);
 
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(0, 0, 215, 0);
		getContentPane().add(verticalBox);
 
		txtAddYourDigit = new JTextField();
		txtAddYourDigit.setText("Add your first digit");
		txtAddYourDigit.setBounds(28, 31, 157, 19);
		getContentPane().add(txtAddYourDigit);
		txtAddYourDigit.setColumns(10);
 
		txtAddYourSecond = new JTextField();
		txtAddYourSecond.setText("Add your second digit");
		txtAddYourSecond.setBounds(28, 69, 157, 19);
		getContentPane().add(txtAddYourSecond);
		txtAddYourSecond.setColumns(10);
	}
}
