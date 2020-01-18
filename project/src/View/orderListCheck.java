package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class orderListCheck {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private String id;
	


	public orderListCheck(String id) {
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
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uB0B4\uC5ED");
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
		panel_2.setBounds(12, 10, 263, 161);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel shopName = new JLabel("");
		shopName.setBounds(12, 44, 200, 24);
		panel_2.add(shopName);
		
		JButton btnNewButton_1 = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		btnNewButton_1.setBounds(142, 127, 109, 24);
		panel_2.add(btnNewButton_1);
		
		JLabel day = new JLabel("");
		day.setBounds(12, 10, 133, 24);
		panel_2.add(day);
		
		JLabel menu = new JLabel("");
		menu.setBounds(12, 78, 219, 39);
		panel_2.add(menu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(12, 181, 263, 161);
		panel_1.add(panel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 44, 200, 24);
		panel_3.add(label);
		
		JButton button_1 = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		button_1.setBounds(142, 127, 109, 24);
		panel_3.add(button_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 10, 133, 24);
		panel_3.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(12, 78, 219, 39);
		panel_3.add(label_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 352, 263, 161);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(12, 44, 200, 24);
		panel_4.add(label_2);
		
		JButton button_2 = new JButton("\uB9AC\uBDF0 \uC4F0\uAE30");
		button_2.setBounds(142, 127, 109, 24);
		panel_4.add(button_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(12, 10, 133, 24);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(12, 78, 219, 39);
		panel_4.add(label_5);
		
		JButton button_4 = new JButton("\uCDE8\uC18C");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		button_4.setBounds(196, 484, 116, 41);
		frame.getContentPane().add(button_4);
		
		
	
	
	
	
	
	
	
	
	
	}
}
