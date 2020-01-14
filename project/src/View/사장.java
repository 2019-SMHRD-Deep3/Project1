package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

public class ªÁ¿Â {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ªÁ¿Â window = new ªÁ¿Â();
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
	public ªÁ¿Â() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 200, 382, 600);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBounds(0, 0, 366, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 366, 72);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("  \uC0AC\uC7A5 \uD68C\uC6D0\uAC00\uC785");
		label.setFont(new Font("HYºˆ∆Úº±B", Font.PLAIN, 25));
		label.setBounds(12, 22, 218, 29);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBounds(27, 103, 307, 38);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uAC8C\uC774\uB984");
		lblNewLabel.setBackground(new Color(102, 153, 255));
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 98, 38);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(97, 0, 210, 38);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(204, 255, 255));
		panel_4.setBounds(27, 151, 307, 38);
		panel.add(panel_4);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("±º∏≤", Font.BOLD, 13));
		lblId.setBackground(new Color(102, 153, 255));
		lblId.setBounds(0, 0, 98, 38);
		panel_4.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(97, 0, 210, 38);
		panel_4.add(textField_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(204, 255, 255));
		panel_6.setBounds(221, 199, 113, 23);
		panel.add(panel_6);
		
		JButton btnNewButton_1 = new JButton("ID \uC911\uBCF5\uD655\uC778");
		btnNewButton_1.setBounds(0, 0, 113, 23);
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(204, 255, 255));
		panel_7.setBounds(27, 232, 307, 38);
		panel.add(panel_7);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("±º∏≤", Font.BOLD, 13));
		lblPw.setBackground(new Color(102, 153, 255));
		lblPw.setBounds(0, 0, 98, 38);
		panel_7.add(lblPw);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(97, 0, 210, 38);
		panel_7.add(textField_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(204, 255, 255));
		panel_9.setBounds(27, 280, 307, 38);
		panel.add(panel_9);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("±º∏≤", Font.BOLD, 13));
		label_2.setBackground(new Color(102, 153, 255));
		label_2.setBounds(0, 0, 98, 38);
		panel_9.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(97, 0, 210, 38);
		panel_9.add(textField_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(new Color(204, 255, 255));
		panel_11.setBounds(27, 328, 307, 38);
		panel.add(panel_11);
		
		JLabel label_3 = new JLabel("\uC8FC\uC18C");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("±º∏≤", Font.BOLD, 13));
		label_3.setBackground(new Color(102, 153, 255));
		label_3.setBounds(0, 0, 98, 38);
		panel_11.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(97, 0, 210, 38);
		panel_11.add(textField_4);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(new Color(204, 255, 255));
		panel_13.setBounds(27, 414, 307, 38);
		panel.add(panel_13);
		
		JLabel label_4 = new JLabel("\uC0AC\uC5C5\uC790\uBC88\uD638");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("±º∏≤", Font.BOLD, 13));
		label_4.setBackground(new Color(102, 153, 255));
		label_4.setBounds(0, 0, 98, 38);
		panel_13.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(97, 0, 210, 38);
		panel_13.add(textField_5);
		
		JButton btnNewButton = new JButton("\uAC00\uC785 \uC2E0\uCCAD");
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 16));
		btnNewButton.setBounds(214, 462, 120, 38);
		panel.add(btnNewButton);
	}
}













