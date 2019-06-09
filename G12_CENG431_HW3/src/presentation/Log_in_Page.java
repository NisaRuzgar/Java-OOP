package presentation;
import business.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_in_Page extends JFrame {
	private ArrayList<User> onlineUsers = new ArrayList<User>();
	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passw;



	/**
	 * Create the frame.
	 */
	public Log_in_Page(ArrayList<User> users) {
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
				for(User u : users) {
					if(u.getName().equals(userName.getText())) {
						//if(u.doPasswordsMatch(passw.getPassword())) {
							System.out.println("yea");
							//yeni user page oluþtur bu sayfayý kapa onu visible yap
							contentPane.setVisible(false);
							UserPage up = new UserPage(users, u);
							up.setVisible(true);
							
					//	}
					//	else {
							//hata sayfasý çýkar
						//}
					}
				}
				
			}
		});
		btnLogin.setBounds(110, 200, 110, 40);
		contentPane.add(btnLogin);
	}

}
