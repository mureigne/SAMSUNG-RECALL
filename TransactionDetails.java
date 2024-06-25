package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TransactionDetails {

	private JFrame frame;
	private String transactionID;
	private String serialNumber = "SN12345678";
	private String samsungEmail = "example@samsung.com";
	private String name = "John Doe";
	private String phoneNumber = "123-456-7890";
	private String appointmentType = "Refund";
	private String branch = "Main Branch";
	private String appointmentDate = "2024-07-01";
	private String appointmentTime = "10:00 AM";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransactionDetails window = new TransactionDetails(args[0]);
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
	public TransactionDetails(String transactionID) {
		this.transactionID = transactionID;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTransactionId = new JLabel("Transaction ID: " + transactionID);
		lblTransactionId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTransactionId.setBounds(50, 100, 600, 30);
		frame.getContentPane().add(lblTransactionId);
		
		JLabel lblSerialNumber = new JLabel("Serial Number: " + serialNumber);
		lblSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSerialNumber.setBounds(50, 150, 600, 30);
		frame.getContentPane().add(lblSerialNumber);
		
		JLabel lblSamsungEmail = new JLabel("Samsung Email: " + samsungEmail);
		lblSamsungEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSamsungEmail.setBounds(50, 200, 600, 30);
		frame.getContentPane().add(lblSamsungEmail);
		
		JLabel lblName = new JLabel("Name: " + name);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(50, 250, 600, 30);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: " + phoneNumber);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhoneNumber.setBounds(50, 300, 600, 30);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblAppointmentType = new JLabel("Appointment Type: " + appointmentType);
		lblAppointmentType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAppointmentType.setBounds(50, 350, 600, 30);
		frame.getContentPane().add(lblAppointmentType);
		
		JLabel lblBranch = new JLabel("Branch: " + branch);
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBranch.setBounds(50, 400, 600, 30);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblAppointmentDate = new JLabel("Appointment Date: " + appointmentDate);
		lblAppointmentDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAppointmentDate.setBounds(50, 450, 600, 30);
		frame.getContentPane().add(lblAppointmentDate);
		
		JLabel lblAppointmentTime = new JLabel("Appointment Time: " + appointmentTime);
		lblAppointmentTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAppointmentTime.setBounds(50, 500, 600, 30);
		frame.getContentPane().add(lblAppointmentTime);
		
		JButton btnMissed = new JButton("Missed");
		btnMissed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMissed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add logic for missed appointment
			}
		});
		btnMissed.setBounds(150, 550, 150, 40);
		frame.getContentPane().add(btnMissed);
		
		JButton btnCompleted = new JButton("Completed");
		btnCompleted.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add logic for completed appointment
			}
		});
		btnCompleted.setBounds(350, 550, 150, 40);
		frame.getContentPane().add(btnCompleted);
		
		JLabel samsungLogo = new JLabel("");
		samsungLogo.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		samsungLogo.setBounds(10, 10, 150, 78);
		frame.getContentPane().add(samsungLogo);
	}
}
