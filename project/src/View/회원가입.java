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

public class ȸ������ {

	private JFrame frame;
	private final JLabel ���ȭ�� = new JLabel("");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ȸ������ window = new ȸ������();
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
	public ȸ������() {
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
		
		
		
		
		JLabel ���λ���� = new JLabel("\uAC1C\uC778\uC0AC\uC6A9\uC790");
		���λ����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ȸ���������� user = new ȸ����������();
			}
			
			
			
			
		});
		sl_panel.putConstraint(SpringLayout.NORTH, ���λ����, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, ���λ����, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, ���λ����, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, ���λ����, 180, SpringLayout.WEST, panel);
		panel.add(���λ����);
		���λ����.setHorizontalAlignment(SwingConstants.CENTER);
		���λ����.setFont(new Font("����", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 240));
		panel_1.setBounds(203, 413, 180, 92);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel ����� = new JLabel("\uC0AC\uC7A5\uB2D8");
		�����.setFont(new Font("����", Font.PLAIN, 24));
		�����.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(�����, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(385, 413, 180, 92);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel ���̴� = new JLabel("\uB77C\uC774\uB354");
		���̴�.setHorizontalAlignment(SwingConstants.CENTER);
		���̴�.setFont(new Font("����", Font.PLAIN, 24));
		panel_2.add(���̴�, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(73, 106, 449, 74);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel ȸ������ = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		ȸ������.setFont(new Font("����", Font.PLAIN, 30));
		ȸ������.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(ȸ������, BorderLayout.CENTER);
		���ȭ��.setHorizontalAlignment(SwingConstants.CENTER);
		���ȭ��.setBounds(0, 0, 594, 581);
		���ȭ��.setIcon(new ImageIcon(imgPath));
		frame.getContentPane().add(���ȭ��);
	}
}
