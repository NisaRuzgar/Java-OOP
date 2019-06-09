package business;

public interface Observer {
	
	public void addNewSongToIztechify(Song song, Album album, Musician musician);
	
	public void removeSongFromIztechify(Song song);
	
	public void editSong(Song song);
	
	
	public void addNewAlbumToIztechify(Album album, Musician musician);
	
	public void removeAlbumFromIztechify(Album album);
	
	public void editAlbum(Album album);
	
	
	
	public void addNewMusicianToIztechify(Musician musician);
	
	public void removeMusicianFromIztechify(Musician musician);
	
	public void editMusician(Musician musician);
	
	
	public void updateIztechify();
	
	
	
	}
