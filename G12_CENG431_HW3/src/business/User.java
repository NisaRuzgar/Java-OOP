package business;
import java.util.ArrayList;
import java.util.Iterator;

public class User extends Person{
	
	private ArrayList<PlayList> playLists;
	private ArrayList<User> friendList;
	private String password;
	
	public User(String name, String password) {
		super(name);
		playLists = new ArrayList<PlayList>();
		friendList = new ArrayList<User>();
		this.password = password;
	}
	

	public ArrayList<PlayList> getPlayLists(){
		return playLists;
	}
	public void addPlayList(PlayList pl) {
		playLists.add(pl);
	}
	public void createPlayList(String name) {
		PlayList playList = new PlayList(name);
		playLists.add(playList);
	}
	public void deletePlayList(PlayList pl) {
		for(PlayList plst : playLists) {
			if(plst.equals(pl)) {
				playLists.remove(pl);
			}
		}
		
	}
	public void addSongToPlayList(Song song, PlayList playList) {
		playList.addSongToPlayList(song);
	}
	
	public void removeSongFromPlayList(Song song, PlayList playList) {
		playList.removeSongFromPlayList(song);
	}
	
	public ArrayList<User> getFriendList() {
		return friendList;
	}

	public void addFriend(User friend) {  
		for(User u: friendList) {
			if(u.getName().equals(friend.getName())) {
				///already added throw exception
			}
		}
		friendList.add(friend);
		friend.friendList.add(this);   // d�zelt    �al���r m�??
	}
	
	public void deleteFriend(User friend) {
		Iterator<User> iter = friendList.iterator();
		while(iter.hasNext()) {
			User u = iter.next();
			if(u.equals(friend)) {
				friendList.remove(u);
				friend.friendList.remove(this);  /// d�zelt
			}
		}
	}
	
	public ArrayList<PlayList> getFriendsPlayLists(User friend) {
		for(User f: friendList) {
			if(f.equals(friend)) {
				return f.getPlayLists();
			}
		}
		return null;   ///exception?
	}
	
	public boolean doPasswordsMatch(char[] passw) {    ////char arrayi
		if(password.equals(passw)) {
			return true;
		}
		return false;
	}


}
