package base;
import java.util.Date;

public class friendspost extends post {

	private user friend;

	public friendspost(Date x,String y, user z){
		super(x,y);
      friend = z;
	}
	
	public String toString(){
		return (friend.toString() +"\n"+ super.toString());
	}

}
