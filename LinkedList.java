class Node{
	int data;
	Node next;
}
public class LinkedList{
	public static void main(String[] args){
		Node n1=new Node();
		n1.data=10;
		Node n2=new Node();
		n2.data=20;
		Node n3=new Node();
		n3.data=30;
		n1.next=n2;
		n2.next=n3;
		Node  temp=n1;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}