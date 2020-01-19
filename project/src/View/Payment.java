package View;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

import Model.ShopkeeperModel;
import Model.UserModel;
import controller.MemberManagementService;

public class Payment {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private JTable table;
	private int sum ;
	private ShopkeeperModel shopkeeper;
	
	
//	public Payment(UserModel loginUser2,int sum) {
//		this.loginUser2 = loginUser2;
//		this.sum = sum;
//		initialize();
//		frame.setVisible(true);
//	}

public Payment(UserModel loginUser2, int sum, ShopkeeperModel shopkeeper2) {
		
//	super();
	
	System.out.println("sum ㄱ값"+sum);
		this.loginUser2 = loginUser2;
		this.sum = sum;
		this.shopkeeper = shopkeeper2;
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
//		
//	}


	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 150, 367, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(50, 115, 263, 52);
		frame.getContentPane().add(textPane);
		
		
			textPane.setText(((UserModel)loginUser2).getUSER_ADDRESS());
	
	
		
		
		
		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1.setBounds(40, 82, 196, 41);
		frame.getContentPane().add(lblNewLabel_1);
				
		
		
		JLabel lblNewLabel = new JLabel("\uACB0\uC81C \uBC0F \uC8FC\uBB38\uB0B4\uC5ED");
		lblNewLabel.setBounds(131, 10, 146, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE08\uC561");
		lblNewLabel_2.setBounds(47, 378, 59, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(99, 378, 214, 52);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setText(""+sum+"원");
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				frame.dispose();
				JOptionPane.showMessageDialog(frame,
					    "구매해 주셔서 감사합니다.");
				order main = new order(loginUser2);
				
			}
		});
		
		btnNewButton.setBounds(120, 460, 116, 41);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 202, 264, 166);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 264, 166);
		panel.add(scrollPane);
		
		
		
	

		
		String[] columnNames = {"MENU","가격"};
		ArrayList<Model.Payment> list = service.memberLookup(loginUser2.getID(),shopkeeper.getID());
		
		Object[][] data = new Object[list.size()][2];
		
		for (int i = 0; i < list.size(); i++) {
			Model.Payment m = list.get(i);
			data[i] = new Object[]{m.getMenu(),m.getPrice()};
			
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		
		
			JLabel a1 = new JLabel("");
		
		JLabel lblNewLabel_4 = new JLabel("\uAD6C\uB9E4 \uB0B4\uC5ED");
		lblNewLabel_4.setBounds(49, 177, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
