package Solution;

import java.util.ArrayList;

import Solution.pallindrome.Node;

public class duplicate {
	static Node head;
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
	public static void disp() {
		Node curr = head;
		while(curr != null) {
			System.out.print(" "+curr.data);
			curr = curr.next;
		}
	}
	public void checkDup() {
		Node temp = head;
		while(temp != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		duplicate list = new duplicate();
		list.inserLast(1);
		list.inserLast(1);
		list.inserLast(2);
		list.inserLast(3);
		list.inserLast(3);
		list.disp();
		System.out.println();
		System.out.println("After removal");
		list.checkDup();
		list.disp();
	}
}
