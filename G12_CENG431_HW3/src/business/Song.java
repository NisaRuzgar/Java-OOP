package business;

public class Song {
	private String title;
	private String length;
	private Album album;
	private Musician musician;
	
	public Song(String songName, String length, Album album, Musician musician) {
		setSongName(songName);
		setLength(length);
		this.setAlbum(album);
		this.setMusician(musician);
	}
	
	public String getSongName() {
		return title;
	}

	public void setSongName(String songName) {
		this.title = songName;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Musician getMusician() {
		return musician;
	}

	public void setMusician(Musician musician) {
		this.musician = musician;
	}
}
