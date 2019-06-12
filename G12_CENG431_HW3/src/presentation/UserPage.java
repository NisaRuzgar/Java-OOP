package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.PlayList;
import business.User;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;

	/**
	 * Create the frame.
	 */
	public UserPage(ArrayList<User> users, User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(user.getName());
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 13, 180, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox playListComboBox = new JComboBox();
		playListComboBox.addItem("My Play Lists");
		for(PlayList pl : user.getPlayLists()) {
			playListComboBox.addItem(pl.getNameOfPlayList());
		}
		playListComboBox.setBounds(12, 49, 187, 30);
		contentPane.add(playListComboBox);
		
		JComboBox friendsComboBox = new JComboBox();
		friendsComboBox.addItem("My Friends");
		friendsComboBox.setBounds(12, 156, 187, 30);
		contentPane.add(friendsComboBox);
		for(User friend : user.getFriendList()) {
			friendsComboBox.addItem(friend.getName());
		}
		
		
		JComboBox addFriendComboBox = new JComboBox();
		addFriendComboBox.setBounds(12, 199, 187, 30);
		contentPane.add(addFriendComboBox);
		addFriendComboBox.addItem("Add a new friend");
		
		for(User frnd: users) {
			if( ! (frnd.equals(user) || user.getFriendList().contains(frnd)) ) {
				addFriendComboBox.addItem(frnd.getName());
			}
		}
		
		
		
		JButton btnRemovePL = new JButton("Remove");
		btnRemovePL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playlstRmvd = (String) playListComboBox.getSelectedItem();
				int index = playListComboBox.getSelectedIndex();
				
				for(PlayList pl : user.getPlayLists()) {
					if(pl.getNameOfPlayList().equals(playlstRmvd)) {
						user.deletePlayList(pl);
						playListComboBox.removeItemAt(index);
					}
				}
			}
		});
		btnRemovePL.setBounds(211, 52, 88, 25);
		contentPane.add(btnRemovePL);
		
		JButton btnViewSongs = new JButton("View Songs");
		btnViewSongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String playlstRmvd = (String) playListComboBox.getSelectedItem();
				int index = playListComboBox.getSelectedIndex();
				
				
				PlayList thePlayList = null;
				for(PlayList plt: user.getPlayLists()) {
					if(plt.getNameOfPlayList().equals(playlstRmvd))
						thePlayList = plt;
				}
				System.out.println(thePlayList.getNameOfPlayList());
				contentPane.setVisible(false);
				ViewSongs wS = new ViewSongs(user, thePlayList );
				wS.setVisible(true);
				
				
			}
		});
		btnViewSongs.setBounds(311, 52, 109, 25);
		contentPane.add(btnViewSongs);
		
		JLabel lblAddANew = new JLabel("Add a new play list");
		lblAddANew.setBounds(12, 92, 137, 25);
		contentPane.add(lblAddANew);
		
		txtEnterName = new JTextField();
		txtEnterName.setText("enter name");
		txtEnterName.setBounds(130, 93, 153, 22);
		contentPane.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayList newPl = new PlayList(txtEnterName.getText());
				playListComboBox.addItem(newPl.getNameOfPlayList());   //check if added before
			}
		});
		btnCreate.setBounds(311, 92, 107, 25);
		contentPane.add(btnCreate);
		
		JButton bttnRmvFriend = new JButton("Remove");
		bttnRmvFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				String friendName = (String) friendsComboBox.getSelectedItem();
				int index = friendsComboBox.getSelectedIndex();
				
				for(User friend : user.getFriendList()) {
					if(friend.getName().equals(friendName)) {
						user.deleteFriend(friend);
						friendsComboBox.removeItemAt(index);
					}
				}				
			}
		});
		bttnRmvFriend.setBounds(211, 159, 88, 25);
		contentPane.add(bttnRmvFriend);
		
		JButton btnViewFriend = new JButton("View Friend");
		btnViewFriend.setBounds(311, 159, 109, 25);
		contentPane.add(btnViewFriend);
		
		JButton btnAddFriend = new JButton("Add Friend");
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String friendAdded = (String) addFriendComboBox.getSelectedItem();
				int index = addFriendComboBox.getSelectedIndex();
				addFriendComboBox.removeItemAt(index);
				friendsComboBox.addItem(friendAdded);
				
				
				for(User friendAdd : users) {
					if(friendAdd.getName().equals(friendAdded)) {	
						user.addFriend(friendAdd);
					}
				}				
					
				
			}
		});
		btnAddFriend.setBounds(211, 202, 109, 25);
		contentPane.add(btnAddFriend);
	}
}
