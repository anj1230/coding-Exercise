package Exercise2;

public class SingleLinkedList {
	Node head;
	 
	 boolean isPalindrome()
	    {
		 //Creating a string by appending all the node data
	        Node node = head;
	 
	        String input = "";
	        while (node != null)
	        {
	            input = input.concat(node.data);
	            node = node.next;
	        }
	 
	        
   
        int length = input.length();
 
       //comparing characters of the string from beginning and end
        for (int i=0; i<length/2; i++){
            if (input.charAt(i) != input.charAt(length-i-1))
                return false;
        }
 
        return true;
}
}
