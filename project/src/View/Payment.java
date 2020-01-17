package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.UserModel;
import controller.MemberManagementService;

public class Payment {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser;
	
	public Payment(UserModel loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Payment window = new Payment();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//
//	public Payment() {
//		initialize();
//	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 367, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Address = new JLabel("New label");
		Address.setBounds(49, 109, 264, 52);
		frame.getContentPane().add(Address);
		frame.getContentPane().add(Address);
		Address.setText(loginUser.getUSER_ADDRESS());
	
		
		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1.setBounds(50, 82, 196, 41);
		frame.getContentPane().add(lblNewLabel_1);
				
		
		
		JLabel lblNewLabel = new JLabel("\uACB0\uC81C \uBC0F \uC8FC\uBB38\uB0B4\uC5ED");
		lblNewLabel.setBounds(131, 10, 146, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE08\uC561");
		lblNewLabel_2.setBounds(49, 350, 59, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(120, 350, 214, 52);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(120, 412, 116, 41);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 202, 264, 468);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 264, 468);
		panel.add(scrollPane);
		
		String[] columnNames = {};
		
//		ArrayList<> list = service.();
//	
//		Object[][] data = new Object[list.size()][2];
//		
//		for (int i = 0; i < list.size(); i++) {
//			Member m = list.get(i);
//			data[i] = new Object[]{m.menuName(),m.menuPrice()};
//		}
//		table = new JTable(data, columnNames);
//		scrollPane.setViewportView(table);
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
			JLabel a1 = new JLabel("");
			panel_1.setPreferredSize(new Dimension(240, 400));
		
		JLabel lblNewLabel_4 = new JLabel("\uAD6C\uB9E4 \uB0B4\uC5ED");
		lblNewLabel_4.setBounds(49, 177, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
