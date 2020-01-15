package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.RiderModel;
import Model.ShopkeeperModel;
import controller.MemberManagementService;
import Model.UserModel;

public class 회원가입 {
	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField user_id;
	private JTextField user_pw;
	private JTextField user_name;
	private JTextField user_address;
	private JTextField user_number;
	private JTextField rider_id;
	private JTextField rider_pw;
	private JTextField rider_name;
	private JTextField rider_loc;
	private JTextField rider_company;
	private JTextField shopkeeper_id;
	private JTextField shopkeeper_pw;
	private JTextField shopkeeper_name;
	private JTextField shopkeeper_address;
	private JTextField shopkeeper_lic;
	private JTextField shopkeeper_tel;
	private JTextField PhoneNumber2;
	private JRadioButton autobike;
	private JRadioButton car;
	private JRadioButton bike;
	private JRadioButton etc;
	

	
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
		frame.setBounds(400, 150, 1011, 661);
		String imgPath = this.getClass().getResource(".").getPath()+"..//..//img//aa.png";
		System.out.println(imgPath);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 370, 632);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 =new JPanel();
		panel_1.setBounds(371, 0, 634, 632);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		// main 창
		JPanel main = new JPanel();
		main.setBackground(new Color(153, 204, 255));
		panel_1.add(main, "name_82546225747300");
		main.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBounds(111, 280, 389, 43);
		main.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, -1, 119, 42);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(120, 1, 269, 41);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setBounds(111, 349, 389, 43);
		main.add(panel_3);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw.setBounds(0, -1, 119, 42);
		panel_3.add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 1, 269, 41);
		panel_3.add(textField_1);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(140, 438, 132, 48);
		main.add(btnNewButton);
		 
		// 로그인 , 회원가입 창 
		JPanel LoJo = new JPanel();
		LoJo.setLayout(null);
		LoJo.setBackground(new Color(153, 204, 255));
		panel_1.add(LoJo, "name_83535195314200");
		
		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(LoJo);
				panel_1.repaint();
				panel_1.revalidate();
				
				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBounds(346, 438, 132, 48);
		main.add(button);
		
		JButton 취소 = new JButton("\uCDE8\uC18C");
		취소.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(main);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		취소.setFont(new Font("굴림", Font.BOLD, 15));
		취소.setBounds(404, 500, 132, 48);
		LoJo.add(취소);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(0, 36, 634, 99);
		LoJo.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_1.setFont(new Font("HY수평선B", Font.BOLD, 35));
		lblNewLabel_1.setBounds(23, 30, 173, 46);
		panel_6.add(lblNewLabel_1);
		
		// User 회원가입 창
		JPanel UserJoin = new JPanel();
		UserJoin.setLayout(null);
		UserJoin.setBackground(new Color(153, 204, 255));
		panel_1.add(UserJoin, "name_90424023594900");
		
		JButton User = new JButton("\uAC1C\uC778\uC0AC\uC6A9\uC790");
		User.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_1.removeAll();
				panel_1.add(UserJoin);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
			
		});
		User.setBackground(new Color(255, 255, 255));
		User.setFont(new Font("굴림", Font.BOLD, 25));
		User.setBounds(202, 203, 229, 67);
		LoJo.add(User);
		
		JButton ShopKeeper = new JButton("\uC0AC\uC7A5\uB2D8");
		ShopKeeper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// 사장 회원가입 창
		JPanel ShopKeeperJoin = new JPanel();
		ShopKeeperJoin.setLayout(null);
		ShopKeeperJoin.setBackground(new Color(153, 204, 255));
		panel_1.add(ShopKeeperJoin, "name_96234007755100");
		
		ShopKeeper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(ShopKeeperJoin);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		ShopKeeper.setFont(new Font("굴림", Font.BOLD, 25));
		ShopKeeper.setBackground(new Color(255, 255, 255));
		ShopKeeper.setBounds(202, 288, 229, 67);
		LoJo.add(ShopKeeper);
		
		JPanel RiderJoin = new JPanel();
		RiderJoin.setLayout(null);
		RiderJoin.setBackground(new Color(153, 204, 255));
		panel_1.add(RiderJoin, "name_96138525806700");
		
		JButton Rider = new JButton("\uB77C\uC774\uB354");
		Rider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(RiderJoin);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		Rider.setFont(new Font("굴림", Font.BOLD, 25));
		Rider.setBackground(new Color(255, 255, 255));
		Rider.setBounds(202, 381, 229, 67);
		LoJo.add(Rider);
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(204, 255, 255));
		panel_7.setBounds(107, 175, 389, 39);
		UserJoin.add(panel_7);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("굴림", Font.BOLD, 16));
		lblId.setBounds(0, -1, 119, 42);
		panel_7.add(lblId);
		
		user_id = new JTextField();
		user_id.setColumns(10);
		user_id.setBounds(120, 1, 269, 41);
		panel_7.add(user_id);
		
		JButton button_1 = new JButton("\uAC00\uC785\uC2E0\uCCAD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// 일반사용자 회원가입 기능
				// 아이디, 비밀번호, 이름, 나이, 성별을 컴포넌트로부터 가져온다.
				String infoId = user_id.getText();                  // id 라는 텍스트창에 적힌 내용을 가져와서 infoId에  넣는다.
				String infoPw = user_pw.getText();
				String infoName = user_name.getText();
				String infoAddress = user_address.getText();
				int infoNumber = Integer.parseInt(user_number.getText());  
				  
				
				// Member 객체를 생성    --> info 변수에 저장된 내용으로 객체를 생성하기 
				UserModel m = new UserModel(infoId, infoPw, infoName, infoAddress, infoNumber);
				
				
				// Controller 에게 회원가입 요청
				boolean result = service.memberJoin(m);
				if(result) {
					// https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html 들어가서 맘에 드는 디자인 코드 복사 붙여넣기
					JOptionPane.showMessageDialog(frame, "회원가입 성공");  
					frame.dispose();  // 화면종료  (가입에 성공하면 가입창을 종료시키기)
				}else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패");
				}
				
				
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 15));
		button_1.setBounds(140, 548, 132, 48);
		UserJoin.add(button_1);
		
		JButton button_2 = new JButton("\uCDE8\uC18C");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(LoJo);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 15));
		button_2.setBounds(346, 548, 132, 48);
		UserJoin.add(button_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 34, 634, 99);
		UserJoin.add(panel_4);
		
		JLabel label_1 = new JLabel("\uAC1C\uC778\uC0AC\uC6A9\uC790 \uD68C\uC6D0\uAC00\uC785");
		label_1.setFont(new Font("HY수평선B", Font.BOLD, 35));
		label_1.setBounds(23, 30, 388, 46);
		panel_4.add(label_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(204, 255, 255));
		panel_8.setBounds(107, 266, 389, 39);
		UserJoin.add(panel_8);
		
		JLabel lblPw_2 = new JLabel("PW");
		lblPw_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw_2.setBounds(0, -1, 119, 42);
		panel_8.add(lblPw_2);
		
		user_pw = new JTextField();
		user_pw.setColumns(10);
		user_pw.setBounds(120, 1, 269, 41);
		panel_8.add(user_pw);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(204, 255, 255));
		panel_9.setBounds(107, 315, 389, 39);
		UserJoin.add(panel_9);
		
		JLabel lblPw_1 = new JLabel("\uC774\uB984");
		lblPw_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw_1.setBounds(0, -1, 119, 42);
		panel_9.add(lblPw_1);
		
		user_name = new JTextField();
		user_name.setColumns(10);
		user_name.setBounds(120, 1, 269, 41);
		panel_9.add(user_name);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(204, 255, 255));
		panel_10.setBounds(107, 367, 389, 39);
		UserJoin.add(panel_10);
		
		JLabel label_4 = new JLabel("\uC8FC\uC18C");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("굴림", Font.BOLD, 16));
		label_4.setBounds(0, -1, 119, 42);
		panel_10.add(label_4);
		
		user_address = new JTextField();
		user_address.setColumns(10);
		user_address.setBounds(120, 1, 269, 41);
		panel_10.add(user_address);
		
		JButton btnNewButton_1 = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton_1.setBounds(373, 224, 115, 32);
		UserJoin.add(btnNewButton_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(new Color(204, 255, 255));
		panel_11.setBounds(107, 416, 389, 39);
		UserJoin.add(panel_11);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("굴림", Font.BOLD, 16));
		label_3.setBounds(0, -1, 119, 42);
		panel_11.add(label_3);
		
		user_number = new JTextField();
		user_number.setColumns(10);
		user_number.setBounds(120, 1, 269, 41);
		panel_11.add(user_number);
		
		
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(new Color(204, 255, 255));
		panel_21.setBounds(107, 157, 389, 39);
		ShopKeeperJoin.add(panel_21);
		
		JLabel label_13 = new JLabel("ID");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("굴림", Font.BOLD, 16));
		label_13.setBounds(0, -1, 119, 42);
		panel_21.add(label_13);
		
		shopkeeper_id = new JTextField();
		shopkeeper_id.setColumns(10);
		shopkeeper_id.setBounds(120, 1, 269, 41);
		panel_21.add(shopkeeper_id);
		
		JButton button_6 = new JButton("\uAC00\uC785\uC2E0\uCCAD");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사장 회원가입 기능
				// 아이디, 비밀번호, 이름, 나이, 성별을 컴포넌트로부터 가져온다.
				String infoId = shopkeeper_id.getText();                  // id 라는 텍스트창에 적힌 내용을 가져와서 infoId에  넣는다.
				String infoPw = shopkeeper_pw.getText();
				String infoName = shopkeeper_name.getText();
				String infoAddress = shopkeeper_address.getText();
				int infoLicense = Integer.parseInt(shopkeeper_lic.getText());
				int infoTel = Integer.parseInt(shopkeeper_tel.getText());
				
				// Member 객체를 생성    --> info 변수에 저장된 내용으로 객체를 생성하기 
				ShopkeeperModel m = new ShopkeeperModel(infoId, infoPw, infoName, infoAddress, infoLicense, infoTel);
				
				
				// Controller 에게 회원가입 요청
				boolean result = service.shopkeeperJoin(m);
				if(result) {
					// https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html 들어가서 맘에 드는 디자인 코드 복사 붙여넣기
					JOptionPane.showMessageDialog(frame, "회원가입 성공");  
					frame.dispose();  // 화면종료  (가입에 성공하면 가입창을 종료시키기)
				}else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패");
				}
				
				
			
			}
		});
		button_6.setFont(new Font("굴림", Font.BOLD, 15));
		button_6.setBounds(140, 548, 132, 48);
		ShopKeeperJoin.add(button_6);
		
		JButton button_7 = new JButton("\uCDE8\uC18C");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(LoJo);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		button_7.setFont(new Font("굴림", Font.BOLD, 15));
		button_7.setBounds(346, 548, 132, 48);
		ShopKeeperJoin.add(button_7);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 34, 634, 99);
		ShopKeeperJoin.add(panel_22);
		
		JLabel label_14 = new JLabel("\uC0AC\uC7A5\uC6A9 \uD68C\uC6D0\uAC00\uC785");
		label_14.setFont(new Font("HY수평선B", Font.BOLD, 35));
		label_14.setBounds(23, 30, 388, 46);
		panel_22.add(label_14);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(new Color(204, 255, 255));
		panel_23.setBounds(107, 248, 389, 39);
		ShopKeeperJoin.add(panel_23);
		
		JLabel lblPw_3 = new JLabel("PW");
		lblPw_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw_3.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw_3.setBounds(0, -1, 119, 42);
		panel_23.add(lblPw_3);
		
		shopkeeper_pw = new JTextField();
		shopkeeper_pw.setColumns(10);
		shopkeeper_pw.setBounds(120, 1, 269, 41);
		panel_23.add(shopkeeper_pw);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(204, 255, 255));
		panel_24.setBounds(107, 297, 389, 39);
		ShopKeeperJoin.add(panel_24);
		
		JLabel label_16 = new JLabel("\uAC00\uAC8C\uC774\uB984");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("굴림", Font.BOLD, 16));
		label_16.setBounds(0, -1, 119, 42);
		panel_24.add(label_16);
		
		shopkeeper_name = new JTextField();
		shopkeeper_name.setColumns(10);
		shopkeeper_name.setBounds(120, 1, 269, 41);
		panel_24.add(shopkeeper_name);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(new Color(204, 255, 255));
		panel_25.setBounds(107, 349, 389, 39);
		ShopKeeperJoin.add(panel_25);
		
		JLabel label_17 = new JLabel("\uC8FC\uC18C");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("굴림", Font.BOLD, 16));
		label_17.setBounds(0, -1, 119, 42);
		panel_25.add(label_17);
		
		shopkeeper_address = new JTextField();
		shopkeeper_address.setColumns(10);
		shopkeeper_address.setBounds(120, 1, 269, 41);
		panel_25.add(shopkeeper_address);
		
		JButton button_8 = new JButton("\uC911\uBCF5\uD655\uC778");
		button_8.setBounds(372, 206, 115, 32);
		ShopKeeperJoin.add(button_8);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(new Color(204, 255, 255));
		panel_26.setBounds(107, 398, 389, 39);
		ShopKeeperJoin.add(panel_26);
		
		JLabel label_18 = new JLabel("\uC0AC\uC5C5\uC790\uBC88\uD638");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("굴림", Font.BOLD, 16));
		label_18.setBounds(0, -1, 119, 42);
		panel_26.add(label_18);
		
		shopkeeper_lic = new JTextField();
		shopkeeper_lic.setColumns(10);
		shopkeeper_lic.setBounds(120, 1, 269, 41);
		panel_26.add(shopkeeper_lic);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(new Color(204, 255, 255));
		panel_27.setBounds(107, 447, 389, 39);
		ShopKeeperJoin.add(panel_27);
		
		JLabel label_19 = new JLabel("\uAC00\uAC8C\uBC88\uD638");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("굴림", Font.BOLD, 16));
		label_19.setBounds(0, -1, 119, 42);
		panel_27.add(label_19);
		
		shopkeeper_tel = new JTextField();
		shopkeeper_tel.setColumns(10);
		shopkeeper_tel.setBounds(120, 1, 269, 41);
		panel_27.add(shopkeeper_tel);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(204, 255, 255));
		panel_14.setBounds(107, 157, 389, 39);
		RiderJoin.add(panel_14);
		
		JLabel label_6 = new JLabel("ID");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("굴림", Font.BOLD, 16));
		label_6.setBounds(0, -1, 119, 42);
		panel_14.add(label_6);
		
		rider_id = new JTextField();
		rider_id.setColumns(10);
		rider_id.setBounds(120, 1, 269, 41);
		panel_14.add(rider_id);
		
		JButton button_3 = new JButton("\uAC00\uC785\uC2E0\uCCAD");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 라이더 회원가입 기능
				// 아이디, 비밀번호, 이름, 나이, 성별을 컴포넌트로부터 가져온다.
				String infoId = rider_id.getText();                  // id 라는 텍스트창에 적힌 내용을 가져와서 infoId에  넣는다.
				String infoPw = rider_pw.getText();
				String infoName = rider_name.getText();
				String TRANSPORTATION = "";
				if(autobike.isSelected()) { // isSelected() -> 선택이 됬는지 안 됬는지 -->  T/F 로 알려주는 메소드 
					TRANSPORTATION = "오토바이";
				}else if(bike.isSelected()){ 
					TRANSPORTATION = "자전거";
				}else if(car.isSelected()){ 
					TRANSPORTATION = "차량";
				}else if(etc.isSelected()){ 
					TRANSPORTATION = "기타";
				}
				String infoLoc = rider_loc.getText();
				String infoCompany = rider_company.getText();
				int infoNumber = Integer.parseInt(PhoneNumber2.getText());  
				// Member 객체를 생성    --> info 변수에 저장된 내용으로 객체를 생성하기 
				RiderModel m = new RiderModel(infoId, infoPw, infoName, TRANSPORTATION, infoLoc, infoCompany, infoNumber);
				
				
				// Controller 에게 회원가입 요청
				boolean result = service.riderJoin(m);
				if(result) {
					// https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html 들어가서 맘에 드는 디자인 코드 복사 붙여넣기
					JOptionPane.showMessageDialog(frame, "회원가입 성공");  
					frame.dispose();  // 화면종료  (가입에 성공하면 가입창을 종료시키기)
				}else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패");
				}
				
				
			}
		});
		button_3.setFont(new Font("굴림", Font.BOLD, 15));
		button_3.setBounds(140, 548, 132, 48);
		RiderJoin.add(button_3);
		
		JButton button_4 = new JButton("\uCDE8\uC18C");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(LoJo);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		button_4.setFont(new Font("굴림", Font.BOLD, 15));
		button_4.setBounds(346, 548, 132, 48);
		RiderJoin.add(button_4);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 34, 634, 99);
		RiderJoin.add(panel_15);
		
		JLabel label_7 = new JLabel("\uB77C\uC774\uB354 \uD68C\uC6D0\uAC00\uC785");
		label_7.setFont(new Font("HY수평선B", Font.BOLD, 35));
		label_7.setBounds(23, 30, 388, 46);
		panel_15.add(label_7);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(new Color(204, 255, 255));
		panel_16.setBounds(107, 248, 389, 39);
		RiderJoin.add(panel_16);
		
		JLabel lblPw_4 = new JLabel("PW");
		lblPw_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw_4.setFont(new Font("굴림", Font.BOLD, 16));
		lblPw_4.setBounds(0, -1, 119, 42);
		panel_16.add(lblPw_4);
		
		rider_pw = new JTextField();
		rider_pw.setColumns(10);
		rider_pw.setBounds(120, 1, 269, 41);
		panel_16.add(rider_pw);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(new Color(204, 255, 255));
		panel_17.setBounds(107, 297, 389, 39);
		RiderJoin.add(panel_17);
		
		JLabel label_9 = new JLabel("\uC774\uB984");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("굴림", Font.BOLD, 16));
		label_9.setBounds(0, -1, 119, 42);
		panel_17.add(label_9);
		
		rider_name = new JTextField();
		rider_name.setColumns(10);
		rider_name.setBounds(120, 1, 269, 41);
		panel_17.add(rider_name);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(new Color(204, 255, 255));
		panel_18.setBounds(107, 349, 389, 39);
		RiderJoin.add(panel_18);
		
		JLabel label_10 = new JLabel("\uC6B4\uC1A1\uC218\uB2E8");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("굴림", Font.BOLD, 16));
		label_10.setBounds(0, -1, 119, 42);
		panel_18.add(label_10);
		
	
		autobike = new JRadioButton("\uC624\uD1A0\uBC14\uC774");
		autobike.setBackground(Color.WHITE);
		autobike.setBounds(121, -1, 138, 23);
		panel_18.add(autobike);
		
		bike = new JRadioButton("\uC790\uC804\uAC70");
		bike.setBackground(Color.WHITE);
		bike.setBounds(121, 18, 138, 23);
		panel_18.add(bike);
		
		car = new JRadioButton("\uCC28\uB7C9");
		car.setBackground(Color.WHITE);
		car.setBounds(257, -1, 132, 23);
		panel_18.add(car);
		
		etc = new JRadioButton("\uAE30\uD0C0");
		etc.setBackground(Color.WHITE);
		etc.setBounds(257, 18, 132, 23);
		panel_18.add(etc);
		
		ButtonGroup group = new ButtonGroup();
		group.add(autobike);
		group.add(bike);
		group.add(car);
		group.add(etc);
		
		
		
		JButton button_5 = new JButton("\uC911\uBCF5\uD655\uC778");
		button_5.setBounds(376, 206, 115, 32);
		RiderJoin.add(button_5);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(new Color(204, 255, 255));
		panel_19.setBounds(107, 398, 389, 39);
		RiderJoin.add(panel_19);
		
		JLabel label_11 = new JLabel("\uC9C0\uC5ED");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("굴림", Font.BOLD, 16));
		label_11.setBounds(0, -1, 119, 42);
		panel_19.add(label_11);
		
		rider_loc = new JTextField();
		rider_loc.setColumns(10);
		rider_loc.setBounds(120, 1, 269, 41);
		panel_19.add(rider_loc);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(new Color(204, 255, 255));
		panel_20.setBounds(107, 447, 389, 39);
		RiderJoin.add(panel_20);
		
		JLabel label_12 = new JLabel("\uC18C\uC18D\uD68C\uC0AC");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("굴림", Font.BOLD, 16));
		label_12.setBounds(0, -1, 119, 42);
		panel_20.add(label_12);
		
		rider_company = new JTextField();
		rider_company.setColumns(10);
		rider_company.setBounds(120, 1, 269, 41);
		panel_20.add(rider_company);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(204, 255, 255));
		panel_5.setBounds(107, 499, 389, 39);
		RiderJoin.add(panel_5);
		
		JLabel PhoneNumber = new JLabel("\uC804\uD654\uBC88\uD638");
		PhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		PhoneNumber.setFont(new Font("굴림", Font.BOLD, 16));
		PhoneNumber.setBounds(0, -1, 119, 42);
		panel_5.add(PhoneNumber);
		
		PhoneNumber2 = new JTextField();
		PhoneNumber2.setColumns(10);
		PhoneNumber2.setBounds(120, 1, 269, 41);
		panel_5.add(PhoneNumber2);
	}
}
