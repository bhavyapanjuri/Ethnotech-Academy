// Create a java program for social media feed navigation.Implement a free scrolling for next post,previous post,delete post,insert sponsor post.
class Node
{
	String post;
	Node prev,next;
	
	Node(String post)
	{
		this.post=post;
		}
}
public class SocialMediaFeed
{
	public static void main(String args[])
	{
		Node p1 = new Node("post 1");
		Node p2 = new Node("post 2");
		Node p3 = new Node("post 3");
	p1.next = p2;
	p2.prev = p1;
	p2.next = p3;
	p3.prev = p2;
	
	Node current = p1;
	System.out.println("Current post:" + current.post);
	
	current = current.next;
	System.out.println("Next Post:" + current.post);
	
	current = current.prev;
	System.out.println("Previous Post:"+ current.post);
	
	Node sponsor = new Node("Sponsored Post");
	sponsor.next = p1;
	p1.prev = sponsor;
	p1 = sponsor;
	System.out.println("Inserted:" + p1.post);
	
	p2.prev.next = p2.next;
	p2.next.prev = p2.prev;
	
	System.out.println("post 2 Deleted");
	}
}

