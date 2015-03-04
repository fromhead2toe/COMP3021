package base;

import java.util.ArrayList;

public class Blog {
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user, ArrayList<Post> allPosts) {
		this.user = user;
		this.allPosts = allPosts;
	}

	public Blog(User user) {
		this.user = user;
		allPosts = new ArrayList<Post>();
		}

	
	public void setUser(User user){
		this.user = user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void post(Post p){
		this.allPosts.add(p);
		System.out.println("A new post");
		System.out.println(p);
	}
	
	public void list(){
		if (this.allPosts.isEmpty() == false){
			System.out.println("Current Posts:");
			for (int i=0;i<this.allPosts.size();i++){
				System.out.println("Post[" + i + "]:"+ this.allPosts.get(i));
			}
		}
		else{
			System.out.println("you no post");
		}
 	}
	
	public void delete(int index){
		if( (index >= 0) && (index < this.allPosts.size()) ){
		this.allPosts.remove(index);
		}
		else{
			System.out.println("illegal index");
		}
	}
	
	public String toString(){
		return(this.user.toString() + "number of posts user has: "+allPosts.size());
	}
	public boolean equals(Object o){
		return false;
	}
	public int hashCode(){
		return 0;
	}
}
