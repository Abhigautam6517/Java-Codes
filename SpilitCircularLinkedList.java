// public class SpilitCircularLinkedList{
//     class Node{
//         int data;
//         Node next;
//     }
// 	   void splitList(circular_LinkedList list)
//         {
//         Node slow = list.head ;
//        Node fast = list.head ;
//        while(fast.next != list.head && fast.next.next != list.head){
//            slow = slow.next ;
//            fast = fast.next.next ;
//        }
//        // the slow pointer points to the mid node 
//        // now we need to find the tail for second part of our list so that we can split it
//        list.head2 = slow.next ;
//        Node temp = slow.next ;
//        while(temp.next != list.head){
//            temp = temp.next ;
//        }
//        temp.next = list.head2 ;
//        slow.next = list.head ;
//        list.head1 = list.head ;
// }
// }s
