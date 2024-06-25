package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

public class TransactionLogin {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransactionLogin window = new TransactionLogin();
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
	public TransactionLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeadline = new JLabel("VIEW YOUR TRANSACTION");
		lblHeadline.setForeground(new Color(255, 255, 255));
		lblHeadline.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHeadline.setBounds(163, 123, 360, 30);
		frame.getContentPane().add(lblHeadline);
		
		JLabel lblTransactionId = new JLabel("Transaction ID:");
		lblTransactionId.setForeground(new Color(255, 255, 255));
		lblTransactionId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTransactionId.setBounds(150, 211, 150, 30);
		frame.getContentPane().add(lblTransactionId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(310, 211, 200, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String transactionID = textField.getText();
				TransactionDetails.main(new String[]{transactionID});
				frame.dispose();
			}
		});
		btnSubmit.setBounds(268, 299, 150, 40);
		frame.getContentPane().add(btnSubmit);
		
		JLabel samsungLogo = new JLabel("");
		samsungLogo.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		samsungLogo.setBounds(268, 10, 150, 78);
		frame.getContentPane().add(samsungLogo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(13, 38, 167));
		panel.setBackground(new Color(13, 38, 167));
		panel.setBounds(0, 103, 686, 270);
		frame.getContentPane().add(panel);
	}
}
