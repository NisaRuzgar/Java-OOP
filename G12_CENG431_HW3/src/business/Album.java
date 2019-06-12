package business;
import java.util.ArrayList;
import java.util.Iterator;

public class Album {
	private String title;
	private String description;
	private Musician musician;
	private ArrayList<Song> songs;
	
	
	public Album(String albumTitle, String desc, Musician musician) {
		setAlbumTitle(albumTitle);
		setDescription(desc);
		setMusician(musician);
		songs = new ArrayList<Song>();
	}

	public String getAlbumTitle() {
		return title;
	}

	public void setAlbumTitle(String albumTitle) {
		this.title = albumTitle;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void addSongsToAlbum(Song song) {
		songs.add(song);  //check if already added
	}
	
	public void removeSongsFromAlbum(Song song) {
		Iterator<Song> iter = songs.iterator();
		while(iter.hasNext()) {
			Song s = iter.next();
			if(s.equals(song)) {
				songs.remove(s);
			}
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Musician getMusician() {
		return musician;
	}

	public void setMusician(Musician musician) {
		this.musician = musician;
	}

	public void removeAlbum(String albumTitle, Musician musician2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
