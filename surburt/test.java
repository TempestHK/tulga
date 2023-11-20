package surburt;

public class test {
	
	JButton btnNewButton = new JButton("Нэвтрэх");
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
                    Class.forName("com.mysql.jdbc.Driver");

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
                    pst = con.prepareStatement("SELECT * FROM oyutan WHERE ner = ? AND nuuts_ug = ?");
                    pst.setString(1, username);
                    pst.setString(2, Spassword);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                    	Main mn  = new Main();
                    	
                    	dispose();
        	        
                        mn.setVisible(true); // Show the Main window
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
}
