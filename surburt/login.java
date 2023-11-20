package surburt;


import java.awt.EventQueue;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;



public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JPasswordField pass;
	private JComboBox<String> utype;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	@SuppressWarnings({ })
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 2, 983, 200);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Нэвтрэх");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(217, 47, 337, 109);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(771, -21, 228, 269);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/guiapp/images/download.jpg")));
		
		name = new JTextField();
		name.setBounds(240, 308, 539, 50);
		contentPane.add(name);
		name.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(240, 404, 539, 50);
		contentPane.add(pass);
		
		JLabel lblNewLabel_1 = new JLabel("Хэрэглэгчийн нэр");
		lblNewLabel_1.setBounds(37, 304, 201, 50);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Нууц үг");
		lblNewLabel_2.setBounds(37, 400, 201, 50);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		utype = new JComboBox<>();
        utype.setBounds(809, 313, 110, 36);
        utype.setFont(new Font("Tahoma", Font.PLAIN, 15));
        utype.setModel(new DefaultComboBoxModel<>(new String[] {"Admin", "Student"}));
        contentPane.add(utype);
		
		JButton btnNewButton = new JButton("Нэвтрэх");
		btnNewButton.setBounds(117, 542, 178, 23);
	    btnNewButton.setBackground(Color.GREEN);
	    btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection con;
                PreparedStatement pst;
                ResultSet rs;
                try {
                    if (name.getText().isEmpty() || new String(pass.getPassword()).isEmpty()) {
                        JOptionPane.showMessageDialog(login.this, "Username or password is blank");
                    } else {
                        String username = name.getText();
                        @SuppressWarnings("deprecation")
                        String Spassword = pass.getText();
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String selectedUserType = (String) utype.getSelectedItem();

                        if ("Admin".equals(selectedUserType)) {
                        	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
 	                        pst = con.prepareStatement("SELECT * FROM oyutan WHERE ner = ? AND nuuts_ug = ?");
                            // ...
                        } else if ("Student".equals(selectedUserType)) {
                        	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
 	                        pst = con.prepareStatement("SELECT * FROM student WHERE ner = ? AND nuuts_ug = ?");
                        } else {
                            return;
                        }

                        pst.setString(1, username);
                        pst.setString(2, Spassword);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            if ("Admin".equals(selectedUserType)) {
                                // Perform admin-specific actions
                                // For example, open an admin dashboard
                              //  Main adminDashboard = new Main();
                              //  adminDashboard.setVisible(true);
                                dispose();
                            } else if ("Student".equals(selectedUserType)) {
                                // Perform student-specific actions
                                // For example, open a student dashboard
                             //   Student studentDashboard = new Student();
                             //   studentDashboard.setStudentUsername(username);
                             //   studentDashboard.setVisible(true);
                                dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(login.this, "Username or password do not match.");
                            name.setText("");
                            pass.setText("");
                            name.requestFocus();
                        }
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, e1);
                }
            }
        });




	    
	
				
				
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Шинэ хэрэглэгч");
		btnNewButton_1.setBounds(426, 542, 178, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newuser n = new newuser();
				n.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Цуцлах");
		btnNewButton_2.setBounds(721, 542, 178, 23);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
		        pass.setText("");
			}
		});
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_2);
		
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Нууц үг харах");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(809, 418, 174, 36);
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
		
	}
}