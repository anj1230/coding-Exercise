package Exercise2;

public class PalindromeFunction {

	public static void main(String[] args) {
		 SingleLinkedList list = new SingleLinkedList();
	        list.head = new Node("m");
	        list.head.next = new Node("a");
	        list.head.next.next = new Node("l");
	        list.head.next.next.next = new Node("a");
	        list.head.next.next.next.next = new Node("y");
	        list.head.next.next.next.next.next = new Node("a");
	        list.head.next.next.next.next.next.next = new Node("l");
	        list.head.next.next.next.next.next.next.next = new Node("a");
	        list.head.next.next.next.next.next.next.next.next = new Node("m");
	        
	        System.out.println(list.isPalindrome());

	}

}
