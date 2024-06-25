package pages;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ViewBatch {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBatch window = new ViewBatch();
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
	public ViewBatch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Define column names and data
		String[] columnNames = {"Batch 1", "Batch 2", "Batch 3", "Batch 4", "Batch 5"};
		Object[][] data = {
			{"SN12345", "SN12346", "SN12347", "SN12348", "SN12349"},
			{"SN22345", "SN22346", "SN22347", "SN22348", "SN22349"},
			{"SN32345", "SN32346", "SN32347", "SN32348", "SN32349"},
			{"SN42345", "SN42346", "SN42347", "SN42348", "SN42349"},
			{"SN52345", "SN52346", "SN52347", "SN52348", "SN52349"}
		};

		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);

		// Set a larger font for the table
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setRowHeight(30);

		// Custom cell renderer to color the columns
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				if (column == 0 || column == 1 || column == 4) {
					cell.setForeground(Color.RED);
				} else if (column == 2 || column == 3) {
					cell.setForeground(Color.GREEN);
				} else {
					cell.setForeground(Color.BLACK);
				}
				return cell;
			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 50, 1100, 400);
		frame.getContentPane().add(scrollPane);
	}
}
