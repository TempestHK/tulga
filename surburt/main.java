package surburt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class main extends JFrame {

	protected static final boolean True = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String username;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(242, 242, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		menuBar.setBackground(new Color(0, 0, 0));
		menuBar.setBounds(0, 0, 40, 42);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("=");
		mnNewMenu.setForeground(UIManager.getColor("Button.highlight"));
		mnNewMenu.setBackground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("New button");
		mnNewMenu.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		mnNewMenu.add(panel_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		/*
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(234, 234, 234));
		panel.setBounds(0, 40, 40, 424);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button_1_1 = new JButton("");
		button_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/oyutan.jpg")));
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				nuurHuudas nuurHuudas = new  nuurHuudas();
				nuurHuudas.setVisible(true);
				
			}
		});
		button_1_1.setBackground(new Color(230, 230, 230));
		button_1_1.setBounds(2, 27, 36, 36);
		 
		panel.add(button_1_1);
		
		JButton button_1_1_1 = new JButton("");
		button_1_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/search.jpg")));
		button_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hailt hailt = new hailt();
				hailt.setVisible(true);
				
			}
		});
		button_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1.setBounds(0, 76, 36, 36);
		panel.add(button_1_1_1);
		
		JButton button_1_1_1_1 = new JButton("");
		button_1_1_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/exit.jpg")));
		button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				burgel burgel = new burgel();
				burgel.setVisible(true);
			}
		});
		button_1_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1_1.setBounds(2, 353, 36, 38);
		panel.add(button_1_1_1_1);
		
		
		*/
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBounds(63, 61, 264, 214);
		contentPane.add(panel_4);
		
		panel_4.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 244, 192);
		panel_4.add(textPane);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1.setBounds(63, 310, 264, 121);
		contentPane.add(panel_3_1_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1_1.setBounds(361, 61, 264, 121);
		contentPane.add(panel_3_1_1_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4_1.setBounds(361, 218, 264, 214);
		contentPane.add(panel_4_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 11, 244, 192);
		panel_4_1.add(textPane_1);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1_1_1.setBounds(649, 61, 215, 370);
		contentPane.add(panel_3_1_1_1_1);
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public  void setMainUsername(String username) {
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(41, 0, 833, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("ШИНЭ МОНГОЛ \r\nТЕХНОЛОГИЙН КОЛЛЕЖ");
		lblNewLabel_1_1.setBounds(77, 0, 360, 24);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("СУРАГЧИЙН БҮРТГЭЛИЙН СИСТЕМ");
		lblNewLabel_4.setBounds(77, 25, 215, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/picture/nmct 2 .png")));
		lblNewLabel.setBounds(21, 3, 46, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(742, 6, 59, 25);
		lblNewLabel_1.setText(username);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(234, 234, 234));
		panel.setBounds(0, 40, 40, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button_1_1_1 = new JButton("");
		button_1_1_1.setIcon(new ImageIcon(nuurHuudas.class.getResource("/picture/add1.png")));
		button_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewBurtgel1 lol = new NewBurtgel1();
				lol.setVisible(true);
				
				
			}
		});
		button_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1.setBounds(0, 126, 36, 36);
		panel.add(button_1_1_1);
		
		JButton button_1_1 = new JButton("");
		button_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/oyutan.jpg")));
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				nuurHuudas nuurHuudas = new  nuurHuudas();
				nuurHuudas.setVisible(true);
				nuurHuudas.setMainUsername1(username);
				//nuurHuudas.setner(username) setner ni sqltrow hiitsne bga uchir
				try {
					nuurHuudas.setner(username);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_1_1.setBackground(new Color(230, 230, 230));
		button_1_1.setBounds(2, 27, 36, 36);
		 
		panel.add(button_1_1);
		
		JButton button_1_1_11 = new JButton("");
		button_1_1_11.setIcon(new ImageIcon(main.class.getResource("/picture/search.jpg")));
		button_1_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hailt hailt = new hailt();
				hailt.setVisible(true);
				hailt.setMainUsername2(username);
				
			}
		});
		button_1_1_11.setBackground(new Color(230, 230, 230));
		button_1_1_11.setBounds(0, 76, 36, 36);
		panel.add(button_1_1_11);
		
		JButton button_1_1_1_1 = new JButton("");
		button_1_1_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/exit.jpg")));
		button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				burgel burgel = new burgel();
				burgel.setVisible(true);
			}
		});
		button_1_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1_1.setBounds(2, 353, 36, 38);
		panel.add(button_1_1_1_1);
		
		/*  
    	Connection con;
        PreparedStatement pst;
        ResultSet rs;
	
				try {
				
					
						 
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
	                    pst = con.prepareStatement("SELECT image FROM oyutan WHERE ner=?  ");
	                    pst.setString(1, username);
	                    rs = pst.executeQuery();
					
	                    
					if (rs.next()  ) {
						
					 
						JOptionPane.showMessageDialog(null, "амжилттай оллоо...");
						
						byte[] imageData = rs.getBytes("image");
		                
		                ImageIcon imageIcon = new ImageIcon(imageData);
		                
						//tseejZ.setIcon(imageIcon);	
						
					}else 
						JOptionPane.showMessageDialog(null, "зураг олдсонгүй...");
					con.close();
					}catch(Exception ex) {System.out.print(ex);}
			        	
		  */
		
	}
}
