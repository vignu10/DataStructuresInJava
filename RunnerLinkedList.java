package dataStructuresInJava;

public class RunnerLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList list=new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(23);
        list.insertAtBeginning(10);
        list.insertAtBeginning(510293);
        
        list.show();
	}

}

 class LinkedList{
	 
	  Node head;
	
	 
	 public void insertAtBeginning(int data)
	 {
		 Node node=new Node();
		 node.data=data;		
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node n=head;
			 while(n.next!=null)
			 {
				 n=n.next;
			 }
			 n.next=node;
		 }
		 
	 }
	 
	 
 
 public void show()
 {
	Node node=head;
	while(node.next!=null)
	{
		System.out.print(node.data+" ");
		node=node.next;
	}
	System.out.print(node.data);
 }
 
 
 class Node{
	 int data;
	 Node next; 
 }
 }
 
 