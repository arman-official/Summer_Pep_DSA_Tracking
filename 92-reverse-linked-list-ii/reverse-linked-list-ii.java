/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)return head;
        if(left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        left++;
        right++;
        head=dummy;
        
        ListNode fast=head;
        ListNode slow=head;
        while(left>2){
            left--;
            right--;
            slow=slow.next;
            fast=fast.next;
        }
        while(right>1){
            right--;
            fast=fast.next;
        }
        ListNode mid=slow.next;
        ListNode end=fast.next;
        fast.next=null;
        slow.next=reverse(mid);
        while(slow.next!=null){
            slow=slow.next;
        }
        slow.next=end;
        return head.next;

    }ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}