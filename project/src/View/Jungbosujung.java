package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.UserModel;
import controller.MemberManagementService;

public class Jungbosujung {

	private MemberManagementService service = new MemberManagementService();
	private JFrame frame;
	private UserModel loginUser2;
	private JTextField pwField;
	private JTextField adressField;
	private JTextField numberField;
	private JTextField nameField;
	private String id;
	
	
//	public Jungbosujung(UserModel loginUser2,int sum) {
//		this.loginUser2 = loginUser2;
//		initialize();
//		frame.setVisible(true);
//	}


	public Jungbosujung(String id) {
		initialize();
		frame.setVisible(true);
		this.id = id;
	}
	
	


	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 150, 367, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		lblNewLabel_1.setBounds(38, 73, 196, 41);
		frame.getContentPane().add(lblNewLabel_1);
				
		pwField = new JTextField();
		pwField.setBounds(36, 111, 230, 41);
		frame.getContentPane().add(pwField);
		pwField.setColumns(10);
		
		adressField = new JTextField();
		adressField.setColumns(10);
		adressField.setBounds(38, 213, 230, 41);
		frame.getContentPane().add(adressField);
		
		numberField = new JTextField();
		numberField.setColumns(10);
		numberField.setBounds(38, 315, 230, 41);
		frame.getContentPane().add(numberField);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(38, 417, 230, 41);
		frame.getContentPane().add(nameField);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778 \uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setFont(new Font("양재벨라체M", Font.PLAIN, 20));
		lblNewLabel.setBounds(116, 10, 146, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String infoPW = pwField.getText();
		
				String infoADDRESS = adressField.getText();
				int infoNUMBER = Integer.parseInt(numberField.getText());
				String infoNAME = nameField.getText();
				// Member 객체생성
				UserModel m = new UserModel(infoNAME, infoPW, infoADDRESS, infoNUMBER);
			
				boolean result = service.sujung(m, id);
				if (result) {
					JOptionPane.showMessageDialog(frame,
							"수정 실패");
				} else {
					JOptionPane.showMessageDialog(frame,
						    "수정 성공");
					//페이지 닫기
					frame.dispose();
					//페이지 닫기
				}

			}
		});
				
		
		
		btnNewButton.setBounds(38, 498, 116, 41);
		frame.getContentPane().add(btnNewButton);
		
	
		
		JLabel a1 = new JLabel("");


		
		
		
		
		
		
		JLabel label = new JLabel("\uC8FC\uC18C \uBCC0\uACBD");
		label.setBounds(38, 162, 196, 41);
		frame.getContentPane().add(label);
		
		
		
		JLabel label_1 = new JLabel("\uC804\uD654\uBC88\uD638 \uBCC0\uACBD");
		label_1.setBounds(38, 264, 196, 41);
		frame.getContentPane().add(label_1);
		
		
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				
			}
		});
		
		button.setBounds(166, 498, 116, 41);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setBounds(38, 366, 196, 41);
		frame.getContentPane().add(label_2);
		

	}
}
