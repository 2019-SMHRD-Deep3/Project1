package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import Model.Model;
import Model.UserModel;
import controller.MemberManagementService;

public class order {

	MemberManagementService service = new MemberManagementService();
	
	private JFrame frame;
	private Model loginUser;
	private ArrayList<String> menuName = new ArrayList<String>();
	private ArrayList<String> menuPrice = new ArrayList<String>();
	
	public order(Model loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
		
		frame.setBounds(400, 150, 1011, 661);
		
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
		
		main.add(leftView);
		leftView.setLayout(new CardLayout(0, 0));
		
		JPanel information = new JPanel();
		leftView.add(information, "name_1140935742232400");
		information.setBackground(new Color(135, 206, 250));
		information.setLayout(null);
		
		JLabel ID = new JLabel("ID");
		ID.setBounds(19, 21, 118, 24);
		information.add(ID);
		ID.setFont(new Font("HY수평선B", Font.BOLD, 20));
		ID.setText(loginUser.getID());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(19, 99, 248, 415);
		information.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_3.setFont(new Font("HY수평선B", Font.BOLD, 22));
		lblNewLabel_3.setBounds(12, 10, 224, 26);
		panel_2.add(lblNewLabel_3);
		
		JLabel address = new JLabel((String) null);
		address.setFont(new Font("HY수평선B", Font.PLAIN, 17));
		address.setBackground(Color.WHITE);
		address.setBounds(12, 41, 198, 44);
		panel_2.add(address);
		if(loginUser instanceof UserModel) {
			address.setText(((UserModel)loginUser).getUSER_ADDRESS());
		}

		
		JPanel order = new JPanel();
		order.setBackground(new Color(135, 206, 250));
		leftView.add(order, "name_274694410481799");
		order.setLayout(null);
		
		JLabel ID2 = new JLabel((String) null);
		ID2.setFont(new Font("HY수평선B", Font.BOLD, 20));
		ID2.setBounds(19, 30, 147, 40);
		ID2.setText(loginUser.getID());
		order.add(ID2);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(135, 206, 250));
		panel_30.setBounds(19, 71, 234, 481);
		order.add(panel_30);
		panel_30.setLayout(null);
		
		JLabel orderinformation = new JLabel("\uC8FC\uBB38 \uC815\uBCF4");
		orderinformation.setHorizontalAlignment(SwingConstants.CENTER);
		orderinformation.setBounds(12, 10, 210, 34);
		panel_30.add(orderinformation);
		orderinformation.setFont(new Font("HY수평선B", Font.BOLD, 20));
		
		JPanel orderlist = new JPanel();
		orderlist.setBackground(Color.WHITE);
		orderlist.setBounds(12, 46, 210, 257);
		panel_30.add(orderlist);
		orderlist.setLayout(new GridLayout(17, 1, 0, 0));
		
		JButton check = new JButton("\uC8FC\uBB38\uD558\uAE30");
		check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				boolean ischeck = false;
				
				for(int n =0; n<menuName.size(); n++) {
					
				ischeck	=service.insultMenu(menuName.get(n));
				}
				if(ischeck ){
					System.out.println("값이 잘 들어갔습니다.");
				}else {
					System.out.println("재확인");
				}
				
				
			}
		});
		check.setBounds(98, 437, 124, 34);
		panel_30.add(check);
		
		JLabel money = new JLabel("");
		money.setBackground(Color.WHITE);
		money.setBounds(12, 349, 210, 63);
		panel_30.add(money);
		
		JLabel label_44 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("HY수평선B", Font.BOLD, 16));
		label_44.setBounds(12, 322, 210, 34);
		panel_30.add(label_44);


		
		JPanel rightView = new JPanel();
		rightView.setBounds(279, 0, 693, 622);
		main.add(rightView);
	
		rightView.setLayout(new CardLayout(0, 0));
		
		JPanel menuKategorie = new JPanel();
		menuKategorie.setBackground(Color.WHITE);
		rightView.add(menuKategorie, "name_191005233949000");
		menuKategorie.setLayout(null);
		
		JPanel shopKategorie = new JPanel();
		shopKategorie.setBackground(Color.WHITE);
		rightView.add(shopKategorie, "name_191255919361100");
		shopKategorie.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 76, 615, 459);
		shopKategorie.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 615, 459);
		panel.add(scrollPane_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		scrollPane_1.setViewportView(panel_5);
		panel_5.setPreferredSize(new Dimension(590,600));
		panel_5.setLayout(null);
		
		JLabel shop1 = new JLabel("");
		String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//s1.png";
		shop1.setIcon(new ImageIcon(shopImg1));
		shop1.setBounds(12, 10, 555, 139);
		panel_5.add(shop1);
		
		JLabel shop2 = new JLabel("");
		String shopImg2 = this.getClass().getResource(".").getPath() + "..//..//img//s2.png";
		shop2.setIcon(new ImageIcon(shopImg2));
		shop2.setBounds(12, 159, 555, 139);
		panel_5.add(shop2);
		
		JLabel shop3 = new JLabel("");
		String shopImg3 = this.getClass().getResource(".").getPath() + "..//..//img//s3.png";
		shop3.setIcon(new ImageIcon(shopImg3));
		shop3.setBounds(12, 308, 555, 139);
		panel_5.add(shop3);
		
		JLabel shop4 = new JLabel("");
		String shopImg4 = this.getClass().getResource(".").getPath() + "..//..//img//s4.png";
		shop4.setIcon(new ImageIcon(shopImg4));
		shop4.setBounds(12, 457, 555, 139);
		panel_5.add(shop4);
		
		// 상점 카테고리에서 취소를 눌렀을 때 메뉴 카테고리 보여주기
		JButton button = new JButton("\uCDE8\uC18C");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(menuKategorie);
				rightView.repaint();
				rightView.revalidate();
				
				leftView.removeAll();
				leftView.add(information);
				leftView.repaint();
				leftView.revalidate();
			}
		});
		button.setBounds(566, 571, 97, 29);
		shopKategorie.add(button);
		
		
		JPanel 한솥 = new JPanel();
		rightView.add(한솥, "name_191008403446000");
		한솥.setBackground(Color.WHITE);
		한솥.setLayout(null);
		
		// 메뉴 카테고리에서 한식을 눌렀을 때 한식 메뉴 카테고리 보여주기
		JLabel kategorie1 = new JLabel("");
		kategorie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(shopKategorie);
				rightView.repaint();
				rightView.revalidate();
				
				leftView.removeAll();
				leftView.add(information);
				leftView.repaint();
				leftView.revalidate();
				
				
				
			}
		});
		
		// 상점 카테고리에서 한솥을 눌렀을 때 한솥 카테고리 보여주기
		shop1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(한솥);
				rightView.repaint();
				rightView.revalidate();
				
				leftView.removeAll();
				leftView.add(order);
				leftView.repaint();
				leftView.revalidate();
			}
		});
		
		// 메뉴 카테고리  이미지 1 ( 한식 ) 
		String mk1 = this.getClass().getResource(".").getPath() + "..//..//img//mk1.png";
		kategorie1.setIcon(new ImageIcon(mk1));
		kategorie1.setBounds(68, 87, 141, 215);
		menuKategorie.add(kategorie1);
		
		// 메뉴 카테고리  이미지 2 ( 치킨 ) 
		JLabel kategorie2 = new JLabel("");
		String mk2 = this.getClass().getResource(".").getPath() + "..//..//img//mk2.png";
		kategorie2.setIcon(new ImageIcon(mk2));
		kategorie2.setBounds(259, 87, 141, 215);
		menuKategorie.add(kategorie2);
		
		JLabel kategorie3 = new JLabel("");
		String mk3 = this.getClass().getResource(".").getPath() + "..//..//img//mk3.png";
		kategorie3.setIcon(new ImageIcon(mk3));
		kategorie3.setBounds(451, 87, 141, 215);
		menuKategorie.add(kategorie3);
		
		JLabel kategorie4 = new JLabel("");
		String mk4 = this.getClass().getResource(".").getPath() + "..//..//img//mk4.png";
		kategorie4.setIcon(new ImageIcon(mk4));
		kategorie4.setBounds(68, 337, 141, 215);
		menuKategorie.add(kategorie4);
		
		JLabel kategorie5 = new JLabel("");
		String mk5 = this.getClass().getResource(".").getPath() + "..//..//img//mk5.png";
		kategorie5.setIcon(new ImageIcon(mk5));
		kategorie5.setBounds(259, 337, 141, 215);
		menuKategorie.add(kategorie5);
		
		JLabel kategorie6 = new JLabel("");
		String mk6 = this.getClass().getResource(".").getPath() + "..//..//img//mk6.png";
		kategorie6.setIcon(new ImageIcon(mk6));
		kategorie6.setBounds(451, 337, 141, 215);
		menuKategorie.add(kategorie6);
		
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(35, 46, 600, 205);
				한솥.add(panel_3);
				panel_3.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBackground(Color.WHITE);
				scrollPane.setBounds(0, 0, 600, 205);
				panel_3.add(scrollPane);
				
					
					JPanel panel_4 = new JPanel();
					panel_4.setBackground(Color.WHITE);
					scrollPane.setViewportView(panel_4);
					panel_4.setPreferredSize(new Dimension(500, 550));
					panel_4.setLayout(null);
					JLabel a1 = new JLabel("");
					a1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("매화도시락"));
							card.add(new JLabel("10000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("매화도시락");
							menuPrice.add("10000");
						}
					});
					
					JLabel bestMenu = new JLabel("  BEST MENU");
					bestMenu.setFont(new Font("HY수평선B", Font.BOLD, 18));
					bestMenu.setBounds(37, 10, 152, 29);
					한솥.add(bestMenu);
					
					// 한솥 베스트메뉴 이미지 1
					String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//a1.png";
					a1.setIcon(new ImageIcon(imgPath1));
					a1.setBounds(27, 10, 542, 126);
					panel_4.add(a1);
					
					// 한솥 베스트메뉴 이미지 2
					JLabel a2 = new JLabel("");
					a2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("개나리도시락"));
							card.add(new JLabel("8000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("개나리도시락");
							menuPrice.add("8000");
						}
					});
					String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//a2.png";
					a2.setIcon(new ImageIcon(imgPath2));
					a2.setBounds(27, 146, 542, 126);
					panel_4.add(a2);
					
					// 한솥 베스트메뉴 이미지 3
					JLabel a3 = new JLabel("");
					a3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("진달래도시락"));
							card.add(new JLabel("7000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("진달래도시락");
							menuPrice.add("7000");
						}
					});
					String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//a3.png";
					a3.setIcon(new ImageIcon(imgPath3));
					a3.setBounds(27, 282, 542, 126);
					panel_4.add(a3);
					
					// 한솥 베스트메뉴 이미지 4
					JLabel a4 = new JLabel("");
					a4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("돈까스도련님 고기고기 도시락"));
							card.add(new JLabel("5500"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("돈까스도련님 고기고기 도시락");
							menuPrice.add("5500");
						}
					});
					String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//a4.png";
					a4.setIcon(new ImageIcon(imgPath4));
					a4.setBounds(27, 418, 542, 126);
					panel_4.add(a4);
					
				// 한솥에서 취소버튼을 눌렀을 때 가게 카테고리 보여주기
					JButton btnNewButton = new JButton("\uCDE8\uC18C");
					btnNewButton.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							rightView.removeAll();
							rightView.add(shopKategorie);
							rightView.repaint();
							rightView.revalidate();
							
							leftView.removeAll();
							leftView.add(information);
							leftView.repaint();
							leftView.revalidate();
							
						}
					});
					
					JPanel panel_6 = new JPanel();
					panel_6.setBounds(35, 267, 600, 283);
					한솥.add(panel_6);
					panel_6.setLayout(null);
					
					JScrollPane scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(0, 0, 600, 281);
					panel_6.add(scrollPane_2);
					
					JPanel panel_7 = new JPanel();
					panel_7.setBackground(new Color(255, 255, 255));
					scrollPane_2.setRowHeaderView(panel_7);
					panel_7.setPreferredSize(new Dimension(280, 440));
					panel_7.setLayout(null);
					
					JLabel lblNewLabel = new JLabel("\uD504\uB9AC\uBBF8\uC5C4 \uC2DC\uB9AC\uC988");
					lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
					lblNewLabel.setBounds(12, 10, 226, 25);
					panel_7.add(lblNewLabel);
					
					JPanel panel_9 = new JPanel();
					panel_9.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("매화도시락"));
							card.add(new JLabel("10000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("매화도시락");
							menuPrice.add("10000");
						}
					});
					panel_9.setBackground(new Color(255, 255, 255));
					panel_9.setBounds(12, 35, 243, 25);
					panel_7.add(panel_9);
					panel_9.setLayout(null);
					
					JLabel 매화도시락 = new JLabel("\uB9E4\uD654\uB3C4\uC2DC\uB77D");
					매화도시락.setBounds(0, 0, 131, 25);
					panel_9.add(매화도시락);
					
					JLabel lblNewLabel_2 = new JLabel("10000\uC6D0");
					lblNewLabel_2.setBounds(174, 0, 69, 25);
					panel_9.add(lblNewLabel_2);
					
					JPanel panel_10 = new JPanel();
					panel_10.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("개나리도시락"));
							card.add(new JLabel("8000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("개나리도시락");
							menuPrice.add("8000");
						}
					});
					panel_10.setLayout(null);
					panel_10.setBackground(Color.WHITE);
					panel_10.setBounds(12, 61, 243, 25);
					panel_7.add(panel_10);
					
					JLabel label = new JLabel("\uAC1C\uB098\uB9AC\uB3C4\uC2DC\uB77D");
					label.setBounds(0, 0, 131, 25);
					panel_10.add(label);
					
					JLabel label_2 = new JLabel("8000\uC6D0");
					label_2.setBounds(174, 0, 69, 25);
					panel_10.add(label_2);
					
					JPanel panel_11 = new JPanel();
					panel_11.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("진달래도시락"));
							card.add(new JLabel("7000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("진달래도시락");
							menuPrice.add("7000");
						}
					});
					panel_11.setLayout(null);
					panel_11.setBackground(Color.WHITE);
					panel_11.setBounds(12, 87, 243, 25);
					panel_7.add(panel_11);
					
					JLabel label_3 = new JLabel("\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D");
					label_3.setBounds(0, 0, 131, 25);
					panel_11.add(label_3);
					
					JLabel label_4 = new JLabel("7000\uC6D0");
					label_4.setBounds(174, 0, 69, 25);
					panel_11.add(label_4);
					
					JPanel panel_12 = new JPanel();
					panel_12.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("숯불직화구이덮밥"));
							card.add(new JLabel("5700"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("숯불직화구이덮밥");
							menuPrice.add("5700");
						}
					});
					panel_12.setLayout(null);
					panel_12.setBackground(Color.WHITE);
					panel_12.setBounds(12, 155, 243, 25);
					panel_7.add(panel_12);
					
					JLabel label_5 = new JLabel("\uC22F\uBD88\uC9C1\uD654\uAD6C\uC774 \uB36E\uBC25");
					label_5.setBounds(0, 0, 131, 25);
					panel_12.add(label_5);
					
					JLabel label_6 = new JLabel("5700\uC6D0");
					label_6.setBounds(174, 0, 69, 25);
					panel_12.add(label_6);
					
					JLabel label_7 = new JLabel("\uC2E0\uBA54\uB274");
					label_7.setFont(new Font("Dialog", Font.BOLD, 18));
					label_7.setBounds(12, 132, 226, 25);
					panel_7.add(label_7);
					
					JPanel panel_13 = new JPanel();
					panel_13.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("중화짜장볶음밥"));
							card.add(new JLabel("4700"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("중화짜장볶음밥");
							menuPrice.add("4700");
						}
					});
					panel_13.setLayout(null);
					panel_13.setBackground(Color.WHITE);
					panel_13.setBounds(12, 180, 243, 25);
					panel_7.add(panel_13);
					
					JLabel label_8 = new JLabel("\uC911\uD654 \uC9DC\uC7A5\uBCF6\uC74C\uBC25");
					label_8.setBounds(0, 0, 131, 25);
					panel_13.add(label_8);
					
					JLabel label_9 = new JLabel("4700\uC6D0");
					label_9.setBounds(174, 0, 69, 25);
					panel_13.add(label_9);
					
					JPanel panel_14 = new JPanel();
					panel_14.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("국물떡볶이튀김세트"));
							card.add(new JLabel("4800"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("국물떡볶이튀김세트");
							menuPrice.add("4800");
						}
					});
					panel_14.setLayout(null);
					panel_14.setBackground(Color.WHITE);
					panel_14.setBounds(12, 205, 243, 25);
					panel_7.add(panel_14);
					
					JLabel label_10 = new JLabel("\uAD6D\uBB3C\uB5A1\uBCF6\uC774\uD280\uAE40\uC138\uD2B8");
					label_10.setBounds(0, 0, 131, 25);
					panel_14.add(label_10);
					
					JLabel label_11 = new JLabel("4800\uC6D0");
					label_11.setBounds(174, 0, 69, 25);
					panel_14.add(label_11);
					
					JLabel label_24 = new JLabel("\uACE0\uAE30\uACE0\uAE30 \uC2DC\uB9AC\uC988");
					label_24.setFont(new Font("Dialog", Font.BOLD, 18));
					label_24.setBounds(12, 250, 256, 19);
					panel_7.add(label_24);
					
					JPanel panel_21 = new JPanel();
					panel_21.setLayout(null);
					panel_21.setBackground(Color.WHITE);
					panel_21.setBounds(12, 271, 243, 25);
					panel_7.add(panel_21);
					
					JLabel label_25 = new JLabel("\uACE0\uAE30\uACE0\uAE30");
					label_25.setBounds(0, 0, 131, 25);
					panel_21.add(label_25);
					
					JLabel label_26 = new JLabel("3900\uC6D0");
					label_26.setBounds(174, 0, 69, 25);
					panel_21.add(label_26);
					
					JPanel panel_22 = new JPanel();
					panel_22.setLayout(null);
					panel_22.setBackground(Color.WHITE);
					panel_22.setBounds(12, 297, 243, 25);
					panel_7.add(panel_22);
					
					JLabel label_27 = new JLabel("\uB3C8\uCE58\uACE0\uAE30\uACE0\uAE30");
					label_27.setBounds(0, 0, 131, 25);
					panel_22.add(label_27);
					
					JLabel label_28 = new JLabel("5200\uC6D0");
					label_28.setBounds(174, 0, 69, 25);
					panel_22.add(label_28);
					
					JPanel panel_23 = new JPanel();
					panel_23.setLayout(null);
					panel_23.setBackground(Color.WHITE);
					panel_23.setBounds(12, 322, 243, 25);
					panel_7.add(panel_23);
					
					JLabel label_29 = new JLabel("\uC0C8\uCE58\uACE0\uAE30\uACE0\uAE30");
					label_29.setBounds(0, 0, 131, 25);
					panel_23.add(label_29);
					
					JLabel label_30 = new JLabel("6000\uC6D0");
					label_30.setBounds(174, 0, 69, 25);
					panel_23.add(label_30);
					
					JPanel panel_24 = new JPanel();
					panel_24.setLayout(null);
					panel_24.setBackground(Color.WHITE);
					panel_24.setBounds(12, 348, 243, 25);
					panel_7.add(panel_24);
					
					JLabel label_31 = new JLabel("\uD0D5\uC218\uC721\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
					label_31.setBounds(0, 0, 131, 25);
					panel_24.add(label_31);
					
					JLabel label_32 = new JLabel("5600\uC6D0");
					label_32.setBounds(174, 0, 69, 25);
					panel_24.add(label_32);
					
					JPanel panel_25 = new JPanel();
					panel_25.setLayout(null);
					panel_25.setBackground(Color.WHITE);
					panel_25.setBounds(12, 375, 243, 25);
					panel_7.add(panel_25);
					
					JLabel label_33 = new JLabel("\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
					label_33.setBounds(0, 0, 131, 25);
					panel_25.add(label_33);
					
					JLabel label_34 = new JLabel("5500\uC6D0");
					label_34.setBounds(174, 0, 69, 25);
					panel_25.add(label_34);
					
					JPanel panel_26 = new JPanel();
					panel_26.setLayout(null);
					panel_26.setBackground(Color.WHITE);
					panel_26.setBounds(12, 400, 243, 25);
					panel_7.add(panel_26);
					
					JLabel label_35 = new JLabel("\uC0DD\uC120\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
					label_35.setBounds(0, 0, 162, 25);
					panel_26.add(label_35);
					
					JLabel label_36 = new JLabel("5500\uC6D0");
					label_36.setBounds(174, 0, 69, 25);
					panel_26.add(label_36);
					
					JPanel panel_8 = new JPanel();
					panel_8.setLayout(null);
					panel_8.setPreferredSize(new Dimension(280, 440));
					panel_8.setBackground(Color.WHITE);
					scrollPane_2.setViewportView(panel_8);
					
					JLabel label_1 = new JLabel("\uC815\uCC2C\uC2DC\uB9AC\uC988");
					label_1.setFont(new Font("Dialog", Font.BOLD, 18));
					label_1.setBounds(12, 10, 272, 25);
					panel_8.add(label_1);
					
					JPanel panel_15 = new JPanel();
					panel_15.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("돈까스도련님도시락"));
							card.add(new JLabel("3900"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("돈까스도련님도시락");
							menuPrice.add("3900");
						}
					});
					panel_15.setLayout(null);
					panel_15.setBackground(Color.WHITE);
					panel_15.setBounds(12, 35, 243, 25);
					panel_8.add(panel_15);
					
					JLabel label_12 = new JLabel("\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D");
					label_12.setBounds(0, 0, 131, 25);
					panel_15.add(label_12);
					
					JLabel label_13 = new JLabel("3900\uC6D0");
					label_13.setBounds(174, 0, 69, 25);
					panel_15.add(label_13);
					
					JPanel panel_16 = new JPanel();
					panel_16.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("국화도시락"));
							card.add(new JLabel("4000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("국화도시락");
							menuPrice.add("4000");
						}
					});
					panel_16.setLayout(null);
					panel_16.setBackground(Color.WHITE);
					panel_16.setBounds(12, 60, 243, 25);
					panel_8.add(panel_16);
					
					JLabel label_14 = new JLabel("\uAD6D\uD654\uB3C4\uC2DC\uB77D");
					label_14.setBounds(0, 0, 131, 25);
					panel_16.add(label_14);
					
					JLabel label_15 = new JLabel("4000\uC6D0");
					label_15.setBounds(174, 0, 69, 25);
					panel_16.add(label_15);
					
					JPanel panel_17 = new JPanel();
					panel_17.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("치킨제육도시락"));
							card.add(new JLabel("4400"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("치킨제육도시락");
							menuPrice.add("4400");
						}
					});
					panel_17.setLayout(null);
					panel_17.setBackground(Color.WHITE);
					panel_17.setBounds(12, 87, 243, 25);
					panel_8.add(panel_17);
					
					JLabel label_16 = new JLabel("\uCE58\uD0A8\uC81C\uC721\uB3C4\uC2DC\uB77D");
					label_16.setBounds(0, 0, 131, 25);
					panel_17.add(label_16);
					
					JLabel label_17 = new JLabel("4400\uC6D0");
					label_17.setBounds(174, 0, 69, 25);
					panel_17.add(label_17);
					
					JPanel panel_18 = new JPanel();
					panel_18.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("동백도시락"));
							card.add(new JLabel("5000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("동백도시락");
							menuPrice.add("5000");
						}
					});
					panel_18.setLayout(null);
					panel_18.setBackground(Color.WHITE);
					panel_18.setBounds(12, 113, 243, 25);
					panel_8.add(panel_18);
					
					JLabel label_18 = new JLabel("\uB3D9\uBC31\uB3C4\uC2DC\uB77D");
					label_18.setBounds(0, 0, 131, 25);
					panel_18.add(label_18);
					
					JLabel label_19 = new JLabel("5000\uC6D0");
					label_19.setBounds(174, 0, 69, 25);
					panel_18.add(label_19);
					
					JPanel panel_19 = new JPanel();
					panel_19.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("칠리찹쌀탕수육도련님"));
							card.add(new JLabel("4000"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("칠리찹쌀탕수육도련님");
							menuPrice.add("4000");
						}
					});
					panel_19.setLayout(null);
					panel_19.setBackground(Color.WHITE);
					panel_19.setBounds(12, 140, 243, 25);
					panel_8.add(panel_19);
					
					JLabel label_20 = new JLabel("\uCE60\uB9AC\uCC39\uC300\uD0D5\uC218\uC721\uB3C4\uB828\uB2D8");
					label_20.setBounds(0, 0, 131, 25);
					panel_19.add(label_20);
					
					JLabel label_21 = new JLabel("4000\uC6D0");
					label_21.setBounds(174, 0, 69, 25);
					panel_19.add(label_21);
					
					JPanel panel_20 = new JPanel();
					panel_20.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							JPanel card = new JPanel();
							card.setLayout(new GridLayout(1,2,0,0));
							card.add(new JLabel("생선까스도시락"));
							card.add(new JLabel("3900"));
							card.setPreferredSize(new Dimension(200,50));
//							card.setBackground(new Color(0, 0, 0));
							orderlist.add(card);
							
							
							orderlist.repaint();
							orderlist.revalidate();
							
							menuName.add("생선까스도시락");
							menuPrice.add("3900");
						}
					});
					panel_20.setLayout(null);
					panel_20.setBackground(Color.WHITE);
					panel_20.setBounds(12, 168, 243, 25);
					panel_8.add(panel_20);
					
					JLabel label_22 = new JLabel("\uC0DD\uC120\uAE4C\uC2A4\uB3C4\uB828\uB2D8");
					label_22.setBounds(0, 0, 131, 25);
					panel_20.add(label_22);
					
					JLabel label_23 = new JLabel("3900\uC6D0");
					label_23.setBounds(174, 0, 69, 25);
					panel_20.add(label_23);
					
					JLabel label_37 = new JLabel("\uBA54\uAC00 \uC2DC\uB9AC\uC988");
					label_37.setFont(new Font("Dialog", Font.BOLD, 18));
					label_37.setBounds(12, 220, 226, 25);
					panel_8.add(label_37);
					
					JPanel panel_27 = new JPanel();
					panel_27.setLayout(null);
					panel_27.setBackground(Color.WHITE);
					panel_27.setBounds(12, 245, 243, 25);
					panel_8.add(panel_27);
					
					JLabel label_38 = new JLabel("\uBA54\uAC00 \uCE58\uD0A8\uB9C8\uC694");
					label_38.setBounds(0, 0, 131, 25);
					panel_27.add(label_38);
					
					JLabel label_39 = new JLabel("5200\uC6D0");
					label_39.setBounds(174, 0, 69, 25);
					panel_27.add(label_39);
					
					JPanel panel_28 = new JPanel();
					panel_28.setLayout(null);
					panel_28.setBackground(Color.WHITE);
					panel_28.setBounds(12, 271, 243, 25);
					panel_8.add(panel_28);
					
					JLabel label_40 = new JLabel("\uBA54\uAC00 \uCE58\uD0A8\uC81C\uC721");
					label_40.setBounds(0, 0, 131, 25);
					panel_28.add(label_40);
					
					JLabel label_41 = new JLabel("6900\uC6D0");
					label_41.setBounds(174, 0, 69, 25);
					panel_28.add(label_41);
					
					JPanel panel_29 = new JPanel();
					panel_29.setLayout(null);
					panel_29.setBackground(Color.WHITE);
					panel_29.setBounds(12, 297, 243, 25);
					panel_8.add(panel_29);
					
					JLabel label_42 = new JLabel("\uBA54\uAC00 \uACE0\uAE30\uACE0\uAE30");
					label_42.setBounds(0, 0, 131, 25);
					panel_29.add(label_42);
					
					JLabel label_43 = new JLabel("7900\uC6D0");
					label_43.setBounds(174, 0, 69, 25);
					panel_29.add(label_43);

					btnNewButton.setBounds(569, 569, 97, 29);
					한솥.add(btnNewButton);

		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1011, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}
}
