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

public class reviewShop {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private String id;
	private JTextField 리플작성란;
	


	public reviewShop(String id) {
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
		
		JLabel lblNewLabel = new JLabel("\uB9AC\uD50C \uC791\uC131");
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
		panel_2.setBounds(12, 10, 263, 326);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uB9AC\uD50C \uC4F0\uAE30");
		btnNewButton_1.setBounds(142, 292, 109, 24);
		panel_2.add(btnNewButton_1);
		
		리플작성란 = new JTextField();
		리플작성란.setBounds(12, 26, 239, 238);
		panel_2.add(리플작성란);
		리플작성란.setColumns(10);
		
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
