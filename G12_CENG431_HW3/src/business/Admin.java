package business;
///OBSERVER CLASS

public class Admin extends Person implements Observer{
	
	private Observable observable;   
	private char[] password;
	
	public Admin(Observable observable, String name, char[] password) {
		super(name);
		this.observable = observable;
		this.password = password;
	//	this.observable.attach(this);    
	}

	public boolean doPasswordsMatch(char[] passw) {    ////char arrayi
		if(password.equals(passw)) {
			return true;
		}
		return false;
	}

	@Override
	public void removeSongFromIztechify(Song song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editSong(Song song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewAlbumToIztechify(Album album, Musician musician) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAlbumFromIztechify(Album album) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editAlbum(Album album) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewMusicianToIztechify(Musician musician) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMusicianFromIztechify(Musician musician) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editMusician(Musician musician) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateIztechify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewSongToIztechify(Song song, Album album, Musician musician) {
		// TODO Auto-generated method stub
		
	}
}
