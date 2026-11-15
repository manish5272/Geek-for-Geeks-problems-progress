/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        
        if(head.next == null){
            return 1;
        }
        int count=1;
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
            count++;
        }
        return count;
        
    }
}