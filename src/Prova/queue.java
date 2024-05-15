package Prova;

import java.util.*;

public class queue {
    

       public static void main(String args[]){

           LinkedList<Integer> myLinkedList= new LinkedList<Integer>();
           myLinkedList.add(1);
           myLinkedList.add(2);
           myLinkedList.add(4);
           System.out.println("three added elements: " + myLinkedList);
           //put one element into the head, not to the tail:
           myLinkedList.push(5);
           System.out.println("The new element last in will be the first: " + myLinkedList);
           //add new element at the specified position:
           myLinkedList.add(4,3);
           //put one element into the head, not to the tail (same as push):
           myLinkedList.addFirst(6);
           System.out.println(myLinkedList);
           //now remove element no 2 (it is 1):
           myLinkedList.remove(2);
           System.out.println(myLinkedList);
           //now remove the head of the list
           myLinkedList.pop();
           System.out.println(myLinkedList);
           //remove with the other method
           myLinkedList.remove();
           System.out.println(myLinkedList);
           //and with one more
           myLinkedList.poll();
           System.out.println(myLinkedList);
       }
}
