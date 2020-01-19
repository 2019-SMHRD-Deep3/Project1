package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.RiderModel;
import Model.ShopkeeperModel;
import controller.MemberManagementService;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class RiderView {

	private JFrame frame;
	private RiderModel loginUser;
	private JPanel orderPanel;
	private int cnt;
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RiderView window = new RiderView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
	
	MemberManagementService service = new MemberManagementService();
	private JTextField textField;
	private JTextField textField_1;
	
	public RiderView(RiderModel loginUser) {
		initialize();
		frame.setBounds(400, 150, 1011, 661);
		frame.setVisible(true);
		
		this.loginUser = loginUser;
		
		JPanel panel_1 =new JPanel();
		panel_1.setBounds(371, 0, 634, 632);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		panel_1.add(main, "name_82546225747300");
		main.setLayout(null);
		
		JPanel leftView = new JPanel();
		leftView.setBackground(new Color(135, 206, 250));
		leftView.setBounds(0, 0, 279, 622);
		leftView.setLayout(null);
		
		main.add(leftView);
		
		JLabel label = new JLabel((String) null);
		label.setFont(new Font("HY수평선B", Font.BOLD, 20));
		label.setBounds(22, 33, 176, 57);
		leftView.add(label);
		label.setText(loginUser.getID());
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 100, 248, 415);
		leftView.add(panel);
		
		JLabel label_1 = new JLabel("\uC815\uBCF4\uC218\uC815");
		label_1.setFont(new Font("HY수평선B", Font.BOLD, 22));
		label_1.setBounds(15, 106, 203, 26);
		panel.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 84, 224, 2);
		panel.add(separator);
		
		JLabel label_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		label_2.setBounds(15, 142, 196, 26);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(14, 264, 216, 41);
		panel.add(textField);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638 \uBCC0\uACBD");
		label_3.setBounds(15, 229, 196, 26);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 178, 218, 41);
		panel.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 313, 224, 2);
		panel.add(separator_1);
		
		JLabel label_4 = new JLabel("\uD3C9\uC810");
		label_4.setFont(new Font("HY수평선B", Font.BOLD, 22));
		label_4.setBounds(12, 10, 203, 26);
		panel.add(label_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 40, 218, 34);
		panel.add(lblNewLabel);
		
		JButton button_2 = new JButton("\uC815\uBCF4\uC218\uC815");
		button_2.setBounds(102, 345, 116, 34);
		panel.add(button_2);
		
		JButton button = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				회원가입 Login = new 회원가입();
			}
		});
		button.setBounds(155, 547, 93, 37);
		leftView.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0 \uD0C8\uD1F4");
		button_1.setBounds(32, 547, 93, 37);
		leftView.add(button_1);
		

		

		
		JPanel rightView = new JPanel();
		rightView.setBackground(Color.WHITE);
		rightView.setBounds(279, 0, 716, 622);
		main.add(rightView);
		rightView.setLayout(null);
		
		JPanel rider_call = new JPanel();
		rider_call.setBounds(27, 97, 651, 432);
		rider_call.setBackground(Color.WHITE);
		rightView.add(rider_call);
		rider_call.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 651, 431);
		scrollPane_1.setPreferredSize(new Dimension(651, 431));
		rider_call.add(scrollPane_1);
		
		JPanel orderPanel1 = new JPanel();
		orderPanel1.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(orderPanel1);
		
		orderPanel1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton bnt = new JButton("새로 고침");
		bnt.setBounds(577, 10, 101, 63);
		rightView.add(bnt);
		
		bnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cnt++;
				if(cnt==4) {
					orderPanel1.setLayout(new GridLayout(-1,1,0,0));
					System.out.println("ddd");
				}
				JPanel cardPanel = new JPanel();
				// cardPanel 꾸미기 시작
				JButton bnt1 = new JButton("New button");
				cardPanel.add(bnt1);
				// cardPanel 꾸미기 끝
				cardPanel.setPreferredSize(new Dimension(350, 150));
				cardPanel.setBackground(new Color(255,0 , 0));
				orderPanel1.add(cardPanel);
				
				// 다시 화면 그리기
				orderPanel1.repaint();
				orderPanel1.revalidate();
			}
		});
		String mk1 = this.getClass().getResource(".").getPath() + "..//..//img//mk1.png";
		String mk2 = this.getClass().getResource(".").getPath() + "..//..//img//mk2.png";
					
					
					String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//a1.png";
					String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//a2.png";
					String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//a3.png";
					String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//a4.png";
					
	
					
			
		
		
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}
}
