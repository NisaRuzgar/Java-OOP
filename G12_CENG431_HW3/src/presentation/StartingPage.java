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



import java.lang.reflect.Array;

public class StartingPage {

	private ArrayList<User> users = new ArrayList<User>();
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingPage window = new StartingPage();
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
	public StartingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		User u1 = new User("a", "123");
		User u2 = new User("eda", "456");
		User u3 = new User("aslý", "789");
		u1.addFriend(u2);
		
		u2.addFriend(u3);
		PlayList pl1 = new PlayList("rocksarkýlarý");
		Musician m = new Musician("pink floyd");
		Album alb = new Album("darkside", "iyii ", m);
		Song s1 = new Song("time", "15",alb,m );
		Song s2 = new Song("wall", "15",alb,m );
		pl1.addSongToPlayList(s1);
		pl1.addSongToPlayList(s2);
		PlayList pl2 = new PlayList("popsarkýlarým");
		
		u1.addPlayList(pl1);
		u1.addPlayList(pl2);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		
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
