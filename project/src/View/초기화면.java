package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.Model;
import Model.RiderModel;
import Model.ShopkeeperModel;
import Model.UserModel;
import controller.MemberManagementService;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 초기화면 {
	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private String sector = "";
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					초기화면 window = new 초기화면();
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
	public 초기화면() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(400, 150, 1011, 661);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				회원가입 Login = new 회원가입();
			}
		});

		panel.setBackground(new Color(47, 190, 198));
		panel.setBounds(0, 0, 1005, 632);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		String main = this.getClass().getResource(".").getPath() + "..//..//img//main2.png";
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(83, 10, 833, 597);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(main));

		
		ButtonGroup group = new ButtonGroup();
	}
}
