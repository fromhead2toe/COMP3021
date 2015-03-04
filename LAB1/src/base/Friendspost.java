package base;
import java.util.Date;

public class Friendspost extends Post {

	private User friend;

	public Friendspost(Date x,String y, User z){
		super(x,y);
      friend = z;
	}
	
	public String toString(){
		return (friend.toString() +"\n"+ super.toString());
	}

}
