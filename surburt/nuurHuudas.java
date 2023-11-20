package surburt;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class nuurHuudas extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuurHuudas frame = new nuurHuudas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public nuurHuudas()  {
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
		button_1_1.setIcon(new ImageIcon(nuurHuudas.class.getResource("/picture/oyutan.jpg")));
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1_1.setBackground(new Color(230, 230, 230));
		button_1_1.setBounds(2, 27, 36, 38);
		
		panel.add(button_1_1);
		
		JButton button_1_1_1_1 = new JButton("");
		button_1_1_1_1.setIcon(new ImageIcon(nuurHuudas.class.getResource("/picture/exit.jpg")));
		button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/picture/nmct 2 .png")));
		lblNewLabel.setBounds(25, 4, 46, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("ШИНЭ МОНГОЛ \r\nТЕХНОЛОГИЙН КОЛЛЕЖ");
		lblNewLabel_1_1.setBounds(77, 0, 360, 24);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("СУРАГЧИЙН БҮРТГЭЛИЙН СИСТЕМ");
		lblNewLabel_4.setBounds(77, 25, 215, 14);
		panel_1.add(lblNewLabel_4);
		
		*/
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1.setBounds(74, 204, 551, 227);
		contentPane.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1_1_1.setBounds(649, 61, 215, 370);
		contentPane.add(panel_3_1_1_1_1);
		/*
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3_1_1_1.setBounds(187, 61, 438, 121);
		contentPane.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		
		
		
		JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] {
                "Овог", "Оюутны нэр", " Регистр", "Гэрийн хаяг" ,"Ургийн овог"
        });
        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 11, 418, 99);
		panel_3_1_1_1.add(scrollPane);
		*/
		/*
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(74, 61, 103, 121);
		contentPane.add(panel_4);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  
		    	Connection con;
	            PreparedStatement pst;
	            ResultSet rs;
			
						try {
						
							
								String username = textField.getText();
								con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
			                    pst = con.prepareStatement("SELECT image FROM oyutan WHERE ner=?  ");
			                    pst.setString(1, username);
			                    rs = pst.executeQuery();
							
			                    
							if (rs.next()  ) {
								
							 
								JOptionPane.showMessageDialog(null, "амжилттай оллоо...");
								
								byte[] imageData = rs.getBytes("image");
				                
				                ImageIcon imageIcon = new ImageIcon(imageData);
				                
								tseejZ.setIcon(imageIcon);	
								
							}else 
								JOptionPane.showMessageDialog(null, "зураг олдсонгүй...");
							con.close();
							}catch(Exception ex) {System.out.print(ex);}
					        	
				  
			}
		});
		btnNewButton_1.setBounds(449, 149, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		*/
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
	
	
	public void setner(String username) throws SQLException {
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBounds(74, 61, 103, 121);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel tseejZ = new JLabel("New label");
		
		/*
		Connection con;
        PreparedStatement pst;
        ResultSet rs;
	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/s5", "root", "Buuvii25");
        pst = con.prepareStatement("SELECT oyutanID FROM oyutan WHERE ner = ? ");
        pst.setString(1, username);
        rs = pst.executeQuery();
        */
        Connection con1 ;
        PreparedStatement pst1;
        ResultSet rs1 ;
        
        //String oyutanID1 = rs.getString("oyutanID");
        	try {
        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s5", "root", "Buuvii25");
        pst1 = con1.prepareStatement("SELECT image FROM oyutan WHERE oyutanID=?");
        pst1.setString(1, username);
        rs1 = pst1.executeQuery();
        
        	if(rs1.next()) {
        	
        byte[] imageData = rs1.getBytes("image");
        ImageIcon imageIcon = new ImageIcon(imageData);
		tseejZ.setIcon(imageIcon);	
		tseejZ.setBounds(0, 0, 93, 121);
		panel_4.add(tseejZ);
        	}
        }catch(Exception ex) {System.out.print(username);}
        
        	
        	//medeelel
        	JPanel panel_3_1_1_1 = new JPanel();
    		panel_3_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
    		panel_3_1_1_1.setBounds(187, 61, 438, 121);
    		contentPane.add(panel_3_1_1_1);
    		panel_3_1_1_1.setLayout(null);
    		
    		
    		JTable table = new JTable();
            DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] {
                    "Овог", "Оюутны нэр", " Регистр", "Гэрийн хаяг" ,"Ургийн овог"
            });
            table.setModel(model);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(10, 11, 418, 99);
    		panel_3_1_1_1.add(scrollPane);
        
    		
    		DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
            searchResultModel.setRowCount(0);
        	try {
        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s5", "root", "Buuvii25");
        pst1 = con1.prepareStatement("SELECT * FROM oyutan WHERE oyutanID=?");
        pst1.setString(1, username);
        rs1 = pst1.executeQuery();
        
        	if(rs1.next()) {
		String ovogField = rs1.getString("ovog");
	 	String nerField = rs1.getString("ner");
        //int ocodeField = rs1.getInt("idburtgel");
        String regField = rs1.getString("register");
        //Date hugatsaaField = rs.getDate("hugatsaa");	
        String haygField = rs1.getString("gerHayg");
        String uragField = rs1.getString("urgiinOvog");
        searchResultModel.addRow(new Object[]{ovogField ,nerField ,regField, haygField, uragField});
        }
    }catch(Exception ex) {System.out.print(username);}
    
		
	}
	

	
	
	

public void setMainUsername1(String username) {

		
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

