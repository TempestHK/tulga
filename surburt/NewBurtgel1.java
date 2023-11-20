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
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class NewBurtgel1 extends JFrame {

	private JPanel contentPane;
	private JTextField ovog;
	private JTextField register;
	private JTextField ner;
	private JTextField urgiinOvog;
	private JTextField gerHayg;
	private JTextField oyutanID;

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
	public NewBurtgel1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 517, 321);
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
		lblNewLabel_1.setBounds(43, 62, 148, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("овог*");
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(43, 99, 86, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("РД*");
		lblNewLabel_1_1_1.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_1.setBounds(43, 142, 86, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("гэрийн хаяг*");
		lblNewLabel_1_1_2.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_2.setBounds(43, 186, 86, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("нэр*");
		lblNewLabel_1_1_3.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3.setBounds(214, 99, 86, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("ургийн овог*");
		lblNewLabel_1_1_4.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_4.setBounds(214, 142, 86, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		ovog = new JTextField();
		ovog.setBounds(43, 111, 148, 20);
		contentPane.add(ovog);
		ovog.setColumns(10);
		
		register = new JTextField();
		register.setColumns(10);
		register.setBounds(43, 155, 148, 20);
		contentPane.add(register);
		
		ner = new JTextField();
		ner.setColumns(10);
		ner.setBounds(214, 111, 148, 20);
		contentPane.add(ner);
		
		urgiinOvog = new JTextField();
		urgiinOvog.setColumns(10);
		urgiinOvog.setBounds(214, 155, 148, 20);
		contentPane.add(urgiinOvog);
		
		gerHayg = new JTextField();
		gerHayg.setColumns(10);
		gerHayg.setBounds(43, 199, 320, 28);
		contentPane.add(gerHayg);
		
		ImageIcon TSzurag = new ImageIcon("/picture/sur1 1 (1).jpg");
		JLabel tseejZurag = new JLabel("New label");
		tseejZurag.setIcon(TSzurag);
		tseejZurag.setBounds(395, 99, 89, 80);
		contentPane.add(tseejZurag);
		
		oyutanID = new JTextField();
		oyutanID.setColumns(10);
		oyutanID.setBounds(214, 57, 148, 20);
		contentPane.add(oyutanID);

		JButton btnNewButton_2 = new JButton("зургаа сонгох");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				
                JFileChooser fileChooser = new JFileChooser();
                //int result = fileChooser.showOpenDialog(null);
                int result = fileChooser.showSaveDialog(null);
                
                
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = new File( fileChooser.getSelectedFile().getAbsolutePath());
                    //ImageIcon image = new ImageIcon("selectedFile"); 
                    //tseejZurag.setIcon(image);
                   
                    
                    try {
                        // зураг гаргах	
                        Image selectedImage = ImageIO.read(selectedFile);
                        tseejZurag.setIcon(new ImageIcon(selectedImage));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "зураг оруулахад алдаа гарлаа.", "алдаа гарлаа", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
		});
		btnNewButton_2.setBounds(395, 202, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		
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
							//String S_code = oyutanID.getText();
							String S_ovog = ovog.getText();
		                    String S_register = register.getText();
		                    String S_gerHayg = gerHayg.getText();
		                    String S_urgiinOvog = urgiinOvog.getText();
		                    String S_tseejZurag = tseejZurag.getText();
		                    
							
							 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a4", "root", "Buuvii25");
			                    pst = con.prepareStatement("INSERT INTO oyutan (ner, ovog , register , gerHayg , urgiinOvog , image) VALUES (?,?, ? , ? , ? , ? , ?)");
			                    pst.setString(1, S_ner);
			                   // pst.setString(2, S_code);
			                    pst.setString(2, S_ovog);
			                    pst.setString(3, S_register);
			                    pst.setString(4, S_gerHayg);
			                    pst.setString(5, S_urgiinOvog);
			                    
			                    JFileChooser fileChooser = new JFileChooser();
			                    //int result = fileChooser.showOpenDialog(null);
			                    int result = fileChooser.showSaveDialog(null);
			                    File selectedFile = new File( fileChooser.getSelectedFile().getAbsolutePath());
			                    FileInputStream fis = new FileInputStream(selectedFile);
			                    
			                    //pst.setString(6, S_tseejZurag);
			                    pst.setBinaryStream(6, fis , fis.available());
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
				//System.exit(0);
				//nuurHuudas nuurHuudas = new nuurHuudas();
				//nuurHuudas.setVisible(true);
				//NewBurtgel1 NewBurtgel1 = new NewBurtgel1();
				//contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(156, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("цээж зураг*");
		lblNewLabel_1_1_5.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_5.setBounds(398, 77, 86, 14);
		contentPane.add(lblNewLabel_1_1_5);
		
		
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Code*");
		lblNewLabel_1_1_3_1.setFont(new Font("Sitka Display", Font.ITALIC, 15));
		lblNewLabel_1_1_3_1.setBounds(214, 34, 86, 14);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		
		
		
	}
}
