package Javacolections_LinkedList;

//representation of double linked list
// create a node for double linked list
class Node{
	//We are creating a node which has a data, previous state, next state.
	String data;
	//previous state
	Node previous;
	//next state
	Node next;
	
	//Constructor
	Node(String data){
		this.data=data;
	}
	
	//initialize head and tail of the DLL
	Node head=null;
	Node tail=null;
	
	//Create new node by adding the previous node 
	public void addNewNode(String data) {
		
		//create new node by creating an object to the previous node
		Node newNode=new Node(data);
		
		//Check whether double linked list is empty or not\
		if(head==null) {
			//The new node is pointed by the head and tail
			head=newNode;
			tail=newNode;
			
			//it is also first-node --- null
			head.previous=null;
			tail.next=null;
		}
		//execute when the double linked list not empty.
		else {
			
			//the newly created node will be the last node
			tail.next=newNode;
			//The tail is pointing to second last node so the newly created node's
			//previous will be the pointer to the tail.
			newNode.previous=tail;
			//The newly created node will become new tail Because it is lasy node in the
			//DLL
			tail=newNode;
			//The newly created node will be the last node so tail's next will be null
			tail.next=null;
		}
	}
	//I need to show the data;
	public void show() {
		System.out.println();
		//Initialize a new node current that will point to the head
		Node current=head;
		//Check whether the DLL is empty or not
		if(head==null) {
			//Print a statement 
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of double linked list");
		//Iterate the DLL 
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}

public class Javacolections_DoublelinkedList {

	public static void main(String[] args) {
		//Create an object to DLL
		Node object=new Node("DLL");
		object.addNewNode("Sachin");
		object.addNewNode("Anil");
		object.addNewNode("TechLead");
		object.addNewNode("Technical");
		object.addNewNode("Trainer");
		object.addNewNode("Double");
		object.addNewNode("Linked");
		object.addNewNode("List");
		object.show();

	}
}