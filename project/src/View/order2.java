package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Model.Model;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class order2 {

	private JFrame frame;
	private Model loginUser;
	
	
	
	
	
	public order2(Model loginUser) {
		initialize();
		frame.setBounds(400, 150, 1011, 661);
		frame.setVisible(true);
		
		
		JPanel panel_1 =new JPanel();
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
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(279, 0, 716, 620);
		store.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		
		
		
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		panel_4.add(main, "name_1749428196331400");
		main.setLayout(null);
		
		JButton button = new JButton("\uAC00\uAC8C \uC815\uBCF4 \uC218\uC815");
		
		button.setBounds(52, 146, 125, 111);
		main.add(button);
		
		JButton button_1 = new JButton("\uBA54\uB274\uC218\uC815");
		
		button_1.setBounds(265, 146, 125, 111);
		main.add(button_1);
		
		JButton button_2 = new JButton("\uC601\uC5C5 \uC2DC\uC791/\uC911\uC9C0");
		
		button_2.setBounds(465, 146, 125, 111);
		main.add(button_2);
		
		JButton button_3 = new JButton("\uCD1D \uB9E4\uCD9C");
		button_3.setBounds(52, 368, 125, 111);
		main.add(button_3);
		
		JButton button_4 = new JButton("\uB9AC\uBDF0/\uB9AC\uD50C \uAD00\uB9AC");
		button_4.setBounds(265, 368, 125, 111);
		main.add(button_4);
		
		JButton button_5 = new JButton("\uC8FC\uBB38 \uC811\uC218\uCC3D");
		button_5.setBounds(465, 368, 125, 111);
		main.add(button_5);
		
		JPanel store1 = new JPanel();
		store1.setLayout(null);
		store1.setBackground(Color.WHITE);
		panel_4.add(store1, "name_1751013448779400");
		
		JButton button_6 = new JButton("\uC774\uC804\uC73C\uB85C");
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
		button_6.setBounds(62, 27, 125, 111);
		store1.add(button_6);
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.WHITE);
		panel_4.add(menu, "name_1749439843296000");
		menu.setLayout(null);
		
		JButton button_7 = new JButton("\uC774\uC804\uC73C\uB85C");
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
		button_7.setBounds(174, 153, 125, 111);
		menu.add(button_7);
		
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
		button_8.setBounds(69, 30, 125, 111);
		work_start.add(button_8);
			
		JPanel pay = new JPanel();
		pay.setLayout(null);
		pay.setBackground(Color.WHITE);
		panel_4.add(pay, "name_1749820970039500");
		
		JButton button_9 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_9.setBounds(69, 30, 125, 111);
		pay.add(button_9);
		
		JPanel Review = new JPanel();
		panel_4.add(Review, "name_1749833862938900");
		Review.setLayout(null);
		Review.setBackground(Color.WHITE);
		
		JButton button_10 = new JButton("\uC774\uC804\uC73C\uB85C");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(main);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		button_10.setBounds(69, 30, 125, 111);
		Review.add(button_10);
		
		JPanel order = new JPanel();
		order.setLayout(null);
		order.setBackground(Color.WHITE);
		panel_4.add(order, "name_1749936219387200");
		
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
		button_11.setBounds(69, 30, 125, 111);
		order.add(button_11);
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_4.removeAll();
				panel_4.add(store1);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_4.removeAll();
				panel_4.add(menu);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(work_start);
						panel_4.repaint();
						panel_4.revalidate();
				
			}
		});
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(pay);
						panel_4.repaint();
						panel_4.revalidate();
				
			}
		});
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(Review);
						panel_4.repaint();
						panel_4.revalidate();
				
			}
		});
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						panel_4.removeAll();
						panel_4.add(order);
						panel_4.repaint();
						panel_4.revalidate();
				
			}
		});
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
