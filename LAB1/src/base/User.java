package base;
public class User implements Comparable<User>{
	private long userID;
	private String userName;
	private String userEmail;
	
	public User(long ID, String Name, String Email){
		userID = ID;
		userName = Name;
		userEmail = Email;
	}
	
	public long getID(){
		return userID;
	}
	
	public void setID(long x){
		userID = x;
	}
	
	public String getEmail(){
		return userEmail;
	}
	
	public void setEmail(String x){
		userEmail = x;
	}
	public String getName(){
		return userName;
	}
	
	public void setName(String x){
		userName = x;
	}
	public String toString(){
		return ("User ["+ "useID="+userID + " " + "useName="+userName +" "+ "useEmail="+userEmail +" ]");
	}
	
	public boolean equals(Object o){
		boolean ans = true;
		
		if(o == null){
			ans = false;
		}
		
		else{
		
			if(this.getClass() != o.getClass()){
			ans = false;
			}
			else {
				User p = (User) o;
				if((this.userID != p.userID)||(this.userName != p.userName)||(this.userEmail != p.userEmail)){
					ans = false;
			}
		         }
		}
		
		return ans;
	}
	
	public int hashCode(){
		int hashCode = 0;
		hashCode = (int) userID +userName.hashCode()+userEmail.hashCode();
	    return hashCode;
	}
	
	@Override
	public int compareTo(User u){
		if(this.userID > u.userID ){
			return 1;
		}
		else if(this.userID < u.userID){
			return -1;
		}
		else{
		return 0;
		}
	}

	
}
