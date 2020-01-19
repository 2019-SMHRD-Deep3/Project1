package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import Model.Menu;
import Model.Model;
import Model.ShopkeeperModel;
import Model.UserModel;
import controller.MemberManagementService;

public class order {

	MemberManagementService service = new MemberManagementService();
	ArrayList<ShopkeeperModel> shop = new ArrayList<ShopkeeperModel>();
	ArrayList<JPanel> list = new ArrayList<JPanel>();
	ArrayList<JPanel> listmenu = new ArrayList<JPanel>();
	ArrayList<Menu> menu1 = new ArrayList<Menu>();
	private JFrame frame;
	private Model loginUser;
	private ArrayList<String> menuName = new ArrayList<String>();
	private ArrayList<Integer> menuPrice = new ArrayList<Integer>();
	private int sum = 0;
	private int cnt;

	public order(Model loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
		frame.setBounds(400, 150, 1011, 661);

		JPanel panel_1 = new JPanel();
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
		lblNewLabel_3.setBounds(12, 5, 60, 34);
		lblNewLabel_3.setFont(new Font("HY수평선B", Font.BOLD, 22));
		panel_2.add(lblNewLabel_3);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(22, 49, 201, 114);
		textPane.setEditable(false);
		panel_2.add(textPane);

		JLabel label_45 = new JLabel("\uC815\uBCF4\uC218\uC815");
		label_45.setBounds(22, 210, 92, 26);
		label_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Jungbosujung main = new Jungbosujung(loginUser.getID());

			}
		});
		label_45.setFont(new Font("HY수평선B", Font.BOLD, 22));
		panel_2.add(label_45);

		JLabel label_46 = new JLabel("\uC8FC\uBB38\uB0B4\uC5ED");
		label_46.setBounds(22, 288, 92, 26);
		label_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				orderListCheck main = new orderListCheck(loginUser.getID());

			}
		});
		label_46.setFont(new Font("HY수평선B", Font.BOLD, 22));
		panel_2.add(label_46);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 182, 224, 12);
		panel_2.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 246, 224, 12);
		panel_2.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 323, 224, 12);
		panel_2.add(separator_2);

		JButton 로그아웃 = new JButton("\uB85C\uADF8\uC544\uC6C3");

		로그아웃.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				회원가입 Login = new 회원가입();

			}
		});
		로그아웃.setBounds(161, 533, 93, 37);
		information.add(로그아웃);

		JButton button_2 = new JButton("\uD68C\uC6D0 \uD0C8\uD1F4");
		button_2.setBounds(29, 533, 93, 37);
		information.add(button_2);

		if (loginUser instanceof UserModel) {
			textPane.setText(((UserModel) loginUser).getUSER_ADDRESS());
		}

		JPanel order = new JPanel();
		order.setBackground(new Color(135, 206, 250));
		leftView.add(order, "name_274694410481799");
		order.setLayout(null);

		JLabel ID2 = new JLabel((String) null);
		ID2.setFont(new Font("HY수평선B", Font.BOLD, 20));
		ID2.setBounds(19, 30, 118, 40);
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

		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(12, 382, 210, 47);
		panel_30.add(panel_31);
		panel_31.setLayout(null);

		JLabel money = new JLabel("");
		money.setBounds(12, 10, 186, 27);
		panel_31.add(money);
		money.setBackground(new Color(255, 255, 255));

		JButton check = new JButton("\uC8FC\uBB38\uD558\uAE30");
		check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sum = 0;
				boolean ischeck = false;

				for (int n = 0; n < menuName.size(); n++) {

					ischeck = service.insultMenu(menuName.get(n), menuPrice.get(n), loginUser.getID());
					sum += menuPrice.get(n);

				}
				if (ischeck) {
					System.out.println("값이 잘 들어갔습니다.");
				} else {
					System.out.println("재확인");
				}
				money.setText(sum + "원");

			}
		});
		check.setBounds(115, 313, 107, 34);
		panel_30.add(check);

		JLabel label_44 = new JLabel("\uACB0\uC81C \uAE08\uC561");
		label_44.setBounds(12, 357, 210, 27);
		panel_30.add(label_44);
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("HY수평선B", Font.BOLD, 16));

		JButton pay = new JButton("\uACB0\uC81C\uD558\uAE30");
		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				// 메인 창 생성
				frame.dispose();
				UserModel loginUser2 = (UserModel) loginUser;
				Payment main = new Payment(loginUser2, sum);

			}
		});
		pay.setBounds(115, 439, 107, 34);
		panel_30.add(pay);

		JButton button_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				회원가입 Login = new 회원가입();
			}
		});

		button_1.setBounds(159, 10, 94, 34);
		order.add(button_1);

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
		scrollPane_1.setPreferredSize(new Dimension(615, 459));

		panel.add(scrollPane_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		scrollPane_1.setViewportView(panel_5);
		panel_5.setLayout(new GridLayout(3, 1, 30, 0));
//		String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//s1.png";
//		String shopImg2 = this.getClass().getResource(".").getPath() + "..//..//img//s2.png";
//		String shopImg3 = this.getClass().getResource(".").getPath() + "..//..//img//s3.png";
//		String shopImg4 = this.getClass().getResource(".").getPath() + "..//..//img//s4.png";

//		for(int n =1; n<=service.nextline(); n++) {
//			Date date = new Date(System.currentTimeMillis());
//			ShopkeeperModel shop = service.getShop(n);
//			cnt++;
//			if(cnt==4) {
//				panel_5.setLayout(new GridLayout(-1, 1, 0, 0));
//			}
//			
//			JPanel cardPanel = new JPanel();  //가게 패널
//			JPanel cardPane2 = new JPanel();   //가게 이름
//			JLabel two = new JLabel("");
//			two.setText(shop.getSHOPNAME());
//			JPanel cardPane3 = new JPanel();   //가게 주소
//			JLabel three = new JLabel("");
//			three.setText(shop.getSHOP_ADDRESS());
////			three.setText(service.selectone());
//			JPanel cardPane4 = new JPanel();   //가게 전화번호
//			JLabel four = new JLabel("");
//			four.setText(""+shop.getSHOP_TEL());
//
//			cardPanel.setPreferredSize(new Dimension(350, 150));
//			cardPanel.add(cardPane2);
//			cardPanel.add(cardPane3);
//			cardPanel.add(cardPane4);
//			cardPane2.add(two);
//			cardPane3.add(three);
//			cardPane4.add(four);
//			panel_5.add(cardPanel);
//			
//			panel_5.repaint();
//			panel_5.revalidate();
//			
//		}
//		

		// 상점 카테고리에서 취소를 눌렀을 때 메뉴 카테고리 보여주기
		JButton button = new JButton("\uC774\uC804");
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

				panel_5.removeAll();

			}
		});
		button.setBounds(566, 571, 97, 29);
		shopKategorie.add(button);

		JButton button_3 = new JButton("\uC0C8\uB85C\uACE0\uCE68");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(shopKategorie);
				rightView.repaint();
				rightView.revalidate();
			}
		});
		button_3.setBounds(543, 28, 97, 29);
		shopKategorie.add(button_3);

		JPanel 한솥 = new JPanel();
		rightView.add(한솥, "name_191008403446000");
		한솥.setBackground(Color.WHITE);
		한솥.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(35, 267, 600, 283);
		한솥.add(panel_6);
		panel_6.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 600, 281);
		scrollPane_1.setPreferredSize(new Dimension(600, 281));
		panel_6.add(scrollPane_2);

		JPanel menu = new JPanel();
		scrollPane_2.setViewportView(menu);
		menu.setLayout(new GridLayout(15, 2, 20, 0));

		// 한솥에서 취소버튼을 눌렀을 때 가게 카테고리 보여주기
		JButton btnNewButton = new JButton("\uC774\uC804");
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

		btnNewButton.setBounds(569, 569, 97, 29);
		한솥.add(btnNewButton);

//		// 메뉴 카테고리에서 한식을 눌렀을 때 한식 메뉴 카테고리 보여주기
		JLabel kategorie1 = new JLabel("");
		kategorie1.addMouseListener(new MouseAdapter() {
			@Override  //한식 눌렀을 때
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(shopKategorie);
				rightView.repaint();
				rightView.revalidate();

				leftView.removeAll();
				leftView.add(information);
				leftView.repaint();
				leftView.revalidate();

				for (int n = 0; n < service.nextline(1); n++) {
					shop = service.getShop(1);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//					three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}

//				//식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(1); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}
						}
					});
				}
				;
			}
		});

		// 메뉴 카테고리 이미지 1 ( 한식 )
		String mk1 = this.getClass().getResource(".").getPath() + "..//..//img//mk1.png";
		kategorie1.setIcon(new ImageIcon(mk1));
		kategorie1.setBounds(68, 87, 141, 215);
		menuKategorie.add(kategorie1);

		// 메뉴 카테고리 이미지 2 ( 치킨 )
		JLabel kategorie2 = new JLabel("");
		kategorie2.addMouseListener(new MouseAdapter() {

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

				for (int n = 0; n < service.nextline(2); n++) {
					shop = service.getShop(2);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//			three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}

				// 식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(2); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}

						}
					});
				}
				;

			}
		});
		String mk2 = this.getClass().getResource(".").getPath() + "..//..//img//mk2.png";
		kategorie2.setIcon(new ImageIcon(mk2));
		kategorie2.setBounds(259, 87, 141, 215);
		menuKategorie.add(kategorie2);

		JLabel kategorie3 = new JLabel("");
		kategorie3.addMouseListener(new MouseAdapter() {
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

				for (int n = 0; n < service.nextline(3); n++) {
					shop = service.getShop(3);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//					three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}
				// 식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(3); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}

						}
					});
				}
				;
			}

		});
		String mk3 = this.getClass().getResource(".").getPath() + "..//..//img//mk3.png";
		kategorie3.setIcon(new ImageIcon(mk3));
		kategorie3.setBounds(451, 87, 141, 215);
		menuKategorie.add(kategorie3);

		JLabel kategorie4 = new JLabel("");
		kategorie4.addMouseListener(new MouseAdapter() {
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

				for (int n = 0; n < service.nextline(4); n++) {
					shop = service.getShop(4);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//					three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}
				// 식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(4); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}

						}
					});
				}
				;
			}
		});
		String mk4 = this.getClass().getResource(".").getPath() + "..//..//img//mk4.png";
		kategorie4.setIcon(new ImageIcon(mk4));
		kategorie4.setBounds(68, 337, 141, 215);
		menuKategorie.add(kategorie4);

		JLabel kategorie5 = new JLabel("");
		kategorie5.addMouseListener(new MouseAdapter() {
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

				for (int n = 0; n < service.nextline(5); n++) {
					shop = service.getShop(5);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//					three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}
				// 식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(5); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}

						}
					});
				}
				;
			}
		});
		String mk5 = this.getClass().getResource(".").getPath() + "..//..//img//mk5.png";
		kategorie5.setIcon(new ImageIcon(mk5));
		kategorie5.setBounds(259, 337, 141, 215);
		menuKategorie.add(kategorie5);

		JLabel kategorie6 = new JLabel("");
		kategorie6.addMouseListener(new MouseAdapter() {
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

				for (int n = 0; n < service.nextline(6); n++) {
					shop = service.getShop(6);
					cnt++;
					if (cnt == 4) {
						panel_5.setLayout(new GridLayout(-1, 1, 30, 0));
					}
					JPanel cardPanel = new JPanel(); // 가게 패널
					list.add(cardPanel);
					System.out.println(list.size());
					cardPanel.setBackground(Color.WHITE);
					JLabel img = new JLabel(); // 이미지
					String shopImg1 = this.getClass().getResource(".").getPath() + "..//..//img//shop.png";
					img.setIcon(new ImageIcon(shopImg1));
					cardPanel.setLayout(new FlowLayout());
					JPanel cardPane1 = new JPanel();
					cardPane1.setLayout(new GridLayout(3, 1, 0, 0));
					JPanel cardPane2 = new JPanel(); // 가게 이름
					JLabel two = new JLabel("");
					two.setText(shop.get(n).getSHOPNAME());
					JPanel cardPane3 = new JPanel(); // 가게 주소
					JLabel three = new JLabel("");
					three.setText(shop.get(n).getSHOP_ADDRESS());
//					three.setText(service.selectone());
					JPanel cardPane4 = new JPanel(); // 가게 전화번호
					JLabel four = new JLabel("");
					four.setText("" + shop.get(n).getSHOP_TEL());

					cardPanel.setPreferredSize(new Dimension(350, 150));
					img.setPreferredSize(new Dimension(120, 150));
					cardPane1.setPreferredSize(new Dimension(380, 150));

					cardPanel.add(img);
					cardPanel.add(cardPane1);
					cardPane1.add(cardPane2);
					cardPane1.add(cardPane3);
					cardPane1.add(cardPane4);
					cardPane2.add(two);
					cardPane3.add(three);
					cardPane4.add(four);
					panel_5.add(cardPanel);

					panel_5.repaint();
					panel_5.revalidate();

				}
				// 식당 클릭햇을 때 ->메뉴 나오게
				for (int m = 0; m < service.nextline(6); m++) {
					final int a = m;
					list.get(m).addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {

							rightView.removeAll();
							rightView.add(한솥);
							rightView.repaint();
							rightView.revalidate();

							ShopkeeperModel m = shop.get(a);

							int cn = 0;
							for (int n = 0; n < service.nextmenu(m.getID()); n++) {
								menu1 = service.getMenu(m.getID());
								cn++;
								if (cn == 16) {
									menu.setLayout(new GridLayout(-1, 2, 20, 0));
									// menu.setLayout(new GridLayout(15, 2, 20, 0));
								}
								JPanel cardPanel = new JPanel(); // 가격 메뉴 패널
								listmenu.add(cardPanel);

								cardPanel.setBackground(Color.WHITE);

								JPanel cardPane2 = new JPanel(); // 메뉴이름
								JLabel two = new JLabel("");
								two.setText(menu1.get(n).getFood());
								JPanel cardPane3 = new JPanel(); // 메뉴가격
								JLabel three = new JLabel("");
								three.setText("menu1.get(n).getPrice()");

								cardPanel.setPreferredSize(new Dimension(350, 150));

								cardPanel.add(cardPane2);
								cardPanel.add(cardPane3);
								cardPane2.add(two);
								cardPane3.add(three);
								menu.add(cardPanel);

								menu.repaint();
								menu.revalidate();

							}

						}
					});
				}
				;
			}
		});
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
				card.setLayout(new GridLayout(1, 2, 0, 0));
				card.add(new JLabel("매화도시락"));
				card.add(new JLabel("10000"));
				card.setPreferredSize(new Dimension(200, 50));
//							card.setBackground(new Color(0, 0, 0));
				orderlist.add(card);

				orderlist.repaint();
				orderlist.revalidate();

				menuName.add("매화도시락");
				menuPrice.add(10000);

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
				card.setLayout(new GridLayout(1, 2, 0, 0));
				card.add(new JLabel("개나리도시락"));
				card.add(new JLabel("8000"));
				card.setPreferredSize(new Dimension(200, 50));
//							card.setBackground(new Color(0, 0, 0));
				orderlist.add(card);

				orderlist.repaint();
				orderlist.revalidate();

				menuName.add("개나리도시락");
				menuPrice.add(8000);
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
				card.setLayout(new GridLayout(1, 2, 0, 0));
				card.add(new JLabel("진달래도시락"));
				card.add(new JLabel("7000"));
				card.setPreferredSize(new Dimension(200, 50));
//							card.setBackground(new Color(0, 0, 0));
				orderlist.add(card);

				orderlist.repaint();
				orderlist.revalidate();

				menuName.add("진달래도시락");
				menuPrice.add(7000);
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
				card.setLayout(new GridLayout(1, 2, 0, 0));
				card.add(new JLabel("돈까스도련님 고기고기 도시락"));
				card.add(new JLabel("5500"));
				card.setPreferredSize(new Dimension(200, 50));
//							card.setBackground(new Color(0, 0, 0));
				orderlist.add(card);

				orderlist.repaint();
				orderlist.revalidate();

				menuName.add("돈까스도련님 고기고기 도시락");
				menuPrice.add(5500);
			}
		});
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//a4.png";
		a4.setIcon(new ImageIcon(imgPath4));
		a4.setBounds(27, 418, 542, 126);
		panel_4.add(a4);

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
