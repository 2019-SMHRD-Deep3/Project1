package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

import Model.UserModel;
import controller.MemberManagementService;
import javax.swing.JTextField;
import java.awt.Font;

public class Jungbosujung {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private JTextField pwField;
	private JTextField adressField;
	private JTextField numberField;
	private JTextField nameField;
	
	
	
	public Jungbosujung(UserModel loginUser2,int sum) {
		this.loginUser2 = loginUser2;
		initialize();
		frame.setVisible(true);
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Payment window = new Payment();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//
//	public Payment() {
//		initialize();
//	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 150, 367, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		lblNewLabel_1.setBounds(38, 73, 196, 41);
		frame.getContentPane().add(lblNewLabel_1);
				
		
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778 \uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setFont(new Font("양재벨라체M", Font.PLAIN, 20));
		lblNewLabel.setBounds(116, 10, 146, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				
			}
		});
		
		btnNewButton.setBounds(38, 498, 116, 41);
		frame.getContentPane().add(btnNewButton);
		
	
		
			JLabel a1 = new JLabel("");
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		pwField = new JTextField();
		pwField.setBounds(36, 111, 230, 41);
		frame.getContentPane().add(pwField);
		pwField.setColumns(10);
		
		adressField = new JTextField();
		adressField.setColumns(10);
		adressField.setBounds(38, 213, 230, 41);
		frame.getContentPane().add(adressField);
		
		numberField = new JTextField();
		numberField.setColumns(10);
		numberField.setBounds(38, 315, 230, 41);
		frame.getContentPane().add(numberField);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(38, 417, 230, 41);
		frame.getContentPane().add(nameField);
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel label = new JLabel("\uC8FC\uC18C \uBCC0\uACBD");
		label.setBounds(38, 162, 196, 41);
		frame.getContentPane().add(label);
		
		
		
		JLabel label_1 = new JLabel("\uC804\uD654\uBC88\uD638 \uBCC0\uACBD");
		label_1.setBounds(38, 264, 196, 41);
		frame.getContentPane().add(label_1);
		
		
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(166, 498, 116, 41);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setBounds(38, 366, 196, 41);
		frame.getContentPane().add(label_2);
		
		
	
	
	
	
	
	
	
	
	
	}
}
