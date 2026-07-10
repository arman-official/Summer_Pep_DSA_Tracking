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
    public void reorderList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int l=0,r=list.size()-1;
        temp=head;
        while(l<=r){
            if(l==r){
                temp.val=list.get(l);
                l++;
            }else{
                temp.val=list.get(l);
                l++;
                temp=temp.next;
                temp.val=list.get(r);
                r--;
                temp=temp.next;
            }
        }
    }
}