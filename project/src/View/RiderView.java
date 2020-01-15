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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RiderView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiderView window = new RiderView();
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
	public RiderView() {
		initialize();
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
		leftView.setLayout(null);
		
		main.add(leftView);
		

		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(12, 25, 196, 40);
		leftView.add(panel_2);
		

		

		
		JPanel rightView = new JPanel();
		rightView.setBounds(279, 0, 693, 622);
		main.add(rightView);
	
		rightView.setLayout(new CardLayout(0, 0));
		
		JPanel rider_categorie = new JPanel();
		rider_categorie.setBackground(Color.WHITE);
		rightView.add(rider_categorie, "name_191005233949000");
		rider_categorie.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		rightView.add(panel_9, "name_191255919361100");
		
		JPanel Rank = new JPanel();
		rightView.add(Rank, "name_191008403446000");
		Rank.setBackground(Color.WHITE);
		Rank.setLayout(null);
		
		JLabel categorie1 = new JLabel("");
		String mk1 = this.getClass().getResource(".").getPath() + "..//..//img//mk1.png";
		categorie1.setIcon(new ImageIcon(mk1));
		categorie1.setBounds(68, 87, 167, 215);
		rider_categorie.add(categorie1);
		categorie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rightView.removeAll();
				rightView.add(Rank);
				rightView.repaint();
				rightView.revalidate();
				
			}
		});
		
		JLabel categorie2 = new JLabel("");
		String mk2 = this.getClass().getResource(".").getPath() + "..//..//img//mk2.png";
		categorie2.setIcon(new ImageIcon(mk2));
		categorie2.setBounds(259, 87, 141, 215);
		rider_categorie.add(categorie2);
		
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(35, 46, 600, 205);
				Rank.add(panel_3);
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
					
					JLabel bestRider = new JLabel("  BEST RIDER");
					bestRider.setFont(new Font("HY¼öÆò¼±B", Font.BOLD, 18));
					bestRider.setBounds(37, 10, 152, 29);
					Rank.add(bestRider);
		
		
		

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
