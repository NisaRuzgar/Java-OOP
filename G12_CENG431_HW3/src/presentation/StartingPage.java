package presentation;
import business.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class StartingPage {

	

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public StartingPage() {
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<User> onlineUsers = new ArrayList<User>();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingPage window = new StartingPage(users);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartingPage(ArrayList<User> users) {
		initialize(users);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<User> users) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE IZTECHIFY");
		lblWelcomeToThe.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lblWelcomeToThe.setForeground(Color.RED);
		lblWelcomeToThe.setBackground(new Color(255, 0, 0));
		lblWelcomeToThe.setBounds(80, 23, 265, 75);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnLogin = new JButton("LOG-IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	frame.dispose();
				Log_in_Page logPage = new Log_in_Page(users);
				logPage.setVisible(true);	
			}
		});
		btnLogin.setBounds(221, 138, 107, 40);
		frame.getContentPane().add(btnLogin);
		
		JButton btnEnroll = new JButton("ENROLL");
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnrollPage enrollPage = new EnrollPage(users);
				enrollPage.setVisible(true);
			}
		});
		
	
		btnEnroll.setBounds(80, 138, 107, 40);
		frame.getContentPane().add(btnEnroll);
	}
	

	

	
}
