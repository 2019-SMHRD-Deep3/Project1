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

public class ȸ������2 {

	private JFrame frame;
	private final JLabel ���ȭ�� = new JLabel("");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ȸ������2 window = new ȸ������2();
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
	public ȸ������2() {
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
		
		JLabel ȸ������ = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		ȸ������.setFont(new Font("����", Font.PLAIN, 30));
		ȸ������.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(ȸ������, BorderLayout.CENTER);
		���ȭ��.setHorizontalAlignment(SwingConstants.CENTER);
		���ȭ��.setBounds(-57, -47, 594, 581);
		���ȭ��.setIcon(new ImageIcon(imgPath));
		frame.getContentPane().add(���ȭ��);
	}
}
