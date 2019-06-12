package business;
import java.util.ArrayList;
import java.util.Iterator;

public class PlayList {
	private String name;
	private ArrayList<Song> songs;
	
	public PlayList(String name) {
		setNameOfPlayList(name);
		songs = new ArrayList<Song>();
	}

	public String getNameOfPlayList() {
		return name;
	}

	public void setNameOfPlayList(String name) {
		this.name = name;
	}
	
	public ArrayList<Song> getSongsOfThePlayList() {
		return songs;
	}

	public void addSongToPlayList(Song song) {              
		Iterator<Song> iter = songs.iterator();
		while(iter.hasNext()) {
			Song s = iter.next();
			if(s.equals(song)) {
			// if already added throw exception
			}
		}
		songs.add(song);
	}
	
	public void removeSongFromPlayList(Song song) {  
		Iterator<Song> iter = songs.iterator();
		while(iter.hasNext()) {
			Song s = iter.next();
			System.out.println(s);
			if(s.equals(song)) {
				songs.remove(s);
			}
		}
	}
	
	
	
	
	
}


