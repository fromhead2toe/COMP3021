package base;

import java.util.Date;


public class Post implements Comparable<Post> {
	private Date date;
	private String content;
/**
 * constructor
 * @param x
 * @param y
 */
	public Post(Date x,String y){
		date = x;
		content = y;
	}	

	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date x){
		date = x;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String x){
		content = x;
	}
	
	public String toString(){
		return (""+ date + "\n" + content);
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
				Post p = (Post) o;
				if((this.date != p.date)||(this.content != p.content)){
					ans = false;
			}
		         }
		}
		
		return ans;
	}
	/**
	 * 
	 */
	public int hashCode(){
		int hashCode = 0;
		hashCode = date.hashCode()+content.hashCode();
	    return hashCode;
	}
	
	/**
	 * 
	 */
	public boolean contains(String keyword){

	    return content.contains(keyword);
	}
	
	public int compareTo(Post p){
		return this.date.compareTo(p.date);
	}
	
}