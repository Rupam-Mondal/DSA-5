package Solution;

public class Reverse {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void inserLast(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        Node temp = head;
        newNode.next = null;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
	public void insert(Node prev , int newData) {
		Node newNode = new Node(newData);
        if(prev == null){
            return;
        }
        newNode.next = prev.next;
        prev.next = newNode;
	}
	public void disp() {
		Node current = head;
		while(current != null) {
			System.out.print(" "+current.data);
			current = current.next;
		}
	}
	public static void main(String args[]) {
		Reverse list = new Reverse();
		list.inserLast(1);
		list.inserLast(2);
		list.inserLast(4);
		list.inserLast(5);
		list.inserLast(6);
		list.disp();
		System.out.println();
		System.out.println("-----------------------");
		list.insert(list.head.next, 3);
		list.disp();
		
	}
}
