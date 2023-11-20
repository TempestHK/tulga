package surburt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.sql.*;

public class burgel extends JFrame {

	private static final long IL = 0;
	private static final long serialVersionUID = IL;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField name;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton burtguuleh;
	private JPasswordField pass;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					burgel frame = new burgel();
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
	public burgel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setText("ШИНЭ МОНГОЛ \r\n");
		lblNewLabel_1.setBounds(209, 104, 201, 38);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(burgel.class.getResource("/picture/nmct 1 (1).png")));
		lblNewLabel_2.setBounds(124, 104, 75, 85);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("ТЕХНОЛОГИЙН КОЛЛЕЖ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(209, 127, 219, 32);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("СУРАГЧИЙН БҮРТГЭЛИЙН ");
		lblNewLabel_4.setBounds(209, 145, 163, 32);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
		
		burtguuleh = new JButton("бүртгүүлэх");
		burtguuleh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	NewBurtgel2 NewBurtgel2 = new NewBurtgel2();
            	NewBurtgel2.setVisible(true);
            }
        });
		
		
		
		burtguuleh.setFont(new Font("Tahoma", Font.PLAIN, 7));
		burtguuleh.setBackground(new Color(255, 255, 255));
		burtguuleh.setBounds(172, 308, 75, 14);
		contentPane.add(burtguuleh);
		
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(UIManager.getBorder("Button.border"));
		panel.setBounds(525, 0, 349, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 339, 464);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(burgel.class.getResource("/picture/sur1 1 (1).jpg")));
		
		
		lblNewLabel_5 = new JLabel("нэр*");
		lblNewLabel_5.setFont(new Font("Sitka Display", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(172, 200, 58, 14);
		contentPane.add(lblNewLabel_5);
		
		name = new JTextField("");
		name.setBounds(172, 217, 211, 32);
		contentPane.add(name);
		name.setColumns(10);
		
		
		
		lblNewLabel_6 = new JLabel("нууц уг*");
		lblNewLabel_6.setFont(new Font("Sitka Display", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(172, 255, 58, 14);
		contentPane.add(lblNewLabel_6);
		
		pass = new JPasswordField("");
		pass.setBounds(172, 272, 211, 32);
		contentPane.add(pass);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(389, 272, 25, 32);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxNewCheckBox.isSelected()) {
		            // Checkbox is selected, so show the password (set echo char to 0)
		            pass.setEchoChar((char) 0);
		        } else {
		            // Checkbox is not selected, so hide the password (set echo char to '*')
		            pass.setEchoChar('*');
		        }
		    }
		});
		

		JButton btnNewButton = new JButton("нэвтрэх");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		    	Connection con;
	            PreparedStatement pst;
	            ResultSet rs;
			
						try {
						
							
							String username = name.getText();
							
		                    @SuppressWarnings("deprecation")
							String Spassword = pass.getText();
							
							 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
			                    pst = con.prepareStatement("SELECT * FROM oyutan WHERE ner = ? AND nuuts_ug = ?");
			                    pst.setString(1, username);
			                    pst.setString(2, Spassword);
			                    rs = pst.executeQuery();
							
			                    
							if (rs.next()) {
								
								
								JOptionPane.showMessageDialog(null, "амжилттай нэвтэрлээ...");
								main main = new main();
								main.setMainUsername(username);
								main.setVisible(true);
								
								
								
								
								dispose();
								
							}else 
								JOptionPane.showMessageDialog(null, "нууц үг эсвэл нэр буруу байна...");
							con.close();
							}catch(Exception ex) {System.out.print(ex);}
					        	
					  
		    	
		    }
		});

			
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(225, 342, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}

