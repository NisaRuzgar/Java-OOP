package presentation;
import business.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_in_Page extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passw;



	/**
	 * Create the frame.
	 */
	public Log_in_Page(ArrayList<User> users) {
		
		ArrayList<User> onlineUsers = new ArrayList<User>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("LOG-IN PAGE");
		lblLoginPage.setForeground(Color.BLUE);
		lblLoginPage.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLoginPage.setBounds(115, 30, 154, 31);
		contentPane.add(lblLoginPage);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(30, 90, 150, 30);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(30, 150, 150, 30);
		contentPane.add(lblPassword);
		
		userName = new JTextField();
		userName.setColumns(10);
		userName.setBounds(225, 90, 180, 30);
		contentPane.add(userName);
		
		passw = new JPasswordField();
		passw.setBounds(225, 150, 180, 30);
		contentPane.add(passw);
		
		JButton btnLogin = new JButton("LOG-IN");
		
		 
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User onlineUser;
				//userList(users);
				for(User u : users) {
					
					 if(u.getName().equals(userName.getText()) && u.doPasswordsMatch(passw.getPassword())) {
						  System.out.println("yea");
						  onlineUser= new User(userName.getText(),passw.getPassword());
						  onlineUsers.add(u);
						  if(u.getName() == "admin") {    
							    contentPane.setVisible(false);
								AdminPage adminP = new AdminPage(u);
								adminP.setVisible(true);	
						  }else {
							    contentPane.setVisible(false);
								UserPage userPage = new UserPage(users , u );
								userPage.setVisible(true);	
						  }
						  
					  } else if(userName.getText().equals("") && (passw.getPassword().length==0)){
				            JOptionPane.showMessageDialog(null,"Please insert Username and Password");
			          }else {

			              JOptionPane.showMessageDialog(null,"Wrong Username / Password");
			              
			            }
					
					
					
				}
								
		
				
			}
		});
		btnLogin.setBounds(110, 200, 110, 40);
		contentPane.add(btnLogin);
	}

	public void userList(ArrayList<User> users) {
		for (User u:users) {
			System.out.println(u.getName());
			if (u.password==split("admin123")) {
				System.out.println("Ok");
			}
		}
	}

	private char[] split(String smt) {
		// TODO Auto-generated method stub	
		return smt.toCharArray();
	}
}
