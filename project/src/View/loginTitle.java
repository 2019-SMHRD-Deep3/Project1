package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.SpringLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class loginTitle {

	private JFrame frame;
	private JPasswordField pw;
	private JTextField id;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginTitle window = new loginTitle();
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
	public loginTitle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(600, 200, 600, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame = new JFrame();
//		frame.setResizable(false);
//		frame.setBounds(600, 200, 600, 610);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(null);
//		frame.getContentPane().setLayout(springLayout);
//		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
//		System.out.println(imgPath);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 375, 250, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uB85C\uADF8\uC778");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = id.getText();
				String infoPw = pw.getText();
				
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(label.getFont().deriveFont(label.getFont().getStyle() | Font.BOLD | Font.ITALIC, 50f));
		panel.add(label, "name_2233986277709600");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(160, 465, 250, 70);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				회원가입 join = new 회원가입();
			}
			
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD | Font.ITALIC, 50f));
		panel_1.add(lblNewLabel, "name_2234031158089300");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(110, 130, 50, 70);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1, "name_2234191797944600");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(100, 210, 70, 70);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("PW");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2, "name_2234266573794200");
		
		pw = new JPasswordField();
		pw.setBounds(190, 210, 240, 70);
		frame.getContentPane().add(pw);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
		System.out.println(imgPath);
		
		id = new JTextField();
		id.setBackground(new Color(255, 255, 255));
		id.setBounds(190, 130, 240, 70);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 584, 571);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(imgPath));
		
	}
}
