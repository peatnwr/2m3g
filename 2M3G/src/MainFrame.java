import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {

	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - - - Set Variable - - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	private JFrame frmMain;
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private String sql = "";
	private ResultSet result;
	private Connection connect;
	private Statement stment;

	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - Launch Application - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frmMain = new MainFrame();
					frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// ------------------------------ // ------------------------------ //
	// - - - - - - - - - - - Launch Application - - - - - - - - - - - - //
	// ------------------------------ // ------------------------------ //
	
	public MainFrame() {
		setBounds(600, 150, 450, 470);
		  
		setTitle("OCLight : Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Windows\\Desktop\\project aria\\2M3G\\icon\\icon_light.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		initialize();
	}

	// ------------------------------ // ----------------------------- //
	// - - - - - - - - - - - - - Create Object - - - - - - - - - - - - //
	// ------------------------------ // ----------------------------- //
	
	private void initialize() {

		// ------------------------------ // ----------------------------- //
		// - - - - - - - - - - - -  Create panelMain - - - - - - - - - - - //
		// ------------------------------ // ----------------------------- //

			JPanel panelMain = new JPanel();
			panelMain.setBackground(Color.DARK_GRAY);
			panelMain.setForeground(Color.DARK_GRAY);
			panelMain.setBounds(10, 10, 416, 413);
			getContentPane().add(panelMain);
			panelMain.setLayout(null);
			
			JLabel lblLogIn = new JLabel("Log In");
			lblLogIn.setBounds(0, 93, 416, 70);
			lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogIn.setForeground(Color.WHITE);
			lblLogIn.setFont(new Font("Tahoma", Font.PLAIN, 40));
			panelMain.add(lblLogIn);
			
			JLabel lblUsername = new JLabel("Username");
			lblUsername.setBounds(31, 173, 72, 25);
			lblUsername.setForeground(Color.WHITE);
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panelMain.add(lblUsername);
			
			JTextField tfUsername = new JTextField();
			tfUsername.setBounds(31, 196, 356, 25);
			panelMain.add(tfUsername);
			tfUsername.setColumns(10);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setBounds(31, 251, 67, 25);
			panelMain.add(lblPassword);
			
			pfPassword = new JPasswordField();
			pfPassword.setBounds(31, 274, 356, 25);
			panelMain.add(pfPassword);
			
			JButton btnLogIn = new JButton("Log In");
			btnLogIn.setBackground(Color.WHITE);
			btnLogIn.setForeground(Color.BLACK);
			btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnLogIn.setBounds(254, 345, 133, 25);
			panelMain.add(btnLogIn);
			
			JLabel Icon = new JLabel("");
			Icon.setHorizontalAlignment(SwingConstants.CENTER);
			Icon.setToolTipText("");
			Icon.setBounds(170, 10, 69, 96);
			Icon.setIcon(new ImageIcon("C:\\Users\\Windows\\Desktop\\project aria\\2M3G\\icon\\logo_light.png")); 
			panelMain.add(Icon);
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - addAction panelMain - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			tfUsername.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent Action_Enter1) {
					if (Action_Enter1.getKeyCode() == 10) {
						btnLogIn.doClick();
			}}});
			
			pfPassword.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent Action_Enter2) {
					if (Action_Enter2.getKeyCode() == 10) {
						btnLogIn.doClick();
			}}});
			
			btnLogIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						//run drivers
						connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
						//connect to localhost (database) 
						stment = connect.createStatement();
						//create statement to connect
						sql = "SELECT * FROM login where Username='"+tfUsername.getText()+"'AND Password='"+pfPassword.getText()+"'";
						//select username and password in database
						result = stment.executeQuery(sql);
						//read data in database to compiler
						if (result.next()) {
							JOptionPane.showMessageDialog(null, "Login Successfully");
							dispose();
							OCLight MainProgram = new OCLight();
							MainProgram.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "Your username or password is incorrect.");
						}
					} catch (ClassNotFoundException Classforname) {
						System.out.println(Classforname);
					} catch (SQLException ConnectErr) {	
						System.out.println(ConnectErr);
			}}});
			
			// ------------------------------ // ----------------------------- //
			// - - - - - - - - - - - - - Create panelFee - - - - - - - - - - - //
			// ------------------------------ // ----------------------------- //
			
			JPanel panelFree = new JPanel();
			panelFree.setBackground(Color.GRAY);
			panelFree.setBounds(0, 0, 436, 433);
			getContentPane().add(panelFree);
	}
}
