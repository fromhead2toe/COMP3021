package test;
import java.util.Date;
import base.user;
import base.friendspost;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u = new user(1,"comp3021","comp3021@cse.ust.hk");
		Date date = new Date();
		String content = "this is my first post";
		friendspost pff = new friendspost(date,content,u);
		
		System.out.println(pff);
		System.out.println(pff.contains("first"));
		System.out.println(pff.contains("HKUST"));
		System.out.println(pff.contains("HKUST"));
	}

}
