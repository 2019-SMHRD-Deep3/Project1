package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import Model.ShopkeeperModel;
import Model.UserModel;
import controller.MemberManagementService;

public class orderListCheck {

	private MemberManagementService service = new MemberManagementService();
	Date date = new Date(System.currentTimeMillis());
	private JFrame frame;
	private UserModel loginUser2;
	private String id;
	private ArrayList<String>menu;
	private int cnt;
	
	
	
	

	public orderListCheck(String id) {
		this.id = id;
		initialize();
		frame.setVisible(true);
	
	}


	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 150, 367, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uB0B4\uC5ED");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("양재벨라체M", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 10, 351, 52);
		frame.getContentPane().add(lblNewLabel);
		
	
		
		JLabel a1 = new JLabel("");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 56, 306, 393);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 306, 390);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(280, 700));
		panel_1.setLayout(new GridLayout(4, 1, 30, 0));
		
		JButton button_4 = new JButton("\uCDE8\uC18C");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		button_4.setBounds(196, 484, 116, 41);
		frame.getContentPane().add(button_4);
		
		String id = "1";
		
//		for(int n =0; n<service.nextline(id); n++) {
//			String sum= "";
//			menu = service.getShop(id);
//			cnt++;
//			if(cnt==4) {
//				panel_1.setLayout(new GridLayout(-1, 1, 30, 0));
//			}
//			JPanel cardPanel = new JPanel();  //리뷰한개
//			cardPanel.setBackground(Color.WHITE);
//
//			cardPanel.setLayout(new GridLayout(3, 1, 0, 0));
//			
//			JPanel cardPane2 = new JPanel();
//			JLabel two = new JLabel("");
//			for(int m =0; m<menu.size(); m++) {
//				sum = sum +  menu.get(m);
//			}
//			two.setText(sum);
//			JPanel cardPane3 = new JPanel();
//			JLabel three = new JLabel("");
//			three.setText(date.getYear()-100+"/"+(date.getMonth()+1)+"/"+date.getDate());
////			JPanel cardPane2 = new JPanel();   //가게 이름
////			JLabel two = new JLabel("");
////			two.setText(shop.get(n).getSHOPNAME());
////			JPanel cardPane3 = new JPanel();   //가게 주소
////			JLabel three = new JLabel("");
////			three.setText(shop.get(n).getSHOP_ADDRESS());
//////			three.setText(service.selectone());
////			JPanel cardPane4 = new JPanel();   //가게 전화번호
////			JLabel four = new JLabel("");
////			four.setText(""+shop.get(n).getSHOP_TEL());
//
//			cardPanel.setPreferredSize(new Dimension(280, 150));
//			
//		
////			cardPanel.add(one);
////			cardPane1.add(cardPane2);
////			cardPane1.add(cardPane3);
////			cardPane1.add(cardPane4);
////			cardPane2.add(two);
////			cardPane3.add(three);
////			cardPane4.add(four);
////			panel_5.add(cardPanel);
//			
//			
//			
//			panel_1.repaint();
//			panel_1.revalidate();
//			System.out.println(n);
//			
//		}
		
		
		
		
	}
}
	

