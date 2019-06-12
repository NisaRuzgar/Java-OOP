package presentation;

import java.util.ArrayList;

import business.Album;
import business.User;
import dataAccess.JSONRead;

public class AppInit {
	static JSONRead jsonRead;
	public static void main(String[] args) {
		jsonRead=new JSONRead();
		ArrayList<User> users=new ArrayList<User>();
		ArrayList<Album> albums=jsonRead.getAlbum();
		StartingPage sPage=new StartingPage();
		for(User u:users) {
			System.out.println(u.getName());
			System.out.println("denemememeemmemme");
		}
	}
}
