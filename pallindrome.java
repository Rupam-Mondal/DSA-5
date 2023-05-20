package Solution;

import java.util.ArrayList;

public class pallindrome {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public boolean check() {
		ArrayList<Integer> list1 = new ArrayList<>();
		Node temp = head;
		while(temp != null) {
			list1.add(temp.data);
			temp = temp.next;
		}
		int left = 0;
		int right = list1.size() - 1;
		while(left < right) {
			if(!list1.get(left).equals(list1.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
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
	public static void main(String args[]) {
		pallindrome list = new pallindrome();
		list.inserLast(1);
		list.inserLast(2);
		list.inserLast(3);
		list.inserLast(1);
		System.out.println(list.check());
	}
}
