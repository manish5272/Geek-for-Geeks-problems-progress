/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        Node prev=null;
        Node current=head;
        Node front=null;
        while(current != null){
            front=current.next;
            current.next=prev;
           
            prev=current;
            current=front;
        }
        
        
        return prev;
        
    }
}