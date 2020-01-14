package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.CardLayout;

public class È¸¿ø°¡ÀÔ {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					È¸¿ø°¡ÀÔ window = new È¸¿ø°¡ÀÔ();
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
	public È¸¿ø°¡ÀÔ() {
		initialize();
		frame.setVisible(true);  //Ã¢À» º¸¿©Áà¶ó
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(400, 150, 1011, 661);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
		System.out.println(imgPath);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 370, 632);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(371, 0, 634, 632);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel main = new JPanel();
		main.setBackground(new Color(153, 204, 255));
		panel_1.add(main, "name_82546225747300");
		main.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBounds(111, 280, 389, 43);
		main.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, -1, 119, 42);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(120, 1, 269, 41);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setBounds(111, 349, 389, 43);
		main.add(panel_3);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblPw.setBounds(0, -1, 119, 42);
		panel_3.add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 1, 269, 41);
		panel_3.add(textField_1);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 15));
		btnNewButton.setBounds(140, 438, 132, 48);
		main.add(btnNewButton);
		
		JPanel LoJo = new JPanel();
		LoJo.setLayout(null);
		LoJo.setBackground(new Color(153, 204, 255));
		panel_1.add(LoJo, "name_83535195314200");
		
		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(LoJo);
				panel_1.repaint();
				panel_1.revalidate();
				
				
			}
		});
		button.setFont(new Font("±¼¸²", Font.BOLD, 15));
		button.setBounds(346, 438, 132, 48);
		main.add(button);
		
		JButton Ãë¼Ò = new JButton("\uCDE8\uC18C");
		Ãë¼Ò.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(main);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		Ãë¼Ò.setFont(new Font("±¼¸²", Font.BOLD, 15));
		Ãë¼Ò.setBounds(404, 500, 132, 48);
		LoJo.add(Ãë¼Ò);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(0, 36, 634, 99);
		LoJo.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_1.setFont(new Font("HY¼öÆò¼±B", Font.BOLD, 35));
		lblNewLabel_1.setBounds(23, 30, 173, 46);
		panel_6.add(lblNewLabel_1);
		
		JButton User = new JButton("\uAC1C\uC778\uC0AC\uC6A9\uC790");
		User.setBackground(new Color(255, 255, 255));
		User.setFont(new Font("±¼¸²", Font.BOLD, 25));
		User.setBounds(202, 203, 229, 67);
		LoJo.add(User);
		
		JButton ShopKeeper = new JButton("\uC0AC\uC7A5\uB2D8");
		ShopKeeper.setFont(new Font("±¼¸²", Font.BOLD, 25));
		ShopKeeper.setBackground(new Color(255, 255, 255));
		ShopKeeper.setBounds(202, 288, 229, 67);
		LoJo.add(ShopKeeper);
		
		JButton Rider = new JButton("\uB77C\uC774\uB354");
		Rider.setFont(new Font("±¼¸²", Font.BOLD, 25));
		Rider.setBackground(new Color(255, 255, 255));
		Rider.setBounds(202, 381, 229, 67);
		LoJo.add(Rider);
		
		JPanel UserJoin = new JPanel();
		UserJoin.setLayout(null);
		UserJoin.setBackground(new Color(153, 204, 255));
		panel_1.add(UserJoin, "name_90424023594900");
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(204, 255, 255));
		panel_7.setBounds(111, 280, 389, 43);
		UserJoin.add(panel_7);
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±¼¸²", Font.BOLD, 16));
		label.setBounds(0, -1, 119, 42);
		panel_7.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 1, 269, 41);
		panel_7.add(textField_2);
		
		JButton button_1 = new JButton("\uB85C\uADF8\uC778");
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		button_1.setBounds(140, 438, 132, 48);
		UserJoin.add(button_1);
		
		JButton button_2 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		button_2.setBounds(346, 438, 132, 48);
		UserJoin.add(button_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 34, 634, 99);
		UserJoin.add(panel_4);
		
		JLabel label_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label_1.setFont(new Font("HY¼öÆò¼±B", Font.BOLD, 35));
		label_1.setBounds(23, 30, 173, 46);
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, "name_79986487518000");
	}
}
