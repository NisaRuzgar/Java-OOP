package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Album;
import business.Musician;
import business.PlayList;
import business.Song;
import business.User;
import dataAccess.JSONRead;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	static JSONRead jsonRead;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage(null);
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
	public AdminPage(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminName = new JLabel(user.getName());
		lblAdminName.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblAdminName.setBounds(22, 13, 165, 22);
		contentPane.add(lblAdminName);
		
		JLabel lblMakeChange = new JLabel("Make change on: ");
		lblMakeChange.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblMakeChange.setBounds(22, 45, 165, 22);
		contentPane.add(lblMakeChange);
		
		ArrayList<Song> songs=jsonRead.getSongs();
		JComboBox comboBoxSong = new JComboBox();
		comboBoxSong.addItem("Songs");
		comboBoxSong.setBounds(22, 80, 196, 25);
		contentPane.add(comboBoxSong);
		for(Song song : songs) {
			comboBoxSong.addItem(song.getSongName());
		}
		
		JButton btnAddSong = new JButton("Add");
		btnAddSong.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnAddSong.setBounds(244, 80, 79, 25);
		contentPane.add(btnAddSong);
		btnAddSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				SongAdd addSong = new SongAdd();
				addSong.setVisible(true);			
			}
		});
		
		JButton btnRemoveSong = new JButton("Remove");
		btnRemoveSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String songRmvd = (String)comboBoxSong.getSelectedItem();
				int index = comboBoxSong.getSelectedIndex();
				
				for(Song song : songs) {
					if(song.equals(songRmvd)) {
						Album albumSongRm = song.getAlbum();
						albumSongRm.removeSongsFromAlbum(song);
						comboBoxSong.removeItemAt(index);
					}
				}
			}
		});
		btnRemoveSong.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnRemoveSong.setBounds(325, 80, 90, 25);
		contentPane.add(btnRemoveSong);
		
		ArrayList<Album> albums=jsonRead.getAlbum();
		JComboBox comboBoxAlbum = new JComboBox();
		comboBoxAlbum.addItem("Albums");
		comboBoxAlbum.setBounds(22, 120, 196, 25);
		contentPane.add(comboBoxAlbum);
		for(Album album : albums) {
			comboBoxAlbum.addItem(album.getAlbumTitle());
		}
		
		JButton btnAddAlbum = new JButton("Add");
		btnAddAlbum.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnAddAlbum.setBounds(244, 120, 79, 25);
		contentPane.add(btnAddAlbum);
		
		JButton btnRemoveAlbum = new JButton("Remove");
		btnRemoveAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String albumRmvd = (String)comboBoxAlbum.getSelectedItem();
				int index = comboBoxAlbum.getSelectedIndex();
								
				for(Album album : albums) {
					if(album.equals(albumRmvd)) {
						Musician musicianAlbRm = album.getMusician();
						musicianAlbRm.removeAlbum(album);
						comboBoxAlbum.removeItemAt(index);
					}
				}
			}
		});
		btnRemoveAlbum.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnRemoveAlbum.setBounds(325, 120, 90, 25);
		contentPane.add(btnRemoveAlbum);
		
		ArrayList<Musician> musicians=jsonRead.getMusician();
		JComboBox comboBoxMusician = new JComboBox();
		comboBoxMusician.addItem("Musicians");
		comboBoxMusician.setBounds(22, 160, 196, 25);
		contentPane.add(comboBoxMusician);
		for(Musician musician : musicians) {
			comboBoxMusician.addItem(musician.getName());
		}
		
		JButton btnAddMusician = new JButton("Add");
		btnAddMusician.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnAddMusician.setBounds(244, 160, 79, 25);
		contentPane.add(btnAddMusician);
		
		JButton btnRemoveMusician = new JButton("Remove");
		btnRemoveMusician.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String musicianRmvd = (String)comboBoxMusician.getSelectedItem();
				int index = comboBoxMusician.getSelectedIndex();
				
				for(Musician musician : musicians) {
					if(musician.equals(musicianRmvd)) {
						musician.removeName(musician.getName());
						comboBoxMusician.removeItemAt(index);
					}
				}
			}
		});
		btnRemoveMusician.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnRemoveMusician.setBounds(325, 160, 90, 25);
		contentPane.add(btnRemoveMusician);
		
		
	}

}
