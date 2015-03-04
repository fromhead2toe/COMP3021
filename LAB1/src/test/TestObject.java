package test;
import java.util.Date;
import java.io.*;
import base.*;
public class TestObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(1,"comp3021","comp3021@cse.ust.hk");
		Blog myblog = new Blog(u);
		Date date = new Date();
		String content = null;
		Friendspost pff = new Friendspost(date,content,u);
		
		System.out.println(pff);
		System.out.println(pff.contains("first"));
		System.out.println(pff.contains("HKUST"));
		System.out.println(pff.contains("HKUST"));
	}

}
