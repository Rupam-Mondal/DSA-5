package Solution;

public class search {
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
	public static void searching(int d) {
		int flag = 0;
		Node temp = head;
		if(head.data == d) {
			System.out.println("Yes");
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
			if(temp.data == d) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String args[]) {
		search list = new search();
		list.inserLast(6);
		list.inserLast(21);
		list.inserLast(17);
		list.inserLast(30);
		list.inserLast(10);
		list.inserLast(8);
		
		
		list.searching(6);
	}
}
