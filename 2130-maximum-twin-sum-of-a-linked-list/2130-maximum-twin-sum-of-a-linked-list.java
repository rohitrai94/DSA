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
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        int size=0;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            size++;
            list.add(temp.val);
            temp = temp.next;
        }

        for(int i=0; i<size/2; i++){
            int sum = list.get(i) + list.get(size-i-1);
            max = Math.max(max, sum);
        }
        return max;
    }
}