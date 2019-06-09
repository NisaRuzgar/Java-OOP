package presentation;
/*package presentation;

import java.awt.EventQueue;
import java.util.ArrayList;

import business.User;

public class App {
	static ArrayList<User> users = null;
	ArrayList<User> onlineUsers = null;
	
	public void add(User u) {
		users.add(u);
	}

	public static void main(String[] args) {
		
		User e = new User("dd", "www");
		
		
		add(e);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingPage window = new StartingPage(users);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}*/




import java.util.ArrayList;

public class Application
{
    static ArrayList<Integer> x = new ArrayList<Integer>();

    static void printSecondElement()
    {
        System.out.println(x.get(1));
    }

    public static void main(String args[])
    {     
         x.add(0);
         x.add(50);
         x.add(100);
         System.out.println(x);
         printSecondElement();
     }
}
