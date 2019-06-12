package presentation;
import business.*;
import presentation.StartingPage;/////////////////////////////
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EnrollPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public EnrollPage(ArrayList<User> users) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnrollPage = new JLabel("ENROLLMENT PAGE");
		lblEnrollPage.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnrollPage.setForeground(Color.BLUE);
		lblEnrollPage.setBounds(115, 30, 190, 29);
		contentPane.add(lblEnrollPage);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterYourName.setBounds(30, 90, 150, 30);
		contentPane.add(lblEnterYourName);
		
		JLabel lblEnterYourPassword = new JLabel("Enter Your Password:");
		lblEnterYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterYourPassword.setBounds(30, 150, 150, 30);
		contentPane.add(lblEnterYourPassword);
		
		textField = new JTextField();
		textField.setBounds(225, 90, 180, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 150, 180, 30);
		contentPane.add(passwordField);
		
		
		JButton btnEnroll = new JButton("ENROLL");
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User u = new User(textField.getText(), passwordField.getPassword());   ///getPassword takes password as char[]
			
				System.out.println(u.getName());
				users.add(u);
			
				
				contentPane.setVisible(false);
				Log_in_Page logInPage = new Log_in_Page(users);
				logInPage.setVisible(true);		
			}
		});
		btnEnroll.setBounds(130, 200, 110, 40);
		contentPane.add(btnEnroll);
	}
}
