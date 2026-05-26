package Dsa_Pattern.Greedy;


import java.util.PriorityQueue;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
public class mergeKSortedLists {

    public static ListNode mergeSortedLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);

       for (ListNode node : lists){
           if(node != null){
               pq.offer(node);
           }
       }

       ListNode dummmy = new ListNode(0);
       ListNode tail = dummmy;


       while (!pq.isEmpty()){
           ListNode curr = pq.poll();

           tail.next = curr;
           tail = tail.next;


           if(curr.next != null){
               pq.offer(curr.next);
           }
       }

       return dummmy.next;
    }

    public static void display(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1,l2,l3};
        ListNode result = mergeSortedLists(lists);
        display(result);
    }



}
