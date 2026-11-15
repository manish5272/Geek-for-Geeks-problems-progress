/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        
        if(head.next == null && head.data==key){
            return true;
        }
        else if(head.next != null && head.data==key){
            return true;
        }
        
        
        
        Node temp=head;
        
        while(temp.next!=null){
            if(temp.next.data == key){
                return true;
            }
            temp=temp.next;
        }
        
        return false;
    }
}