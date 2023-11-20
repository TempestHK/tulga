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
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;

public class amdinORsuragch extends JFrame {

	private JPanel contentPane;

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
	public amdinORsuragch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("admin*");
		lblNewLabel_1_1_3.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3.setBounds(100, 27, 54, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton = new JButton("admin");
		btnNewButton.setIcon(new ImageIcon(amdinORsuragch.class.getResource("/picture/bagsh.jpg")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPass AdminPass = new AdminPass();
				AdminPass.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(50, 66, 158, 167);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("student*");
		lblNewLabel_1_1_3_1.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3_1.setBounds(307, 25, 54, 14);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4.setBounds(31, 52, 200, 198);
		contentPane.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_4_1.setBounds(253, 50, 200, 198);
		contentPane.add(panel_4_1);
		
		JButton btnNewButton_1 = new JButton("suragch");
		btnNewButton_1.setBounds(20, 15, 158, 167);
		panel_4_1.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(amdinORsuragch.class.getResource("/picture/student.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_burgel S_burgel= new S_burgel();
				S_burgel.setVisible(true);
				dispose();
				
			}
		});
		
	
	}
}
