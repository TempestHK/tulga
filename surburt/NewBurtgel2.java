package surburt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class NewBurtgel2 extends JFrame {

	private JPanel contentPane;
	private JTextField ner;
	private JTextField nuuts_ug;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBurtgel1 frame = new NewBurtgel1();
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
	public NewBurtgel2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 346, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Бүртгүүлэх");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 0, 138, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Сурагчийн мэдээлэл");
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblNewLabel_1.setBounds(43, 65, 148, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("хэрэглэгчийн нэр*");
		lblNewLabel_1_1_3.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3.setBounds(66, 90, 148, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("нууц уг*");
		lblNewLabel_1_1_4.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_4.setBounds(66, 145, 86, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		ner = new JTextField();
		ner.setColumns(10);
		ner.setBounds(66, 111, 182, 20);
		contentPane.add(ner);
		
		nuuts_ug = new JTextField();
		nuuts_ug.setColumns(10);
		nuuts_ug.setBounds(66, 170, 182, 20);
		contentPane.add(nuuts_ug);
		
		JButton btnNewButton = new JButton("үүсгэх");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

		    	Connection con;
	            PreparedStatement pst;
	            int rs=0;
			
						try {
						
							
							String S_ner = ner.getText();
		  
							String S_nuuts_ug = nuuts_ug.getText();
		                    
							
							 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
			                    pst = con.prepareStatement("INSERT INTO oyutan (ner, nuuts_ug ) VALUES (?, ? )");
			                    pst.setString(1, S_ner);
			                    pst.setString(2, S_nuuts_ug);
			                   
			                    rs = pst.executeUpdate();
							
						
							if (rs > 0)
								JOptionPane.showMessageDialog(null, "амжилттай бүртгэгдэллээ...");
								
							else 
								JOptionPane.showMessageDialog(null, "нууц үг эсвэл нэр буруу байна...");
							con.close();
							}catch(Exception ex) {System.out.print(ex);}
					        	System.out.print("good");
					  

				
			}
		});
		btnNewButton.setBounds(40, 248, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("буцах");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1-System.exit(0);
				// 2-burgel burgel = new burgel();
				//   burgel.setVisible(true);
				//NewBurtgel1 NewBurtgel1 = new NewBurtgel1();
				//contentPane.setVisible(false);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(156, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}
}
