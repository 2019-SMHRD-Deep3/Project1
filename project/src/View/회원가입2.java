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

public class 회원가입2 {

	private JFrame frame;
	private final JLabel 배경화면 = new JLabel("");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입2 window = new 회원가입2();
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
	public 회원가입2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(600, 200, 571, 589);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//a1.png";
		System.out.println(imgPath);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(72, 76, 353, 49);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel 회원가입 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		회원가입.setFont(new Font("굴림", Font.PLAIN, 30));
		회원가입.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(회원가입, BorderLayout.CENTER);
		배경화면.setHorizontalAlignment(SwingConstants.CENTER);
		배경화면.setBounds(-57, -47, 594, 581);
		배경화면.setIcon(new ImageIcon(imgPath));
		frame.getContentPane().add(배경화면);
	}
}
