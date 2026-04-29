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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int[]nums=new int[count];
        temp=head;
       for(int i=0;i<count;i++){
           nums[i]=temp.val;
           temp=temp.next;
       }
        Arrays.sort(nums);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.val=nums[i];
            i=i+1;
            temp=temp.next;

        }
       return head;
    }
}