package Random;

package graphs;

        import java.awt.EventQueue;

        import javax.swing.JFrame;
        import javax.swing.JTextField;
        import javax.swing.JLabel;

public class Common {

    private JFrame frame;
    private JTextField txtBanko;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Common window = new Common();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Common() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtBanko = new JTextField();
        txtBanko.setText("Banko");
        txtBanko.setBounds(132, 96, 143, 20);
        frame.getContentPane().add(txtBanko);
        txtBanko.setColumns(10);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(167, 71, 46, 14);
        frame.getContentPane().add(lblName);
    }
}

