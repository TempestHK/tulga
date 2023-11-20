package surburt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class AdminPass extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					amdinORsuragch frame = new amdinORsuragch();
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
	public AdminPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 376, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBounds(46, 42, 234, 53);
		contentPane.add(panel_4);
		
		passwordField = new JPasswordField("");
		passwordField.setBounds(10, 11, 211, 32);
		panel_4.add(passwordField);
		
		
		JLabel lblNewLabel_1_1_3 = new JLabel("admin pass*");
		lblNewLabel_1_1_3.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3.setBounds(46, 17, 74, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(297, 52, 25, 32);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("нэвтрэх");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(46, 106, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgel burgel = new burgel();
				burgel.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("буцах");
		btnNewButton_1.setBounds(181, 106, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amdinORsuragch amdinORsuragch = new amdinORsuragch();
				amdinORsuragch.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton_1);
		
	
	}
}
