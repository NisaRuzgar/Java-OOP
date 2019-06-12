package business;
import java.util.ArrayList;

public class Musician extends Person{
	private ArrayList<Album> albums;
	
	public Musician(String name) {
		super(name);
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);  // check if already added
	}
	
	public void removeAlbum(Album album) {
		
		albums.remove(album);
	}

	public void removeName(String name) {
		// TODO Auto-generated method stub
		
	}
}
