package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.PlayList;
import business.Song;
import business.User;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewSongs extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public ViewSongs(User user, PlayList playList) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayListName = new JLabel(playList.getNameOfPlayList());
		lblPlayListName.setBounds(22, 13, 165, 22);
		contentPane.add(lblPlayListName);
		
		JButton button = new JButton("Remove");
		button.setBounds(244, 41, 91, 25);
		contentPane.add(button);
		

		textField = new JTextField();
		textField.setBounds(116, 114, 128, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(304, 143, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 143, 128, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(116, 178, 252, 65);
		contentPane.add(textPane);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(22, 41, 196, 25);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Songs");
		for(Song s : playList.getSongsOfThePlayList()) {
			comboBox_1.addItem(s.getSongName());
		}
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String songName = (String) comboBox_1.getSelectedItem();
				int index = comboBox_1.getSelectedIndex();
				Song theSong = null;
				
				for(Song s: playList.getSongsOfThePlayList()) {
					if(s.getSongName().equals(songName)) {
						System.out.println("eeeeeeee");
						theSong = s;
					}
				}
				textField.setText(theSong.getMusician().getName());
				textField_1.setText(theSong.getLength());
				textField_2.setText(theSong.getAlbum().getAlbumTitle() );
				textPane.setText(theSong.getAlbum().getDescription());
			}
		});

		
		
		JLabel lblMusicianName = new JLabel("Musician Name:");
		lblMusicianName.setBounds(22, 117, 91, 16);
		contentPane.add(lblMusicianName);
		
		JLabel lblAlbumName = new JLabel("Album Name:");
		lblAlbumName.setBounds(22, 146, 79, 16);
		contentPane.add(lblAlbumName);
		
		JLabel lblLength = new JLabel("length:");
		lblLength.setBounds(330, 117, 46, 16);
		contentPane.add(lblLength);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(22, 193, 91, 16);
		contentPane.add(lblDescription);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 79, 196, 25);
		contentPane.add(comboBox);
		comboBox.addItem("AddSong");
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(244, 79, 91, 25);
		contentPane.add(btnAdd);
		
		
		
		

	}
}
