package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import Model.Model;
import Model.ShopkeeperModel;

public class order2 {

	private JFrame frame;
	private ShopkeeperModel loginUser;
	private JTable table;
	private JTable table_1;

	public order2(ShopkeeperModel loginUser) {
		initialize();
		frame.setBounds(400, 150, 1011, 661);
		frame.setVisible(true);

		this.loginUser = loginUser;
		
		String c1 = this.getClass().getResource(".").getPath() + "..//..//img//c.png";

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(371, 0, 634, 632);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel name = new JLabel("OOO");
		name.setBackground(Color.WHITE);
		name.setForeground(Color.WHITE);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(12, 23, 165, 58);

		JPanel store = new JPanel();
		panel_1.add(store, "name_1749354183210100");
		store.setLayout(null);
		store.setBackground(Color.WHITE);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 0, 279, 632);
		store.add(panel_3);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("HY수평선B", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 20, 176, 57);
		panel_3.add(lblNewLabel);
		lblNewLabel.setText(loginUser.getID());
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 122, 248, 415);
		panel_3.add(panel);
		
		JLabel label_60 = new JLabel("\uAC00\uAC8C\uC8FC\uC18C");
		label_60.setFont(new Font("HY수평선B", Font.BOLD, 22));
		label_60.setBounds(12, 24, 224, 26);
		panel.add(label_60);
		
		JTextPane address = new JTextPane();
		address.setEditable(false);
		address.setBounds(22, 60, 203, 69);
		panel.add(address);
		address.setText(loginUser.getSHOP_ADDRESS());
		
		
		// 가게 주소 가져오기
//		if(loginUser instanceof ShopkeeperModel) {
//			textPane.setText(((ShopkeeperModel)loginUser).getSHOP_ADDRESS());
//		}
		

		
		
	
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 145, 224, 2);
		panel.add(separator);
		
		JButton button = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				회원가입 Login = new 회원가입();
			}
		});


		button.setBounds(160, 566, 93, 37);
		panel_3.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		button_1.setBounds(23, 566, 93, 37);
		panel_3.add(button_1);
		

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(279, 0, 716, 620);
		store.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));

		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		panel_4.add(main, "name_1749428196331400");
		main.setLayout(null);

		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(224, 255, 255));
		panel_6.setBounds(52, 22, 589, 79);
		main.add(panel_6);
		panel_6.setLayout(null);

		JLabel shopname = new JLabel("\uD55C\uC1A5 \uAD11\uC8FC\uB300\uC810");
		shopname.setBackground(new Color(255, 255, 255));
		shopname.setHorizontalAlignment(SwingConstants.CENTER);
		shopname.setBounds(0, 0, 589, 79);
		panel_6.add(shopname);
		shopname.setText(loginUser.getSHOPNAME());
//		ID.setText(loginUser.getID());

		
		JPanel menu = new JPanel();
		menu.setBackground(Color.WHITE);
		panel_4.add(menu, "name_1749439843296000");
		menu.setLayout(null);
		

		JPanel store1 = new JPanel();
		store1.setLayout(null);
		store1.setBackground(Color.WHITE);
		panel_4.add(store1, "name_1751013448779400");
		
		JPanel panel_34 = new JPanel();
		//가게 정보 수정란
		panel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
				panel_4.removeAll();
				panel_4.add(store1);
				panel_4.repaint();
				panel_4.revalidate();
				
			}
		});
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(88, 146, 137, 135);
		main.add(panel_34);
		panel_34.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("\uAC00\uAC8C \uC815\uBCF4 \uC218\uC815");
		lblNewLabel_4.setFont(new Font("HY수평선B", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 25, 137, 82);
		panel_34.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 137, 135);
		panel_34.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(c1));

		JPanel panel_35 = new JPanel();
		panel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(menu);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(275, 146, 137, 135);
		main.add(panel_35);

		JLabel label_48 = new JLabel("\uBA54\uB274 \uC218\uC815");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_48.setBounds(0, 25, 137, 82);
		panel_35.add(label_48);

		JLabel label_49 = new JLabel("");
		label_49.setBounds(0, 0, 137, 135);
		panel_35.add(label_49);
		label_49.setIcon(new ImageIcon(c1));

		JPanel pay = new JPanel();
		pay.setLayout(null);
		pay.setBackground(Color.WHITE);
		panel_4.add(pay, "name_1749820970039500");

		JPanel panel_37 = new JPanel();
		panel_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_37.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(pay);
						panel_4.repaint();
						panel_4.revalidate();

					}
				});
			}
		});
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(88, 302, 137, 135);
		main.add(panel_37);

		JLabel label_52 = new JLabel("\uCD1D \uB9E4\uCD9C");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_52.setBounds(0, 25, 137, 82);
		panel_37.add(label_52);

		JLabel label_53 = new JLabel("");
		label_53.setBounds(0, 0, 137, 135);
		panel_37.add(label_53);
		label_53.setIcon(new ImageIcon(c1));

		JPanel Review = new JPanel();
		panel_4.add(Review, "name_1749833862938900");
		Review.setLayout(null);
		Review.setBackground(Color.WHITE);
		
		JPanel panel_38 = new JPanel();
		panel_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				panel_4.removeAll();
				panel_4.add(Review);
				panel_4.repaint();
				panel_4.revalidate();

			}
		});
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(275, 302, 137, 135);
		main.add(panel_38);

		JLabel label_54 = new JLabel("\uB9AC\uBDF0/\uB9AC\uD50C \uAD00\uB9AC");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_54.setBounds(0, 25, 137, 82);
		panel_38.add(label_54);

		JLabel label_55 = new JLabel("");
		label_55.setBounds(0, 0, 137, 135);
		panel_38.add(label_55);
		label_55.setIcon(new ImageIcon(c1));

		JPanel order = new JPanel();
		order.setLayout(null);
		order.setBackground(Color.WHITE);
		panel_4.add(order, "name_1749936219387200");
		
		JPanel panel_39 = new JPanel();
		panel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(order);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(464, 302, 137, 135);
		main.add(panel_39);

		JLabel label_56 = new JLabel("\uC8FC\uBB38 \uC811\uC218\uCC3D");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_56.setBounds(0, 25, 137, 82);
		panel_39.add(label_56);

		JLabel label_57 = new JLabel("");
		label_57.setBounds(0, 0, 137, 135);
		panel_39.add(label_57);
		label_57.setIcon(new ImageIcon(c1));

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(461, 146, 137, 135);
		main.add(panel_40);
		panel_40.setLayout(new CardLayout(0, 0));

		JPanel panel_36 = new JPanel();
		JPanel panel_41 = new JPanel();
		panel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_40.removeAll();
				panel_40.add(panel_41);
				panel_40.repaint();
				panel_40.revalidate();
			}
		});
		panel_40.add(panel_36, "name_1229935410162600");
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);

		panel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_40.removeAll();
				panel_40.add(panel_36);
				panel_40.repaint();
				panel_40.revalidate();

			}
		});
		panel_40.add(panel_41, "name_1229955962227900");
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);

		JLabel label_58 = new JLabel("\uC601\uC5C5\uC2DC\uC791");
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_58.setBounds(0, 25, 137, 82);
		panel_41.add(label_58);

		JLabel label_59 = new JLabel("");
		label_59.setBounds(0, 0, 137, 135);
		panel_41.add(label_59);
		label_59.setIcon(new ImageIcon(c1));

		JLabel label_50 = new JLabel("\uC601\uC5C5\uC885\uB8CC");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("HY수평선B", Font.BOLD, 15));
		label_50.setBounds(0, 25, 137, 82);
		panel_36.add(label_50);

		JLabel label_51 = new JLabel("");
		label_51.setBounds(0, 0, 137, 135);
		panel_36.add(label_51);
		label_51.setIcon(new ImageIcon(c1));

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 693, 622);

		store1.add(panel_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(37, 158, 615, 693);
		panel_2.add(panel_7);
		String shopimg1 = this.getClass().getResource(".").getPath() + "..//..//img//s1.png";
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 615, 796);
		panel_7.add(scrollPane_4);
		
		JPanel panel_43 = new JPanel();
		scrollPane_4.setViewportView(panel_43);
		panel_43.setPreferredSize(new Dimension(570, 600));

		JButton btnNewButton = new JButton("\uC218\uC815\uD558\uAE30");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(510, 545, 142, 40);
		panel_2.add(btnNewButton);
		
				JButton button_6 = new JButton("\uC774\uC804\uC73C\uB85C");
				button_6.setFont(new Font("굴림", Font.BOLD, 14));
				button_6.setBounds(38, 42, 115, 40);
				panel_2.add(button_6);
				
						JPanel panel_5 = new JPanel();
						panel_5.setBounds(257, 46, 305, 36);
						panel_2.add(panel_5);
						
								JLabel lblNewLabel_2 = new JLabel("\uAC00\uAC8C \uC815\uBCF4 \uC218\uC815");
								lblNewLabel_2.setFont(new Font("HY수평선B", Font.BOLD, 22));
								panel_5.add(lblNewLabel_2);
				button_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(main);
						panel_4.repaint();
						panel_4.revalidate();
					}
				});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});


		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 0, 693, 622);
		menu.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(35, 46, 600, 211);
		panel_8.add(panel_9);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 0, 600, 211);
		panel_9.add(scrollPane);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_42);
		panel_42.setPreferredSize(new Dimension(550, 500));
				panel_42.setLayout(null);
				
				JLabel a1 = new JLabel("");
				String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//a1.png";
				a1.setIcon(new ImageIcon(imgPath1));
				a1.setBounds(12, 10, 542, 126);
				panel_42.add(a1);
				
				JLabel a2 = new JLabel("");
				String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//a2.png";
				a2.setIcon(new ImageIcon(imgPath2));
				a2.setBounds(12, 146, 542, 126);
				panel_42.add(a2);
				
				JLabel a3 = new JLabel("");
				String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//a3.png";
				a3.setIcon(new ImageIcon(imgPath3));
				a3.setBounds(12, 282, 542, 126);
				panel_42.add(a3);
				

		JLabel label = new JLabel("  BEST MENU");
		label.setFont(new Font("HY수평선B", Font.BOLD, 18));
		label.setBounds(37, 10, 152, 29);
		panel_8.add(label);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(35, 267, 572, 506);
		panel_8.add(panel_10);

		JPanel panel_24 = new JPanel();
		panel_24.setBounds(275, 0, 301, 440);
		panel_10.add(panel_24);
		panel_24.setLayout(null);
		panel_24.setPreferredSize(new Dimension(280, 440));
		panel_24.setBackground(Color.WHITE);

		JLabel label_28 = new JLabel("\uC815\uCC2C\uC2DC\uB9AC\uC988");
		label_28.setFont(new Font("Dialog", Font.BOLD, 18));
		label_28.setBounds(12, 10, 272, 25);
		panel_24.add(label_28);

		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(12, 35, 243, 25);
		panel_24.add(panel_25);

		JLabel label_29 = new JLabel("\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D");
		label_29.setBounds(0, 0, 131, 25);
		panel_25.add(label_29);

		JLabel label_30 = new JLabel("3900\uC6D0");
		label_30.setBounds(174, 0, 69, 25);
		panel_25.add(label_30);

		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(12, 60, 243, 25);
		panel_24.add(panel_26);

		JLabel label_31 = new JLabel("\uAD6D\uD654\uB3C4\uC2DC\uB77D");
		label_31.setBounds(0, 0, 131, 25);
		panel_26.add(label_31);

		JLabel label_32 = new JLabel("4000\uC6D0");
		label_32.setBounds(174, 0, 69, 25);
		panel_26.add(label_32);

		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(12, 87, 243, 25);
		panel_24.add(panel_27);

		JLabel label_33 = new JLabel("\uCE58\uD0A8\uC81C\uC721\uB3C4\uC2DC\uB77D");
		label_33.setBounds(0, 0, 131, 25);
		panel_27.add(label_33);

		JLabel label_34 = new JLabel("4400\uC6D0");
		label_34.setBounds(174, 0, 69, 25);
		panel_27.add(label_34);

		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(12, 113, 243, 25);
		panel_24.add(panel_28);

		JLabel label_35 = new JLabel("\uB3D9\uBC31\uB3C4\uC2DC\uB77D");
		label_35.setBounds(0, 0, 131, 25);
		panel_28.add(label_35);

		JLabel label_36 = new JLabel("5000\uC6D0");
		label_36.setBounds(174, 0, 69, 25);
		panel_28.add(label_36);

		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(12, 140, 243, 25);
		panel_24.add(panel_29);

		JLabel label_37 = new JLabel("\uCE60\uB9AC\uCC39\uC300\uD0D5\uC218\uC721\uB3C4\uB828\uB2D8");
		label_37.setBounds(0, 0, 131, 25);
		panel_29.add(label_37);

		JLabel label_38 = new JLabel("4000\uC6D0");
		label_38.setBounds(174, 0, 69, 25);
		panel_29.add(label_38);

		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(12, 168, 243, 25);
		panel_24.add(panel_30);

		JLabel label_39 = new JLabel("\uC0DD\uC120\uAE4C\uC2A4\uB3C4\uB828\uB2D8");
		label_39.setBounds(0, 0, 131, 25);
		panel_30.add(label_39);

		JLabel label_40 = new JLabel("3900\uC6D0");
		label_40.setBounds(174, 0, 69, 25);
		panel_30.add(label_40);

		JLabel label_41 = new JLabel("\uBA54\uAC00 \uC2DC\uB9AC\uC988");
		label_41.setFont(new Font("Dialog", Font.BOLD, 18));
		label_41.setBounds(12, 220, 226, 25);
		panel_24.add(label_41);

		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(12, 245, 243, 25);
		panel_24.add(panel_31);

		JLabel label_42 = new JLabel("\uBA54\uAC00 \uCE58\uD0A8\uB9C8\uC694");
		label_42.setBounds(0, 0, 131, 25);
		panel_31.add(label_42);

		JLabel label_43 = new JLabel("5200\uC6D0");
		label_43.setBounds(174, 0, 69, 25);
		panel_31.add(label_43);

		JPanel panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(12, 271, 243, 25);
		panel_24.add(panel_32);

		JLabel label_44 = new JLabel("\uBA54\uAC00 \uCE58\uD0A8\uC81C\uC721");
		label_44.setBounds(0, 0, 131, 25);
		panel_32.add(label_44);

		JLabel label_45 = new JLabel("6900\uC6D0");
		label_45.setBounds(174, 0, 69, 25);
		panel_32.add(label_45);

		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(12, 297, 243, 25);
		panel_24.add(panel_33);

		JLabel label_46 = new JLabel("\uBA54\uAC00 \uACE0\uAE30\uACE0\uAE30");
		label_46.setBounds(0, 0, 131, 25);
		panel_33.add(label_46);

		JLabel label_47 = new JLabel("7900\uC6D0");
		label_47.setBounds(174, 0, 69, 25);
		panel_33.add(label_47);

		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setPreferredSize(new Dimension(280, 440));
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 0, 280, 440);
		panel_10.add(panel_11);

		JLabel label_1 = new JLabel("\uD504\uB9AC\uBBF8\uC5C4 \uC2DC\uB9AC\uC988");
		label_1.setFont(new Font("Dialog", Font.BOLD, 18));
		label_1.setBounds(12, 10, 226, 25);
		panel_11.add(label_1);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(12, 35, 243, 25);
		panel_11.add(panel_12);

		JLabel label_2 = new JLabel("\uB9E4\uD654\uB3C4\uC2DC\uB77D");
		label_2.setBounds(0, 0, 131, 25);
		panel_12.add(label_2);

		JLabel label_3 = new JLabel("10000\uC6D0");
		label_3.setBounds(174, 0, 69, 25);
		panel_12.add(label_3);

		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(12, 61, 243, 25);
		panel_11.add(panel_13);

		JLabel label_4 = new JLabel("\uAC1C\uB098\uB9AC\uB3C4\uC2DC\uB77D");
		label_4.setBounds(0, 0, 131, 25);
		panel_13.add(label_4);

		JLabel label_5 = new JLabel("8000\uC6D0");
		label_5.setBounds(174, 0, 69, 25);
		panel_13.add(label_5);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(12, 87, 243, 25);
		panel_11.add(panel_14);

		JLabel label_6 = new JLabel("\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D");
		label_6.setBounds(0, 0, 131, 25);
		panel_14.add(label_6);

		JLabel label_7 = new JLabel("7000\uC6D0");
		label_7.setBounds(174, 0, 69, 25);
		panel_14.add(label_7);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(12, 155, 243, 25);
		panel_11.add(panel_15);

		JLabel label_8 = new JLabel("\uC22F\uBD88\uC9C1\uD654\uAD6C\uC774 \uB36E\uBC25");
		label_8.setBounds(0, 0, 131, 25);
		panel_15.add(label_8);

		JLabel label_9 = new JLabel("5700\uC6D0");
		label_9.setBounds(174, 0, 69, 25);
		panel_15.add(label_9);

		JLabel label_10 = new JLabel("\uC2E0\uBA54\uB274");
		label_10.setFont(new Font("Dialog", Font.BOLD, 18));
		label_10.setBounds(12, 132, 226, 25);
		panel_11.add(label_10);

		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(12, 180, 243, 25);
		panel_11.add(panel_16);

		JLabel label_11 = new JLabel("\uC911\uD654 \uC9DC\uC7A5\uBCF6\uC74C\uBC25");
		label_11.setBounds(0, 0, 131, 25);
		panel_16.add(label_11);

		JLabel label_12 = new JLabel("4700\uC6D0");
		label_12.setBounds(174, 0, 69, 25);
		panel_16.add(label_12);

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(12, 205, 243, 25);
		panel_11.add(panel_17);

		JLabel label_13 = new JLabel("\uAD6D\uBB3C\uB5A1\uBCF6\uC774\uD280\uAE40\uC138\uD2B8");
		label_13.setBounds(0, 0, 131, 25);
		panel_17.add(label_13);

		JLabel label_14 = new JLabel("4800\uC6D0");
		label_14.setBounds(174, 0, 69, 25);
		panel_17.add(label_14);

		JLabel label_15 = new JLabel("\uACE0\uAE30\uACE0\uAE30 \uC2DC\uB9AC\uC988");
		label_15.setFont(new Font("Dialog", Font.BOLD, 18));
		label_15.setBounds(12, 250, 256, 19);
		panel_11.add(label_15);

		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(12, 271, 243, 25);
		panel_11.add(panel_18);

		JLabel label_16 = new JLabel("\uACE0\uAE30\uACE0\uAE30");
		label_16.setBounds(0, 0, 131, 25);
		panel_18.add(label_16);

		JLabel label_17 = new JLabel("3900\uC6D0");
		label_17.setBounds(174, 0, 69, 25);
		panel_18.add(label_17);

		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(12, 297, 243, 25);
		panel_11.add(panel_19);

		JLabel label_18 = new JLabel("\uB3C8\uCE58\uACE0\uAE30\uACE0\uAE30");
		label_18.setBounds(0, 0, 131, 25);
		panel_19.add(label_18);

		JLabel label_19 = new JLabel("5200\uC6D0");
		label_19.setBounds(174, 0, 69, 25);
		panel_19.add(label_19);

		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(12, 322, 243, 25);
		panel_11.add(panel_20);

		JLabel label_20 = new JLabel("\uC0C8\uCE58\uACE0\uAE30\uACE0\uAE30");
		label_20.setBounds(0, 0, 131, 25);
		panel_20.add(label_20);

		JLabel label_21 = new JLabel("6000\uC6D0");
		label_21.setBounds(174, 0, 69, 25);
		panel_20.add(label_21);

		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(12, 348, 243, 25);
		panel_11.add(panel_21);

		JLabel label_22 = new JLabel("\uD0D5\uC218\uC721\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
		label_22.setBounds(0, 0, 131, 25);
		panel_21.add(label_22);

		JLabel label_23 = new JLabel("5600\uC6D0");
		label_23.setBounds(174, 0, 69, 25);
		panel_21.add(label_23);

		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(12, 375, 243, 25);
		panel_11.add(panel_22);

		JLabel label_24 = new JLabel("\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
		label_24.setBounds(0, 0, 131, 25);
		panel_22.add(label_24);

		JLabel label_25 = new JLabel("5500\uC6D0");
		label_25.setBounds(174, 0, 69, 25);
		panel_22.add(label_25);

		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(12, 400, 243, 25);
		panel_11.add(panel_23);

		JLabel label_26 = new JLabel("\uC0DD\uC120\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uACE0\uAE30\uACE0\uAE30");
		label_26.setBounds(0, 0, 162, 25);
		panel_23.add(label_26);

		JLabel label_27 = new JLabel("5500\uC6D0");
		label_27.setBounds(174, 0, 69, 25);
		panel_23.add(label_27);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 450, 600, -448);
		panel_10.add(scrollPane_1);

		JButton button_7 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_7.setBounds(375, 9, 125, 35);
		panel_8.add(button_7);

		JButton button_2 = new JButton("\uC218\uC815\uD558\uAE30");
		button_2.setBounds(510, 9, 125, 35);
		panel_8.add(button_2);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});

		JPanel work_start = new JPanel();
		work_start.setBackground(Color.WHITE);
		panel_4.add(work_start, "name_1749406374324900");
		work_start.setLayout(null);

		JButton button_8 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_8.setBounds(69, 30, 115, 40);
		work_start.add(button_8);
		
		JButton button_3 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_3.setBounds(47, 30, 115, 40);
		pay.add(button_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(47, 144, 611, 403);
		pay.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);


		JButton button_10 = new JButton("\uC774\uC804\uC73C\uB85C");

		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_10.setBounds(69, 30, 115, 40);
		Review.add(button_10);

		JButton button_11 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_11.setBounds(69, 30, 115, 40);
		order.add(button_11);

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
