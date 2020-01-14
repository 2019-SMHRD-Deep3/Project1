package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class 회원가입사장 {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel label = new JLabel("\uC0AC\uC7A5\uC6A9 \uD68C\uC6D0\uAC00\uC785");
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("\uAC00\uAC8C\uC774\uB984");
	private JTextField 가게이름;
	private final JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785 \uC2E0\uCCAD");
	private final JLabel lblNewLabel_2 = new JLabel("ID");
	private final JTextField ID = new JTextField();
	private final JPanel panel_3 = new JPanel();
	private final JLabel lblPw = new JLabel("PW");
	private final JTextField PW = new JTextField();
	private final JPanel panel_4 = new JPanel();
	private final JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638");
	private final JTextField 전화번호 = new JTextField();
	private final JPanel panel_5 = new JPanel();
	private final JLabel label_3 = new JLabel("\uC8FC\uC18C");
	private final JTextField 주소 = new JTextField();
	private final JPanel panel_6 = new JPanel();
	private final JLabel label_4 = new JLabel("\uC0AC\uC5C5\uC790\uBC88\uD638");
	private final JTextField 사업자번호 = new JTextField();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입사장 window = new 회원가입사장();
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
	public 회원가입사장() {
		initialize();
		frame.setVisible(true);  //창을 보여줘라
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		ID.setColumns(10);
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(600, 200, 382, 600);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
		System.out.println(imgPath);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(96, 25, 177, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(label, BorderLayout.CENTER);
		panel_1.setBounds(30, 117, 296, 53);
		
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblNewLabel_1);
		
		가게이름 = new JTextField();
		가게이름.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(가게이름);
		가게이름.setColumns(10);
		panel_2.setBounds(30, 180, 296, 53);
		
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_2.add(lblNewLabel_2);
		
		panel_2.add(ID);
		btnNewButton_1.setBounds(106, 508, 141, 53);
		
		frame.getContentPane().add(btnNewButton_1);
		panel_3.setBounds(30, 243, 296, 53);
		
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_3.add(lblPw);
		PW.setHorizontalAlignment(SwingConstants.CENTER);
		PW.setColumns(10);
		
		panel_3.add(PW);
		panel_4.setBounds(30, 306, 296, 53);
		
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_4.add(label_2);
		전화번호.setHorizontalAlignment(SwingConstants.CENTER);
		전화번호.setColumns(10);
		
		panel_4.add(전화번호);
		panel_5.setBounds(30, 369, 296, 53);
		
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(label_3);
		주소.setHorizontalAlignment(SwingConstants.CENTER);
		주소.setColumns(10);
		
		panel_5.add(주소);
		panel_6.setBounds(30, 432, 296, 53);
		
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_6.add(label_4);
		사업자번호.setHorizontalAlignment(SwingConstants.CENTER);
		사업자번호.setColumns(10);
		
		panel_6.add(사업자번호);
		lblNewLabel.setBounds(0, 10, 594, 584);
		lblNewLabel.setIcon(new ImageIcon(imgPath));
		frame.getContentPane().add(lblNewLabel);
	}
}













