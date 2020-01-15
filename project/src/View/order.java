package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public class order {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order window = new order();
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
	public order() {
		initialize();
		frame.setBounds(400, 150, 1011, 661);
		
		JPanel panel_1 =new JPanel();
		panel_1.setBounds(371, 0, 634, 632);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		panel_1.add(main, "name_82546225747300");
		main.setLayout(new CardLayout(0, 0));
		JPanel leftView = new JPanel();
		main.add(leftView, "name_190991486518000");
		
		leftView.setBackground(new Color(135, 206, 250));
		leftView.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(12, 25, 196, 40);
		leftView.add(panel_2);
		
		JPanel rightView = new JPanel();
		rightView.setBounds(281, 0, 714, 625);
		leftView.add(rightView);
		rightView.setLayout(new CardLayout(0, 0));
		
		JPanel menuKategorie = new JPanel();
		menuKategorie.setBackground(Color.WHITE);
		rightView.add(menuKategorie, "name_191005233949000");
		menuKategorie.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SM024\\git\\Project2\\project\\img\\mk1.PNG"));
		lblNewLabel.setBounds(59, 124, 141, 214);
		menuKategorie.add(lblNewLabel);
		
		JPanel korean = new JPanel();
		korean.setBackground(Color.WHITE);
		rightView.add(korean, "name_191253599176200");
		
		JPanel ÇÑ¼Ü = new JPanel();
		rightView.add(ÇÑ¼Ü, "name_191008403446000");
		ÇÑ¼Ü.setBackground(Color.WHITE);
		ÇÑ¼Ü.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(35, 46, 600, 218);
		ÇÑ¼Ü.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 0, 600, 217);
		panel_3.add(scrollPane);
		
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(Color.WHITE);
			scrollPane.setViewportView(panel_4);
			panel_4.setPreferredSize(new Dimension(500, 800));
			panel_4.setLayout(null);
			JLabel a1 = new JLabel("");
			String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//a1.png";
			a1.setIcon(new ImageIcon(imgPath1));
			a1.setBounds(27, 10, 542, 126);
			panel_4.add(a1);
			
			
			JLabel a2 = new JLabel("");
			String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//a2.png";
			a2.setIcon(new ImageIcon(imgPath2));
			a2.setBounds(27, 146, 542, 126);
			panel_4.add(a2);
			
			
			JLabel a3 = new JLabel("");
			String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//img//a3.png";
			a3.setIcon(new ImageIcon(imgPath3));
			a3.setBounds(27, 282, 542, 126);
			panel_4.add(a3);
			
			JLabel a4 = new JLabel("");
			String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//img//a4.png";
			a4.setIcon(new ImageIcon(imgPath4));
			a4.setBounds(27, 418, 542, 126);
			panel_4.add(a4);
			
			JLabel bestMenu = new JLabel("  BEST MENU");
			bestMenu.setFont(new Font("HY¼öÆò¼±B", Font.BOLD, 18));
			bestMenu.setBounds(37, 10, 152, 29);
			ÇÑ¼Ü.add(bestMenu);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		rightView.add(panel_9, "name_191255919361100");
		
		
		

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
