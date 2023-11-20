package surburt;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

public class hailt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hailt frame = new hailt();
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
	public hailt() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(234, 234, 234));
		panel.setBounds(0, 40, 40, 424);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button_1_1 = new JButton("");
		button_1_1.setIcon(null);
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1_1.setBackground(new Color(230, 230, 230));
		button_1_1.setBounds(2, 27, 36, 36);
		
		panel.add(button_1_1);
		
		JButton button_1_1_1 = new JButton("");
		button_1_1_1.setIcon(new ImageIcon(main.class.getResource("/picture/search.jpg")));
		button_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		button_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1.setBounds(2, 76, 36, 36);
		panel.add(button_1_1_1);
		
		JButton button_1_1_1_1 = new JButton("");
		button_1_1_1_1.setIcon(new ImageIcon(hailt.class.getResource("/picture/exit.jpg")));
		button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//main lol = new main();
				//lol.setVisible(true);
				
				dispose();
			}
		});
		button_1_1_1_1.setBackground(new Color(230, 230, 230));
		button_1_1_1_1.setBounds(2, 353, 36, 38);
		panel.add(button_1_1_1_1);
		/*
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
		
		*/

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1.setBounds(600, 53, 264, 121);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel tseejZ = new JLabel("New label");
		tseejZ.setBounds(89, 11, 101, 88);
		panel_3_1.add(tseejZ);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBounds(50, 53, 521, 62);
		contentPane.add(panel_4);
		
		panel_4.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 398, 30);
		panel_4.add(textPane);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1.setBounds(50, 136, 521, 295);
		contentPane.add(panel_3_1_1);
		 panel_3_1_1.setLayout(null);
		
		 
		 JTable table = new JTable();
	        DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] {
	                "Овог", "Оюутны нэр",/* "Төрсөн он сар өдөр" ,*/ " Регистр", "Гэрийн хаяг" ,"Ургийн овог"
	        });
		 table.setModel(model);
		 JScrollPane scrollPane = new JScrollPane(table);
		 scrollPane.setBounds(10, 7, 501, 277);
		 panel_3_1_1.add(scrollPane);
		 
		 
		 
		 
		JButton btnNewButton_1 = new JButton("haih");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
	            PreparedStatement pst;
	            ResultSet rs;
			
	            DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
                searchResultModel.setRowCount(0);
						try {
						
							
							String S_haih = textPane.getText();
		                    
							
							 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
			                    pst = con.prepareStatement("SELECT * FROM oyutan WHERE ner = ? ");
			                    pst.setString(1, S_haih);
			                    rs = pst.executeQuery();
							
			                   
			                   
							if (rs.next() ) {
								JOptionPane.showMessageDialog(null, " амжилттай оллоо ...");
								
								String ovogField = rs.getString("ovog");
							 	String nerField = rs.getString("ner");
                                //int ocodeField = rs.getInt("idburtgel");
                                String regField = rs.getString("register");
                                //Date hugatsaaField = rs.getDate("hugatsaa");	
                                String haygField = rs.getString("gerHayg");
                                String uragField = rs.getString("urgiinOvog");
                                searchResultModel.addRow(new Object[]{ovogField ,nerField ,regField, haygField, uragField});
                                
								
								byte[] imageData = rs.getBytes("image");
				                ImageIcon imageIcon = new ImageIcon(imageData);
								
								tseejZ.setIcon(imageIcon);	
								
								 // 2 oos iluu ijil nertei bh uyd ajillah ym
									 while(rs.next()) {
									 	String ovog2Field = rs.getString("ovog");
									 	String ner2Field = rs.getString("ner");
	                                    //int ocodeField = rs.getInt("idburtgel");
	                                    String reg2Field = rs.getString("register");
	                                    //Date hugatsaaField = rs.getDate("hugatsaa");	
	                                    String hayg2Field = rs.getString("gerHayg");
	                                    String urag2Field = rs.getString("urgiinOvog");
	                                    searchResultModel.addRow(new Object[]{ovog2Field ,ner2Field ,reg2Field, hayg2Field, urag2Field});
									 } 
	                                
								
							/* JPanel customPanel = new JPanel() {
						            @Override
						            protected void paintComponent(Graphics g) {
						                super.paintComponent(g);
						                g.drawString("Custom Drawing", 100, 100);
						            }
						        }   ;*/
							}
							else 
								JOptionPane.showMessageDialog(null, " нэр буруу байна...");
							con.close();
							}catch(Exception ex) {System.out.print(ex);}
					        	System.out.print("");
					        	

			}
		});
		btnNewButton_1.setBounds(422, 11, 77, 30);
		panel_4.add(btnNewButton_1);
		
		
		
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4_1.setBounds(600, 217, 264, 214);
		contentPane.add(panel_4_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 11, 244, 192);
		panel_4_1.add(textPane_1);
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
	
	
public void setMainUsername2(String username) {

		
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
