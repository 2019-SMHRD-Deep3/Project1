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

public class 회원가입 {

	private JFrame frame;
	private final JLabel 배경화면 = new JLabel("");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입 window = new 회원가입();
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
	public 회원가입() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(600, 200, 600, 610);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
		System.out.println(imgPath);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(22, 413, 180, 92);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		
		
		
		JLabel 개인사용자 = new JLabel("\uAC1C\uC778\uC0AC\uC6A9\uC790");
		개인사용자.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				회원가입유저 user = new 회원가입유저();
			}
			
			
			
			
		});
		sl_panel.putConstraint(SpringLayout.NORTH, 개인사용자, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, 개인사용자, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, 개인사용자, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, 개인사용자, 180, SpringLayout.WEST, panel);
		panel.add(개인사용자);
		개인사용자.setHorizontalAlignment(SwingConstants.CENTER);
		개인사용자.setFont(new Font("굴림", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 240));
		panel_1.setBounds(203, 413, 180, 92);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel 사장님 = new JLabel("\uC0AC\uC7A5\uB2D8");
		사장님.setFont(new Font("굴림", Font.PLAIN, 24));
		사장님.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(사장님, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(385, 413, 180, 92);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel 라이더 = new JLabel("\uB77C\uC774\uB354");
		라이더.setHorizontalAlignment(SwingConstants.CENTER);
		라이더.setFont(new Font("굴림", Font.PLAIN, 24));
		panel_2.add(라이더, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(73, 106, 449, 74);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel 회원가입 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		회원가입.setFont(new Font("굴림", Font.PLAIN, 30));
		회원가입.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(회원가입, BorderLayout.CENTER);
		배경화면.setHorizontalAlignment(SwingConstants.CENTER);
		배경화면.setBounds(0, 0, 594, 581);
		배경화면.setIcon(new ImageIcon(imgPath));
		frame.getContentPane().add(배경화면);
	}
}
