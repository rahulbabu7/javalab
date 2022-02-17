package lab21;
import java.util.*;

class DoublyLinkedList {    

    //A node class for doubly linked list

    class Node{  

        int item;  

        Node previous;  

        Node next;  

         public Node(int item) {  

            this.item = item;  

        }  

    }  

    //Initially, head and tail is set to null

    Node head, tail = null;  

   

    //add a node to the list  

    public void addNode(int item) {  

        //Create a new node  

        Node newNode = new Node(item);  

        //if list is empty, head and tail points to newNode  

        if(head == null) {  

            head = tail = newNode;  

            //head's previous will be null  

            head.previous = null;  

            //tail's next will be null  

            tail.next = null;  

        }  

        else {  

            //add newNode to the end of list. tail->next set to newNode  

            tail.next = newNode;  

            //newNode->previous set to tail  

            newNode.previous = tail;  

            //newNode becomes new tail  

            tail = newNode;  

            //tail's next point to null  

            tail.next = null;  

        }  

    }  

    public void deleteNodes() {

    	int x = head.item;

        head = head.next;

        System.out.println("Element "+x +" got deleted");

   }

//print all the nodes of doubly linked list  

    public void printNodes() {  

        //Node current will point to head  

        Node current = head;  

        if(head == null) {  

            System.out.println("Doubly linked list is empty");  

            return;  

        }  

        System.out.println("Nodes of doubly linked list: ");  

        while(current != null) {  

            //Print each node and then go to next.  

            System.out.print(current.item + " ");  

            current = current.next;  

        }  

    }  

}
public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list =new DoublyLinkedList();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Add Node\n2.Delete Node\n3.Print Node\n4.Exit");
		System.out.println("Enter your choice....");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the elements to be inserted:");
			 int element = sc.nextInt();
			 list.addNode(element);
				break;
		
		case 2:
			System.out.println("Enter the elements to be deleted");
			list.deleteNodes();
			break;
			
		case 3:
			list.printNodes();
			break;
			
		case 4:
			System.out.println("\nExting.......");
			sc.close();
			System.exit(0);
			break;
				
			 
			
		}	
		
	}while(true);
		
		
	}	

}
