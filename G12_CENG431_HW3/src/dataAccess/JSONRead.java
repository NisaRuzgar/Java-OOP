package dataAccess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import business.Album;
import business.Musician;
import business.Song;

public class JSONRead{
	private static final String filePath = "generated.json";
	ArrayList<Album> albums;
	ArrayList<Musician> musicians;
	ArrayList<Song> songs;
	
	public JSONRead() {
		
		albums=new ArrayList<Album>();
		musicians=new ArrayList<Musician>();
		songs=new ArrayList<Song>();
		
		init(musicians,albums,songs);
	}
	public void init(ArrayList<Musician> musicians,ArrayList<Album> albums,ArrayList<Song> songs) {
		try {
			FileReader reader = new FileReader(filePath);

			JSONParser jsonParser = new JSONParser();
			JSONArray musicianArr = (JSONArray) jsonParser.parse(reader);
		
			Iterator itr = musicianArr.iterator();
			
			while (itr.hasNext()) {
				JSONObject innerObj = (JSONObject) itr.next();	
		        // getting musician name
		        String name = (String) innerObj.get("name");
		        System.out.println(name);
		        Musician musician = new Musician(name);
		        JSONArray albumsArr= (JSONArray) innerObj.get("albums");
		        Iterator itr1 = albumsArr.iterator();
	
				// take each value from the albums array separately
				while (itr1.hasNext()) {
					
					JSONObject innerObj1 = (JSONObject) itr1.next();
					System.out.println("Title: "+ innerObj1.get("title")); 
					System.out.println("Description" + innerObj1.get("description"));
					Album album = new Album((String)innerObj1.get("title"),(String)innerObj1.get("description"),musician);
					JSONArray songsArr= (JSONArray) innerObj1.get("songs");
				    Iterator itr2 = songsArr.iterator();
				     
				    while (itr2.hasNext()) {
				   	 
				     	JSONObject innerObj2 = (JSONObject) itr2.next();
						System.out.println("Title: "+ innerObj2.get("title")); 
						System.out.println("Length" + innerObj2.get("length"));
			            songs.add(new Song((String)innerObj2.get("title"),(String)innerObj2.get("length"), album, musician));
			            album.addSongsToAlbum(new Song((String)innerObj2.get("title"),(String)innerObj2.get("length"), album, musician));
				     }
				    musician.addAlbum(album);
				}
		        musicians.add(musician);
		    }
			
	
			}catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			} catch (ParseException ex) {
				ex.printStackTrace();
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
		}
	
	public ArrayList<Album> getAlbum(){	
		return this.albums;
	}
	
	public ArrayList<Song> getSongs(){	
		return this.songs;
	}
	public ArrayList<Musician> getMusician() {
		/*for(Musician m:musicians) {
			
		}*/
		return this.musicians;
	}
}