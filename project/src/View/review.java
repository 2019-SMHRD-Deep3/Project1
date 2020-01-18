package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.UserModel;
import controller.MemberManagementService;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class review {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private String id;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	


	public review(String id) {
		initialize();
		frame.setVisible(true);
		this.id = id;
	}
	
	


	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 150, 367, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9AC\uBDF0 \uC4F0\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("양재벨라체M", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 10, 351, 52);
		frame.getContentPane().add(lblNewLabel);
		
	
		
		JLabel a1 = new JLabel("");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 56, 306, 393);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 306, 390);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(280, 700));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 10, 263, 516);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel shop = new JLabel("\uAC00\uAC8C \uB9AC\uBDF0");
		shop.setFont(new Font("HY수평선B", Font.BOLD, 14));
		shop.setBounds(12, 10, 239, 26);
		panel_2.add(shop);
		
		JLabel label = new JLabel("\uB77C\uC774\uB354 \uB9AC\uBDF0");
		label.setFont(new Font("HY수평선B", Font.BOLD, 14));
		label.setBounds(12, 199, 239, 26);
		panel_2.add(label);
		
		textField = new JTextField();
		textField.setBounds(12, 46, 239, 66);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 235, 239, 92);
		panel_2.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 183, 239, 2);
		panel_2.add(separator);
		
		JLabel label_1 = new JLabel("\uAC00\uAC8C \uD3C9\uC810");
		label_1.setFont(new Font("HY수평선B", Font.BOLD, 14));
		label_1.setBounds(22, 122, 77, 26);
		panel_2.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 122, 134, 26);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		if(textField_2.equals("5")) {
			String star5 = this.getClass().getResource(".").getPath() + "..//..//img//star5.png";
			lblNewLabel_1.setIcon(new ImageIcon(star5));
		}else if(textField_2.equals("4")) {
			String star4 = this.getClass().getResource(".").getPath() + "..//..//img//star4.png";
			lblNewLabel_1.setIcon(new ImageIcon(star4));
		}else if(textField_2.equals("3")) {
			String star3 = this.getClass().getResource(".").getPath() + "..//..//img//star3.png";
			lblNewLabel_1.setIcon(new ImageIcon(star3));
		}else if(textField_2.equals("2")) {
			String star2 = this.getClass().getResource(".").getPath() + "..//..//img//star2.png";
			lblNewLabel_1.setIcon(new ImageIcon(star2));
		}else if(textField_2.equals("1")) {
			String star1 = this.getClass().getResource(".").getPath() + "..//..//img//star1.png";
			lblNewLabel_1.setIcon(new ImageIcon(star1));
		}
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(32, 158, 205, 26);
		panel_2.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("\uB77C\uC774\uB354 \uD3C9\uC810");
		label_2.setFont(new Font("HY수평선B", Font.BOLD, 14));
		label_2.setBounds(20, 338, 98, 26);
		panel_2.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 338, 116, 26);
		panel_2.add(textField_3);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(30, 374, 205, 26);
		panel_2.add(label_3);
		
		JButton button_4 = new JButton("\uCDE8\uC18C");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		button_4.setBounds(196, 484, 116, 41);
		frame.getContentPane().add(button_4);
		
		JButton button = new JButton("\uD655\uC778");
		button.setBounds(47, 484, 116, 41);
		frame.getContentPane().add(button);
		
		
	
	
	
	
	
	
	
	
	
	}
}
